package androidx.compose.material;

import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: Scaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class M7 extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32900l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32901m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32902n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32903o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32904p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f32905q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f32906r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32907s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f32908t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E4 f32909u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f32910v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i12, int i13, int i14, Integer num, E4 e42, Integer num2) {
        super(1);
        this.f32900l = arrayList;
        this.f32901m = arrayList2;
        this.f32902n = arrayList3;
        this.f32903o = arrayList4;
        this.f32904p = arrayList5;
        this.f32905q = i12;
        this.f32906r = i13;
        this.f32907s = i14;
        this.f32908t = num;
        this.f32909u = e42;
        this.f32910v = num2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        int i12;
        K0.a aVar2 = aVar;
        ArrayList arrayList = this.f32900l;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            aVar2.e((androidx.compose.ui.layout.K0) arrayList.get(i13), 0, this.f32905q, 0.0f);
        }
        ArrayList arrayList2 = this.f32901m;
        int size2 = arrayList2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            aVar2.e((androidx.compose.ui.layout.K0) arrayList2.get(i14), 0, 0, 0.0f);
        }
        ArrayList arrayList3 = this.f32902n;
        int size3 = arrayList3.size();
        int i15 = 0;
        while (true) {
            i12 = this.f32906r;
            if (i15 >= size3) {
                break;
            }
            aVar2.e((androidx.compose.ui.layout.K0) arrayList3.get(i15), 0, i12 - this.f32907s, 0.0f);
            i15++;
        }
        ArrayList arrayList4 = this.f32903o;
        int size4 = arrayList4.size();
        for (int i16 = 0; i16 < size4; i16++) {
            androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) arrayList4.get(i16);
            Integer num = this.f32908t;
            aVar2.e(k02, 0, i12 - (num != null ? num.intValue() : 0), 0.0f);
        }
        ArrayList arrayList5 = this.f32904p;
        int size5 = arrayList5.size();
        for (int i17 = 0; i17 < size5; i17++) {
            androidx.compose.ui.layout.K0 k03 = (androidx.compose.ui.layout.K0) arrayList5.get(i17);
            E4 e42 = this.f32909u;
            int i18 = e42 != null ? e42.f32576a : 0;
            Integer num2 = this.f32910v;
            aVar2.e(k03, i18, i12 - (num2 != null ? num2.intValue() : 0), 0.0f);
        }
        return kotlin.G0.f406611a;
    }
}
