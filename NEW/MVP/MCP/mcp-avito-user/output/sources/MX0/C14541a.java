package Mx0;

import Ux0.d;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.UniversalColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMx0/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mx0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C14541a extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final C0711a f11117l = new C0711a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final C14541a f11118m = new C14541a(null, null, null, true, false, false, false, null, null, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<d> f11119b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<d> f11120c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalColor f11121d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11122e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11123f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11124g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11125h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Float f11126i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Parcelable f11127j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11128k;

    /* compiled from: StrBookingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMx0/a$a;", "", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mx0.a$a, reason: collision with other inner class name */
    public static final class C0711a {
        public /* synthetic */ C0711a(C42822w c42822w) {
            this();
        }

        public C0711a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14541a(@l List<? extends d> list, @l List<? extends d> list2, @l UniversalColor universalColor, boolean z12, boolean z13, boolean z14, boolean z15, @l Float f12, @l Parcelable parcelable, boolean z16) {
        this.f11119b = list;
        this.f11120c = list2;
        this.f11121d = universalColor;
        this.f11122e = z12;
        this.f11123f = z13;
        this.f11124g = z14;
        this.f11125h = z15;
        this.f11126i = f12;
        this.f11127j = parcelable;
        this.f11128k = z16;
    }

    public static C14541a a(C14541a c14541a, List list, List list2, UniversalColor universalColor, boolean z12, boolean z13, boolean z14, boolean z15, Float f12, Parcelable parcelable, boolean z16, int i12) {
        List list3 = (i12 & 1) != 0 ? c14541a.f11119b : list;
        List list4 = (i12 & 2) != 0 ? c14541a.f11120c : list2;
        UniversalColor universalColor2 = (i12 & 4) != 0 ? c14541a.f11121d : universalColor;
        boolean z17 = (i12 & 8) != 0 ? c14541a.f11122e : z12;
        boolean z18 = (i12 & 16) != 0 ? c14541a.f11123f : z13;
        boolean z19 = (i12 & 32) != 0 ? c14541a.f11124g : z14;
        boolean z22 = (i12 & 64) != 0 ? c14541a.f11125h : z15;
        Float f13 = (i12 & 128) != 0 ? c14541a.f11126i : f12;
        Parcelable parcelable2 = (i12 & 256) != 0 ? c14541a.f11127j : parcelable;
        boolean z23 = (i12 & 512) != 0 ? c14541a.f11128k : z16;
        c14541a.getClass();
        return new C14541a(list3, list4, universalColor2, z17, z18, z19, z22, f13, parcelable2, z23);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14541a)) {
            return false;
        }
        C14541a c14541a = (C14541a) obj;
        return L.f(this.f11119b, c14541a.f11119b) && L.f(this.f11120c, c14541a.f11120c) && L.f(this.f11121d, c14541a.f11121d) && this.f11122e == c14541a.f11122e && this.f11123f == c14541a.f11123f && this.f11124g == c14541a.f11124g && this.f11125h == c14541a.f11125h && L.f(this.f11126i, c14541a.f11126i) && L.f(this.f11127j, c14541a.f11127j) && this.f11128k == c14541a.f11128k;
    }

    public final int hashCode() {
        List<d> list = this.f11119b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<d> list2 = this.f11120c;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        UniversalColor universalColor = this.f11121d;
        int i12 = r.i(r.i(r.i(r.i((iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31, 31, this.f11122e), 31, this.f11123f), 31, this.f11124g), 31, this.f11125h);
        Float f12 = this.f11126i;
        int iHashCode3 = (i12 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Parcelable parcelable = this.f11127j;
        return Boolean.hashCode(this.f11128k) + ((iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingState(mainItems=");
        sb2.append(this.f11119b);
        sb2.append(", headerItems=");
        sb2.append(this.f11120c);
        sb2.append(", headerBackgroundColor=");
        sb2.append(this.f11121d);
        sb2.append(", isScreenLoading=");
        sb2.append(this.f11122e);
        sb2.append(", hasError=");
        sb2.append(this.f11123f);
        sb2.append(", shouldShowGuestProfileTooltip=");
        sb2.append(this.f11124g);
        sb2.append(", isBannerButtonLoading=");
        sb2.append(this.f11125h);
        sb2.append(", motionLayoutScrollPosition=");
        sb2.append(this.f11126i);
        sb2.append(", mainItemsScrollState=");
        sb2.append(this.f11127j);
        sb2.append(", isEventBusUpdateEnabled=");
        return r.x(sb2, this.f11128k, ')');
    }
}
