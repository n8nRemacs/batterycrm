package com.avito.beduin.v2.repository.environment;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import kotlin.Metadata;

/* compiled from: AndroidEnvironmentClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/f;", "Landroid/content/ComponentCallbacks;", "environment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements ComponentCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public int f338223b;

    /* renamed from: c, reason: collision with root package name */
    public int f338224c;

    /* renamed from: d, reason: collision with root package name */
    public int f338225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f338226e;

    public f(g gVar) {
        this.f338226e = gVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@Y61.k Configuration configuration) {
        int i12 = this.f338223b;
        int i13 = configuration.orientation;
        if (i12 == i13 && this.f338224c == configuration.screenWidthDp && this.f338225d == configuration.screenHeightDp) {
            return;
        }
        this.f338223b = i13;
        this.f338224c = configuration.screenWidthDp;
        this.f338225d = configuration.screenHeightDp;
        this.f338226e.f338230e.setValue(new Configuration(configuration));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
