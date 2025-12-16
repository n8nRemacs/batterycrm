package O91;

import B91.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import com.avito.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import m.C43852a;
import ru.mts.biometry.sdk.view.SdkBioEditText;

/* loaded from: classes9.dex */
public final class b implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j f12035b;

    public b(ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j jVar) {
        this.f12035b = jVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        Object next;
        List list = (List) obj;
        ru.mts.biometry.sdk.feature.document.chooseDocument.ui.j jVar = this.f12035b;
        t tVar = (t) jVar.f436376g0;
        if (tVar != null) {
            SdkBioEditText sdkBioEditText = tVar.f1169c;
            boolean z12 = list.size() == 1;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((M91.b) next).f10434c) {
                    break;
                }
            }
            M91.b bVar = (M91.b) next;
            sdkBioEditText.setText(bVar != null ? bVar.f10433b : null);
            EditText editText = sdkBioEditText.getEditText();
            editText.setBackground(C43852a.a(editText.getContext(), !z12 ? R.drawable.sdk_bio_edittext_normal : R.drawable.sdk_bio_disabled_background));
            Context context = editText.getContext();
            int iB2 = !z12 ? H91.b.b(context, R.attr.sdkBioTextPrimaryColor) : context.getColor(R.color.sdk_bio_greyscale_500);
            Drawable drawableA = z12 ? null : C43852a.a(editText.getContext(), R.drawable.sdk_bio_ic_dropdown_arrow);
            editText.setTextColor(iB2);
            editText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
            Ca1.d.a(new j(0, jVar, z12), sdkBioEditText);
        }
        return G0.f406611a;
    }
}
