package com.avito.android.contact_access.contact_access_package.view;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContactAccessPackageFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_contact-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* compiled from: ContactAccessPackageFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f125944l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f125945m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f125946n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z12, boolean z13) {
            super(1);
            this.f125944l = str;
            this.f125945m = z12;
            this.f125946n = z13;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            bundle2.putString("key_item_id", this.f125944l);
            bundle2.putBoolean("check_employee_balance_for_cv", this.f125945m);
            bundle2.putBoolean("key_should_to_show_toast", this.f125946n);
            return G0.f406611a;
        }
    }

    @k
    public static final ContactAccessPackageFragment a(@k String str, boolean z12, boolean z13) {
        ContactAccessPackageFragment contactAccessPackageFragment = new ContactAccessPackageFragment();
        C35966w1.a(contactAccessPackageFragment, 2, new a(str, z12, z13));
        return contactAccessPackageFragment;
    }
}
