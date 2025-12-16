package ka1;

import B91.I;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* renamed from: ka1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C42658c implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.result.g f406389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f406390c;

    public C42658c(ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar, I i12) {
        this.f406389b = gVar;
        this.f406390c = i12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        E91.c cVar = (E91.c) obj;
        ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar = this.f406389b;
        C42657b c42657b = gVar.f436505h0;
        Object obj2 = cVar.f3824c;
        c42657b.getClass();
        c42657b.f406388c = obj2;
        c42657b.notifyDataSetChanged();
        I i12 = this.f406390c;
        TextView textView = i12.f1068g;
        String string = cVar.f3822a;
        if (string == null) {
            string = gVar.getString(R.string.sdk_bio_title_result_passport_data);
        }
        textView.setText(string);
        TextView textView2 = i12.f1067f;
        String string2 = cVar.f3823b;
        if (string2 == null) {
            string2 = gVar.getString(R.string.sdk_bio_message_confirm_not_accepted);
        }
        textView2.setText(string2);
        return G0.f406611a;
    }
}
