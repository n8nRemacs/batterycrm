package Mp0;

import Lp0.C14427a;
import Np0.InterfaceC14601a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ChangeJobSearchStatusInteractorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMp0/a;", "LNp0/a;", "_avito_job_search-status_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14517a implements InterfaceC14601a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C14427a f11020a;

    @Inject
    public C14517a(@k C14427a c14427a) {
        this.f11020a = c14427a;
    }

    @Override // Np0.InterfaceC14601a
    @l
    public final Object a(long j12, @k String str, @k Continuation<? super TypedResult<Object>> continuation) {
        return this.f11020a.f10128a.a(j12, str, continuation);
    }
}
