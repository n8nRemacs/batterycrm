package fm;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.campaigns_sale.di.p;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinDeeplinkCreator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfm/b;", "Lfm/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40442b implements InterfaceC40441a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CampaignsSaleArguments f396067a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396068b;

    @Inject
    public C40442b(@k CampaignsSaleArguments campaignsSaleArguments, @p @k String str) {
        this.f396067a = campaignsSaleArguments;
        this.f396068b = str;
    }

    @Override // fm.InterfaceC40441a
    @k
    public final BeduinUniversalPageLink a(@l Integer num, @k String str) {
        Uri.Builder builderAppendQueryParameter = Uri.parse("/api/1/campaigns/sales/" + this.f396067a.f114050b + "/categories").buildUpon().appendQueryParameter("blockId", str).appendQueryParameter("sessionID", this.f396068b);
        if (num != null) {
            builderAppendQueryParameter.appendQueryParameter("discount", String.valueOf(num));
        }
        return new BeduinUniversalPageLink(builderAppendQueryParameter.build().toString(), ScreenStyle.MODAL.f133649b, "seller-select-categories", null, null, null, null, 120, null);
    }
}
