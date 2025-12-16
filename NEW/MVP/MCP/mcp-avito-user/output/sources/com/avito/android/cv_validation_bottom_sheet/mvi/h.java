package com.avito.android.cv_validation_bottom_sheet.mvi;

import com.avito.android.cv_validation_bottom_sheet.deeplink.CvForValidation;
import com.avito.android.cv_validation_bottom_sheet.mvi.a;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetOpenParams;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: CvValidationBottomSheetActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/cv_validation_bottom_sheet/mvi/a;", "Lcom/avito/android/cv_validation_bottom_sheet/mvi/m;", "Lcom/avito/android/cv_validation_bottom_sheet/mvi/s;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.arch.mvi.a<a, m, s> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f131898a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CvValidationBottomSheetOpenParams f131899b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_validation_bottom_sheet.domain.a f131900c;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k CvValidationBottomSheetOpenParams cvValidationBottomSheetOpenParams, @Y61.k com.avito.android.cv_validation_bottom_sheet.domain.a aVar2) {
        this.f131898a = aVar;
        this.f131899b = cvValidationBottomSheetOpenParams;
        this.f131900c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new d(new b(new c(y.a(this.f131898a.V9())))), C43175k.C(new g(this, aVar, null), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<m> b(a aVar, s sVar) {
        return c(aVar);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k a aVar) {
        if (aVar instanceof a.C3949a) {
            return C43175k.G(new e(this, null));
        }
        if (aVar instanceof a.b) {
            return C43175k.G(new f(this, aVar, null));
        }
        if (!(aVar instanceof a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        CvValidationBottomSheetOpenParams cvValidationBottomSheetOpenParams = this.f131899b;
        String strValueOf = String.valueOf(cvValidationBottomSheetOpenParams.f131951h);
        CvForValidation cvForValidation = (CvForValidation) C42745f0.G(cvValidationBottomSheetOpenParams.f131945b);
        String str = cvForValidation != null ? cvForValidation.f131787b : null;
        b.a.a(this.f131898a, new CreateChannelLink(String.valueOf(cvValidationBottomSheetOpenParams.f131951h), null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null), null, null, 6);
        if (str != null) {
            this.f131900c.a(strValueOf, str);
        }
        return C43175k.w();
    }
}
