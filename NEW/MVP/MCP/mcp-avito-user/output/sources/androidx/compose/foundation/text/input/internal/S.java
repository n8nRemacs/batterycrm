package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22082i3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class S implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30980b;

    public /* synthetic */ S(Object obj, int i12) {
        this.f30979a = i12;
        this.f30980b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        Object obj = this.f30980b;
        switch (this.f30979a) {
            case 0:
                V v12 = V.f31005a;
                C21011f1 c21011f1 = (C21011f1) obj;
                if (c21011f1 != null) {
                    C20985q1 c20985q1 = c21011f1.f31986d;
                    if (c20985q1 != null) {
                        androidx.compose.ui.text.v0.f42734b.getClass();
                        long j12 = androidx.compose.ui.text.v0.f42735c;
                        ((C22082i3) c20985q1.f31777A).setValue(androidx.compose.ui.text.v0.a(j12));
                    }
                    C20985q1 c20985q12 = c21011f1.f31986d;
                    if (c20985q12 != null) {
                        androidx.compose.ui.text.v0.f42734b.getClass();
                        long j13 = androidx.compose.ui.text.v0.f42735c;
                        ((C22082i3) c20985q12.f31803z).setValue(androidx.compose.ui.text.v0.a(j13));
                        break;
                    }
                }
                break;
            case 1:
                V v13 = V.f31005a;
                t1 t1Var = (t1) obj;
                androidx.compose.foundation.text.input.p pVar = t1Var.f31452a;
                androidx.compose.foundation.text.input.c cVar = t1Var.f31453b;
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
                pVar.f31519b.a().b();
                androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
                iVar.f30762i = null;
                t1Var.m(iVar);
                androidx.compose.foundation.text.input.p.a(pVar, cVar, true, textFieldEditUndoBehavior);
                break;
            default:
                ((kotlinx.coroutines.V0) ((kotlinx.coroutines.N0) obj)).c(null);
                break;
        }
    }
}
