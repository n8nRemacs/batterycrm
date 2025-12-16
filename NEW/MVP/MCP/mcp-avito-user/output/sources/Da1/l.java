package da1;

import L91.z;
import android.os.Bundle;
import kotlin.jvm.internal.N;
import z91.s;

/* loaded from: classes9.dex */
public final class l extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393932l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar) {
        super(0);
        this.f393932l = mVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393932l;
        mVar.requireContext();
        s sVar = z91.e.f443908b;
        if (sVar == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        Y91.b bVar = (Y91.b) sVar.f443926f.getValue();
        mVar.requireContext();
        s sVar2 = z91.e.f443908b;
        if (sVar2 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        W91.h hVarB = sVar2.b();
        mVar.requireContext();
        s sVar3 = z91.e.f443908b;
        if (sVar3 == null) {
            throw new IllegalArgumentException("DI delegate is null");
        }
        C91.h hVarC = sVar3.c();
        Bundle arguments = mVar.getArguments();
        return new z(bVar, hVarB, hVarC, arguments != null ? Boolean.valueOf(arguments.getBoolean("INN")) : null);
    }
}
