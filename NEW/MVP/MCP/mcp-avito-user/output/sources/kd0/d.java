package Kd0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpaTariffState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LKd0/d;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f9557d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d f9558e = new d(new e("", false, 2, null), new e("", false, 2, null), true);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f9559a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f9560b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9561c;

    /* compiled from: CpaTariffState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKd0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k e eVar, @k e eVar2, boolean z12) {
        this.f9559a = eVar;
        this.f9560b = eVar2;
        this.f9561c = z12;
    }

    public static d a(d dVar, e eVar, e eVar2, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            eVar = dVar.f9559a;
        }
        if ((i12 & 2) != 0) {
            eVar2 = dVar.f9560b;
        }
        if ((i12 & 4) != 0) {
            z12 = dVar.f9561c;
        }
        dVar.getClass();
        return new d(eVar, eVar2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f9559a, dVar.f9559a) && L.f(this.f9560b, dVar.f9560b) && this.f9561c == dVar.f9561c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9561c) + ((this.f9560b.hashCode() + (this.f9559a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpaTariffState(name=");
        sb2.append(this.f9559a);
        sb2.append(", phone=");
        sb2.append(this.f9560b);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f9561c, ')');
    }
}
