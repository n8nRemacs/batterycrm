package com.avito.android.select.new_metro.compose;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectMetroScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class H extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MetroFilterItem f265963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroFilterItem, G0> f265964m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Y41.l lVar, MetroFilterItem metroFilterItem) {
        super(3);
        this.f265963l = metroFilterItem;
        this.f265964m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            C34641h.a(this.f265963l, this.f265964m, a13, 8);
        }
        return G0.f406611a;
    }
}
