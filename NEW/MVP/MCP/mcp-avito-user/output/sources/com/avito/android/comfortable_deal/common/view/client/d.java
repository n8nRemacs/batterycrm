package com.avito.android.comfortable_deal.common.view.client;

import android.net.Uri;
import com.avito.android.comfortable_deal.api.model.Client;
import com.avito.android.comfortable_deal.api.model.RealtyImage;
import com.avito.android.comfortable_deal.api.model.RealtyItem;
import com.avito.android.comfortable_deal.api.model.Stage;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.TextIconAttribute;
import com.avito.android.util.L4;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ClientCardData.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final L4 f120662a = new L4(true, true);

    public static final AttributedText a(String str, String str2, UniversalColor universalColor) {
        List listU = C42745f0.U(new FontParameter.TextStyleParameter(null, "s20"), new FontParameter.ColorParameter(universalColor.getColor(), universalColor.getColorDark(), universalColor.getColorKey()));
        return str2 != null ? new AttributedText("{{icon}} {{text}}", C42745f0.U(new TextIconAttribute("icon", str2, null, listU, 4, null), new FontAttribute("text", str, listU)), 1) : new AttributedText("{{text}}", Collections.singletonList(new FontAttribute("text", str, listU)), 1);
    }

    public static final ClientCardData b(Stage stage, Client client, RealtyItem realtyItem, String str) {
        Uri largeImage;
        Uri smallImage;
        AttributedText attributedTextA = a(stage.getDisplay().getStageDisplay(), stage.getDisplay().getStageIcon(), stage.getDisplay().getColors().getStageColor());
        String statusDisplay = stage.getDisplay().getStatusDisplay();
        AttributedText attributedTextA2 = statusDisplay != null ? a(statusDisplay, stage.getDisplay().getStatusIcon(), stage.getDisplay().getColors().getStatusColor()) : null;
        Image image = client.getImage();
        String name = client.getName();
        String phone = client.getPhone();
        String str2 = phone != null ? f120662a.b(0, phone).f318924a : null;
        boolean zF2 = L.f(stage.getStatus(), "refused");
        RealtyImage image2 = realtyItem.getImage();
        if (image2 == null || (smallImage = image2.getSmallImage()) == null) {
            RealtyImage image3 = realtyItem.getImage();
            largeImage = image3 != null ? image3.getLargeImage() : null;
        } else {
            largeImage = smallImage;
        }
        StringBuilder sb2 = new StringBuilder();
        long price = realtyItem.getPrice();
        sb2.append(price >= 1000000000 ? AK.c.j(price / 1000000000, " млрд.", new StringBuilder()) : price >= 1000000 ? AK.c.j(price / 1000000, " млн.", new StringBuilder()) : price >= 1000 ? AK.c.j(price / 1000, " тыс.", new StringBuilder()) : String.valueOf(price));
        sb2.append(", ");
        sb2.append(realtyItem.getTitle().toLowerCase(Locale.ROOT));
        sb2.append(", ");
        sb2.append(realtyItem.getAddress());
        return new ClientCardData(str, image, name, str2, new RealtyData(largeImage, attributedTextA, attributedTextA2, sb2.toString(), stage.getDisplay().getColors().getProgressColor(), stage.getDisplay().getProgress() / 100.0f, false, 64, null), zF2, new NoMatchLink());
    }
}
