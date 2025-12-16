package Hp;

import Hp.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import com.avito.android.comfortable_deal.common.view.CommissionData;
import com.avito.android.comfortable_deal.end_deal.model.CommissionInfo;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EndDealState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LHp/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f7730l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final c f7731m = new c(false, false, false, null, null, null, null, null, false, null, 1023, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7732b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7733c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7734d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CommissionData f7735e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final CommissionDetailsDialogArguments f7736f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Map<String, EndDealField> f7737g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f7738h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final CommissionInfo f7739i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7740j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final d f7741k;

    /* compiled from: EndDealState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHp/c$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(false, false, false, null, null, null, null, null, false, null, 1023, null);
    }

    public static c a(c cVar, boolean z12, boolean z13, boolean z14, CommissionData commissionData, CommissionDetailsDialogArguments commissionDetailsDialogArguments, Map map, AttributedText attributedText, CommissionInfo commissionInfo, boolean z15, d dVar, int i12) {
        boolean z16 = (i12 & 1) != 0 ? cVar.f7732b : z12;
        boolean z17 = (i12 & 2) != 0 ? cVar.f7733c : z13;
        boolean z18 = (i12 & 4) != 0 ? cVar.f7734d : z14;
        CommissionData commissionData2 = (i12 & 8) != 0 ? cVar.f7735e : commissionData;
        CommissionDetailsDialogArguments commissionDetailsDialogArguments2 = (i12 & 16) != 0 ? cVar.f7736f : commissionDetailsDialogArguments;
        Map map2 = (i12 & 32) != 0 ? cVar.f7737g : map;
        AttributedText attributedText2 = (i12 & 64) != 0 ? cVar.f7738h : attributedText;
        CommissionInfo commissionInfo2 = (i12 & 128) != 0 ? cVar.f7739i : commissionInfo;
        boolean z19 = (i12 & 256) != 0 ? cVar.f7740j : z15;
        d dVar2 = (i12 & 512) != 0 ? cVar.f7741k : dVar;
        cVar.getClass();
        return new c(z16, z17, z18, commissionData2, commissionDetailsDialogArguments2, map2, attributedText2, commissionInfo2, z19, dVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7732b == cVar.f7732b && this.f7733c == cVar.f7733c && this.f7734d == cVar.f7734d && L.f(this.f7735e, cVar.f7735e) && L.f(this.f7736f, cVar.f7736f) && L.f(this.f7737g, cVar.f7737g) && L.f(this.f7738h, cVar.f7738h) && L.f(this.f7739i, cVar.f7739i) && this.f7740j == cVar.f7740j && L.f(this.f7741k, cVar.f7741k);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(Boolean.hashCode(this.f7732b) * 31, 31, this.f7733c), 31, this.f7734d);
        CommissionData commissionData = this.f7735e;
        int iHashCode = (i12 + (commissionData == null ? 0 : commissionData.hashCode())) * 31;
        CommissionDetailsDialogArguments commissionDetailsDialogArguments = this.f7736f;
        int iHashCode2 = (iHashCode + (commissionDetailsDialogArguments == null ? 0 : commissionDetailsDialogArguments.hashCode())) * 31;
        Map<String, EndDealField> map = this.f7737g;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        AttributedText attributedText = this.f7738h;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        CommissionInfo commissionInfo = this.f7739i;
        return this.f7741k.hashCode() + r.i((iHashCode4 + (commissionInfo != null ? commissionInfo.hashCode() : 0)) * 31, 31, this.f7740j);
    }

    @k
    public final String toString() {
        return "EndDealState(isLoading=" + this.f7732b + ", isSubmitting=" + this.f7733c + ", isLoadingCommission=" + this.f7734d + ", commissionData=" + this.f7735e + ", dialogArguments=" + this.f7736f + ", fields=" + this.f7737g + ", title=" + this.f7738h + ", commissionInfo=" + this.f7739i + ", isError=" + this.f7740j + ", viewState=" + this.f7741k + ')';
    }

    public /* synthetic */ c(boolean z12, boolean z13, boolean z14, CommissionData commissionData, CommissionDetailsDialogArguments commissionDetailsDialogArguments, Map map, AttributedText attributedText, CommissionInfo commissionInfo, boolean z15, d dVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? null : commissionData, (i12 & 16) != 0 ? null : commissionDetailsDialogArguments, (i12 & 32) != 0 ? null : map, (i12 & 64) != 0 ? null : attributedText, (i12 & 128) == 0 ? commissionInfo : null, (i12 & 256) == 0 ? z15 : false, (i12 & 512) != 0 ? d.c.f7748a : dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, boolean z13, boolean z14, @l CommissionData commissionData, @l CommissionDetailsDialogArguments commissionDetailsDialogArguments, @l Map<String, ? extends EndDealField> map, @l AttributedText attributedText, @l CommissionInfo commissionInfo, boolean z15, @k d dVar) {
        this.f7732b = z12;
        this.f7733c = z13;
        this.f7734d = z14;
        this.f7735e = commissionData;
        this.f7736f = commissionDetailsDialogArguments;
        this.f7737g = map;
        this.f7738h = attributedText;
        this.f7739i = commissionInfo;
        this.f7740j = z15;
        this.f7741k = dVar;
    }
}
