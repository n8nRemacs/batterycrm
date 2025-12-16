package bQ;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.job.cv_packages.JobCvPackagesActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvPackagesIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbQ/b;", "LbQ/a;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements InterfaceC25544a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f57068a;

    @Inject
    public b(@k Application application) {
        this.f57068a = application;
    }

    @Override // bQ.InterfaceC25544a
    @k
    public final Intent a(@k String str, @l String str2) {
        Intent intent = new Intent(this.f57068a, (Class<?>) JobCvPackagesActivity.class);
        intent.putExtra("extra_resume_id", str);
        intent.putExtra("extra_vertical_type", str2);
        return intent;
    }
}
