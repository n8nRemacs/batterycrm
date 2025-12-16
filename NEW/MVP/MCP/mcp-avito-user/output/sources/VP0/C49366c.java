package vp0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.screens.bbip_v2.ui.items.budget.b;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import uZ.e;

/* compiled from: BbipV2State.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lvp0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vp0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C49366c extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f440985m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final C49366c f440986n = new C49366c(null, C42784z0.f406748b, null, null, null, null, null, null, false, false, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final e f440987b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f440988c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ButtonAction f440989d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonAction f440990e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f440991f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final b.a f440992g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final b.a f440993h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Throwable f440994i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f440995j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f440996k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f440997l;

    /* compiled from: BbipV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp0/c$a;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49366c(@l e eVar, @k List<? extends com.avito.conveyor_item.a> list, @l ButtonAction buttonAction, @l ButtonAction buttonAction2, @l String str, @l b.a aVar, @l b.a aVar2, @l Throwable th2, boolean z12, boolean z13, boolean z14) {
        this.f440987b = eVar;
        this.f440988c = list;
        this.f440989d = buttonAction;
        this.f440990e = buttonAction2;
        this.f440991f = str;
        this.f440992g = aVar;
        this.f440993h = aVar2;
        this.f440994i = th2;
        this.f440995j = z12;
        this.f440996k = z13;
        this.f440997l = z14;
    }

    public static C49366c a(C49366c c49366c, e eVar, List list, ButtonAction buttonAction, ButtonAction buttonAction2, String str, b.a aVar, b.a aVar2, ApiException apiException, boolean z12, boolean z13, boolean z14, int i12) {
        e eVar2 = (i12 & 1) != 0 ? c49366c.f440987b : eVar;
        List list2 = (i12 & 2) != 0 ? c49366c.f440988c : list;
        ButtonAction buttonAction3 = (i12 & 4) != 0 ? c49366c.f440989d : buttonAction;
        ButtonAction buttonAction4 = (i12 & 8) != 0 ? c49366c.f440990e : buttonAction2;
        String str2 = (i12 & 16) != 0 ? c49366c.f440991f : str;
        b.a aVar3 = (i12 & 32) != 0 ? c49366c.f440992g : aVar;
        b.a aVar4 = (i12 & 64) != 0 ? c49366c.f440993h : aVar2;
        Throwable th2 = (i12 & 128) != 0 ? c49366c.f440994i : apiException;
        boolean z15 = (i12 & 256) != 0 ? c49366c.f440995j : z12;
        boolean z16 = (i12 & 512) != 0 ? c49366c.f440996k : z13;
        boolean z17 = (i12 & 1024) != 0 ? c49366c.f440997l : z14;
        c49366c.getClass();
        return new C49366c(eVar2, list2, buttonAction3, buttonAction4, str2, aVar3, aVar4, th2, z15, z16, z17);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49366c)) {
            return false;
        }
        C49366c c49366c = (C49366c) obj;
        return L.f(this.f440987b, c49366c.f440987b) && L.f(this.f440988c, c49366c.f440988c) && L.f(this.f440989d, c49366c.f440989d) && L.f(this.f440990e, c49366c.f440990e) && L.f(this.f440991f, c49366c.f440991f) && L.f(this.f440992g, c49366c.f440992g) && L.f(this.f440993h, c49366c.f440993h) && L.f(this.f440994i, c49366c.f440994i) && this.f440995j == c49366c.f440995j && this.f440996k == c49366c.f440996k && this.f440997l == c49366c.f440997l;
    }

    public final int hashCode() {
        e eVar = this.f440987b;
        int iE2 = H.e((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f440988c);
        ButtonAction buttonAction = this.f440989d;
        int iHashCode = (iE2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ButtonAction buttonAction2 = this.f440990e;
        int iHashCode2 = (iHashCode + (buttonAction2 == null ? 0 : buttonAction2.hashCode())) * 31;
        String str = this.f440991f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        b.a aVar = this.f440992g;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b.a aVar2 = this.f440993h;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Throwable th2 = this.f440994i;
        return Boolean.hashCode(this.f440997l) + r.i(r.i((iHashCode5 + (th2 != null ? th2.hashCode() : 0)) * 31, 31, this.f440995j), 31, this.f440996k);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipV2State(navBar=");
        sb2.append(this.f440987b);
        sb2.append(", items=");
        sb2.append(this.f440988c);
        sb2.append(", skipAction=");
        sb2.append(this.f440989d);
        sb2.append(", nextAction=");
        sb2.append(this.f440990e);
        sb2.append(", checkoutContext=");
        sb2.append(this.f440991f);
        sb2.append(", activeBudget=");
        sb2.append(this.f440992g);
        sb2.append(", activeDuration=");
        sb2.append(this.f440993h);
        sb2.append(", error=");
        sb2.append(this.f440994i);
        sb2.append(", isConfiguratorLoading=");
        sb2.append(this.f440995j);
        sb2.append(", isForecastLoading=");
        sb2.append(this.f440996k);
        sb2.append(", isContextLoading=");
        return r.x(sb2, this.f440997l, ')');
    }
}
