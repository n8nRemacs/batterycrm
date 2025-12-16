package pA;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileAdvertsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LpA/d;", "", "a", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f428241j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final d f428242k;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f428243a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f428244b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f428245c;

    /* renamed from: d, reason: collision with root package name */
    public final int f428246d;

    /* renamed from: e, reason: collision with root package name */
    public final int f428247e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f428248f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f428249g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f428250h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Throwable f428251i;

    /* compiled from: ProfileAdvertsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpA/d$a;", "", "<init>", "()V", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f428242k = new d(c42784z0, c42784z0, null, 0, 1, false, true, null, null);
    }

    public d(@k List<? extends i1> list, @k List<? extends SerpElement> list2, @l String str, int i12, int i13, boolean z12, boolean z13, @l String str2, @l Throwable th2) {
        this.f428243a = list;
        this.f428244b = list2;
        this.f428245c = str;
        this.f428246d = i12;
        this.f428247e = i13;
        this.f428248f = z12;
        this.f428249g = z13;
        this.f428250h = str2;
        this.f428251i = th2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public static d a(d dVar, ArrayList arrayList, boolean z12, String str, Throwable th2, int i12) {
        ?? r22 = dVar.f428244b;
        String str2 = dVar.f428245c;
        int i13 = dVar.f428246d;
        int i14 = dVar.f428247e;
        if ((i12 & 32) != 0) {
            z12 = dVar.f428248f;
        }
        boolean z13 = z12;
        boolean z14 = dVar.f428249g;
        if ((i12 & 128) != 0) {
            str = dVar.f428250h;
        }
        String str3 = str;
        if ((i12 & 256) != 0) {
            th2 = dVar.f428251i;
        }
        dVar.getClass();
        return new d(arrayList, r22, str2, i13, i14, z13, z14, str3, th2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f428243a, dVar.f428243a) && L.f(this.f428244b, dVar.f428244b) && L.f(this.f428245c, dVar.f428245c) && this.f428246d == dVar.f428246d && this.f428247e == dVar.f428247e && this.f428248f == dVar.f428248f && this.f428249g == dVar.f428249g && L.f(this.f428250h, dVar.f428250h) && L.f(this.f428251i, dVar.f428251i);
    }

    public final int hashCode() {
        int iA2 = C23088b.a(this.f428243a.hashCode() * 31, 31, this.f428244b);
        String str = this.f428245c;
        int i12 = r.i(r.i(r.e(this.f428247e, r.e(this.f428246d, (iA2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f428248f), 31, this.f428249g);
        String str2 = this.f428250h;
        int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Throwable th2 = this.f428251i;
        return iHashCode + (th2 != null ? th2.hashCode() : 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileAdvertsState : { visibleItems.size: ");
        sb2.append(this.f428243a.size());
        sb2.append(", rawAdverts.size: ");
        sb2.append(this.f428244b.size());
        sb2.append(", offset: ");
        sb2.append(this.f428246d);
        sb2.append(", page: ");
        sb2.append(this.f428247e);
        sb2.append(", hasMore: ");
        return r.s(" }", sb2, this.f428249g);
    }
}
