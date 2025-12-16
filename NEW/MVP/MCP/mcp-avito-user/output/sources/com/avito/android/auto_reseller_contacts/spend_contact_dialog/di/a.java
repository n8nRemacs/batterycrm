package com.avito.android.auto_reseller_contacts.spend_contact_dialog.di;

import com.avito.android.auto_reseller_contacts.spend_contact_dialog.SpendContactDialogActivity;
import com.avito.android.auto_reseller_contacts.spend_contact_dialog.SpendContactOpenParams;
import com.avito.android.auto_reseller_contacts.spend_contact_dialog.di.b;
import com.avito.android.auto_reseller_contacts.spend_contact_dialog.g;
import dagger.internal.e;

/* compiled from: DaggerSpendContactComponent.java */
@e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerSpendContactComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.auto_reseller_contacts.spend_contact_dialog.di.b.a
        public final com.avito.android.auto_reseller_contacts.spend_contact_dialog.di.b a(SpendContactOpenParams spendContactOpenParams) {
            spendContactOpenParams.getClass();
            return new c(spendContactOpenParams, null);
        }
    }

    /* compiled from: DaggerSpendContactComponent.java */
    public static final class c implements com.avito.android.auto_reseller_contacts.spend_contact_dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final SpendContactOpenParams f95804a;

        public c(SpendContactOpenParams spendContactOpenParams, C2832a c2832a) {
            this.f95804a = spendContactOpenParams;
        }

        @Override // com.avito.android.auto_reseller_contacts.spend_contact_dialog.di.b
        public final void a(SpendContactDialogActivity spendContactDialogActivity) {
            spendContactDialogActivity.f95794n = new g(this.f95804a);
        }
    }

    public static b.a a() {
        return new b();
    }
}
