package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21388w2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C21388w2 f34317a = new C21388w2();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f34318b = new C22096n(996639038, a.f34319l, false);

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/U8;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material/U8;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.w2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<U8, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34319l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(U8 u82, androidx.compose.runtime.A a12, Integer num) {
            U8 u83 = u82;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? a13.B(u83) : a13.u(u83) ? 4 : 2;
            }
            if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
                C21434z9.b(u83, null, null, 0L, 0L, 0L, 0.0f, a13, iIntValue & 14);
            } else {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }
}
