package ca1;

import android.os.Bundle;
import android.widget.EditText;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import kotlin.G0;
import kotlin.Q;
import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* renamed from: ca1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27135a extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.address.f f57935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27135a(ru.mts.biometry.sdk.feature.passport.ui.address.f fVar) {
        super(1);
        this.f57935l = fVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        I91.d dVar = (I91.d) obj;
        Q q12 = new Q("fullAddress", dVar.f8029b);
        String str = dVar.f8028a;
        Q q13 = new Q("shortAddress", str);
        Q q14 = new Q("city", dVar.f8030c);
        Q q15 = new Q(DistrictParameter.TYPE, dVar.f8031d);
        String str2 = dVar.f8032e;
        Bundle bundleB = C22777e.b(q12, q13, q14, q15, new Q("house", str2), new Q("index", dVar.f8034g), new Q("numberFlat", dVar.f8035h), new Q("region", dVar.f8036i), new Q("street", dVar.f8037j), new Q("block", dVar.f8033f));
        ru.mts.biometry.sdk.feature.passport.ui.address.f fVar = this.f57935l;
        C22960s.a(bundleB, fVar, "request_address");
        if (str2 == null || str2.length() == 0) {
            int i12 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
            fVar.b5().f1149c.setText(str);
            SdkBioEditText sdkBioEditText = fVar.b5().f1149c;
            EditText editText = sdkBioEditText.getEditText();
            String text = sdkBioEditText.getText();
            editText.setSelection(text != null ? text.length() : 0);
        } else {
            fVar.dismiss();
        }
        return G0.f406611a;
    }
}
