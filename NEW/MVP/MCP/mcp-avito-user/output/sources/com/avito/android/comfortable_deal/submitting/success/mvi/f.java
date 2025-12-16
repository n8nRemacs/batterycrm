package com.avito.android.comfortable_deal.submitting.success.mvi;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.submitting.success.mvi.entity.SubmittingSuccessInternalAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SubmittingSuccessBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.arch.mvi.b<SubmittingSuccessInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.n f123423a;

    @Inject
    public f(@Y61.k com.avito.android.comfortable_deal.repository.n nVar) {
        this.f123423a = nVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SubmittingSuccessInternalAction> a() {
        Context context = this.f123423a.f122627a.f429364a;
        return new C43210w(new SubmittingSuccessInternalAction.ContentLoaded(new rp.i(Uri.parse(context.getString(R.string.submitting_success_url)), new UniversalImage(new Image(P0.g(new Q(new Size(318, 249), Uri.parse("https://avito.st/static/ims/7a0cdfbb-ade8-455f-a5b4-12dcbe672de5_success_promo_common_318x249.png")), new Q(new Size(477, 374), Uri.parse("https://avito.st/static/ims/9a941210-a00d-49e2-95cd-9ea3be9d8d53_success_promo_common_477x374.png")), new Q(new Size(636, 498), Uri.parse("https://avito.st/static/ims/e1611200-68e4-419b-b73d-72dc24b56648_success_promo_common_636x498.png")), new Q(new Size(954, 747), Uri.parse("https://avito.st/static/ims/e26237f4-a1f8-44c5-9c66-b53d23d6ae6a_success_promo_common_954x747.png")), new Q(new Size(1272, 996), Uri.parse("https://avito.st/static/ims/c8514e6a-98b4-472f-8fbc-7ccbddfae579_success_promo_common_1272x996")))), new Image(P0.g(new Q(new Size(318, 249), Uri.parse("https://avito.st/static/ims/7a0cdfbb-ade8-455f-a5b4-12dcbe672de5_success_promo_common_318x249.png")), new Q(new Size(477, 374), Uri.parse("https://avito.st/static/ims/9a941210-a00d-49e2-95cd-9ea3be9d8d53_success_promo_common_477x374.png")), new Q(new Size(636, 498), Uri.parse("https://avito.st/static/ims/e1611200-68e4-419b-b73d-72dc24b56648_success_promo_common_636x498.png")), new Q(new Size(954, 747), Uri.parse("https://avito.st/static/ims/e26237f4-a1f8-44c5-9c66-b53d23d6ae6a_success_promo_common_954x747.png")), new Q(new Size(1272, 996), Uri.parse("https://avito.st/static/ims/c8514e6a-98b4-472f-8fbc-7ccbddfae579_success_promo_common_1272x996"))))), context.getString(R.string.submitting_success_title), context.getString(R.string.submitting_success_subtitle), context.getString(R.string.submitting_success_details_button_text), context.getString(R.string.submitting_success_proceed_button_text))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
