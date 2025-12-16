package com.avito.android.position_in_search.stats.screen.position_in_search.util;

import Y41.q;
import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.J3;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.d;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: ComposeExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.util.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6706a extends H implements q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final C6706a f221754b = new C6706a();

        public C6706a() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return l.m(num2, size, num.intValue());
        }
    }

    @InterfaceC22132o
    public static final float a(@Y61.l A a12, int i12) {
        a12.C(1957061260);
        float fJ2 = ((d) a12.o(Q0.f41199h)).J(i12);
        a12.h();
        return fJ2;
    }

    @InterfaceC22132o
    @Y61.l
    public static final Uri b(@Y61.l Image image, float f12, float f13, @Y61.l A a12, int i12) {
        a12.C(1502978466);
        a12.C(1461680476);
        J3 j32 = Q0.f41199h;
        int iY02 = ((d) a12.o(j32)).y0(f12);
        a12.h();
        a12.C(1461680476);
        int iY03 = ((d) a12.o(j32)).y0(f13);
        a12.h();
        Uri uriC = C35829k2.b(image, iY02, iY03, 0.0f, 1, 44).c(C6706a.f221754b);
        a12.h();
        return uriC;
    }
}
