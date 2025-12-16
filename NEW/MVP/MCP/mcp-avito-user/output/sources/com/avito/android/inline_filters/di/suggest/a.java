package com.avito.android.inline_filters.di.suggest;

import com.avito.android.inline_filters.di.suggest.b;
import com.avito.android.inline_filters.dialog.suggest.m;
import com.avito.android.inline_filters.dialog.suggest.o;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import kA0.InterfaceC42557b;

/* compiled from: DaggerInlineFilterSuggestComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerInlineFilterSuggestComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.inline_filters.di.suggest.b.a
        public final com.avito.android.inline_filters.di.suggest.b a(com.avito.android.inline_filters.di.suggest.c cVar, SearchParams searchParams, Filter filter) {
            filter.getClass();
            return new c(cVar, searchParams, filter, null);
        }
    }

    /* compiled from: DaggerInlineFilterSuggestComponent.java */
    public static final class c implements com.avito.android.inline_filters.di.suggest.b {

        /* renamed from: a, reason: collision with root package name */
        public final Filter f171128a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.inline_filters.di.suggest.c f171129b;

        public c(com.avito.android.inline_filters.di.suggest.c cVar, SearchParams searchParams, Filter filter, C5068a c5068a) {
            this.f171128a = filter;
            this.f171129b = cVar;
        }

        @Override // com.avito.android.inline_filters.di.suggest.b
        public final void a(com.avito.android.inline_filters.dialog.suggest.b bVar) {
            com.avito.android.inline_filters.di.suggest.c cVar = this.f171129b;
            InterfaceC42557b interfaceC42557bS3 = cVar.S3();
            t.c(interfaceC42557bS3);
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            m mVar = new m(interfaceC42557bS3, interfaceC35745a5D);
            InterfaceC35745a5 interfaceC35745a5D2 = cVar.d();
            t.c(interfaceC35745a5D2);
            o.a aVar = new o.a(this.f171128a, mVar, interfaceC35745a5D2);
            int i12 = d.f171130a;
            bVar.f172219i = (o) aVar.create(o.class);
        }
    }

    public static b.a a() {
        return new b();
    }
}
