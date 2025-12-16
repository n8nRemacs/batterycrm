package sY0;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C22767g;
import com.google.android.material.R;
import com.google.android.material.color.k;
import com.google.android.material.resources.b;
import j.InterfaceC42156l;
import j.N;

/* compiled from: ElevationOverlayProvider.java */
/* renamed from: sY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48134a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f437716f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f437717a;

    /* renamed from: b, reason: collision with root package name */
    public final int f437718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f437719c;

    /* renamed from: d, reason: collision with root package name */
    public final int f437720d;

    /* renamed from: e, reason: collision with root package name */
    public final float f437721e;

    public C48134a(@N Context context) {
        boolean zB2 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int iB2 = k.b(context, R.attr.elevationOverlayColor, 0);
        int iB3 = k.b(context, R.attr.elevationOverlayAccentColor, 0);
        int iB4 = k.b(context, R.attr.colorSurface, 0);
        float f12 = context.getResources().getDisplayMetrics().density;
        this.f437717a = zB2;
        this.f437718b = iB2;
        this.f437719c = iB3;
        this.f437720d = iB4;
        this.f437721e = f12;
    }

    @InterfaceC42156l
    public final int a(float f12, @InterfaceC42156l int i12) {
        int i13;
        if (!this.f437717a || C22767g.i(i12, 255) != this.f437720d) {
            return i12;
        }
        float fMin = (this.f437721e <= 0.0f || f12 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f12 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i12);
        int iF2 = k.f(fMin, C22767g.i(i12, 255), this.f437718b);
        if (fMin > 0.0f && (i13 = this.f437719c) != 0) {
            iF2 = C22767g.g(C22767g.i(i13, f437716f), iF2);
        }
        return C22767g.i(iF2, iAlpha);
    }
}
