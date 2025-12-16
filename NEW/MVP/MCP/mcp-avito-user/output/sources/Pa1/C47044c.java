package pa1;

import android.view.View;
import com.avito.android.R;
import kotlin.jvm.internal.N;

/* renamed from: pa1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47044c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.gallery.g f428607l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47044c(ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar) {
        super(0);
        this.f428607l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        Da1.d dVar = Da1.d.f3247l;
        ru.mts.biometry.sdk.view.modalcard.enums.a aVar = ru.mts.biometry.sdk.view.modalcard.enums.a.f436604c;
        final ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar = this.f428607l;
        String string = gVar.getString(R.string.sdk_bio_title_passport_recognition_error);
        String string2 = gVar.getString(R.string.sdk_bio_message_passport_recognition_error);
        String string3 = gVar.getString(R.string.sdk_bio_title_retry);
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: pa1.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar2 = gVar;
                        W91.h hVar = gVar2.f436516i0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        hVar.a();
                        ru.mts.biometry.sdk.view.modalcard.b bVar = (ru.mts.biometry.sdk.view.modalcard.b) gVar2.getParentFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                        if (bVar == null) {
                            bVar = (ru.mts.biometry.sdk.view.modalcard.b) gVar2.getChildFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                        }
                        if (bVar != null) {
                            bVar.dismissAllowingStateLoss();
                            break;
                        }
                        break;
                    default:
                        W91.h hVar2 = gVar.f436516i0;
                        if (hVar2 == null) {
                            hVar2 = null;
                        }
                        hVar2.d(false);
                        break;
                }
            }
        };
        final int i13 = 1;
        return new ru.mts.biometry.sdk.view.modalcard.f(aVar, null, string, string2, string3, gVar.getString(R.string.sdk_bio_title_close), onClickListener, new View.OnClickListener() { // from class: pa1.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar2 = gVar;
                        W91.h hVar = gVar2.f436516i0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        hVar.a();
                        ru.mts.biometry.sdk.view.modalcard.b bVar = (ru.mts.biometry.sdk.view.modalcard.b) gVar2.getParentFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                        if (bVar == null) {
                            bVar = (ru.mts.biometry.sdk.view.modalcard.b) gVar2.getChildFragmentManager().H("ru.mts.biometry.sdk.view.modalcard.d");
                        }
                        if (bVar != null) {
                            bVar.dismissAllowingStateLoss();
                            break;
                        }
                        break;
                    default:
                        W91.h hVar2 = gVar.f436516i0;
                        if (hVar2 == null) {
                            hVar2 = null;
                        }
                        hVar2.d(false);
                        break;
                }
            }
        }, dVar);
    }
}
