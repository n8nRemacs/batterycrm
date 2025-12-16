package com.avito.android.extended_profile_map.mvi;

import AA.b;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.extended_profile_map.ExtendedProfileAddress;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileMapBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_map/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "LAA/b;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements com.avito.android.arch.mvi.b<AA.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AvitoMapPoint f151295a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<ExtendedProfileAddress> f151296b;

    @Inject
    public g(@Y61.l AvitoMapPoint avitoMapPoint, @Y61.k Set<ExtendedProfileAddress> set) {
        this.f151295a = avitoMapPoint;
        this.f151296b = set;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AA.b> a() {
        return new C43210w(new b.f(this.f151295a, this.f151296b));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
