package cM;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kM.AbstractC42600d;
import kotlin.Metadata;

/* compiled from: IacProblemMicAccessCheckerImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcM/j;", "LkM/d;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class j extends AbstractC42600d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.permissions.u f57825a;

    @Inject
    public j(@Y61.k com.avito.android.permissions.u uVar) {
        this.f57825a = uVar;
    }

    @Override // lM.AbstractC43655b
    @Y61.l
    public final IacProblem b() {
        if (this.f57825a.b("android.permission.RECORD_AUDIO")) {
            return null;
        }
        return IacProblem.f169092e;
    }
}
