package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/V;", "Landroid/content/ComponentCallbacks2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V implements ComponentCallbacks2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0.g f41288b;

    public V(u0.g gVar) {
        this.f41288b = gVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f41288b.a();
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC42830m
    public final void onLowMemory() {
        this.f41288b.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i12) {
        this.f41288b.a();
    }
}
