package com.avito.android.select.sectioned_multiselect.container.di;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.T0;
import aq0.InterfaceC23653b;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.select.sectioned_multiselect.container.SectionedMultiselectContainerFragment;
import com.avito.android.select.sectioned_multiselect.container.di.c;
import com.avito.android.select.sectioned_multiselect.container.di.f;
import com.avito.android.select.sectioned_multiselect.container.tab_layout.ContainerTabItem;
import com.avito.android.select.sectioned_multiselect.core.O;
import com.avito.android.select.sectioned_multiselect.core.T;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import kq0.C43487a;

/* compiled from: DaggerSectionedMultiselectContainerComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSectionedMultiselectContainerComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.select.sectioned_multiselect.container.di.c.a
        public final com.avito.android.select.sectioned_multiselect.container.di.c a(String str, Context context, Resources resources, SectionedMultiselectContainerFragment sectionedMultiselectContainerFragment, ActivityC22955m activityC22955m, SearchParams searchParams, boolean z12, InterfaceC23653b interfaceC23653b) {
            str.getClass();
            return new c(interfaceC23653b, str, context, resources, sectionedMultiselectContainerFragment, activityC22955m, searchParams, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerSectionedMultiselectContainerComponent.java */
    public static final class c implements com.avito.android.select.sectioned_multiselect.container.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final Context f266431a;

        /* renamed from: b, reason: collision with root package name */
        public final Fragment f266432b;

        /* renamed from: c, reason: collision with root package name */
        public final String f266433c;

        /* renamed from: d, reason: collision with root package name */
        public final SearchParams f266434d;

        /* renamed from: e, reason: collision with root package name */
        public final Boolean f266435e;

        /* renamed from: f, reason: collision with root package name */
        public final e f266436f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35745a5> f266437g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.select.sectioned_multiselect.container.d> f266438h;

        /* renamed from: i, reason: collision with root package name */
        public final u<j<ContainerTabItem>> f266439i = g.d(f.a.f266445a);

        /* compiled from: DaggerSectionedMultiselectContainerComponent.java */
        /* renamed from: com.avito.android.select.sectioned_multiselect.container.di.a$c$a, reason: collision with other inner class name */
        public static final class C7948a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266440a;

            public C7948a(InterfaceC23653b interfaceC23653b) {
                this.f266440a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f266440a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(InterfaceC23653b interfaceC23653b, String str, Context context, Resources resources, Fragment fragment, T0 t02, SearchParams searchParams, Boolean bool, C7947a c7947a) {
            this.f266431a = context;
            this.f266432b = fragment;
            this.f266433c = str;
            this.f266434d = searchParams;
            this.f266435e = bool;
            this.f266436f = new e(l.a(t02), T.a());
            this.f266437g = new C7948a(interfaceC23653b);
            this.f266438h = g.d(new com.avito.android.select.sectioned_multiselect.container.f(this.f266436f, this.f266437g, new O(l.a(resources))));
        }

        @Override // com.avito.android.select.sectioned_multiselect.container.di.c
        public final void a(SectionedMultiselectContainerFragment sectionedMultiselectContainerFragment) {
            sectionedMultiselectContainerFragment.f266418n0 = this.f266438h.get();
            sectionedMultiselectContainerFragment.f266419o0 = new C43487a(this.f266439i.get(), this.f266431a, R.layout.sectioned_multiselect_tab);
            sectionedMultiselectContainerFragment.f266420p0 = this.f266439i.get();
            sectionedMultiselectContainerFragment.f266421q0 = new com.avito.android.select.sectioned_multiselect.container.a(this.f266432b, this.f266433c, this.f266439i.get(), this.f266434d, this.f266435e.booleanValue());
        }
    }

    public static c.a a() {
        return new b();
    }
}
