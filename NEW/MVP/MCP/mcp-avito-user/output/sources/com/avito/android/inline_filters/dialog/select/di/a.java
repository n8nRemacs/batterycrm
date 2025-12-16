package com.avito.android.inline_filters.dialog.select.di;

import android.content.Context;
import com.avito.android.candy.f;
import com.avito.android.candy.j;
import com.avito.android.candy.r;
import com.avito.android.candy.u;
import com.avito.android.inline_filters.dialog.select.C31039i;
import com.avito.android.inline_filters.dialog.select.di.b;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerMultiselectFiltersDialogComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerMultiselectFiltersDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.inline_filters.dialog.select.di.b.a
        public final com.avito.android.inline_filters.dialog.select.di.b a(com.avito.android.inline_filters.dialog.select.di.c cVar) {
            return new c(cVar, null);
        }
    }

    /* compiled from: DaggerMultiselectFiltersDialogComponent.java */
    public static final class c implements com.avito.android.inline_filters.dialog.select.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.inline_filters.dialog.select.di.c f172145a;

        public c(com.avito.android.inline_filters.dialog.select.di.c cVar, C5081a c5081a) {
            this.f172145a = cVar;
        }

        @Override // com.avito.android.inline_filters.dialog.select.di.b
        public final void a(C31039i c31039i) {
            u uVar = new u();
            com.avito.android.inline_filters.dialog.select.di.c cVar = this.f172145a;
            j jVar = new j(cVar.g());
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            Context contextG = cVar.g();
            InterfaceC35745a5 interfaceC35745a5D2 = cVar.d();
            t.c(interfaceC35745a5D2);
            c31039i.f172161e = new f(uVar, jVar, new r(interfaceC35745a5D, new com.avito.android.candy.c(contextG, interfaceC35745a5D2)));
            InterfaceC35745a5 interfaceC35745a5D3 = cVar.d();
            t.c(interfaceC35745a5D3);
            c31039i.f172162f = interfaceC35745a5D3;
        }
    }

    public static b.a a() {
        return new b();
    }
}
