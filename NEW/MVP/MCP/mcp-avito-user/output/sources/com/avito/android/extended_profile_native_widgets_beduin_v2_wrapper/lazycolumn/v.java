package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.grid.GridElementType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: SpanLookup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/v;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Integer> f151425e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public Object f151426f = C42784z0.f406748b;

    public v(@Y61.k Y41.a<Integer> aVar) {
        this.f151425e = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int size = this.f151426f.size();
        Y41.a<Integer> aVar = this.f151425e;
        if (i12 >= size) {
            return ((Number) ((h) aVar).invoke()).intValue();
        }
        k kVar = (k) this.f151426f.get(i12);
        if (kVar instanceof a) {
            return ((Number) ((h) aVar).invoke()).intValue();
        }
        if (!(kVar instanceof u)) {
            throw new NoWhenBranchMatchedException();
        }
        QH.a aVar2 = ((u) kVar).f151421a;
        if (aVar2 == null) {
            return ((Number) ((h) aVar).invoke()).intValue();
        }
        GridElementType f154834c = aVar2.getF154834c();
        if (f154834c instanceof GridElementType.FullWidth) {
            return ((Number) ((h) aVar).invoke()).intValue();
        }
        if (f154834c instanceof GridElementType.SingleSpan) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
