package com.avito.android.location_picker.view.publish;

import androidx.view.x;
import com.avito.android.location_picker.analytics.ScreenCloseFromBlock;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishLocationPickerView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<x, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f182741l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar) {
        super(1);
        this.f182741l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(x xVar) {
        b bVar = this.f182741l;
        if (D6.y(bVar.f182710l.f182756k)) {
            bVar.f182675L.accept(G0.f406611a);
        } else {
            if (bVar.f182697e) {
                bVar.f182720v.accept(ScreenCloseFromBlock.f182204c);
            }
            bVar.f182695d.R0();
        }
        return G0.f406611a;
    }
}
