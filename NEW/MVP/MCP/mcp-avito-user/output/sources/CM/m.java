package cM;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kM.AbstractC42601e;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacProblemMiuiLockScreenPermissionCheckerImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcM/m;", "LkM/e;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class m extends AbstractC42601e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PL.i f57827a;

    @Inject
    public m(@Y61.k PL.i iVar) {
        this.f57827a = iVar;
    }

    @Override // lM.AbstractC43655b
    @Y61.l
    public final IacProblem b() {
        PL.i iVar = this.f57827a;
        Boolean boolA = iVar.a();
        Boolean bool = Boolean.TRUE;
        if (L.f(boolA, bool) && L.f(iVar.c(), bool) && L.f(iVar.b(), Boolean.FALSE)) {
            return IacProblem.f169095h;
        }
        return null;
    }
}
