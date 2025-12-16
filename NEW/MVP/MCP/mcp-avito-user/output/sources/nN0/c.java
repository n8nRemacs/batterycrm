package NN0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientsState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LNN0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f11402i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final c f11403j = new c(null, false, false, false, "", new d(null, null, null, false, false, 31, null), 0);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<PN0.a> f11404b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11405c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11406d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11407e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f11408f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final d f11409g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11410h;

    /* compiled from: ClientsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNN0/c$a;", "", "<init>", "()V", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l List<PN0.a> list, boolean z12, boolean z13, boolean z14, @k String str, @k d dVar, int i12) {
        this.f11404b = list;
        this.f11405c = z12;
        this.f11406d = z13;
        this.f11407e = z14;
        this.f11408f = str;
        this.f11409g = dVar;
        this.f11410h = i12;
    }

    public static c a(c cVar, List list, boolean z12, boolean z13, boolean z14, String str, d dVar, int i12, int i13) {
        List list2 = (i13 & 1) != 0 ? cVar.f11404b : list;
        boolean z15 = (i13 & 2) != 0 ? cVar.f11405c : z12;
        boolean z16 = (i13 & 4) != 0 ? cVar.f11406d : z13;
        boolean z17 = (i13 & 8) != 0 ? cVar.f11407e : z14;
        String str2 = (i13 & 16) != 0 ? cVar.f11408f : str;
        d dVar2 = (i13 & 32) != 0 ? cVar.f11409g : dVar;
        int i14 = (i13 & 64) != 0 ? cVar.f11410h : i12;
        cVar.getClass();
        return new c(list2, z15, z16, z17, str2, dVar2, i14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f11404b, cVar.f11404b) && this.f11405c == cVar.f11405c && this.f11406d == cVar.f11406d && this.f11407e == cVar.f11407e && L.f(this.f11408f, cVar.f11408f) && L.f(this.f11409g, cVar.f11409g) && this.f11410h == cVar.f11410h;
    }

    public final int hashCode() {
        List<PN0.a> list = this.f11404b;
        return Integer.hashCode(this.f11410h) + ((this.f11409g.hashCode() + H.d(r.i(r.i(r.i((list == null ? 0 : list.hashCode()) * 31, 31, this.f11405c), 31, this.f11406d), 31, this.f11407e), 31, this.f11408f)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientsState(items=");
        sb2.append(this.f11404b);
        sb2.append(", isLoading=");
        sb2.append(this.f11405c);
        sb2.append(", isError=");
        sb2.append(this.f11406d);
        sb2.append(", isEnded=");
        sb2.append(this.f11407e);
        sb2.append(", search=");
        sb2.append(this.f11408f);
        sb2.append(", viewState=");
        sb2.append(this.f11409g);
        sb2.append(", page=");
        return r.t(sb2, this.f11410h, ')');
    }
}
