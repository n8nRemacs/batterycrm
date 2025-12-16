package com.avito.android.user_adverts_views.advert_item.factory;

import Zx.C19616a;
import bW.InterfaceC25571b;
import com.avito.android.user_adverts_views.advert_item.factory.e;
import dagger.internal.l;
import dagger.internal.u;
import ur.InterfaceC49101b;
import wJ0.InterfaceC49521b;
import wJ0.InterfaceC49522c;
import wJ0.InterfaceC49523d;
import xJ0.InterfaceC49850b;

/* compiled from: DaggerUserAdvertItemViewProviderComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerUserAdvertItemViewProviderComponent.java */
    public static final class b implements e.a {
        public b() {
        }
    }

    /* compiled from: DaggerUserAdvertItemViewProviderComponent.java */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final l f316489a;

        /* renamed from: b, reason: collision with root package name */
        public final l f316490b;

        /* renamed from: c, reason: collision with root package name */
        public final l f316491c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC49522c> f316492d;

        /* renamed from: e, reason: collision with root package name */
        public final l f316493e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC49521b> f316494f;

        public c(com.avito.android.user_adverts_views.advert_item.factory.b bVar, com.avito.android.user_adverts_views_pub.a aVar, InterfaceC49523d interfaceC49523d, InterfaceC25571b interfaceC25571b, C19616a c19616a, InterfaceC49850b.InterfaceC12859b interfaceC12859b, InterfaceC49101b interfaceC49101b, C9832a c9832a) {
            this.f316489a = l.a(aVar);
            this.f316490b = l.a(interfaceC49523d);
            this.f316491c = l.a(interfaceC25571b);
            this.f316492d = dagger.internal.g.d(new d(bVar, this.f316489a, this.f316490b, this.f316491c, l.a(c19616a)));
            this.f316493e = l.a(interfaceC12859b);
            this.f316494f = dagger.internal.g.d(new com.avito.android.user_adverts_views.advert_item.factory.c(bVar, this.f316492d, this.f316493e, l.a(interfaceC49101b)));
        }

        @Override // xJ0.InterfaceC49849a
        public final InterfaceC49521b a() {
            return this.f316494f.get();
        }

        @Override // xJ0.InterfaceC49849a
        public final InterfaceC49522c b() {
            return this.f316492d.get();
        }
    }
}
