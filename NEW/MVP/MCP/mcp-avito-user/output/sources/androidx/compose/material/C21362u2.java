package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21362u2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C21362u2 f34234a = new C21362u2();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f34235b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f34236c;

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/j9;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material/j9;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.u2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<C21224j9, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34237l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(C21224j9 c21224j9, androidx.compose.runtime.A a12, Integer num) {
            C21224j9 c21224j92 = c21224j9;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= a13.B(c21224j92) ? 4 : 2;
            }
            if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
                C21172f9.b(c21224j92, null, null, a13, iIntValue & 14);
            } else {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.u2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f34238l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if (!a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.u2$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f34239l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if (!a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        new C22096n(239945703, a.f34237l, false);
        f34235b = new C22096n(690018774, b.f34238l, false);
        f34236c = new C22096n(1054313561, c.f34239l, false);
    }
}
