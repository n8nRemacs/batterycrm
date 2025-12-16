package com.avito.android.extended_profile_image_edit.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.extended_profile_image_edit.x;
import javax.inject.Inject;
import kotlin.Metadata;
import vA.InterfaceC49184b;
import vA.d;

/* compiled from: BannerImageEditReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/mvi/q;", "Lcom/avito/android/arch/mvi/u;", "LvA/b;", "LvA/d;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q implements u<InterfaceC49184b, vA.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f151104b;

    @Inject
    public q(@Y61.k x xVar) {
        this.f151104b = xVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final vA.d a(InterfaceC49184b interfaceC49184b, vA.d dVar) {
        InterfaceC49184b interfaceC49184b2 = interfaceC49184b;
        vA.d dVar2 = dVar;
        if (interfaceC49184b2 instanceof InterfaceC49184b.e) {
            return vA.d.a(dVar2, ((InterfaceC49184b.e) interfaceC49184b2).f440497a, false, null, false, 14);
        }
        if (!(interfaceC49184b2 instanceof InterfaceC49184b.i)) {
            return interfaceC49184b2 instanceof InterfaceC49184b.C12746b ? vA.d.a(dVar2, null, false, null, false, 11) : interfaceC49184b2 instanceof InterfaceC49184b.g ? vA.d.a(dVar2, null, true, null, false, 13) : interfaceC49184b2 instanceof InterfaceC49184b.f ? vA.d.a(dVar2, null, false, null, false, 13) : interfaceC49184b2 instanceof InterfaceC49184b.a ? vA.d.a(dVar2, null, false, null, ((InterfaceC49184b.a) interfaceC49184b2).f440493a, 7) : dVar2;
        }
        x xVar = this.f151104b;
        return vA.d.a(dVar2, null, false, new d.b(xVar.f151135d, xVar.f151136e), false, 11);
    }
}
