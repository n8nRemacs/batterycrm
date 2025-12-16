package da1;

import B91.F;
import L91.z;
import aa1.AbstractC19853c;
import aa1.C19851a;
import aa1.C19852b;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* renamed from: da1.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C39693e implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393918b;

    public C39693e(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar) {
        this.f393918b = mVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC19853c abstractC19853c = (AbstractC19853c) obj;
        boolean z12 = abstractC19853c instanceof C19852b;
        ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393918b;
        if (z12) {
            n nVar = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436487n0[0];
            ((z) mVar.f436488h0.a(mVar)).le(((C19852b) abstractC19853c).f20925a, mVar.requireContext());
        } else if (abstractC19853c instanceof C19851a) {
            C39689a c39689a = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436486m0;
            F f12 = (F) mVar.f436376g0;
            if (f12 != null) {
                ru.mts.biometry.sdk.feature.passport.ui.camera.m.e5(mVar, f12);
            }
        }
        return G0.f406611a;
    }
}
