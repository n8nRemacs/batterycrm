package gt;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CrmPaidCvsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgt/b;", "Lgt/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40730b implements InterfaceC40729a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f396895a;

    @Inject
    public C40730b(@k Application application) {
        this.f396895a = application;
    }

    @Override // gt.InterfaceC40729a
    @k
    public final Intent a() {
        CrmPaidCvsActivity.f130688m.getClass();
        return new Intent(this.f396895a, (Class<?>) CrmPaidCvsActivity.class);
    }
}
