package com.avito.android.inline_filters.dialog.addresses.di;

import com.avito.android.inline_filters.dialog.addresses.SuggestAddressesDialogFragment;
import com.avito.android.inline_filters.dialog.addresses.di.b;
import dagger.internal.e;

/* compiled from: DaggerSuggestAddressesDialogComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerSuggestAddressesDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.inline_filters.dialog.addresses.di.b.a
        public final com.avito.android.inline_filters.dialog.addresses.di.b a(com.avito.android.suggest_addresses.di.e eVar) {
            return new c(eVar, null);
        }
    }

    /* compiled from: DaggerSuggestAddressesDialogComponent.java */
    public static final class c implements com.avito.android.inline_filters.dialog.addresses.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.suggest_addresses.di.e f171160a;

        public c(com.avito.android.suggest_addresses.di.e eVar, C5069a c5069a) {
            this.f171160a = eVar;
        }

        @Override // com.avito.android.inline_filters.dialog.addresses.di.b
        public final void a(SuggestAddressesDialogFragment suggestAddressesDialogFragment) {
            suggestAddressesDialogFragment.f171149h0 = this.f171160a.ld();
        }
    }

    public static b.a a() {
        return new b();
    }
}
