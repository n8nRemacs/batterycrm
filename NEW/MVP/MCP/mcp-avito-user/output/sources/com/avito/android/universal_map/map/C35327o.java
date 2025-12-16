package com.avito.android.universal_map.map;

import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.universal_map.map.AbstractC35291a;
import com.avito.android.universal_map.map.UniversalMapFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/a;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35327o extends kotlin.jvm.internal.N implements Y41.l<AbstractC35291a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305697l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35327o(UniversalMapFragment universalMapFragment) {
        super(1);
        this.f305697l = universalMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC35291a abstractC35291a) {
        AbstractC35291a abstractC35291a2 = abstractC35291a;
        boolean zF2 = kotlin.jvm.internal.L.f(abstractC35291a2, AbstractC35291a.C9363a.f304911a);
        UniversalMapFragment universalMapFragment = this.f305697l;
        if (zF2) {
            InterfaceC33034d interfaceC33034d = universalMapFragment.f304867s0;
            if (interfaceC33034d == null) {
                interfaceC33034d = null;
            }
            universalMapFragment.f304858T0.b(interfaceC33034d.h());
        } else if (kotlin.jvm.internal.L.f(abstractC35291a2, AbstractC35291a.b.f304912a)) {
            UniversalMapFragment.a aVar = UniversalMapFragment.f304838X0;
            universalMapFragment.t5();
        }
        return G0.f406611a;
    }
}
