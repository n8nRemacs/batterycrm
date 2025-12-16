package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final H3 f34824a = new H3();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f34825b = new C22096n(818736383, a.f34826l, false);

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/Xf;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material3/Xf;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<Xf, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34826l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(Xf xf2, androidx.compose.runtime.A a12, Integer num) {
            Xf xf3 = xf2;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= a13.B(xf3) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && a13.c()) {
                a13.f();
            } else {
                Bg.b(xf3, null, null, 0L, 0L, 0L, 0L, 0L, a13, iIntValue & 14);
            }
            return kotlin.G0.f406611a;
        }
    }
}
