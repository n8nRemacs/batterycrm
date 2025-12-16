package N91;

import B91.x;
import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes9.dex */
public final class e implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l f11270b;

    public e(ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l lVar) {
        this.f11270b = lVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l lVar = this.f11270b;
        O91.o oVar = (O91.o) lVar.f436433i0.getValue();
        x xVar = lVar.f436431g0;
        if (xVar == null) {
            xVar = null;
        }
        String text = xVar.f1191c.getText();
        if (text == null) {
            text = "";
        }
        oVar.a(text);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
    }
}
