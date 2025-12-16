package Hb1;

import com.avito.android.R;
import kotlin.G0;

/* renamed from: Hb1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13952c extends kotlin.jvm.internal.N implements Y41.q {

    /* renamed from: l, reason: collision with root package name */
    public static final C13952c f7433l = new C13952c();

    public C13952c() {
        super(3);
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.A a12 = (androidx.compose.runtime.A) obj2;
        if ((((Number) obj3).intValue() & 81) == 16 && a12.c()) {
            a12.f();
        } else {
            Mc1.s.c(u0.i.c(a12, R.string.error_screen_button), null, 0L, a12, 0);
        }
        return G0.f406611a;
    }
}
