package coil.view;

import X41.f;
import Y61.k;
import Y61.l;
import coil.view.AbstractC27249c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/size/g;", "", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.size.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C27253g {

    /* renamed from: c, reason: collision with root package name */
    @f
    @k
    public static final C27253g f58764c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC27249c f58765a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC27249c f58766b;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/size/g$a;", "", "<init>", "()V", "Lcoil/size/g;", "ORIGINAL", "Lcoil/size/g;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.size.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        AbstractC27249c.b bVar = AbstractC27249c.b.f58760a;
        f58764c = new C27253g(bVar, bVar);
    }

    public C27253g(@k AbstractC27249c abstractC27249c, @k AbstractC27249c abstractC27249c2) {
        this.f58765a = abstractC27249c;
        this.f58766b = abstractC27249c2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27253g)) {
            return false;
        }
        C27253g c27253g = (C27253g) obj;
        return L.f(this.f58765a, c27253g.f58765a) && L.f(this.f58766b, c27253g.f58766b);
    }

    public final int hashCode() {
        return this.f58766b.hashCode() + (this.f58765a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "Size(width=" + this.f58765a + ", height=" + this.f58766b + ')';
    }
}
