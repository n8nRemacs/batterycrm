package com.google.accompanist.drawablepainter;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import l0.n;

/* compiled from: DrawablePainter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/drawablepainter/b;", "Landroid/graphics/drawable/Drawable$Callback;", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f342876b;

    public b(a aVar) {
        this.f342876b = aVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@k Drawable drawable) {
        a aVar = this.f342876b;
        int iIntValue = ((Number) ((C22082i3) aVar.f342872h).getF42167b()).intValue() + 1;
        ((C22082i3) aVar.f342872h).setValue(Integer.valueOf(iIntValue));
        long jA2 = c.a(aVar.f342871g);
        ((C22082i3) aVar.f342873i).setValue(n.a(jA2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@k Drawable drawable, @k Runnable runnable, long j12) {
        ((Handler) c.f342877a.getValue()).postAtTime(runnable, j12);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@k Drawable drawable, @k Runnable runnable) {
        ((Handler) c.f342877a.getValue()).removeCallbacks(runnable);
    }
}
