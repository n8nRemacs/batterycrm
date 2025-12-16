package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BackdropScaffold.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21349t2 {

    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/j9;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material/j9;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.t2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<C21224j9, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34206l = new a();

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

    static {
        new C21349t2();
        new C22096n(-1054097158, a.f34206l, false);
    }
}
