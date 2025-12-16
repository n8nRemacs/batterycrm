package com.avito.android.photo_picker.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.photo_picker.C33272x;
import com.avito.android.photo_picker.C33273y;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import p80.C46918c;
import p80.InterfaceC46916a;

/* compiled from: PhotoPickerDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f219340a;

    /* renamed from: b, reason: collision with root package name */
    public final C33273y f219341b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f219342c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f219343d;

    /* renamed from: e, reason: collision with root package name */
    public final C46918c f219344e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f219345f;

    public b(dv.b bVar, C33273y c33273y, C30102l3 c30102l3, dv.b bVar2, C46918c c46918c, Provider provider) {
        this.f219340a = bVar;
        this.f219341b = c33273y;
        this.f219342c = c30102l3;
        this.f219343d = bVar2;
        this.f219344e = c46918c;
        this.f219345f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f219340a.get();
        this.f219341b.getClass();
        return new a(interfaceC4053a, new C33272x(), (Context) this.f219342c.get(), (a.b) this.f219343d.get(), (InterfaceC46916a) this.f219344e.get(), this.f219345f.get());
    }
}
