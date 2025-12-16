package cM;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kM.InterfaceC42599c;
import kotlin.Metadata;

/* compiled from: IacProblemCurrentDeviceIacEnablingCheckerImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcM/g;", "LkM/c;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class g implements InterfaceC42599c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final NL.e f57823a;

    @Inject
    public g(@Y61.k NL.e eVar) {
        this.f57823a = eVar;
    }

    @Override // lM.InterfaceC43654a
    @Y61.l
    public final IacProblem a() {
        if (this.f57823a.a()) {
            return null;
        }
        return IacProblem.f169089b;
    }
}
