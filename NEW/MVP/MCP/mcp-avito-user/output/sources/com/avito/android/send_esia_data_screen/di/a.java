package com.avito.android.send_esia_data_screen.di;

import com.avito.android.deep_linking.x;
import com.avito.android.send_esia_data_screen.di.b;
import com.avito.android.send_esia_data_screen.mvi.f;
import com.avito.android.send_esia_data_screen.mvi.i;
import com.avito.android.send_esia_data_screen.mvi.k;
import com.avito.android.send_esia_data_screen.mvi.m;
import com.avito.android.send_esia_data_screen.mvi.o;
import com.avito.android.send_esia_data_screen.ui.SendEsiaDataActivity;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import nG.InterfaceC44249a;

/* compiled from: DaggerSendEsiaDataComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSendEsiaDataComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.send_esia_data_screen.di.b.a
        public final com.avito.android.send_esia_data_screen.di.b a(com.avito.android.send_esia_data_screen.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerSendEsiaDataComponent.java */
    public static final class c implements com.avito.android.send_esia_data_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f268242a;

        /* renamed from: b, reason: collision with root package name */
        public final u<x> f268243b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC44249a> f268244c;

        /* renamed from: d, reason: collision with root package name */
        public final o f268245d;

        /* compiled from: DaggerSendEsiaDataComponent.java */
        /* renamed from: com.avito.android.send_esia_data_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C8027a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.send_esia_data_screen.di.c f268246a;

            public C8027a(com.avito.android.send_esia_data_screen.di.c cVar) {
                this.f268246a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f268246a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerSendEsiaDataComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f268247a;

            public b(cv.b bVar) {
                this.f268247a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f268247a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSendEsiaDataComponent.java */
        /* renamed from: com.avito.android.send_esia_data_screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C8028c implements u<InterfaceC44249a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.send_esia_data_screen.di.c f268248a;

            public C8028c(com.avito.android.send_esia_data_screen.di.c cVar) {
                this.f268248a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44249a interfaceC44249aJa = this.f268248a.Ja();
                t.c(interfaceC44249aJa);
                return interfaceC44249aJa;
            }
        }

        public c(com.avito.android.send_esia_data_screen.di.c cVar, cv.b bVar, C8026a c8026a) {
            b bVar2 = new b(bVar);
            C8027a c8027a = new C8027a(cVar);
            this.f268245d = new o(new i(new f(bVar2, c8027a, new com.avito.android.send_esia_data_screen.domain.b(c8027a, new C8028c(cVar))), k.a(), m.a()));
        }

        @Override // com.avito.android.send_esia_data_screen.di.b
        public final void a(SendEsiaDataActivity sendEsiaDataActivity) {
            sendEsiaDataActivity.f268288m = this.f268245d;
        }
    }

    public static b.a a() {
        return new b();
    }
}
