package Ys;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesActivity;
import com.avito.android.crm_candidates.view.base.JobCrmNotesActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobCrmCandidatesIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYs/b;", "LYs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC18322a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f19702a;

    @Inject
    public b(@k Application application) {
        this.f19702a = application;
    }

    @Override // Ys.InterfaceC18322a
    @k
    public final Intent a() {
        JobCrmNotesActivity.f129876m.getClass();
        return new Intent(this.f19702a, (Class<?>) JobCrmNotesActivity.class);
    }

    @Override // Ys.InterfaceC18322a
    @k
    public final Intent b() {
        JobCrmCandidatesActivity.f129790m.getClass();
        return new Intent(this.f19702a, (Class<?>) JobCrmCandidatesActivity.class);
    }
}
