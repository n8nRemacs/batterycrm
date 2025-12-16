package Ut;

import Tt.C15404a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ChangeCvVisibilityInteractorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt/b;", "LUt/a;", "_avito_job_cv-visibility_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC15565a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C15404a f16712a;

    @Inject
    public b(@k C15404a c15404a) {
        this.f16712a = c15404a;
    }

    @Override // Ut.InterfaceC15565a
    @l
    public final Object a(long j12, @k String str, @k Continuation<? super TypedResult<Object>> continuation) {
        return this.f16712a.f15963a.a(j12, str, continuation);
    }
}
