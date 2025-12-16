package com.avito.android.contact_access.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.contact_access.links.ContactsPackagesApplyLink;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContactsPackagesApplyLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class a extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ContactsPackagesApplyLink f126066l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f126067m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ContactsPackagesApplyLink contactsPackagesApplyLink, boolean z12) {
        super(0);
        this.f126066l = contactsPackagesApplyLink;
        this.f126067m = z12;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        ContactsPackagesApplyLink contactsPackagesApplyLink = this.f126066l;
        return com.avito.android.contact_access.contact_access_package.view.d.a(contactsPackagesApplyLink.f126153b, contactsPackagesApplyLink.f126154c, this.f126067m);
    }
}
