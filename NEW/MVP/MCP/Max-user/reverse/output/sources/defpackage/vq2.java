package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class vq2 implements UnaryOperator {
    public final /* synthetic */ hr9 a;

    public vq2(hr9 hr9Var) {
        this.a = hr9Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        hr9 hr9Var = this.a;
        return new hp2(hr9Var.c, hr9Var.b);
    }
}
