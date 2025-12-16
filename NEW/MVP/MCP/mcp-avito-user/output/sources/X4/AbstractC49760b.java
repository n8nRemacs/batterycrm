package x4;

import TV0.e;
import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.autoteka.common.AdvertDetailsAutotekaTeaserItemCommon;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.autotekateaser.AutotekaCpoTeaser;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserItem;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.CpoDescription;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import x4.InterfaceC49759a;
import x4.InterfaceC49759a.b;
import x4.c;

/* compiled from: AdvertDetailsAutotekaTeaserPresenterCommon.kt */
@P
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\b\u0002\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0005*\b\b\u0003\u0010\b*\u00020\u00072\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t¨\u0006\n"}, d2 = {"Lx4/b;", "Lcom/avito/android/remote/model/autotekateaser/AutotekaTeaserItem;", "ItemResponse", "Lx4/c;", "View", "Lcom/avito/android/advert/item/autoteka/common/AdvertDetailsAutotekaTeaserItemCommon;", "Item", "Lx4/a$b;", "Router", "Lx4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x4.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC49760b<ItemResponse extends AutotekaTeaserItem, View extends c, Item extends AdvertDetailsAutotekaTeaserItemCommon<ItemResponse>, Router extends InterfaceC49759a.b> implements InterfaceC49759a<ItemResponse, View, Item, Router> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f442181b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.autoteka.data.a f442182c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View f442183d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public W0 f442184e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public AutotekaTeaserResult f442185f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public String f442186g;

    public AbstractC49760b(@k com.avito.android.autoteka.data.a aVar, @k @InterfaceC30174s String str) {
        this.f442181b = str;
        this.f442182c = aVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        AdvertDetailsAutotekaTeaserItemCommon advertDetailsAutotekaTeaserItemCommon = (AdvertDetailsAutotekaTeaserItemCommon) aVar;
        this.f442183d = (View) eVar;
        AutotekaTeaserItem autotekaTeaserItem = (AutotekaTeaserItem) advertDetailsAutotekaTeaserItemCommon.getF73157d();
        if (autotekaTeaserItem != null) {
            n0(autotekaTeaserItem);
        }
        AutotekaTeaserItem autotekaTeaserItem2 = (AutotekaTeaserItem) advertDetailsAutotekaTeaserItemCommon.getF73157d();
        this.f442185f = autotekaTeaserItem2 != null ? autotekaTeaserItem2.getAutotekaData() : null;
        this.f442186g = advertDetailsAutotekaTeaserItemCommon.getF73158e();
    }

    public void V() {
        AutotekaTeaserResult autotekaTeaserResult = this.f442185f;
        if (autotekaTeaserResult != null) {
            com.avito.android.autoteka.helpers.b.f96647a.getClass();
            AutotekaPurchaseAction autotekaPurchaseActionA = com.avito.android.autoteka.helpers.b.a(autotekaTeaserResult);
            com.avito.android.autoteka.helpers.b.a(autotekaTeaserResult);
            G0 g02 = null;
            if (autotekaPurchaseActionA != null) {
                FromBlock fromBlock = FromBlock.f96083c;
                AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParamsC = com.avito.android.autoteka.helpers.b.c(autotekaPurchaseActionA, 0, this.f442186g, null, null);
                W0 w02 = this.f442184e;
                if (w02 != null) {
                    w02.a(autotekaChoosingPurchaseButtonParamsC.f97068b);
                    g02 = G0.f406611a;
                }
            }
            if (g02 == null) {
                k0();
            }
        }
    }

    @Override // x4.InterfaceC49759a
    public final void V5(@k W0 w02) {
        this.f442184e = w02;
    }

    @Override // x4.InterfaceC49759a
    public final void c0() {
        this.f442184e = null;
    }

    @Override // x4.InterfaceC49759a
    public final void e0() {
        this.f442183d = null;
    }

    @Override // x4.c.a
    public final void g0(@k FromBlock fromBlock, @k AutotekaReportLink autotekaReportLink) {
        W0 w02 = this.f442184e;
        if (w02 != null) {
            Uri url = autotekaReportLink.getUrl();
            String strValueOf = String.valueOf(fromBlock.f96095b);
            Uri.Builder builderBuildUpon = url.buildUpon();
            builderBuildUpon.appendQueryParameter("fromBlock", strValueOf);
            w02.a(new AutotekaBuyReportLink(builderBuildUpon.build().toString(), null, null, null));
        }
    }

    @Override // com.avito.android.advert.item.teaser.a.b
    public final void h0(@k String str) {
        this.f442182c.l(this.f442181b, str, FromBlock.f96086f);
        W0 w02 = this.f442184e;
        if (w02 != null) {
            w02.a(new AutotekaBuyReportLink(str, null, null, null, 14, null));
        }
    }

    @Override // x4.c.a
    public final void i0(@k DeepLink deepLink) {
        FromBlock fromBlock = FromBlock.f96083c;
        this.f442182c.g();
        W0 w02 = this.f442184e;
        if (w02 != null) {
            w02.a(deepLink);
        }
    }

    @Override // x4.c.a
    public final void k(@k CpoDescription cpoDescription) {
        W0 w02 = this.f442184e;
        if (w02 != null) {
            w02.o(cpoDescription);
        }
    }

    public final void k0() {
        AutotekaReportLink reportLink;
        Uri url;
        AutotekaCpoTeaser cpo;
        AutotekaReportLink reportLink2;
        AutotekaTeaserResult autotekaTeaserResult = this.f442185f;
        if (autotekaTeaserResult == null || (cpo = autotekaTeaserResult.getCpo()) == null || (reportLink2 = cpo.getReportLink()) == null || (url = reportLink2.getUrl()) == null) {
            AutotekaTeaserResult autotekaTeaserResult2 = this.f442185f;
            if (autotekaTeaserResult2 == null || (reportLink = autotekaTeaserResult2.getReportLink()) == null) {
                return;
            } else {
                url = reportLink.getUrl();
            }
        }
        this.f442182c.l(this.f442181b, url.toString(), FromBlock.f96086f);
        W0 w02 = this.f442184e;
        if (w02 != null) {
            w02.a(new AutotekaBuyReportLink(url.toString(), null, null, null, 14, null));
        }
    }

    public abstract void n0(@k ItemResponse itemresponse);

    public void Y(@k DeepLink deepLink) {
    }
}
