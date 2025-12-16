package Nv0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Location;
import com.avito.android.settings.adapter.i0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SettingsState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LNv0/d;", "", "a", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f11863h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final d f11864i = new d(false, null, false, null, false, 31, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11865a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<i0> f11866b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11867c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Location f11868d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11869e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final com.avito.android.replace_main.toggle.d f11870f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11871g;

    /* compiled from: SettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv0/d$a;", "", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d() {
        this(false, null, false, null, false, 31, null);
    }

    public static d a(d dVar, boolean z12, List list, boolean z13, Location location, boolean z14, int i12) {
        if ((i12 & 1) != 0) {
            z12 = dVar.f11865a;
        }
        boolean z15 = z12;
        if ((i12 & 2) != 0) {
            list = dVar.f11866b;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            z13 = dVar.f11867c;
        }
        boolean z16 = z13;
        if ((i12 & 8) != 0) {
            location = dVar.f11868d;
        }
        Location location2 = location;
        if ((i12 & 16) != 0) {
            z14 = dVar.f11869e;
        }
        dVar.getClass();
        return new d(z15, list2, z16, location2, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11865a == dVar.f11865a && L.f(this.f11866b, dVar.f11866b) && this.f11867c == dVar.f11867c && L.f(this.f11868d, dVar.f11868d) && this.f11869e == dVar.f11869e;
    }

    public final int hashCode() {
        int i12 = r.i(H.e(Boolean.hashCode(this.f11865a) * 31, 31, this.f11866b), 31, this.f11867c);
        Location location = this.f11868d;
        return Boolean.hashCode(this.f11869e) + ((i12 + (location == null ? 0 : location.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingsState(isLoading=");
        sb2.append(this.f11865a);
        sb2.append(", items=");
        sb2.append(this.f11866b);
        sb2.append(", isDeviceIdVisible=");
        sb2.append(this.f11867c);
        sb2.append(", selectedLocation=");
        sb2.append(this.f11868d);
        sb2.append(", clearSearchHistoryInProgress=");
        return r.x(sb2, this.f11869e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z12, @k List<? extends i0> list, boolean z13, @l Location location, boolean z14) {
        Object next;
        this.f11865a = z12;
        this.f11866b = list;
        this.f11867c = z13;
        this.f11868d = location;
        this.f11869e = z14;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof i0.h) {
                    break;
                }
            }
        }
        i0.h hVar = (i0.h) (next instanceof i0.h ? next : null);
        com.avito.android.replace_main.toggle.d dVar = hVar != null ? hVar.f280796b : null;
        this.f11870f = dVar;
        this.f11871g = dVar != null ? dVar.f254621f : false;
    }

    public d(boolean z12, List list, boolean z13, Location location, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? null : location, (i12 & 16) != 0 ? false : z14);
    }
}
