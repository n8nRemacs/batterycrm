package com.avito.android.fps;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import androidx.metrics.performance.h;
import id.i;
import kotlin.Metadata;

/* compiled from: FramesListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fps/b;", "Lid/i;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f158621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f158622c;

    public b(e eVar, c cVar) {
        this.f158621b = eVar;
        this.f158622c = cVar;
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
        androidx.metrics.performance.f fVar;
        Window window = activity.getWindow();
        e eVar = this.f158621b;
        eVar.getClass();
        if (window.peekDecorView() == null) {
            fVar = null;
        } else {
            com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c cVar = new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(eVar, 21);
            androidx.metrics.performance.f.f52702e.getClass();
            fVar = new androidx.metrics.performance.f(window, cVar, null);
        }
        if (fVar != null) {
            eVar.f158629e.put(activity, fVar);
        }
        ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
        FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            supportFragmentManager.e0(this.f158622c, true);
        }
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@k Activity activity) {
        this.f158621b.f158629e.remove(activity);
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@k Activity activity) {
        androidx.metrics.performance.f fVar = this.f158621b.f158629e.get(activity);
        if (fVar != null && fVar.f52705c) {
            androidx.metrics.performance.k kVar = fVar.f52704b;
            kVar.f52719h.getDecorView().post(new h(false, kVar));
            fVar.f52705c = false;
        }
    }

    @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@k Activity activity) {
        e eVar = this.f158621b;
        androidx.metrics.performance.f fVar = eVar.f158629e.get(activity);
        if (fVar != null) {
            boolean z12 = true;
            if (true != fVar.f52705c) {
                androidx.metrics.performance.k kVar = fVar.f52704b;
                kVar.f52719h.getDecorView().post(new h(z12, kVar));
                fVar.f52705c = true;
            }
        }
        eVar.f158631g = kotlin.math.b.c(eVar.f158627c.a());
    }
}
