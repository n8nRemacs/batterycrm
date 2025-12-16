package ru.mts.biometry.sdk.feature.recognition.ui.error;

import B91.D;
import E91.f;
import H91.b;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.R;
import e11.ViewOnClickListenerC39879j1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.base.p;
import ru.mts.biometry.sdk.view.SdkBioList;

@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/sdk/feature/recognition/ui/error/a;", "Lru/mts/biometry/sdk/base/p;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public abstract class a extends p {
    @Override // ru.mts.biometry.sdk.base.p
    public final List e5() {
        requireContext();
        z91.e eVar = z91.e.f443907a;
        f fVar = C91.a.f2018e.f3815a;
        if (fVar != null) {
            return fVar.f3845c;
        }
        return null;
    }

    @Override // ru.mts.biometry.sdk.base.p, ru.mts.biometry.sdk.base.b
    /* renamed from: f5 */
    public void d5(D d12) {
        requireContext();
        z91.e eVar = z91.e.f443907a;
        f fVar = C91.a.f2018e.f3815a;
        d12.f1020j.setOnCloseListener(new ViewOnClickListenerC39879j1(this, 10));
        d12.f1022l.setText(fVar != null ? fVar.f3843a : getString(R.string.sdk_bio_recognize_error_title));
        AppCompatTextView appCompatTextView = d12.f1021k;
        String str = fVar != null ? fVar.f3844b : null;
        appCompatTextView.setVisibility(!(str == null || str.length() == 0) ? 0 : 8);
        appCompatTextView.setText(fVar != null ? fVar.f3844b : null);
        d12.f1016f.setImageDrawable(b.c(R.attr.sdkBioIcError, requireContext()));
        List<String> listE5 = e5();
        SdkBioList sdkBioList = d12.f1018h;
        if (listE5 != null) {
            sdkBioList.setItems(listE5);
        }
        List listE52 = e5();
        sdkBioList.setVisibility((listE52 == null || listE52.isEmpty()) ? 8 : 0);
        d12.f1014d.setVisibility(8);
    }
}
