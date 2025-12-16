package androidx.compose.foundation.lazy;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyListMeasure.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20653c0 extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<G0> f28920l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f28921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f28922n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f28923o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20653c0(InterfaceC22204y1 interfaceC22204y1, ArrayList arrayList, List list, boolean z12) {
        super(1);
        this.f28920l = interfaceC22204y1;
        this.f28921m = arrayList;
        this.f28922n = list;
        this.f28923o = z12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        C20651b0 c20651b0 = new C20651b0(this.f28921m, this.f28922n, this.f28923o);
        aVar2.f40350a = true;
        c20651b0.invoke(aVar2);
        aVar2.f40350a = false;
        this.f28920l.getF42167b();
        return G0.f406611a;
    }
}
