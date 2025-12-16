package com.avito.android.item_report.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.item_report.ItemReportFragment;
import com.avito.android.item_report.di.b;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;

/* compiled from: DaggerItemReportComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerItemReportComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.item_report.di.c f173866a;

        public b() {
        }

        @Override // com.avito.android.item_report.di.b.a
        public final b.a a(com.avito.android.item_report.di.c cVar) {
            this.f173866a = cVar;
            return this;
        }

        @Override // com.avito.android.item_report.di.b.a
        public final com.avito.android.item_report.di.b build() {
            t.a(com.avito.android.item_report.di.c.class, this.f173866a);
            return new c(this.f173866a, null);
        }
    }

    /* compiled from: DaggerItemReportComponent.java */
    public static final class c implements com.avito.android.item_report.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.item_report.di.c f173867a;

        public c(com.avito.android.item_report.di.c cVar, C5123a c5123a) {
            this.f173867a = cVar;
        }

        @Override // com.avito.android.item_report.di.b
        public final void a(ItemReportFragment itemReportFragment) {
            com.avito.android.item_report.di.c cVar = this.f173867a;
            HO.a aVarEf = cVar.ef();
            t.c(aVarEf);
            itemReportFragment.f173862w0 = aVarEf;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            itemReportFragment.f173863x0 = interfaceC28373aA;
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            itemReportFragment.f173864y0 = interfaceC35745a5D;
            InterfaceC35741a1 interfaceC35741a1N = cVar.n();
            t.c(interfaceC35741a1N);
            itemReportFragment.f173865z0 = interfaceC35741a1N;
        }
    }

    public static b.a a() {
        return new b();
    }
}
