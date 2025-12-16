package com.avito.android.publish.date_picker;

import com.avito.android.lib.design.picker.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MonthAndYearPicker.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f232516l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k<?> f232517m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k<?> f232518n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, k<?> kVar, k<?> kVar2) {
        super(0);
        this.f232516l = hVar;
        this.f232517m = kVar;
        this.f232518n = kVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f232516l;
        hVar.f232506d.setSecondWheelValue(this.f232517m);
        hVar.f232506d.setFirstWheelValue(this.f232518n);
        return G0.f406611a;
    }
}
