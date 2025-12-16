package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* compiled from: IntervalList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/f;", "T", "", "a", "Landroidx/compose/foundation/lazy/layout/C0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC20717f<T> {

    /* compiled from: IntervalList.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/f$a;", "T", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.f$a */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f29411a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29412b;

        /* renamed from: c, reason: collision with root package name */
        public final T f29413c;

        public a(int i12, int i13, T t12) {
            this.f29411a = i12;
            this.f29412b = i13;
            this.f29413c = t12;
            if (i12 < 0) {
                androidx.compose.foundation.internal.e.a("startIndex should be >= 0");
            }
            if (i13 > 0) {
                return;
            }
            androidx.compose.foundation.internal.e.a("size should be > 0");
        }
    }
}
