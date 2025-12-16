package com.avito.android.location_picker.view.publish;

import com.avito.android.location_picker.analytics.ScreenCloseFromBlock;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishLocationPickerView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f182744l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar) {
        super(0);
        this.f182744l = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f182744l;
        if (bVar.f182697e) {
            bVar.f182720v.accept(ScreenCloseFromBlock.f182204c);
        }
        bVar.f182695d.R0();
        return G0.f406611a;
    }
}
