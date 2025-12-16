package qp;

import Y61.k;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.comfortable_deal.data_source.model.ItemType;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.remote.model.text.TextIconAttribute;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import rp.C47699b;
import rp.C47701d;

/* compiled from: PromoDataSource.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqp/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47424a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f429364a;

    @Inject
    public C47424a(@k Context context) {
        this.f429364a = context;
    }

    public static C47699b a(String str, String str2) {
        return new C47699b(new AttributedText("{{header}} {{description}}", C42745f0.U(new FontAttribute("header", str, C42745f0.U(new FontParameter.TextStyleParameter(null, "h70"), new FontParameter.StyleParameter(FontStyleKt.BOLD))), new FontAttribute("description", str2, l.u(null, "s10"))), 1), new AttributedText("{{icon_name}}", Collections.singletonList(new TextIconAttribute("icon_name", PaymentStateKt.PAYMENT_STATE_DONE, null, l.u(null, "s10"), 4, null)), 1));
    }

    public final AttributedText b() {
        Context context = this.f429364a;
        String string = context.getString(R.string.promo_content_phone_input_hint);
        FontAttribute fontAttribute = new FontAttribute("text1", context.getString(R.string.legal_text_attr1), C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(null, null, "gray48")));
        FontAttribute fontAttribute2 = new FontAttribute("text2", context.getString(R.string.legal_text_attr2), C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(null, null, "gray48")));
        String string2 = context.getString(R.string.legal_link_attr1_title);
        WebViewLink.OnlyAvitoDomain onlyAvitoDomain = new WebViewLink.OnlyAvitoDomain(Uri.parse(context.getString(R.string.legal_link_attr1_url)), null, null, 6, null);
        FontParameter.TextStyleParameter textStyleParameter = new FontParameter.TextStyleParameter(null, "s20");
        FontParameter.ColorParameter colorParameter = new FontParameter.ColorParameter(null, null, "gray48");
        FontParameter.UnderlineParameter underlineParameter = FontParameter.UnderlineParameter.INSTANCE;
        return new AttributedText(string, C42745f0.U(fontAttribute, fontAttribute2, new DeepLinkAttribute("link1", string2, onlyAvitoDomain, null, null, C42745f0.U(textStyleParameter, colorParameter, underlineParameter), 24, null), new DeepLinkAttribute("link2", context.getString(R.string.legal_link_attr2_title), new WebViewLink.OnlyAvitoDomain(Uri.parse(context.getString(R.string.legal_link_attr2_url)), null, null, 6, null), null, null, C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(null, null, "gray48"), underlineParameter), 24, null)), 1);
    }

    public final List<C47701d> c() {
        ItemType itemType = ItemType.f120901b;
        Context context = this.f429364a;
        C47701d c47701d = new C47701d(itemType, context.getString(R.string.promo_content_list_title_item), null, null);
        ItemType itemType2 = ItemType.f120903d;
        C47701d c47701d2 = new C47701d(itemType2, context.getString(R.string.promo_content_list_image_item1), Integer.valueOf(R.drawable.ic_promo1), null);
        C47701d c47701d3 = new C47701d(itemType2, context.getString(R.string.promo_content_list_image_item2), Integer.valueOf(R.drawable.ic_promo2), null);
        C47701d c47701d4 = new C47701d(itemType2, context.getString(R.string.promo_content_list_image_item3), Integer.valueOf(R.drawable.ic_promo3), null);
        C47701d c47701d5 = new C47701d(itemType2, context.getString(R.string.promo_content_list_image_item4), Integer.valueOf(R.drawable.ic_promo4), null);
        C47701d c47701d6 = new C47701d(itemType2, context.getString(R.string.promo_content_list_image_item5), Integer.valueOf(R.drawable.ic_promo5), null);
        C47701d c47701d7 = new C47701d(itemType, "Как это работает", null, null);
        ItemType itemType3 = ItemType.f120902c;
        return C42745f0.U(c47701d, c47701d2, c47701d3, c47701d4, c47701d5, c47701d6, c47701d7, new C47701d(itemType3, context.getString(R.string.promo_content_list_text_item1), null, 1), new C47701d(itemType3, context.getString(R.string.promo_content_list_text_item2), null, 2), new C47701d(itemType3, context.getString(R.string.promo_content_list_text_item3), null, 3), new C47701d(itemType3, context.getString(R.string.promo_content_list_text_item4), null, 4), new C47701d(itemType3, context.getString(R.string.promo_content_list_text_item5), null, 5), new C47701d(itemType3, context.getString(R.string.promo_content_list_text_item6), null, 6), new C47701d(itemType3, context.getString(R.string.promo_content_list_text_item7), null, 7));
    }
}
