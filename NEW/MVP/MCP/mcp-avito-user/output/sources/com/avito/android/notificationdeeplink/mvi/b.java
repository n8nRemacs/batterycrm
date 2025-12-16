package com.avito.android.notificationdeeplink.mvi;

import Bk0.InterfaceC13158a;
import com.avito.android.AnalyticParams;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.remote.notification.NotificationIdentifier;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationDeepLinkBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f207801a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.push.c> f207802b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.counter.h> f207803c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34350q> f207804d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC13158a> f207805e;

    /* renamed from: f, reason: collision with root package name */
    public final l f207806f;

    /* renamed from: g, reason: collision with root package name */
    public final l f207807g;

    /* renamed from: h, reason: collision with root package name */
    public final l f207808h;

    /* renamed from: i, reason: collision with root package name */
    public final l f207809i;

    /* renamed from: j, reason: collision with root package name */
    public final l f207810j;

    /* renamed from: k, reason: collision with root package name */
    public final l f207811k;

    public b(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6) {
        this.f207801a = provider;
        this.f207802b = provider2;
        this.f207803c = provider3;
        this.f207804d = provider4;
        this.f207805e = provider5;
        this.f207806f = lVar;
        this.f207807g = lVar2;
        this.f207808h = lVar3;
        this.f207809i = lVar4;
        this.f207810j = lVar5;
        this.f207811k = lVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f207801a.get(), this.f207802b.get(), this.f207803c.get(), this.f207804d.get(), this.f207805e.get(), (DeepLink) this.f207806f.f393949a, (NotificationIdentifier) this.f207807g.f393949a, (Payload) this.f207808h.f393949a, (AnalyticParams) this.f207809i.f393949a, (String) this.f207810j.f393949a, ((Boolean) this.f207811k.f393949a).booleanValue());
    }
}
