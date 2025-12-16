package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyListMeasure.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20651b0 extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f28909l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f28910m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f28911n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20651b0(ArrayList arrayList, List list, boolean z12) {
        super(1);
        this.f28909l = arrayList;
        this.f28910m = list;
        this.f28911n = z12;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        boolean z12;
        K0.a aVar2 = aVar;
        ArrayList arrayList = this.f28909l;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            z12 = this.f28911n;
            if (i12 >= size) {
                break;
            }
            ((g0) arrayList.get(i12)).e(aVar2, z12);
            i12++;
        }
        ?? r02 = this.f28910m;
        int size2 = ((Collection) r02).size();
        for (int i13 = 0; i13 < size2; i13++) {
            ((g0) r02.get(i13)).e(aVar2, z12);
        }
        return G0.f406611a;
    }
}
