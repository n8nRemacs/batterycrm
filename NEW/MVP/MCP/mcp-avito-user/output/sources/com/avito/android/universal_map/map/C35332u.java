package com.avito.android.universal_map.map;

import com.avito.android.util.V2;
import kotlin.Metadata;
import lW.InterfaceC43691a;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35332u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305952b;

    public C35332u(UniversalMapFragment universalMapFragment) {
        this.f305952b = universalMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        InterfaceC43691a interfaceC43691a = this.f305952b.f304868t0;
        if (interfaceC43691a == null) {
            interfaceC43691a = null;
        }
        interfaceC43691a.f(null, th2.getMessage());
        V2.f318762a.f(th2);
    }
}
