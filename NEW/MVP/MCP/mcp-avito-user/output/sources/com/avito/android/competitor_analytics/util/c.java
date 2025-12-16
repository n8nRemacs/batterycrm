package com.avito.android.competitor_analytics.util;

import Y41.q;
import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.Q0;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* compiled from: ComposeExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f124910b = new a();

        public a() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return l.m(num2, size, num.intValue());
        }
    }

    @InterfaceC22132o
    public static final int a(float f12, @Y61.l A a12) {
        a12.C(-1855506458);
        int iY02 = ((androidx.compose.ui.unit.d) a12.o(Q0.f41199h)).y0(f12);
        a12.h();
        return iY02;
    }

    @InterfaceC22132o
    public static final float b(@Y61.l A a12, int i12) {
        a12.C(-1474734826);
        float fJ2 = ((androidx.compose.ui.unit.d) a12.o(Q0.f41199h)).J(i12);
        a12.h();
        return fJ2;
    }

    @InterfaceC22132o
    @Y61.l
    public static final Uri c(@Y61.l Image image, float f12, float f13, @Y61.l A a12, int i12) {
        a12.C(45153964);
        Uri uriC = C35829k2.b(image, a(f12, a12), a(f13, a12), 0.0f, 1, 44).c(a.f124910b);
        a12.h();
        return uriC;
    }
}
