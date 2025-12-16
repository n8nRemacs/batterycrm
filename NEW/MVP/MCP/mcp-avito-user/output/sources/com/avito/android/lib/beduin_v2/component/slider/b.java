package com.avito.android.lib.beduin_v2.component.slider;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SliderComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l<Integer, G0> f175904l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super Integer, G0> lVar) {
        super(1);
        this.f175904l = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(Float f12) {
        this.f175904l.invoke(Integer.valueOf((int) f12.floatValue()));
        return G0.f406611a;
    }
}
