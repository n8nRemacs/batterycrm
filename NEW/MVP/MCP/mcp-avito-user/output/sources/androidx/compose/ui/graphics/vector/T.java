package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.H0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageVector.kt */
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/T;", "Landroidx/compose/ui/graphics/vector/V;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T extends V implements Iterable<V>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f39800b;

    /* renamed from: c, reason: collision with root package name */
    public final float f39801c;

    /* renamed from: d, reason: collision with root package name */
    public final float f39802d;

    /* renamed from: e, reason: collision with root package name */
    public final float f39803e;

    /* renamed from: f, reason: collision with root package name */
    public final float f39804f;

    /* renamed from: g, reason: collision with root package name */
    public final float f39805g;

    /* renamed from: h, reason: collision with root package name */
    public final float f39806h;

    /* renamed from: i, reason: collision with root package name */
    public final float f39807i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final List<AbstractC22297h> f39808j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<V> f39809k;

    /* compiled from: ImageVector.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/graphics/vector/T$a", "", "Landroidx/compose/ui/graphics/vector/V;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<V>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<V> f39810b;

        public a(T t12) {
            this.f39810b = t12.f39809k.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f39810b.hasNext();
        }

        @Override // java.util.Iterator
        public final V next() {
            return this.f39810b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public T() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof T)) {
            T t12 = (T) obj;
            return kotlin.jvm.internal.L.f(this.f39800b, t12.f39800b) && this.f39801c == t12.f39801c && this.f39802d == t12.f39802d && this.f39803e == t12.f39803e && this.f39804f == t12.f39804f && this.f39805g == t12.f39805g && this.f39806h == t12.f39806h && this.f39807i == t12.f39807i && kotlin.jvm.internal.L.f(this.f39808j, t12.f39808j) && kotlin.jvm.internal.L.f(this.f39809k, t12.f39809k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39809k.hashCode() + androidx.compose.foundation.H.e(androidx.appcompat.app.r.d(this.f39807i, androidx.appcompat.app.r.d(this.f39806h, androidx.appcompat.app.r.d(this.f39805g, androidx.appcompat.app.r.d(this.f39804f, androidx.appcompat.app.r.d(this.f39803e, androidx.appcompat.app.r.d(this.f39802d, androidx.appcompat.app.r.d(this.f39801c, this.f39800b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f39808j);
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<V> iterator() {
        return new a(this);
    }

    public T(String str, float f12, float f13, float f14, float f15, float f16, float f17, float f18, List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0.0f : f12, (i12 & 4) != 0 ? 0.0f : f13, (i12 & 8) != 0 ? 0.0f : f14, (i12 & 16) != 0 ? 1.0f : f15, (i12 & 32) == 0 ? f16 : 1.0f, (i12 & 64) != 0 ? 0.0f : f17, (i12 & 128) == 0 ? f18 : 0.0f, (i12 & 256) != 0 ? U.f39811a : list, (i12 & 512) != 0 ? C42784z0.f406748b : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T(@Y61.k String str, float f12, float f13, float f14, float f15, float f16, float f17, float f18, @Y61.k List<? extends AbstractC22297h> list, @Y61.k List<? extends V> list2) {
        super(null);
        this.f39800b = str;
        this.f39801c = f12;
        this.f39802d = f13;
        this.f39803e = f14;
        this.f39804f = f15;
        this.f39805g = f16;
        this.f39806h = f17;
        this.f39807i = f18;
        this.f39808j = list;
        this.f39809k = list2;
    }
}
