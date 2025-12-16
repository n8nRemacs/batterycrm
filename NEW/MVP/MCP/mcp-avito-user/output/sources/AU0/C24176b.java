package au0;

import Y61.k;
import Y61.l;
import Yt0.InterfaceC18325a;
import com.squareup.anvil.annotations.ContributesBinding;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ActiveServiceBookingsRemoteRepositoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau0/b;", "Lau0/a;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: au0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C24176b implements InterfaceC24175a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC18325a> f56771a;

    @Inject
    public C24176b(@k e<InterfaceC18325a> eVar) {
        this.f56771a = eVar;
    }

    @Override // au0.InterfaceC24175a
    @l
    public final Object a(@l String str, @k ContinuationImpl continuationImpl) {
        return this.f56771a.get().a(str, continuationImpl);
    }
}
