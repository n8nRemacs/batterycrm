package Q91;

import B91.A;
import android.util.TypedValue;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioList;

/* loaded from: classes9.dex */
public final class a implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.intro.ui.e f13574b;

    public a(ru.mts.biometry.sdk.feature.document.intro.ui.e eVar) {
        this.f13574b = eVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        SdkBioList sdkBioList;
        TextView textView;
        e eVar = (e) obj;
        boolean z12 = eVar.f13580a;
        n[] nVarArr = ru.mts.biometry.sdk.feature.document.intro.ui.e.f436443i0;
        ru.mts.biometry.sdk.feature.document.intro.ui.e eVar2 = this.f13574b;
        A a12 = (A) eVar2.f436376g0;
        if (a12 != null) {
            TypedValue typedValue = new TypedValue();
            eVar2.requireContext().getTheme().resolveAttribute(z12 ? R.attr.sdkBioPassportIntroMainImage : R.attr.sdkBioHorizontalDocumentIntroMainImage, typedValue, true);
            a12.f980e.setImageDrawable(androidx.core.content.d.getDrawable(eVar2.requireContext(), typedValue.resourceId));
        }
        A a13 = (A) eVar2.f436376g0;
        if (a13 != null && (textView = a13.f985j) != null) {
            textView.setText(eVar.f13581b);
        }
        A a14 = (A) eVar2.f436376g0;
        if (a14 != null && (sdkBioList = a14.f981f) != null) {
            sdkBioList.setItems(C42756l.g0(eVar2.getResources().getStringArray(eVar.f13582c)));
        }
        return G0.f406611a;
    }
}
