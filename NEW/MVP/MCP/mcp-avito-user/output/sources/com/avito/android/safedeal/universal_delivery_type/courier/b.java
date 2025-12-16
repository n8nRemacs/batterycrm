package com.avito.android.safedeal.universal_delivery_type.courier;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinUniversalDeliveryTypeCourierFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinUniversalDeliveryTypeCourierFragment f256470l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BeduinUniversalDeliveryTypeCourierFragment beduinUniversalDeliveryTypeCourierFragment) {
        super(0);
        this.f256470l = beduinUniversalDeliveryTypeCourierFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        BeduinUniversalDeliveryTypeCourierFragment beduinUniversalDeliveryTypeCourierFragment = this.f256470l;
        RecyclerView recyclerView = beduinUniversalDeliveryTypeCourierFragment.f256455v0;
        RecyclerView recyclerView2 = recyclerView == null ? null : recyclerView;
        RecyclerView recyclerView3 = beduinUniversalDeliveryTypeCourierFragment.f256456w0;
        D6.f(recyclerView2, 0, 0, 0, (recyclerView3 != null ? recyclerView3 : null).getMeasuredHeight(), 7);
        return G0.f406611a;
    }
}
