package ja1;

import B91.G;
import E91.g;
import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.verification.verification_input_inn.o;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.mts.biometry.sdk.view.SdkBioButton;

/* renamed from: ja1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C42342a implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.intro.e f405648b;

    public C42342a(ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar) {
        this.f405648b = eVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        g gVar = (g) obj;
        if (gVar != null) {
            n[] nVarArr = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0;
            ru.mts.biometry.sdk.feature.recognition.ui.intro.e eVar = this.f405648b;
            G g12 = (G) eVar.f436376g0;
            if (g12 != null) {
                String string = gVar.f3847b;
                if (string == null) {
                    string = eVar.getString(R.string.sdk_bio_passport_intro_title);
                }
                g12.f1042j.setText(string);
                g12.f1038f.setItems(gVar.f3848c);
                o oVar = new o(19, eVar, gVar);
                SdkBioButton sdkBioButton = g12.f1036d;
                Ca1.d.a(oVar, sdkBioButton);
                Ca1.d.a(new o(20, g12, eVar), g12.f1035c);
                sdkBioButton.setVisibility(gVar.f3850e ? 0 : 8);
                Drawable drawable = androidx.core.content.d.getDrawable(eVar.requireContext(), R.drawable.sdk_bio_passport_intro_main);
                j jVarC = com.bumptech.glide.b.c(eVar.requireView());
                n nVar = ru.mts.biometry.sdk.feature.recognition.ui.intro.e.f436502i0[0];
                g gVar2 = (g) ((f) eVar.f436503h0.a(eVar)).f405659K.getValue();
                String str = gVar2 != null ? gVar2.f3846a : "";
                i iVarD = jVarC.d(Drawable.class);
                iVarD.f338801A = str;
                iVarD.f338803C = true;
                iVarD.j(drawable).A(g12.f1037e);
            }
        }
        return G0.f406611a;
    }
}
