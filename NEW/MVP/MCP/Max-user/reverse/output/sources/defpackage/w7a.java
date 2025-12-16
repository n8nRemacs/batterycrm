package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w7a extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ l09 Z;
    public final /* synthetic */ b8a o;
    public final /* synthetic */ String s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ Bundle u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7a(b8a b8aVar, String str, String str2, l09 l09Var, String str3, String str4, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.o = b8aVar;
        this.X = str;
        this.Y = str2;
        this.Z = l09Var;
        this.s0 = str3;
        this.t0 = str4;
        this.u0 = bundle;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        w7a w7aVar = (w7a) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        w7aVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new w7a(this.o, this.X, this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        k09 k09VarH = b8a.h(this.X, this.Y, this.Z, this.s0, this.t0, this.u0);
        b8a b8aVar = this.o;
        px8 px8Var = b8aVar.w0;
        if (px8Var != null) {
            px8Var.D();
            ox8 ox8Var = px8Var.c;
            if (ox8Var.isConnected()) {
                ox8Var.O(k09VarH);
            } else {
                a8i.l("MediaController", "The controller is not connected. Ignoring setMediaItem().");
            }
        }
        b8aVar.p();
        return qqg.a;
    }
}
