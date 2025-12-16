package cZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.mvi.header_feature.C31757i;
import h31.e;
import iP.InterfaceC41329a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobCandidatesEntryPointAvailabilityInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcZ/c;", "LcZ/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC41329a> f57932a;

    @Inject
    public c(@k e<InterfaceC41329a> eVar) {
        this.f57932a = eVar;
    }

    @Override // cZ.b
    @l
    public final Object a(@k C31757i c31757i) {
        return this.f57932a.get().g(c31757i);
    }
}
