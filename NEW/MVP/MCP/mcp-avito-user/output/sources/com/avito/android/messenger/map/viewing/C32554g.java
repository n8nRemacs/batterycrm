package com.avito.android.messenger.map.viewing;

import androidx.view.InterfaceC23040h0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.viewing.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32554g<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196845b;

    public C32554g(PlatformMapFragment platformMapFragment) {
        this.f196845b = platformMapFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            PlatformMapFragment platformMapFragment = this.f196845b;
            com.avito.android.location.find.p pVar = platformMapFragment.f196799s0;
            if (pVar == null) {
                pVar = null;
            }
            io.reactivex.rxjava3.core.z zVarB = pVar.b(platformMapFragment.requireActivity(), (4 & 2) == 0, (4 & 4) == 0);
            C32550c c32550c = new C32550c(platformMapFragment);
            C32551d c32551d = new C32551d(platformMapFragment);
            zVarB.getClass();
            platformMapFragment.f196803w0.b(zVarB.v0(c32550c, c32551d, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }
}
