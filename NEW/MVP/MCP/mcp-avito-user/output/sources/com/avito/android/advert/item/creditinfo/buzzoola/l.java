package com.avito.android.advert.item.creditinfo.buzzoola;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.creditinfo.buzzoola.a;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaCreditConfig;
import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BuzzoolaCreditBannerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/l;", "Lcom/avito/android/advert/item/creditinfo/buzzoola/k;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public o f74962b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public BuzzoolaCreditBannerItem f74963c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.creditinfo.buzzoola.a f74964d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74965e = true;

    /* renamed from: f, reason: collision with root package name */
    public v f74966f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74967g;

    /* compiled from: BuzzoolaCreditBannerPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74968a;

        static {
            int[] iArr = new int[BuzzoolaPromoType.values().length];
            try {
                iArr[BuzzoolaPromoType.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuzzoolaPromoType.SOCIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f74968a = iArr;
        }
    }

    @Inject
    public l() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        BuzzoolaCreditBannerItem buzzoolaCreditBannerItem = (BuzzoolaCreditBannerItem) aVar;
        this.f74965e = buzzoolaCreditBannerItem.f74916d;
        this.f74962b = (o) eVar;
        this.f74963c = buzzoolaCreditBannerItem;
        com.avito.android.advert.item.creditinfo.buzzoola.a aVar2 = this.f74964d;
        if (aVar2 != null) {
            Sd(aVar2);
        }
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.k
    public final void Pd(@Y61.k d dVar) {
        this.f74966f = (v) dVar;
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.k
    public final void Qd(@Y61.l BuzzoolaBanner.BuzzoolaCredit buzzoolaCredit) {
        if (this.f74964d instanceof a.c) {
            if (buzzoolaCredit == null) {
                o oVar = this.f74962b;
                if (oVar != null) {
                    oVar.Y3();
                    return;
                }
                return;
            }
            o oVar2 = this.f74962b;
            if (oVar2 != null) {
                oVar2.iH(buzzoolaCredit.f88211e, this.f74967g ? buzzoolaCredit.f88212f : null);
            }
        }
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.k
    @Y61.l
    /* renamed from: Rd, reason: from getter */
    public final com.avito.android.advert.item.creditinfo.buzzoola.a getF74964d() {
        return this.f74964d;
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.k
    public final void Sd(@Y61.k com.avito.android.advert.item.creditinfo.buzzoola.a aVar) {
        o oVar;
        String str;
        String str2;
        BuzzoolaCreditConfig buzzoolaCreditConfig;
        boolean z12 = aVar instanceof a.c;
        a.c cVar = z12 ? (a.c) aVar : null;
        BuzzoolaBanner.BuzzoolaCredit buzzoolaCredit = cVar != null ? cVar.f74924b : null;
        BuzzoolaPromoType buzzoolaPromoType = (buzzoolaCredit == null || (buzzoolaCreditConfig = buzzoolaCredit.f88213g) == null) ? null : buzzoolaCreditConfig.f88287h;
        int i12 = buzzoolaPromoType == null ? -1 : a.f74968a[buzzoolaPromoType.ordinal()];
        this.f74967g = i12 == 1 || !(i12 != 2 || (str = buzzoolaCredit.f88212f) == null || str.length() == 0 || (str2 = buzzoolaCredit.f88213g.f88286g) == null || str2.length() == 0);
        BuzzoolaCreditBannerItem buzzoolaCreditBannerItem = this.f74963c;
        if (buzzoolaCreditBannerItem != null) {
            buzzoolaCreditBannerItem.f74920h = aVar;
        }
        this.f74964d = aVar;
        if (!z12) {
            if (aVar instanceof a.b) {
                o oVar2 = this.f74962b;
                if (oVar2 != null) {
                    oVar2.z20();
                    return;
                }
                return;
            }
            if (!(aVar instanceof a.C2226a) || (oVar = this.f74962b) == null) {
                return;
            }
            oVar.Ek();
            return;
        }
        o oVar3 = this.f74962b;
        if (oVar3 != null) {
            oVar3.pz(this.f74965e);
            a.c cVar2 = (a.c) aVar;
            BuzzoolaBanner.BuzzoolaCredit buzzoolaCredit2 = cVar2.f74924b;
            String str3 = cVar2.f74926d;
            if (str3 != null) {
                oVar3.WO(str3, buzzoolaCredit2.f88209c);
            } else {
                oVar3.setTitle(buzzoolaCredit2.f88208b);
                oVar3.U7(buzzoolaCredit2.f88209c, buzzoolaCredit2.f88208b.length() > 0);
            }
            oVar3.kC(this.f74967g);
            oVar3.Oc(this.f74967g ? buzzoolaCredit2.f88213g.f88286g : null);
            oVar3.y9(buzzoolaCredit2.f88210d);
            v vVar = this.f74966f;
            oVar3.Pd(vVar != null ? vVar : null);
        }
    }
}
