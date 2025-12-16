package xp;

import Y41.l;
import Y61.k;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.btob_business_trip.screens.selectItemScreen.t;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DigitalRegistrationUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: xp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49980a {
    @k
    public static final AttributedText a(@k Context context, @k l<? super String, G0> lVar) {
        String string = context.getString(R.string.promo_content_phone_input_hint);
        FontAttribute fontAttribute = new FontAttribute("text1", context.getString(R.string.legal_text_attr1), C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(null, null, "gray48")));
        FontAttribute fontAttribute2 = new FontAttribute("text2", context.getString(R.string.legal_text_attr2), C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(null, null, "gray48")));
        String string2 = context.getString(R.string.client_room_digital_registration_legal_link_attr1_title);
        String string3 = context.getString(R.string.client_room_digital_registration_legal_link_attr1_url);
        FontParameter.TextStyleParameter textStyleParameter = new FontParameter.TextStyleParameter(null, "s20");
        FontParameter.ColorParameter colorParameter = new FontParameter.ColorParameter(null, null, "gray48");
        FontParameter.UnderlineParameter underlineParameter = FontParameter.UnderlineParameter.INSTANCE;
        AttributedText attributedText = new AttributedText(string, C42745f0.U(fontAttribute, fontAttribute2, new LinkAttribute("link1", string2, string3, C42745f0.U(textStyleParameter, colorParameter, underlineParameter)), new LinkAttribute("link2", context.getString(R.string.legal_link_attr2_title), context.getString(R.string.legal_link_attr2_url), C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(null, null, "gray48"), underlineParameter))), 1);
        attributedText.setOnUrlClickListener(new t(5, lVar));
        return attributedText;
    }
}
