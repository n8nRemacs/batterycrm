package coil.compose;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k {

    /* compiled from: SubcomposeAsyncImage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil/compose/E;", "Lkotlin/G0;", "invoke", "(Lcoil/compose/E;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<E, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f58236l = 0;

        static {
            new a();
        }

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(E e12, androidx.compose.runtime.A a12, Integer num) {
            E e13 = e12;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(e13) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                B.a(e13, null, null, null, null, null, 0.0f, null, false, a13, iIntValue & 14, 255);
            }
            return G0.f406611a;
        }
    }

    static {
        new k();
        int i12 = a.f58236l;
    }
}
