package ru.cyberity.cbr.core.presentation.form.model;

import Y41.p;
import Y61.k;
import Y61.l;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: PolishNotationSolver.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00050\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0013j\b\u0012\u0004\u0012\u00020\u000b`\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R2\u0010\u0018\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/PolishNotationSolver;", "", "<init>", "()V", "Ljava/util/Stack;", "", "Lkotlin/Function2;", "op", "kotlin.jvm.PlatformType", "execute", "(Ljava/util/Stack;LY41/p;)Ljava/lang/Boolean;", "", "", "getPrecedence", "(Ljava/lang/String;)I", "expr", "polishCalculate", "(Ljava/lang/String;)Z", "expression", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "convertToRPN", "(Ljava/lang/String;)Ljava/util/ArrayList;", "", "operationMap", "Ljava/util/Map;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PolishNotationSolver {

    @k
    private final Map<String, p<Boolean, Boolean, Boolean>> operationMap = P0.g(new Q("&&", PolishNotationSolver$operationMap$1.INSTANCE), new Q("||", PolishNotationSolver$operationMap$2.INSTANCE));

    private final Boolean execute(Stack<Boolean> stack, p<? super Boolean, ? super Boolean, Boolean> pVar) {
        return stack.push(pVar.invoke(stack.pop(), stack.pop()));
    }

    private final int getPrecedence(String op2) {
        return L.f(op2, "&&") ? 2 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k0
    @k
    public final ArrayList<String> convertToRPN(@l String expression) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (expression != null && !C43066x.K(expression)) {
            Stack stack = new Stack();
            for (String str : C43066x.f0(expression, new String[]{" "}, 0, 6)) {
                if (this.operationMap.containsKey(str)) {
                    while (!stack.isEmpty() && getPrecedence((String) stack.peek()) >= getPrecedence(str)) {
                        arrayList.add(stack.pop());
                    }
                    stack.push(str);
                } else if (L.f(str, "(")) {
                    stack.push(str);
                } else if (L.f(str, ")")) {
                    while (!((String) stack.peek()).equals("(")) {
                        arrayList.add(stack.pop());
                    }
                    stack.pop();
                } else {
                    arrayList.add(str);
                }
            }
            while (!stack.isEmpty()) {
                arrayList.add(stack.pop());
            }
        }
        return arrayList;
    }

    public final boolean polishCalculate(@k String expr) {
        ArrayList<String> arrayListConvertToRPN = convertToRPN(C43066x.A0(expr).toString());
        if (arrayListConvertToRPN.isEmpty()) {
            return false;
        }
        Stack<Boolean> stack = new Stack<>();
        Iterator<String> it = arrayListConvertToRPN.iterator();
        while (it.hasNext()) {
            String next = it.next();
            p<Boolean, Boolean, Boolean> pVar = this.operationMap.get(next);
            if (pVar != null) {
                execute(stack, pVar);
            } else {
                stack.push(Boolean.valueOf(Boolean.parseBoolean(next)));
            }
        }
        return stack.pop().booleanValue();
    }
}
