package ru.LearnUp;

public class Calculator {
    private final SumProcessor sumProcessor;
    private final SubtractProcessor subtractProcessor;
    private final MultiplyProcessor multiplyProcessor;
    private final DivideProcessor divideProcessor;


    public Calculator(SumProcessor sumProcessor, SubtractProcessor subtractProcessor, MultiplyProcessor multiplyProcessor, DivideProcessor divideProcessor) {
        this.sumProcessor = sumProcessor;
        this.subtractProcessor = subtractProcessor;
        this.multiplyProcessor = multiplyProcessor;
        this.divideProcessor = divideProcessor;
    }

    public int sum(int arg1, int arg2){
        return sumProcessor.process(arg1, arg2);
    }
    public int subtract(int arg1, int arg2){
        return subtractProcessor.process(arg1, arg2);
    }
    public double divide(int arg1, int arg2) {
        return divideProcessor.process(arg1, arg2);
    }
    public int multiply(int arg1, int arg2){
        return multiplyProcessor.process(arg1, arg2);
    }

}
