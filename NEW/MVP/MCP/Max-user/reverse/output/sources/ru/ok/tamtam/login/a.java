package ru.ok.tamtam.login;

import defpackage.dtf;
import defpackage.f84;
import defpackage.g84;
import defpackage.g8j;
import defpackage.jve;
import defpackage.ph8;
import defpackage.qqg;
import defpackage.sm6;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a extends dtf implements sm6 {
    public final /* synthetic */ LoginEventsByBus X;
    public final /* synthetic */ ph8 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LoginEventsByBus loginEventsByBus, ph8 ph8Var, Continuation continuation) {
        super(2, continuation);
        this.X = loginEventsByBus;
        this.Y = ph8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new a(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            this.o = 1;
            Object objA = jveVar.a(this.Y, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
