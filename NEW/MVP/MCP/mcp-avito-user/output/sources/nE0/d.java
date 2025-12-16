package Ne0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LNe0/d;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f11679d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d f11680e = new d(0, C42784z0.f406748b, false);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f11681a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11682b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11683c;

    /* compiled from: SelectState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNe0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(int i12, @k List list, boolean z12) {
        this.f11681a = list;
        this.f11682b = i12;
        this.f11683c = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a(d dVar, ArrayList arrayList, int i12, boolean z12, int i13) {
        List list = arrayList;
        if ((i13 & 1) != 0) {
            list = dVar.f11681a;
        }
        if ((i13 & 2) != 0) {
            i12 = dVar.f11682b;
        }
        if ((i13 & 4) != 0) {
            z12 = dVar.f11683c;
        }
        dVar.getClass();
        return new d(i12, list, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f11681a, dVar.f11681a) && this.f11682b == dVar.f11682b && this.f11683c == dVar.f11683c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11683c) + r.e(this.f11682b, this.f11681a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectState(items=");
        sb2.append(this.f11681a);
        sb2.append(", itemsBottomPadding=");
        sb2.append(this.f11682b);
        sb2.append(", isPublishButtonVisible=");
        return r.x(sb2, this.f11683c, ')');
    }
}
