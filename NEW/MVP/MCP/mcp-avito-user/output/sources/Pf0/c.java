package PF0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.trx_promo_goods.screens.status.domain.TrxPromoGoodsStatus;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsStatusState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPF0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f12920k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f12921l = new c(false, 0, null, null, null, null, null, null, true);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12922b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12923c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TrxPromoGoodsStatus f12924d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f12925e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f12926f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f12927g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ButtonAction f12928h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f12929i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12930j;

    /* compiled from: TrxPromoGoodsStatusState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPF0/c$a;", "", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(boolean z12, @InterfaceC42165v int i12, @l TrxPromoGoodsStatus trxPromoGoodsStatus, @l UniversalImage universalImage, @l AttributedText attributedText, @l AttributedText attributedText2, @l ButtonAction buttonAction, @l String str, boolean z13) {
        this.f12922b = z12;
        this.f12923c = i12;
        this.f12924d = trxPromoGoodsStatus;
        this.f12925e = universalImage;
        this.f12926f = attributedText;
        this.f12927g = attributedText2;
        this.f12928h = buttonAction;
        this.f12929i = str;
        this.f12930j = z13;
    }

    public static c a(c cVar, boolean z12, int i12, TrxPromoGoodsStatus trxPromoGoodsStatus, UniversalImage universalImage, AttributedText attributedText, AttributedText attributedText2, ButtonAction buttonAction, String str, boolean z13, int i13) {
        boolean z14 = (i13 & 1) != 0 ? cVar.f12922b : z12;
        int i14 = (i13 & 2) != 0 ? cVar.f12923c : i12;
        TrxPromoGoodsStatus trxPromoGoodsStatus2 = (i13 & 4) != 0 ? cVar.f12924d : trxPromoGoodsStatus;
        UniversalImage universalImage2 = (i13 & 8) != 0 ? cVar.f12925e : universalImage;
        AttributedText attributedText3 = (i13 & 16) != 0 ? cVar.f12926f : attributedText;
        AttributedText attributedText4 = (i13 & 32) != 0 ? cVar.f12927g : attributedText2;
        ButtonAction buttonAction2 = (i13 & 64) != 0 ? cVar.f12928h : buttonAction;
        String str2 = (i13 & 128) != 0 ? cVar.f12929i : str;
        boolean z15 = (i13 & 256) != 0 ? cVar.f12930j : z13;
        cVar.getClass();
        return new c(z14, i14, trxPromoGoodsStatus2, universalImage2, attributedText3, attributedText4, buttonAction2, str2, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12922b == cVar.f12922b && this.f12923c == cVar.f12923c && this.f12924d == cVar.f12924d && L.f(this.f12925e, cVar.f12925e) && L.f(this.f12926f, cVar.f12926f) && L.f(this.f12927g, cVar.f12927g) && L.f(this.f12928h, cVar.f12928h) && L.f(this.f12929i, cVar.f12929i) && this.f12930j == cVar.f12930j;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f12923c, Boolean.hashCode(this.f12922b) * 31, 31);
        TrxPromoGoodsStatus trxPromoGoodsStatus = this.f12924d;
        int iHashCode = (iE2 + (trxPromoGoodsStatus == null ? 0 : trxPromoGoodsStatus.hashCode())) * 31;
        UniversalImage universalImage = this.f12925e;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AttributedText attributedText = this.f12926f;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f12927g;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        ButtonAction buttonAction = this.f12928h;
        int iHashCode5 = (iHashCode4 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        String str = this.f12929i;
        return Boolean.hashCode(this.f12930j) + ((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsStatusState(isClosable=");
        sb2.append(this.f12922b);
        sb2.append(", navigationIcon=");
        sb2.append(this.f12923c);
        sb2.append(", status=");
        sb2.append(this.f12924d);
        sb2.append(", image=");
        sb2.append(this.f12925e);
        sb2.append(", title=");
        sb2.append(this.f12926f);
        sb2.append(", subtitle=");
        sb2.append(this.f12927g);
        sb2.append(", action=");
        sb2.append(this.f12928h);
        sb2.append(", error=");
        sb2.append(this.f12929i);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f12930j, ')');
    }
}
