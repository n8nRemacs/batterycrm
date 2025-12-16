package Gr;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceActivity;
import com.avito.android.contact_access.contact_access_service.view.ContactAccessServiceArguments;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactAccessIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGr/b;", "LGr/a;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13910b implements InterfaceC13909a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f6750a;

    @Inject
    public C13910b(@k Application application) {
        this.f6750a = application;
    }

    @Override // Gr.InterfaceC13909a
    @k
    public final Intent a(@k String str, @l String str2, @l String str3) {
        return new Intent(this.f6750a, (Class<?>) ContactAccessServiceActivity.class).putExtra("extra_contact_access_args", new ContactAccessServiceArguments(str, str2, str3));
    }
}
