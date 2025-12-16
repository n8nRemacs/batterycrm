package T91;

import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioTextField;

/* loaded from: classes9.dex */
public final class l implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.o f15460b;

    public l(ru.mts.biometry.sdk.feature.documentResult.ui.o oVar) {
        this.f15460b = oVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        C15344b c15344b = (C15344b) obj;
        k kVar = ru.mts.biometry.sdk.feature.documentResult.ui.o.f436456l0;
        ru.mts.biometry.sdk.feature.documentResult.ui.o oVar = this.f15460b;
        B91.B b12 = (B91.B) oVar.f436376g0;
        if (b12 != null) {
            String str = c15344b.f15441b;
            SdkBioTextField sdkBioTextField = b12.f996k;
            sdkBioTextField.setFieldValue(str);
            SdkBioButton sdkBioButton = b12.f987b;
            TextView textView = b12.f1005t;
            TextView textView2 = b12.f1006u;
            TextView textView3 = b12.f1002q;
            if (str == null || str.length() == 0) {
                textView2.setVisibility(0);
                textView3.setVisibility(0);
                textView3.setText(oVar.getString(R.string.sdk_bio_add));
                textView.setVisibility(0);
                sdkBioTextField.setVisibility(8);
                sdkBioButton.setEnabled(false);
            } else {
                textView2.setVisibility(0);
                textView3.setVisibility(0);
                textView3.setText(oVar.getString(R.string.sdk_bio_edit));
                textView.setVisibility(8);
                sdkBioTextField.setVisibility(0);
                sdkBioButton.setEnabled(true);
            }
        }
        return G0.f406611a;
    }
}
