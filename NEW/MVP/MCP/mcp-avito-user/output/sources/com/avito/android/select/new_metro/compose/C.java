package com.avito.android.select.new_metro.compose;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectMetroScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class C extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MetroSelectedStationsItem f265952l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, String, G0> f265953m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, Boolean, G0> f265954n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(MetroSelectedStationsItem metroSelectedStationsItem, Y41.p pVar, Y41.p pVar2) {
        super(3);
        this.f265952l = metroSelectedStationsItem;
        this.f265953m = pVar;
        this.f265954n = pVar2;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a(this.f265952l, this.f265953m, this.f265954n, a13, 8);
        }
        return G0.f406611a;
    }
}
