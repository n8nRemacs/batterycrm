package com.avito.android.messenger.conversation.mvi.menu;

import android.content.res.Resources;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ChannelMenuPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32109a> f191495a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ChannelIacInteractor> f191496b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC32208e> f191497c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.blacklist_reasons.m> f191498d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f191499e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f191500f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f191501g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<JY.a> f191502h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191503i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<u3.g<MessengerFolderTabsTestGroup>> f191504j;

    public r(Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.l lVar, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f191495a = provider;
        this.f191496b = provider2;
        this.f191497c = provider3;
        this.f191498d = provider4;
        this.f191499e = lVar;
        this.f191500f = provider5;
        this.f191501g = provider6;
        this.f191502h = provider7;
        this.f191503i = provider8;
        this.f191504j = provider9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f191495a.get(), this.f191496b.get(), this.f191497c.get(), this.f191498d.get(), (Resources) this.f191499e.f393949a, this.f191500f.get(), this.f191501g.get(), this.f191502h.get(), this.f191503i.get(), this.f191504j.get());
    }
}
