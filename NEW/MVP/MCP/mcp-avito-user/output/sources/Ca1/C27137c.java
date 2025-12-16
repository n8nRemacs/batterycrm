package ca1;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* renamed from: ca1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27137c implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.address.f f57937b;

    public C27137c(ru.mts.biometry.sdk.feature.passport.ui.address.f fVar) {
        this.f57937b = fVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ru.mts.biometry.sdk.feature.passport.ui.address.f fVar = this.f57937b;
        C27154t c27154t = fVar.f436483f0;
        if (c27154t == null) {
            c27154t = null;
        }
        String text = fVar.b5().f1149c.getText();
        N0 n02 = c27154t.f57966J;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        if (text == null || C43066x.K(text)) {
            c27154t.f57967K.setValue(C27147m.f57951a);
        } else {
            c27154t.f57966J = C43259k.d(androidx.view.N0.a(c27154t), null, null, new C27151q(c27154t, text, null), 3);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }
}
