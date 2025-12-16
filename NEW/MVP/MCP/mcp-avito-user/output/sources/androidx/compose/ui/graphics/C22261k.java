package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/k;", "Landroidx/compose/ui/graphics/q0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22261k implements InterfaceC22280q0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bitmap f39545b;

    public C22261k(@Y61.k Bitmap bitmap) {
        this.f39545b = bitmap;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22280q0
    public final void a() {
        this.f39545b.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22280q0
    public final int b() {
        Bitmap.Config config = this.f39545b.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            C22281r0.f39749b.getClass();
            return C22281r0.f39750c;
        }
        if (config == Bitmap.Config.RGB_565) {
            C22281r0.f39749b.getClass();
            return C22281r0.f39751d;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            C22281r0.f39749b.getClass();
        } else {
            if (config == Bitmap.Config.RGBA_F16) {
                C22281r0.f39749b.getClass();
                return C22281r0.f39752e;
            }
            if (config == Bitmap.Config.HARDWARE) {
                C22281r0.f39749b.getClass();
                return C22281r0.f39753f;
            }
            C22281r0.f39749b.getClass();
        }
        return 0;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22280q0
    public final int getHeight() {
        return this.f39545b.getHeight();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22280q0
    public final int getWidth() {
        return this.f39545b.getWidth();
    }
}
