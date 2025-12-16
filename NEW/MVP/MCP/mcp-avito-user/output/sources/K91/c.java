package K91;

import com.avito.android.R;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.g f9307l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ru.mts.biometry.sdk.feature.address.ui.g gVar) {
        super(0);
        this.f9307l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        Da1.d dVar = Da1.d.f3247l;
        ru.mts.biometry.sdk.view.modalcard.enums.a aVar = ru.mts.biometry.sdk.view.modalcard.enums.a.f436604c;
        ru.mts.biometry.sdk.feature.address.ui.g gVar = this.f9307l;
        return new ru.mts.biometry.sdk.view.modalcard.f(aVar, null, gVar.getString(R.string.sdk_bio_address_error_tittle), gVar.getString(R.string.sdk_bio_address_error_message), gVar.getString(R.string.sdk_bio_title_retry), gVar.getString(R.string.sdk_bio_title_close), new ViewOnClickListenerC14270a(gVar, 0), new ViewOnClickListenerC14270a(gVar, 1), dVar);
    }
}
