package rp0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import uZ.e;

/* compiled from: BbipPrivateState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lrp0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47707c extends q {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f430245o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final C47707c f430246p = new C47707c(null, C42784z0.f406748b, null, null, null, null, false, true, false, null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final e f430247b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f430248c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ButtonAction f430249d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonAction f430250e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f430251f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Throwable f430252g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f430253h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f430254i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f430255j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final MnzFloatingFooter f430256k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Integer f430257l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f430258m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f430259n;

    /* compiled from: BbipPrivateState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrp0/c$a;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47707c(@l e eVar, @k List<? extends com.avito.conveyor_item.a> list, @l ButtonAction buttonAction, @l ButtonAction buttonAction2, @l String str, @l Throwable th2, boolean z12, boolean z13, boolean z14, @l MnzFloatingFooter mnzFloatingFooter, @l Integer num, @l String str2, @l String str3) {
        this.f430247b = eVar;
        this.f430248c = list;
        this.f430249d = buttonAction;
        this.f430250e = buttonAction2;
        this.f430251f = str;
        this.f430252g = th2;
        this.f430253h = z12;
        this.f430254i = z13;
        this.f430255j = z14;
        this.f430256k = mnzFloatingFooter;
        this.f430257l = num;
        this.f430258m = str2;
        this.f430259n = str3;
    }

    public static C47707c a(C47707c c47707c, e eVar, List list, ButtonAction buttonAction, ButtonAction buttonAction2, String str, ApiException apiException, boolean z12, boolean z13, boolean z14, MnzFloatingFooter mnzFloatingFooter, Integer num, String str2, String str3, int i12) {
        e eVar2 = (i12 & 1) != 0 ? c47707c.f430247b : eVar;
        List list2 = (i12 & 2) != 0 ? c47707c.f430248c : list;
        ButtonAction buttonAction3 = (i12 & 4) != 0 ? c47707c.f430249d : buttonAction;
        ButtonAction buttonAction4 = (i12 & 8) != 0 ? c47707c.f430250e : buttonAction2;
        String str4 = (i12 & 16) != 0 ? c47707c.f430251f : str;
        Throwable th2 = (i12 & 32) != 0 ? c47707c.f430252g : apiException;
        boolean z15 = (i12 & 64) != 0 ? c47707c.f430253h : z12;
        boolean z16 = (i12 & 128) != 0 ? c47707c.f430254i : z13;
        boolean z17 = (i12 & 256) != 0 ? c47707c.f430255j : z14;
        MnzFloatingFooter mnzFloatingFooter2 = (i12 & 512) != 0 ? c47707c.f430256k : mnzFloatingFooter;
        Integer num2 = (i12 & 1024) != 0 ? c47707c.f430257l : num;
        String str5 = (i12 & 2048) != 0 ? c47707c.f430258m : str2;
        String str6 = (i12 & 4096) != 0 ? c47707c.f430259n : str3;
        c47707c.getClass();
        return new C47707c(eVar2, list2, buttonAction3, buttonAction4, str4, th2, z15, z16, z17, mnzFloatingFooter2, num2, str5, str6);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47707c)) {
            return false;
        }
        C47707c c47707c = (C47707c) obj;
        return L.f(this.f430247b, c47707c.f430247b) && L.f(this.f430248c, c47707c.f430248c) && L.f(this.f430249d, c47707c.f430249d) && L.f(this.f430250e, c47707c.f430250e) && L.f(this.f430251f, c47707c.f430251f) && L.f(this.f430252g, c47707c.f430252g) && this.f430253h == c47707c.f430253h && this.f430254i == c47707c.f430254i && this.f430255j == c47707c.f430255j && L.f(this.f430256k, c47707c.f430256k) && L.f(this.f430257l, c47707c.f430257l) && L.f(this.f430258m, c47707c.f430258m) && L.f(this.f430259n, c47707c.f430259n);
    }

    public final int hashCode() {
        e eVar = this.f430247b;
        int iE2 = H.e((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f430248c);
        ButtonAction buttonAction = this.f430249d;
        int iHashCode = (iE2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ButtonAction buttonAction2 = this.f430250e;
        int iHashCode2 = (iHashCode + (buttonAction2 == null ? 0 : buttonAction2.hashCode())) * 31;
        String str = this.f430251f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th2 = this.f430252g;
        int i12 = r.i(r.i(r.i((iHashCode3 + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.f430253h), 31, this.f430254i), 31, this.f430255j);
        MnzFloatingFooter mnzFloatingFooter = this.f430256k;
        int iHashCode4 = (i12 + (mnzFloatingFooter == null ? 0 : mnzFloatingFooter.hashCode())) * 31;
        Integer num = this.f430257l;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f430258m;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f430259n;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipPrivateState(navBar=");
        sb2.append(this.f430247b);
        sb2.append(", items=");
        sb2.append(this.f430248c);
        sb2.append(", skipAction=");
        sb2.append(this.f430249d);
        sb2.append(", nextAction=");
        sb2.append(this.f430250e);
        sb2.append(", checkoutContext=");
        sb2.append(this.f430251f);
        sb2.append(", error=");
        sb2.append(this.f430252g);
        sb2.append(", needUpdateForecast=");
        sb2.append(this.f430253h);
        sb2.append(", isConfiguratorLoading=");
        sb2.append(this.f430254i);
        sb2.append(", isContextLoading=");
        sb2.append(this.f430255j);
        sb2.append(", floatingFooter=");
        sb2.append(this.f430256k);
        sb2.append(", clickedButtonId=");
        sb2.append(this.f430257l);
        sb2.append(", nextActionUxFeedbackCampaignName=");
        sb2.append(this.f430258m);
        sb2.append(", skipActionUxFeedbackCampaignName=");
        return C22026a.c(sb2, this.f430259n, ')');
    }
}
