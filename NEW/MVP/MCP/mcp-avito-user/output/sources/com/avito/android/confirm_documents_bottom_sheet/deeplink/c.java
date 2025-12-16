package com.avito.android.confirm_documents_bottom_sheet.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmDocumentationBottomSheetDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f125515a;

    /* renamed from: b, reason: collision with root package name */
    public final C25721c f125516b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f125517c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f125518d;

    public c(C25721c c25721c, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f125515a = bVar;
        this.f125516b = c25721c;
        this.f125517c = bVar2;
        this.f125518d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((C25719a) this.f125516b.get(), (a.d) this.f125515a.get(), (a.f) this.f125517c.get(), this.f125518d.get());
    }
}
