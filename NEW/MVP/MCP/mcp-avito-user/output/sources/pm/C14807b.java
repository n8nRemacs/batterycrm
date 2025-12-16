package Pm;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BundleInfoWithDiscount.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LPm/b;", "", "LPm/c;", "discount", "", "itemsLeft", "appliedDiscount", "<init>", "(IILPm/c;Lkotlin/jvm/internal/w;)V", "a", "_avito_cart-bundles_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14807b {

    /* renamed from: a, reason: collision with root package name */
    public final int f13267a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13268b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C14808c f13269c;

    /* compiled from: BundleInfoWithDiscount.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPm/b$a;", "", "<init>", "()V", "_avito_cart-bundles_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pm.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        new C14807b(-1, -1, C14808c.a(-1), null);
    }

    public C14807b(int i12, int i13, C14808c c14808c, C42822w c42822w) {
        this.f13267a = i12;
        this.f13268b = i13;
        this.f13269c = c14808c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14807b)) {
            return false;
        }
        C14807b c14807b = (C14807b) obj;
        return this.f13267a == c14807b.f13267a && this.f13268b == c14807b.f13268b && L.f(this.f13269c, c14807b.f13269c);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f13268b, Integer.hashCode(this.f13267a) * 31, 31);
        C14808c c14808c = this.f13269c;
        return iE2 + (c14808c == null ? 0 : Integer.hashCode(c14808c.f13270a));
    }

    @k
    public final String toString() {
        return "BundleInfoWithDiscount(discount=" + ((Object) ("Discount(percent=" + this.f13267a + ')')) + ", itemsLeft=" + this.f13268b + ", appliedDiscount=" + this.f13269c + ')';
    }
}
