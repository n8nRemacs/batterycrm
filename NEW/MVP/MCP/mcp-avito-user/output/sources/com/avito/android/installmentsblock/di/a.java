package com.avito.android.installmentsblock.di;

import aO.InterfaceC19796b;
import com.avito.android.installments_block.entity.InstallmentsBlock;
import com.avito.android.installmentsblock.di.b;
import com.avito.android.installmentsblock.mvi.g;
import com.avito.android.installmentsblock.mvi.j;
import com.avito.android.installmentsblock.mvi.n;
import com.avito.android.installmentsblock.mvi.p;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerInstallmentsBlockComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerInstallmentsBlockComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.installmentsblock.di.b.a
        public final com.avito.android.installmentsblock.di.b a(InstallmentsBlock installmentsBlock, InterfaceC19796b interfaceC19796b, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, installmentsBlock, interfaceC19796b, null);
        }
    }

    /* compiled from: DaggerInstallmentsBlockComponent.java */
    public static final class c implements com.avito.android.installmentsblock.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final g f172962a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f172963b;

        /* renamed from: c, reason: collision with root package name */
        public final p f172964c;

        /* compiled from: DaggerInstallmentsBlockComponent.java */
        /* renamed from: com.avito.android.installmentsblock.di.a$c$a, reason: collision with other inner class name */
        public static final class C5097a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f172965a;

            public C5097a(cv.b bVar) {
                this.f172965a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f172965a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        public c(cv.b bVar, InstallmentsBlock installmentsBlock, InterfaceC19796b interfaceC19796b, C5096a c5096a) {
            this.f172962a = new g(l.b(installmentsBlock));
            this.f172964c = new p(new j(this.f172962a, new com.avito.android.installmentsblock.mvi.e(l.b(interfaceC19796b)), new com.avito.android.installmentsblock.mvi.l(new C5097a(bVar)), n.a()));
        }

        @Override // com.avito.android.installmentsblock.di.b
        public final void a(com.avito.android.installmentsblock.e eVar) {
            eVar.f172967b = this.f172964c;
        }
    }

    public static b.a a() {
        return new b();
    }
}
