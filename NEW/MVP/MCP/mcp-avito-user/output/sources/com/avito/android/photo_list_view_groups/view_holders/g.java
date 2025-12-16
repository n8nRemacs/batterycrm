package com.avito.android.photo_list_view_groups.view_holders;

import com.avito.android.photo_list_view.G;
import com.avito.android.remote.model.category_parameters.Purpose;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageLoadingViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Purpose;", "purpose", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/Purpose;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<Purpose, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f218683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G f218684m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, G g12) {
        super(1);
        this.f218683l = fVar;
        this.f218684m = g12;
    }

    @Override // Y41.l
    public final G0 invoke(Purpose purpose) {
        f.C80(this.f218683l, purpose, this.f218684m, "icon");
        return G0.f406611a;
    }
}
