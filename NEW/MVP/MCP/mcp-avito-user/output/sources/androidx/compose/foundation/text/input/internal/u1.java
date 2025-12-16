package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.t1;
import androidx.compose.runtime.I3;
import kotlin.Metadata;

/* compiled from: TransformedTextFieldState.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/t1$b;", "invoke", "()Landroidx/compose/foundation/text/input/internal/t1$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class u1 extends kotlin.jvm.internal.N implements Y41.a<t1.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t1 f31464l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f31465m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(t1 t1Var, r rVar) {
        super(0);
        this.f31464l = t1Var;
        this.f31465m = rVar;
    }

    @Override // Y41.a
    public final t1.b invoke() {
        androidx.compose.ui.text.v0 v0VarA;
        t1.b f42167b;
        t1.a aVar = t1.f31451h;
        t1 t1Var = this.f31464l;
        I3<t1.b> i32 = t1Var.f31456e;
        androidx.compose.foundation.text.input.l lVarB = (i32 == null || (f42167b = i32.getF42167b()) == null) ? t1Var.f31452a.b() : f42167b.f31459a;
        F0 f0C = t1Var.c();
        aVar.getClass();
        C20954z0 c20954z0 = new C20954z0();
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        while (i12 < lVarB.f31511c.length()) {
            int iCodePointAt = Character.codePointAt(lVarB, i12);
            int iA2 = this.f31465m.a(i13, iCodePointAt);
            int iCharCount = Character.charCount(iCodePointAt);
            if (iA2 != iCodePointAt) {
                c20954z0.c(sb2.length(), sb2.length() + iCharCount, Character.charCount(iA2));
                z12 = true;
            }
            sb2.appendCodePoint(iA2);
            i12 += iCharCount;
            i13++;
        }
        CharSequence string = z12 ? sb2.toString() : lVarB;
        if (string == lVarB) {
            return null;
        }
        long jC2 = t1.a.c(lVarB.f31512d, c20954z0, f0C);
        androidx.compose.ui.text.v0 v0Var = lVarB.f31513e;
        if (v0Var != null) {
            t1.f31451h.getClass();
            v0VarA = androidx.compose.ui.text.v0.a(t1.a.c(v0Var.f42736a, c20954z0, f0C));
        } else {
            v0VarA = null;
        }
        return new t1.b(new androidx.compose.foundation.text.input.l(string, jC2, v0VarA, null, null, 24, null), c20954z0);
    }
}
