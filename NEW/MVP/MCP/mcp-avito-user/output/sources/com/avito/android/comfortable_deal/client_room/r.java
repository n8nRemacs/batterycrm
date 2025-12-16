package com.avito.android.comfortable_deal.client_room;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import fp.C40460a;
import fp.C40461b;
import fp.c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ClientRoomMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/r;", "Lcom/avito/android/comfortable_deal/client_room/q;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f119931a;

    @Inject
    public r(@Y61.k Context context) {
        this.f119931a = context;
    }

    @Y61.l
    public static String b(@Y61.l String str) {
        if (str == null) {
            return null;
        }
        String strA0 = C43066x.a0(C43066x.a0(str, "\"", "", false), "\\n", "\n", false);
        if (strA0.length() <= 0 || C43066x.K(strA0)) {
            return null;
        }
        return strA0;
    }

    @Y61.l
    public static String c(@Y61.l Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() < 20) {
            return "меньше 20";
        }
        if (num.intValue() < 100) {
            return ((num.intValue() / 20) * 20) + "+ сделок";
        }
        if (num.intValue() < 100) {
            return null;
        }
        return ((num.intValue() / 50) * 50) + "+ сделок";
    }

    @Override // com.avito.android.comfortable_deal.client_room.q
    @Y61.k
    public final fp.c a(@Y61.k PartnerStatus partnerStatus) {
        String str;
        String string;
        String str2;
        String string2;
        if (!(partnerStatus instanceof PartnerStatus.Agent)) {
            if (!(partnerStatus instanceof PartnerStatus.Agency)) {
                return new c.C11172c(partnerStatus);
            }
            PartnerStatus.Agency agency = (PartnerStatus.Agency) partnerStatus;
            PartnerStatus.Agent agent = agency.f119874e;
            Integer num = agent != null ? agent.f119880g : null;
            if (num != null) {
                str = "c " + num + " года";
            } else {
                str = null;
            }
            String strC = c(agent != null ? agent.f119879f : null);
            String str3 = agent != null ? agent.f119878e : null;
            String str4 = (str3 == null || (string = C43066x.A0(str3).toString()) == null || string.length() == 0) ? null : string;
            String strB = b(agent != null ? agent.f119881h : null);
            return strB == null ? new c.C11172c(partnerStatus) : agent == null ? new c.C11172c(partnerStatus) : new c.b(d(agent.f119876c, agent.f119877d, agency.f119872c, strB, str, strC, str4), new C40460a(agency.f119872c, agency.f119873d));
        }
        PartnerStatus.Agent agent2 = (PartnerStatus.Agent) partnerStatus;
        String strB2 = b(agent2.f119881h);
        if (strB2 == null) {
            return new c.C11172c(partnerStatus);
        }
        Integer num2 = agent2.f119880g;
        if (num2 != null) {
            str2 = "c " + num2 + " года";
        } else {
            str2 = null;
        }
        String strC2 = c(agent2.f119879f);
        String str5 = agent2.f119878e;
        return new c.b(d(agent2.f119876c, agent2.f119877d, "ИП " + agent2.f119876c, strB2, str2, strC2, (str5 == null || (string2 = C43066x.A0(str5).toString()) == null || string2.length() == 0) ? null : string2), null);
    }

    public final C40461b d(String str, Image image, String str2, String str3, String str4, String str5, String str6) throws Resources.NotFoundException {
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.b.f63985c.getClass();
        int i12 = com.akita.compose.theme.re23.e.f64748rf;
        com.akita.compose.theme.re23.a aVar = com.akita.compose.theme.re23.b.f63984b;
        com.akita.compose.foundation.p pVar = aVar.f63966u0;
        Context context = this.f119931a;
        String string = context.getResources().getString(R.string.client_room_agency_card_documents_verified);
        C42784z0 c42784z0 = C42784z0.f406748b;
        List listU = C42745f0.U(new fp.i(i12, pVar, new AttributedText(string, c42784z0, 1), false, 8, null), new fp.i(com.akita.compose.theme.re23.e.f64879zb, aVar.f63981z0, new AttributedText(context.getResources().getString(R.string.client_room_agency_card_reviews), C42745f0.U(new FontAttribute("rank", "5.0", com.avito.android.advert.item.delivery_suggests.l.u(null, "m20")), new FontAttribute("text", "Подробнее", C42745f0.U(new FontParameter.TextStyleParameter(null, "m20"), new FontParameter.ColorParameter(null, null, "gray54")))), 1), true), new fp.i(com.akita.compose.theme.re23.e.f64697of, aVar.f63840E, new AttributedText(str2, c42784z0, 1), false, 8, null));
        ArrayList arrayList = new ArrayList();
        if (str4 != null) {
            arrayList.add(new fp.h(R.drawable.ic_clock_violet, str4, R.string.client_room_badge_work_experience));
        }
        if (str5 != null) {
            arrayList.add(new fp.h(R.drawable.ic_house_blue, str5, R.string.client_room_badge_deals_amount));
        }
        if (str6 != null) {
            arrayList.add(new fp.h(R.drawable.ic_geo_green, str6, R.string.client_room_badge_geo));
        }
        return new C40461b(str, str3, image, listU, arrayList);
    }
}
