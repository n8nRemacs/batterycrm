package com.avito.android.location_picker.view;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationPickerView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.view.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31587i extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC31586h f182652l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31587i(AbstractC31586h abstractC31586h) {
        super(0);
        this.f182652l = abstractC31586h;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AbstractC31586h abstractC31586h = this.f182652l;
        com.avito.android.lib.design.modal.a aVar = abstractC31586h.f182567G;
        if (aVar != null) {
            aVar.dismiss();
        }
        abstractC31586h.f182567G = null;
        G0 g02 = G0.f406611a;
        abstractC31586h.f182578R.accept(g02);
        return g02;
    }
}
