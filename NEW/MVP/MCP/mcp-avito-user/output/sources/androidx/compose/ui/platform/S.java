package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import u0.d;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/S;", "Landroid/content/ComponentCallbacks2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S implements ComponentCallbacks2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Configuration f41268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0.d f41269c;

    public S(Configuration configuration, u0.d dVar) {
        this.f41268b = configuration;
        this.f41269c = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f41268b;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<d.b, WeakReference<d.a>>> it = this.f41269c.f439715a.entrySet().iterator();
        while (it.hasNext()) {
            d.a aVar = it.next().getValue().get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f439717b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC42830m
    public final void onLowMemory() {
        this.f41269c.f439715a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i12) {
        this.f41269c.f439715a.clear();
    }
}
