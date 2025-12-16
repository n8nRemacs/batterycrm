package g30;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import h30.InterfaceC40766a;
import i30.InterfaceC41217a;
import j30.C42188a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: GetContactsUseCaseImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg30/a;", "Lh30/a;", "_avito_new-cars-get-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g30.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40525a implements InterfaceC40766a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC41217a f396276a;

    @Inject
    public C40525a(@k InterfaceC41217a interfaceC41217a) {
        this.f396276a = interfaceC41217a;
    }

    @Override // h30.InterfaceC40766a
    @l
    public final Object a(@k Continuation<? super TypedResult<C42188a>> continuation) {
        return this.f396276a.a(continuation);
    }
}
