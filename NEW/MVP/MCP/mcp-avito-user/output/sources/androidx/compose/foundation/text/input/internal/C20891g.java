package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.p;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.compose.foundation.text.input.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C20891g implements p.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20941t f31085a;

    @Override // androidx.compose.foundation.text.input.p.a
    public final void a(androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.l lVar2, boolean z12) {
        long j12 = lVar.f31512d;
        long j13 = lVar2.f31512d;
        InterfaceC20941t interfaceC20941t = this.f31085a;
        if (z12) {
            interfaceC20941t.c();
            return;
        }
        boolean zC2 = androidx.compose.ui.text.v0.c(j12, j13);
        androidx.compose.ui.text.v0 v0Var = lVar2.f31513e;
        if (zC2 && kotlin.jvm.internal.L.f(lVar.f31513e, v0Var)) {
            return;
        }
        interfaceC20941t.b(androidx.compose.ui.text.v0.g(j13), androidx.compose.ui.text.v0.f(j13), v0Var != null ? androidx.compose.ui.text.v0.g(v0Var.f42736a) : -1, v0Var != null ? androidx.compose.ui.text.v0.f(v0Var.f42736a) : -1);
    }
}
