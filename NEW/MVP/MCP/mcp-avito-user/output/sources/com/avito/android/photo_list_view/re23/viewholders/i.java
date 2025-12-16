package com.avito.android.photo_list_view.re23.viewholders;

import Y41.l;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.re23.viewholders.h;
import com.avito.android.remote.model.category_parameters.Purpose;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageLoadingViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Purpose;", "purpose", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/Purpose;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements l<Purpose, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f218320l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G f218321m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, G g12) {
        super(1);
        this.f218320l = hVar;
        this.f218321m = g12;
    }

    @Override // Y41.l
    public final G0 invoke(Purpose purpose) {
        Purpose purpose2 = purpose;
        int i12 = h.f218308h;
        h hVar = this.f218320l;
        hVar.getClass();
        int i13 = h.a.f218314a[purpose2.ordinal()];
        G g12 = this.f218321m;
        com.avito.android.photo_list_view.re23.a aVar = hVar.f218279b;
        if (i13 == 1) {
            aVar.b(g12.f218068a);
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("Action is not supported: " + purpose2);
            }
            aVar.o(g12.f218068a);
        }
        hVar.f218310d.a(purpose2, g12.f218072e);
        com.avito.android.lib.design.bottom_sheet.d dVar = hVar.f218313g;
        if (dVar != null) {
            dVar.dismiss();
        }
        return G0.f406611a;
    }
}
