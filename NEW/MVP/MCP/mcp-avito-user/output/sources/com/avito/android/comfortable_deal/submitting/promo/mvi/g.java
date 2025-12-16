package com.avito.android.comfortable_deal.submitting.promo.mvi;

import Yo.t;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import com.avito.android.comfortable_deal.submitting.promo.mvi.entity.PromoInternalAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qp.C47424a;
import rp.C47700c;
import rp.C47703f;
import rp.C47704g;

/* compiled from: PromoBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements com.avito.android.arch.mvi.b<PromoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.n f123193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f123194b;

    @Inject
    public g(@Y61.k com.avito.android.comfortable_deal.repository.n nVar, @Y61.k t tVar) {
        this.f123193a = nVar;
        this.f123194b = tVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PromoInternalAction> a() {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new f(this, null));
        C47424a c47424a = this.f123193a.f122627a;
        Context context = c47424a.f429364a;
        return C43175k.N(interfaceC43160iG, new C43210w(new PromoInternalAction.ContentLoaded(new C47704g(context.getString(R.string.promo_content_nav_title), new C47700c(new UniversalImage(new Image(P0.g(new Q(new Size(349, 198), Uri.parse("https://avito.st/static/ims/b85d0eed-36f7-40b4-af35-efe1ce108210_avito_house1396_common_349x198.png")), new Q(new Size(524, 297), Uri.parse("https://avito.st/static/ims/a2fcae2c-7d92-4f9c-9563-97fba0b3d60c_avito_house1396_common_524x297.png")), new Q(new Size(698, 396), Uri.parse("https://avito.st/static/ims/fe438fd1-b7a2-474d-820b-dfdfcb817772_avito_house1396_common_1047x594.png")), new Q(new Size(1396, 792), Uri.parse("https://avito.st/static/ims/66cf762f-6782-49ce-ab6d-0dd842540d1c_avito_house1396_common_1396x792.png")))), new Image(P0.g(new Q(new Size(349, 198), Uri.parse("https://avito.st/static/ims/b85d0eed-36f7-40b4-af35-efe1ce108210_avito_house1396_common_349x198.png")), new Q(new Size(524, 297), Uri.parse("https://avito.st/static/ims/a2fcae2c-7d92-4f9c-9563-97fba0b3d60c_avito_house1396_common_524x297.png")), new Q(new Size(698, 396), Uri.parse("https://avito.st/static/ims/fe438fd1-b7a2-474d-820b-dfdfcb817772_avito_house1396_common_1047x594.png")), new Q(new Size(1396, 792), Uri.parse("https://avito.st/static/ims/66cf762f-6782-49ce-ab6d-0dd842540d1c_avito_house1396_common_1396x792.png"))))), context.getString(R.string.promo_content_header_title), context.getString(R.string.promo_content_header_subtitle)), new C47703f(context.getString(R.string.promo_content_phone_input_title), context.getString(R.string.promo_content_phone_input_subtitle), c47424a.b(), context.getString(R.string.promo_content_phone_input_placeholder)), context.getString(R.string.promo_content_phone_button_text), c47424a.c(), new SubmittingSuccessLink()))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
