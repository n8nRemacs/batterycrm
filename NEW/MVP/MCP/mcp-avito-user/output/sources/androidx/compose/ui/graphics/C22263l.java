package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.C22281r0;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22263l {
    @Y61.k
    public static final Bitmap a(@Y61.k InterfaceC22280q0 interfaceC22280q0) {
        if (interfaceC22280q0 instanceof C22261k) {
            return ((C22261k) interfaceC22280q0).f39545b;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @Y61.k
    public static final Bitmap.Config b(int i12) {
        C22281r0.a aVar = C22281r0.f39749b;
        aVar.getClass();
        if (C22281r0.b(i12, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        aVar.getClass();
        if (C22281r0.b(i12, C22281r0.f39750c)) {
            return Bitmap.Config.ALPHA_8;
        }
        aVar.getClass();
        if (C22281r0.b(i12, C22281r0.f39751d)) {
            return Bitmap.Config.RGB_565;
        }
        aVar.getClass();
        if (C22281r0.b(i12, C22281r0.f39752e)) {
            return Bitmap.Config.RGBA_F16;
        }
        aVar.getClass();
        return C22281r0.b(i12, C22281r0.f39753f) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
