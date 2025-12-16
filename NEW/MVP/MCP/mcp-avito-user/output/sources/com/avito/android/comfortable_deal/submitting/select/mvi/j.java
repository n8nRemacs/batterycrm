package com.avito.android.comfortable_deal.submitting.select.mvi;

import Yo.t;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.data_source.model.ItemType;
import com.avito.android.comfortable_deal.deeplink.OrderCallDeeplink;
import com.avito.android.comfortable_deal.submitting.select.mvi.entity.SubmittingSelectInternalAction;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.remote.model.text.TextIconAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qp.C47424a;
import rp.C47698a;
import rp.C47699b;
import rp.C47701d;

/* compiled from: SubmittingSelectBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements com.avito.android.arch.mvi.b<SubmittingSelectInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.n f123352a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f123353b;

    @Inject
    public j(@Y61.k com.avito.android.comfortable_deal.repository.n nVar, @Y61.k t tVar) {
        this.f123352a = nVar;
        this.f123353b = tVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SubmittingSelectInternalAction> a() {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new i(this, null));
        C47424a c47424a = this.f123352a.f122627a;
        Context context = c47424a.f429364a;
        String string = context.getString(R.string.submitting_select_title);
        List listU = C42745f0.U(new C47698a("comfort_deal", context.getString(R.string.submitting_select_comfortable_deal_item_title), new UniversalImage(new Image(P0.g(new Q(new Size(64, 56), Uri.parse("https://avito.st/static/ims/5d8d3a73-e5ea-446f-ac4a-25525240a71a_comfortable_deal_select_common_64x56.png")), new Q(new Size(96, 84), Uri.parse("https://avito.st/static/ims/e71417f8-0ba2-4142-8992-496eff88bf84_comfortable_deal_select_common_96x84.png")), new Q(new Size(128, 112), Uri.parse("https://avito.st/static/ims/c458d6a7-49ef-4e58-8d47-0fe72744c16d_comfortable_deal_select_common_128x112.png")), new Q(new Size(192, 168), Uri.parse("https://avito.st/static/ims/1d0d504b-ab1f-4374-8baa-ae7bcf7f1f74_comfortable_deal_select_common_192x168.png")), new Q(new Size(256, 224), Uri.parse("https://avito.st/static/ims/3b1288ec-00de-4134-aa77-18b8b642cda2_comfortable_deal_select_common_256x224.png")))), new Image(P0.g(new Q(new Size(64, 56), Uri.parse("https://avito.st/static/ims/5d8d3a73-e5ea-446f-ac4a-25525240a71a_comfortable_deal_select_common_64x56.png")), new Q(new Size(96, 84), Uri.parse("https://avito.st/static/ims/e71417f8-0ba2-4142-8992-496eff88bf84_comfortable_deal_select_common_96x84.png")), new Q(new Size(128, 112), Uri.parse("https://avito.st/static/ims/c458d6a7-49ef-4e58-8d47-0fe72744c16d_comfortable_deal_select_common_128x112.png")), new Q(new Size(192, 168), Uri.parse("https://avito.st/static/ims/1d0d504b-ab1f-4374-8baa-ae7bcf7f1f74_comfortable_deal_select_common_192x168.png")), new Q(new Size(256, 224), Uri.parse("https://avito.st/static/ims/3b1288ec-00de-4134-aa77-18b8b642cda2_comfortable_deal_select_common_256x224.png"))))), C42745f0.U(C47424a.a(context.getString(R.string.submitting_select_comfortable_deal_item_option1_bold), context.getString(R.string.submitting_select_comfortable_deal_item_option1_regular)), C47424a.a(context.getString(R.string.submitting_select_comfortable_deal_item_option2_bold), context.getString(R.string.submitting_select_comfortable_deal_item_option2_regular)), C47424a.a(context.getString(R.string.submitting_select_comfortable_deal_item_option3_bold), context.getString(R.string.submitting_select_comfortable_deal_item_option3_regular)), C47424a.a(context.getString(R.string.submitting_select_comfortable_deal_item_option4_bold), context.getString(R.string.submitting_select_comfortable_deal_item_option4_regular)), C47424a.a(context.getString(R.string.submitting_select_comfortable_deal_item_option5_bold), context.getString(R.string.submitting_select_comfortable_deal_item_option5_regular)), new C47699b(new AttributedText("{{icon_question}}{{icon_spacer}}{{about}}", C42745f0.U(new SpacerAttribute("icon_spacer", "", null, 8), new TextIconAttribute("icon_question", "questionOutline", null, C42745f0.U(new FontParameter.TextStyleParameter(null, "s10"), new FontParameter.ColorParameter(null, null, "blue")), 4, null), new DeepLinkAttribute("about", "Как это работает", new NoMatchLink(), null, null, C42745f0.U(new FontParameter.TextStyleParameter(null, "s10"), new FontParameter.ColorParameter(null, null, "blue")), 24, null)), 1), null)), context.getString(R.string.submitting_select_comfortable_deal_item_button_text), new OrderCallDeeplink()), new C47698a("independent_sale", context.getString(R.string.submitting_select_independent_sale_item_title), new UniversalImage(new Image(P0.g(new Q(new Size(64, 56), Uri.parse("https://avito.st/static/ims/22acb455-faf9-44d9-9579-a354e7ef91a4_independent_sale_select_common_64x56.png")), new Q(new Size(96, 84), Uri.parse("https://avito.st/static/ims/562fabb1-b156-4809-87c0-8eafa6133b41_independent_sale_select_common_96x84.png")), new Q(new Size(128, 112), Uri.parse("https://avito.st/static/ims/3f22e47c-2672-4249-b406-e206d64df267_independent_sale_select_common_128x112.png")), new Q(new Size(192, 168), Uri.parse("https://avito.st/static/ims/1359c41e-e0d8-4363-ac5e-719d291b3385_independent_sale_select_common_192x168.png")), new Q(new Size(256, 224), Uri.parse("https://avito.st/static/ims/868ac969-41c1-476b-b225-57d0b9647aad_independent_sale_select_common_256x224.png")))), new Image(P0.g(new Q(new Size(64, 56), Uri.parse("https://avito.st/static/ims/22acb455-faf9-44d9-9579-a354e7ef91a4_independent_sale_select_common_64x56.png")), new Q(new Size(96, 84), Uri.parse("https://avito.st/static/ims/562fabb1-b156-4809-87c0-8eafa6133b41_independent_sale_select_common_96x84.png")), new Q(new Size(128, 112), Uri.parse("https://avito.st/static/ims/3f22e47c-2672-4249-b406-e206d64df267_independent_sale_select_common_128x112.png")), new Q(new Size(192, 168), Uri.parse("https://avito.st/static/ims/1359c41e-e0d8-4363-ac5e-719d291b3385_independent_sale_select_common_192x168.png")), new Q(new Size(256, 224), Uri.parse("https://avito.st/static/ims/868ac969-41c1-476b-b225-57d0b9647aad_independent_sale_select_common_256x224.png"))))), Collections.singletonList(new C47699b(new AttributedText(context.getString(R.string.submitting_select_independent_sale_item_option), C42784z0.f406748b, 1), null)), context.getString(R.string.submitting_select_independent_sale_item_button_text), null));
        List<C47701d> listC = c47424a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((C47701d) obj).f430199a == ItemType.f120902c) {
                arrayList.add(obj);
            }
        }
        return C43175k.N(interfaceC43160iG, new C43210w(new SubmittingSelectInternalAction.ContentLoaded(new rp.h(string, arrayList, listU))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
