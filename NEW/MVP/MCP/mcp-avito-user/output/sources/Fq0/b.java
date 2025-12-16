package fQ0;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.work_profile.WorkProfileActivity;
import com.avito.android.work_profile.WorkProfileOpenParams;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WorkProfileIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfQ0/b;", "LfQ0/a;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements InterfaceC40329a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f395878a;

    @Inject
    public b(@k Application application) {
        this.f395878a = application;
    }

    @Override // fQ0.InterfaceC40329a
    @k
    public final Intent a(@k WorkProfileTab workProfileTab, @l String str) {
        WorkProfileActivity.a aVar = WorkProfileActivity.f330595o;
        WorkProfileOpenParams workProfileOpenParams = new WorkProfileOpenParams(workProfileTab, str);
        aVar.getClass();
        return new Intent(this.f395878a, (Class<?>) WorkProfileActivity.class).putExtra("open_params", workProfileOpenParams);
    }
}
