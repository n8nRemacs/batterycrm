package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22008z3 {

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.z3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f37837l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 3) == 2 && a13.c()) {
                a13.f();
            } else {
                C21828r1.f37188a.a(null, 0.0f, 0.0f, null, 0L, a13, 196608);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/mg;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material3/mg;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.z3$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<C21729mg, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f37838l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(C21729mg c21729mg, androidx.compose.runtime.A a12, Integer num) {
            C21729mg c21729mg2 = c21729mg;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= a13.B(c21729mg2) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && a13.c()) {
                a13.f();
            } else {
                C21637ig.b(c21729mg2, null, null, a13, iIntValue & 14, 6);
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        new C22008z3();
        new C22096n(-927355320, a.f37837l, false);
        new C22096n(923568898, b.f37838l, false);
    }
}
