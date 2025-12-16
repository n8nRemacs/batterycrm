package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: AndroidGraphicsContext.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/g;", "Landroid/content/ComponentCallbacks2;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C22253g implements ComponentCallbacks2 {

    /* compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/g$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.g$a */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            boolean z12 = C22257i.f39513d;
            throw null;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i12) {
        if (i12 >= 40) {
            throw null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
