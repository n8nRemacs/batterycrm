package com.avito.android.replace_main.toggle;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.replace_main.toggle.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ReplaceMainToggleViewImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class z extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28373a f254663l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A f254664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f254665n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(InterfaceC28373a interfaceC28373a, A a12, v.a aVar) {
        super(2);
        this.f254663l = interfaceC28373a;
        this.f254664m = a12;
        this.f254665n = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            Z1<d> z12 = this.f254664m.f254607a;
            v.a aVar = this.f254665n;
            j.a(this.f254663l, z12, aVar.f254658b, aVar.f254659c, a13, 584);
        }
        return G0.f406611a;
    }
}
