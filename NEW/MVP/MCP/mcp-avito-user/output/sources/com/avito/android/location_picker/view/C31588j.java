package com.avito.android.location_picker.view;

import com.avito.android.location_picker.analytics.ScreenCloseFromBlock;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationPickerView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.view.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31588j extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC31586h f182653l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31588j(AbstractC31586h abstractC31586h) {
        super(0);
        this.f182653l = abstractC31586h;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AbstractC31586h abstractC31586h = this.f182653l;
        if (abstractC31586h.f182594e) {
            abstractC31586h.f182632z.accept(ScreenCloseFromBlock.f182204c);
        }
        abstractC31586h.f182592d.R0();
        return G0.f406611a;
    }
}
