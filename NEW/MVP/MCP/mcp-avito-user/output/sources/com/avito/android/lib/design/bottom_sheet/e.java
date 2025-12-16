package com.avito.android.lib.design.bottom_sheet;

import android.view.View;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "bottomSheet", "", "newState", "Lkotlin/G0;", "invoke", "(Landroid/view/View;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.p<View, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f178535l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f178536m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, q qVar) {
        super(2);
        this.f178535l = dVar;
        this.f178536m = qVar;
    }

    @Override // Y41.p
    public final G0 invoke(View view, Integer num) {
        Y41.a<G0> aVarT;
        int iIntValue = num.intValue();
        d dVar = this.f178535l;
        dVar.getClass();
        if (iIntValue == 5) {
            if (dVar.f178527u && (aVarT = this.f178536m.t()) != null) {
                aVarT.invoke();
            }
            if (dVar.f178512A) {
                try {
                    if (dVar.f178522p) {
                        dVar.dismiss();
                    }
                } catch (Exception e12) {
                    V2.f318762a.c("BottomSheetDialog", "Error during dismiss", e12);
                }
            }
        }
        return G0.f406611a;
    }
}
