package qM0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.util.ApiException;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import uZ.e;

/* compiled from: VasUnionV2State.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LqM0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C47322c extends q {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f429223r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final C47322c f429224s;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f429225b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f429226c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Throwable f429227d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final e f429228e;

    /* renamed from: f, reason: collision with root package name */
    public final int f429229f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f429230g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Map<String, List<com.avito.conveyor_item.a>> f429231h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f429232i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f429233j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Integer f429234k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f429235l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Integer f429236m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final MnzFloatingFooter f429237n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final MnzFloatingFooterContact f429238o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f429239p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final Integer f429240q;

    /* compiled from: VasUnionV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqM0/c$a;", "", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f429224s = new C47322c(false, true, null, null, -1, c42784z0, P0.c(), c42784z0, null, null, null, null, null, null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47322c(boolean z12, boolean z13, @l Throwable th2, @l e eVar, @InterfaceC42165v int i12, @k List<? extends com.avito.conveyor_item.a> list, @k Map<String, ? extends List<? extends com.avito.conveyor_item.a>> map, @k List<? extends com.avito.conveyor_item.a> list2, @l String str, @l Integer num, @l String str2, @l Integer num2, @l MnzFloatingFooter mnzFloatingFooter, @l MnzFloatingFooterContact mnzFloatingFooterContact, boolean z14, @l Integer num3) {
        this.f429225b = z12;
        this.f429226c = z13;
        this.f429227d = th2;
        this.f429228e = eVar;
        this.f429229f = i12;
        this.f429230g = list;
        this.f429231h = map;
        this.f429232i = list2;
        this.f429233j = str;
        this.f429234k = num;
        this.f429235l = str2;
        this.f429236m = num2;
        this.f429237n = mnzFloatingFooter;
        this.f429238o = mnzFloatingFooterContact;
        this.f429239p = z14;
        this.f429240q = num3;
    }

    public static C47322c a(C47322c c47322c, boolean z12, boolean z13, ApiException apiException, e eVar, int i12, List list, Map map, ArrayList arrayList, String str, Integer num, String str2, Integer num2, MnzFloatingFooter mnzFloatingFooter, MnzFloatingFooterContact mnzFloatingFooterContact, boolean z14, Integer num3, int i13) {
        boolean z15 = (i13 & 1) != 0 ? c47322c.f429225b : z12;
        boolean z16 = (i13 & 2) != 0 ? c47322c.f429226c : z13;
        Throwable th2 = (i13 & 4) != 0 ? c47322c.f429227d : apiException;
        e eVar2 = (i13 & 8) != 0 ? c47322c.f429228e : eVar;
        int i14 = (i13 & 16) != 0 ? c47322c.f429229f : i12;
        List list2 = (i13 & 32) != 0 ? c47322c.f429230g : list;
        Map map2 = (i13 & 64) != 0 ? c47322c.f429231h : map;
        List<com.avito.conveyor_item.a> list3 = (i13 & 128) != 0 ? c47322c.f429232i : arrayList;
        String str3 = (i13 & 256) != 0 ? c47322c.f429233j : str;
        Integer num4 = (i13 & 512) != 0 ? c47322c.f429234k : num;
        String str4 = (i13 & 1024) != 0 ? c47322c.f429235l : str2;
        Integer num5 = (i13 & 2048) != 0 ? c47322c.f429236m : num2;
        MnzFloatingFooter mnzFloatingFooter2 = (i13 & 4096) != 0 ? c47322c.f429237n : mnzFloatingFooter;
        MnzFloatingFooterContact mnzFloatingFooterContact2 = (i13 & 8192) != 0 ? c47322c.f429238o : mnzFloatingFooterContact;
        boolean z17 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? c47322c.f429239p : z14;
        Integer num6 = (i13 & 32768) != 0 ? c47322c.f429240q : num3;
        c47322c.getClass();
        return new C47322c(z15, z16, th2, eVar2, i14, list2, map2, list3, str3, num4, str4, num5, mnzFloatingFooter2, mnzFloatingFooterContact2, z17, num6);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47322c)) {
            return false;
        }
        C47322c c47322c = (C47322c) obj;
        return this.f429225b == c47322c.f429225b && this.f429226c == c47322c.f429226c && L.f(this.f429227d, c47322c.f429227d) && L.f(this.f429228e, c47322c.f429228e) && this.f429229f == c47322c.f429229f && L.f(this.f429230g, c47322c.f429230g) && L.f(this.f429231h, c47322c.f429231h) && L.f(this.f429232i, c47322c.f429232i) && L.f(this.f429233j, c47322c.f429233j) && L.f(this.f429234k, c47322c.f429234k) && L.f(this.f429235l, c47322c.f429235l) && L.f(this.f429236m, c47322c.f429236m) && L.f(this.f429237n, c47322c.f429237n) && L.f(this.f429238o, c47322c.f429238o) && this.f429239p == c47322c.f429239p && L.f(this.f429240q, c47322c.f429240q);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f429225b) * 31, 31, this.f429226c);
        Throwable th2 = this.f429227d;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        e eVar = this.f429228e;
        int iE2 = H.e(AK.c.c(H.e(r.e(this.f429229f, (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31), 31, this.f429230g), 31, this.f429231h), 31, this.f429232i);
        String str = this.f429233j;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f429234k;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f429235l;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f429236m;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MnzFloatingFooter mnzFloatingFooter = this.f429237n;
        int iHashCode6 = (iHashCode5 + (mnzFloatingFooter == null ? 0 : mnzFloatingFooter.hashCode())) * 31;
        MnzFloatingFooterContact mnzFloatingFooterContact = this.f429238o;
        int i13 = r.i((iHashCode6 + (mnzFloatingFooterContact == null ? 0 : mnzFloatingFooterContact.hashCode())) * 31, 31, this.f429239p);
        Integer num3 = this.f429240q;
        return i13 + (num3 != null ? num3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasUnionV2State(isClosable=");
        sb2.append(this.f429225b);
        sb2.append(", isLoading=");
        sb2.append(this.f429226c);
        sb2.append(", error=");
        sb2.append(this.f429227d);
        sb2.append(", navBar=");
        sb2.append(this.f429228e);
        sb2.append(", navigationIcon=");
        sb2.append(this.f429229f);
        sb2.append(", headerItems=");
        sb2.append(this.f429230g);
        sb2.append(", tabItems=");
        sb2.append(this.f429231h);
        sb2.append(", displayItems=");
        sb2.append(this.f429232i);
        sb2.append(", selectedTabType=");
        sb2.append(this.f429233j);
        sb2.append(", selectedChipId=");
        sb2.append(this.f429234k);
        sb2.append(", selectedPerfSlug=");
        sb2.append(this.f429235l);
        sb2.append(", selectedBundleId=");
        sb2.append(this.f429236m);
        sb2.append(", footer=");
        sb2.append(this.f429237n);
        sb2.append(", currentContact=");
        sb2.append(this.f429238o);
        sb2.append(", isOnScreenLoading=");
        sb2.append(this.f429239p);
        sb2.append(", clickedButtonId=");
        return s.j(sb2, this.f429240q, ')');
    }
}
