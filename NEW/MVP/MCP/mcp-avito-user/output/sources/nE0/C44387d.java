package ne0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputVinMviState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lne0/d;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ne0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C44387d {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f415260f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C44387d f415261g = new C44387d("", new UV0.c(C42784z0.f406748b), 0, false, false, 16, null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f415262a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UV0.a<? extends com.avito.conveyor_item.a> f415263b;

    /* renamed from: c, reason: collision with root package name */
    public final int f415264c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f415265d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f415266e;

    /* compiled from: InputVinMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44387d(@k String str, @k UV0.a<? extends com.avito.conveyor_item.a> aVar, int i12, boolean z12, boolean z13) {
        this.f415262a = str;
        this.f415263b = aVar;
        this.f415264c = i12;
        this.f415265d = z12;
        this.f415266e = z13;
    }

    public static C44387d a(C44387d c44387d, String str, UV0.a aVar, int i12, boolean z12, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            str = c44387d.f415262a;
        }
        String str2 = str;
        if ((i13 & 2) != 0) {
            aVar = c44387d.f415263b;
        }
        UV0.a aVar2 = aVar;
        if ((i13 & 4) != 0) {
            i12 = c44387d.f415264c;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            z12 = c44387d.f415265d;
        }
        c44387d.getClass();
        return new C44387d(str2, aVar2, i14, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44387d)) {
            return false;
        }
        C44387d c44387d = (C44387d) obj;
        return L.f(this.f415262a, c44387d.f415262a) && L.f(this.f415263b, c44387d.f415263b) && this.f415264c == c44387d.f415264c && this.f415265d == c44387d.f415265d && this.f415266e == c44387d.f415266e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f415266e) + r.i(r.e(this.f415264c, (this.f415263b.hashCode() + (this.f415262a.hashCode() * 31)) * 31, 31), 31, this.f415265d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputVinMviState(vin=");
        sb2.append(this.f415262a);
        sb2.append(", itemsDataSource=");
        sb2.append(this.f415263b);
        sb2.append(", retriesWithWarningCount=");
        sb2.append(this.f415264c);
        sb2.append(", isVinVerificationInProgress=");
        sb2.append(this.f415265d);
        sb2.append(", isNeededToItemsUpdate=");
        return r.x(sb2, this.f415266e, ')');
    }

    public /* synthetic */ C44387d(String str, UV0.a aVar, int i12, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(str, aVar, i12, z12, (i13 & 16) != 0 ? false : z13);
    }
}
