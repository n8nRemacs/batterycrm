package com.avito.android.video_requirements.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.video_requirements.view.VideoRequirementsOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pN0.InterfaceC46980a;
import pN0.InterfaceC46981b;

/* compiled from: VideoRequirementsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/video_requirements/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LpN0/a;", "LpN0/b;", "LpN0/d;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC46980a, InterfaceC46981b, pN0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.video_requirements.domain.a f326017a;

    @Inject
    public a(@Y61.k com.avito.android.video_requirements.domain.a aVar) {
        this.f326017a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC46981b> b(InterfaceC46980a interfaceC46980a, pN0.d dVar) {
        InterfaceC46980a interfaceC46980a2 = interfaceC46980a;
        if (!(interfaceC46980a2 instanceof InterfaceC46980a.C12269a)) {
            throw new NoWhenBranchMatchedException();
        }
        VideoRequirementsOpenParams videoRequirementsOpenParams = ((InterfaceC46980a.C12269a) interfaceC46980a2).f428508a;
        return this.f326017a.a(videoRequirementsOpenParams.f326053b, videoRequirementsOpenParams.f326054c, videoRequirementsOpenParams.f326055d, videoRequirementsOpenParams.f326056e);
    }
}
