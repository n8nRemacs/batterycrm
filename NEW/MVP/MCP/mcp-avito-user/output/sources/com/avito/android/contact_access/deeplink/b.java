package com.avito.android.contact_access.deeplink;

import Ju.InterfaceC14249c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.contact_access.contact_access_package.view.ContactAccessPackageFragment;
import com.avito.android.contact_access.links.ContactsPackagesApplyLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: ContactsPackagesApplyLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/contact_access/deeplink/b;", "Lev/a;", "Lcom/avito/android/contact_access/links/ContactsPackagesApplyLink;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40161a<ContactsPackagesApplyLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f126068f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f126069g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f126070h = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ContactsPackagesApplyLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "it", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b c3746b;
            ContactAccessPackageFragment.ResultType resultType = ContactAccessPackageFragment.ResultType.f125925c;
            Bundle bundle = ((C47919b) obj).f437159b;
            int i12 = bundle.getInt("contact_access_package_fragment_result_argument", 1);
            if (i12 == 2) {
                c3746b = ContactsPackagesApplyLink.b.c.f126157b;
            } else if (i12 == 3) {
                DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("contact_access_package_fragment_switch_payment_argument", DeepLink.class) : bundle.getParcelable("contact_access_package_fragment_switch_payment_argument"));
                c3746b = deepLink == null ? ContactsPackagesApplyLink.b.a.f126155b : new ContactsPackagesApplyLink.b.C3746b(deepLink);
            } else {
                c3746b = ContactsPackagesApplyLink.b.a.f126155b;
            }
            b.this.j(c3746b);
        }
    }

    /* compiled from: ContactsPackagesApplyLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.contact_access.deeplink.b$b, reason: collision with other inner class name */
    public static final class C3741b<T> implements l41.g {
        public C3741b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
            b.this.j(ContactsPackagesApplyLink.b.a.f126155b);
        }
    }

    @Inject
    public b(@Y61.k a.d dVar, @Y61.k a.f fVar) {
        this.f126068f = dVar;
        this.f126069g = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f126068f.D0(this.f395444b, new com.avito.android.contact_access.deeplink.a((ContactsPackagesApplyLink) deepLink, bundle != null ? bundle.getBoolean("key_should_to_show_toast", true) : true));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f126070h.b(this.f126069g.l1("contact_access_package_fragment_result").v0(new a(), new C3741b(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f126070h.e();
    }
}
