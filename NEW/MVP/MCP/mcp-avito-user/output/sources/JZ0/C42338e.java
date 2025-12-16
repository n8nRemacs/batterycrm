package jZ0;

import android.os.Bundle;
import j.N;
import j.P;

/* compiled from: CrashlyticsOriginAnalyticsEventLogger.java */
/* renamed from: jZ0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C42338e implements InterfaceC42334a {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final com.google.firebase.analytics.connector.a f405647b;

    public C42338e(@N com.google.firebase.analytics.connector.a aVar) {
        this.f405647b = aVar;
    }

    @Override // jZ0.InterfaceC42334a
    public final void c(@P Bundle bundle) {
        this.f405647b.a("clx", "_ae", bundle);
    }
}
