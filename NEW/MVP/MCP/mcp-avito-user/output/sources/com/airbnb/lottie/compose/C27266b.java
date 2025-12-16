package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Matrix;
import android.provider.Settings;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.C27291k;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: animateLottieCompositionAsState.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "wasPlaying", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.airbnb.lottie.compose.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27266b {
    @InterfaceC22132o
    @Y61.k
    public static final InterfaceC27267c a(@Y61.l C27291k c27291k, boolean z12, boolean z13, boolean z14, @Y61.l AbstractC27282s abstractC27282s, float f12, int i12, @Y61.l androidx.compose.runtime.A a12, int i13) {
        a12.I(683659508);
        boolean z15 = (i13 & 8) != 0 ? false : z14;
        AbstractC27282s abstractC27282s2 = (i13 & 16) != 0 ? null : abstractC27282s;
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.f59394b;
        if (i12 <= 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Iterations must be a positive number (", ").").toString());
        }
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f12 + ".").toString());
        }
        a12.I(2024497114);
        a12.I(-610207850);
        Object objT = a12.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = new C27271g();
            a12.H(objT);
        }
        InterfaceC27267c interfaceC27267c = (InterfaceC27267c) objT;
        a12.O();
        a12.O();
        a12.I(-180606964);
        Object objT2 = a12.t();
        if (objT2 == c1651a) {
            objT2 = C22126m3.g(Boolean.valueOf(z12));
            a12.H(objT2);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT2;
        a12.O();
        a12.I(-180606834);
        Context context = (Context) a12.o(AndroidCompositionLocals_androidKt.f41069b);
        Matrix matrix = com.airbnb.lottie.utils.k.f60123a;
        float f13 = f12 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        a12.O();
        C22187u0.g(new Object[]{c27291k, Boolean.valueOf(z12), abstractC27282s2, Float.valueOf(f13), Integer.valueOf(i12)}, new C27265a(z12, z13, interfaceC27267c, c27291k, i12, z15, f13, abstractC27282s2, interfaceC22204y1, null), a12);
        a12.O();
        return interfaceC27267c;
    }
}
