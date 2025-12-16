package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.C21008e1;
import androidx.compose.ui.text.input.C22636b;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextFieldKeyInput.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C21058u2 extends kotlin.jvm.internal.H implements Y41.l<androidx.compose.ui.input.key.c, Boolean> {
    public final Boolean f(KeyEvent keyEvent) {
        Integer numA;
        KeyCommand keyCommandA;
        C20958j2 c20958j2 = (C20958j2) this.receiver;
        c20958j2.getClass();
        boolean z12 = true;
        C22636b c22636b = (C21070x2.a(keyEvent) && (numA = c20958j2.f31551i.a(keyEvent)) != null) ? new C22636b(new StringBuilder().appendCodePoint(numA.intValue()).toString(), 1) : null;
        androidx.compose.foundation.text.selection.C1 c12 = c20958j2.f31548f;
        boolean z13 = c20958j2.f31546d;
        boolean z14 = false;
        if (c22636b != null) {
            if (z13) {
                c20958j2.a(Collections.singletonList(c22636b));
                c12.f31828a = null;
            } else {
                z12 = false;
            }
            z14 = z12;
        } else {
            int iB2 = androidx.compose.ui.input.key.e.b(keyEvent);
            androidx.compose.ui.input.key.d.f40069b.getClass();
            if (androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40071d) && (keyCommandA = c20958j2.f31552j.a(keyEvent)) != null && (!keyCommandA.f30450b || z13)) {
                l0.a aVar = new l0.a();
                aVar.f406838b = true;
                C20993s2 c20993s2 = new C20993s2(keyCommandA, c20958j2, aVar);
                Q2 q2D = c20958j2.f31543a.d();
                androidx.compose.ui.text.input.L l12 = c20958j2.f31549g;
                androidx.compose.ui.text.input.W w12 = c20958j2.f31545c;
                C21008e1 c21008e1 = new C21008e1(w12, l12, q2D, c12);
                c20993s2.invoke(c21008e1);
                if (!androidx.compose.ui.text.v0.c(c21008e1.f32038f, w12.f42384b) || !kotlin.jvm.internal.L.f(c21008e1.f32039g, w12.f42383a)) {
                    c20958j2.f31553k.invoke(androidx.compose.ui.text.input.W.a(c21008e1.f31976h, c21008e1.f32039g, c21008e1.f32038f, 4));
                }
                i3 i3Var = c20958j2.f31550h;
                if (i3Var != null) {
                    i3Var.f30751f = true;
                }
                z14 = aVar.f406838b;
            }
        }
        return Boolean.valueOf(z14);
    }

    @Override // Y41.l
    public final /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
        return f(cVar.f40068a);
    }
}
