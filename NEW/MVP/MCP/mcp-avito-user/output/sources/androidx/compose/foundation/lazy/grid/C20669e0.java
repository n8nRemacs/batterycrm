package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.H0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: LazyGrid.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "line", "Ljava/util/ArrayList;", "Lkotlin/Q;", "Landroidx/compose/ui/unit/b;", "Lkotlin/collections/ArrayList;", "invoke", "(I)Ljava/util/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.grid.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20669e0 extends kotlin.jvm.internal.N implements Y41.l<Integer, ArrayList<kotlin.Q<? extends Integer, ? extends C22712b>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H0 f29118l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20667d0 f29119m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20669e0(H0 h02, C20667d0 c20667d0) {
        super(1);
        this.f29118l = h02;
        this.f29119m = c20667d0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final ArrayList<kotlin.Q<? extends Integer, ? extends C22712b>> invoke(Integer num) {
        H0.c cVarB = this.f29118l.b(num.intValue());
        ?? r12 = cVarB.f29015b;
        ArrayList<kotlin.Q<? extends Integer, ? extends C22712b>> arrayList = new ArrayList<>(r12.size());
        int size = ((Collection) r12).size();
        int i12 = cVarB.f29014a;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = (int) ((C20664c) r12.get(i14)).f29104a;
            arrayList.add(new kotlin.Q<>(Integer.valueOf(i12), C22712b.a(this.f29119m.a(i13, i15))));
            i12++;
            i13 += i15;
        }
        return arrayList;
    }
}
