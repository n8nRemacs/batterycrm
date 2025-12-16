package com.avito.android.virtual_deal_room_reference_category.client_add.di;

import Y41.l;
import androidx.view.C22977J;
import androidx.view.Lifecycle;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment;
import com.avito.android.virtual_deal_room_reference_category.client_add.di.a;
import com.avito.android.virtual_deal_room_reference_category.client_add.j;
import com.avito.android.virtual_deal_room_reference_category.client_add.model.ClientAddArguments;
import com.avito.android.virtual_deal_room_reference_category.client_add.mvi.d;
import com.avito.android.virtual_deal_room_reference_category.client_add.mvi.g;
import com.avito.android.virtual_deal_room_reference_category.client_add.mvi.i;
import com.avito.android.virtual_deal_room_reference_category.client_add.mvi.k;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import kotlinx.coroutines.T;
import rO0.InterfaceC47577a;
import tO0.InterfaceC48588a;

/* compiled from: DaggerClientAddComponent.java */
@e
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: DaggerClientAddComponent.java */
    public static final class b implements com.avito.android.virtual_deal_room_reference_category.client_add.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super InterfaceC47577a, G0> f327146a;

        /* renamed from: b, reason: collision with root package name */
        public final Lifecycle f327147b;

        /* renamed from: c, reason: collision with root package name */
        public final T f327148c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC48588a> f327149d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f327150e;

        /* renamed from: f, reason: collision with root package name */
        public final d f327151f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f327152g;

        /* renamed from: h, reason: collision with root package name */
        public final j f327153h;

        /* compiled from: DaggerClientAddComponent.java */
        public static final class a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.virtual_deal_room_reference_category.client_add.di.b f327154a;

            public a(com.avito.android.virtual_deal_room_reference_category.client_add.di.b bVar) {
                this.f327154a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f327154a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerClientAddComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_reference_category.client_add.di.c$b$b, reason: collision with other inner class name */
        public static final class C10140b implements u<InterfaceC48588a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.virtual_deal_room_reference_category.client_add.di.b f327155a;

            public C10140b(com.avito.android.virtual_deal_room_reference_category.client_add.di.b bVar) {
                this.f327155a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48588a interfaceC48588aDe = this.f327155a.de();
                t.c(interfaceC48588aDe);
                return interfaceC48588aDe;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.virtual_deal_room_reference_category.client_add.di.b bVar, ClientAddArguments clientAddArguments, l lVar, Lifecycle lifecycle, T t12, a aVar) {
            this.f327146a = lVar;
            this.f327147b = lifecycle;
            this.f327148c = t12;
            this.f327151f = new d(new C10140b(bVar), new a(bVar));
            this.f327152g = dagger.internal.l.a(clientAddArguments);
            this.f327153h = new j(new g(this.f327151f, i.a(), k.a(), this.f327152g));
        }

        @Override // com.avito.android.virtual_deal_room_reference_category.client_add.di.a
        public final void a(ClientAddDialogFragment clientAddDialogFragment) {
            clientAddDialogFragment.f327121h0 = this.f327153h;
            clientAddDialogFragment.f327123j0 = new com.avito.android.virtual_deal_room_reference_category.client_add.g(this.f327146a, this.f327147b, this.f327148c);
        }
    }

    /* compiled from: DaggerClientAddComponent.java */
    /* renamed from: com.avito.android.virtual_deal_room_reference_category.client_add.di.c$c, reason: collision with other inner class name */
    public static final class C10141c implements a.b {
        public C10141c() {
        }

        @Override // com.avito.android.virtual_deal_room_reference_category.client_add.di.a.b
        public final com.avito.android.virtual_deal_room_reference_category.client_add.di.a a(com.avito.android.virtual_deal_room_reference_category.client_add.di.b bVar, ClientAddArguments clientAddArguments, l lVar, Lifecycle lifecycle, C22977J c22977j) {
            clientAddArguments.getClass();
            return new b(bVar, clientAddArguments, lVar, lifecycle, c22977j, null);
        }
    }

    public static a.b a() {
        return new C10141c();
    }
}
