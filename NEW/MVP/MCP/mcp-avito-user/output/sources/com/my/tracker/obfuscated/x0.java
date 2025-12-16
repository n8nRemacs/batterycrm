package com.my.tracker.obfuscated;

import android.app.Application;
import com.my.tracker.plugins.MyTrackerPlugin;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import com.my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<MyTrackerPlugin> f365866a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f365867b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final PluginEventTracker f365868c;

    /* renamed from: d, reason: collision with root package name */
    private final Application f365869d;

    private x0(PluginEventTracker pluginEventTracker, Application application) {
        this.f365868c = pluginEventTracker;
        this.f365869d = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            e2.c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.f365868c, this.f365869d);
                this.f365866a.add(myTrackerPlugin);
                e2.c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th2) {
                e2.b("PluginHandler: exception occurred while initialization plugin " + pluginName, th2);
            }
        }
    }

    public static x0 a(C37848w c37848w, Application application) {
        return new x0(PluginEventTracker.newTracker(c37848w), application);
    }

    public void a(List<MyTrackerPluginConfig> list) {
        if (this.f365867b.compareAndSet(false, true)) {
            C37835i.a(new H(13, this, list));
        } else {
            e2.a("PluginHandler: instance has already been initialized");
        }
    }
}
