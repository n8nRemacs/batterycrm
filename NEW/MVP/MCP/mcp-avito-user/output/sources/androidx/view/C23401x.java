package androidx.view;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/u;", "entry", "Lkotlin/G0;", "invoke", "(Landroidx/navigation/u;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23401x extends N implements l<C23395u, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f53240l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.a f53241m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C23397v f53242n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f53243o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C42754k<NavBackStackEntryState> f53244p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23401x(l0.a aVar, l0.a aVar2, C23397v c23397v, boolean z12, C42754k<NavBackStackEntryState> c42754k) {
        super(1);
        this.f53240l = aVar;
        this.f53241m = aVar2;
        this.f53242n = c23397v;
        this.f53243o = z12;
        this.f53244p = c42754k;
    }

    @Override // Y41.l
    public final G0 invoke(C23395u c23395u) {
        this.f53240l.f406838b = true;
        this.f53241m.f406838b = true;
        boolean z12 = C23397v.f53198G;
        boolean z13 = this.f53243o;
        C42754k<NavBackStackEntryState> c42754k = this.f53244p;
        this.f53242n.s(c23395u, z13, c42754k);
        return G0.f406611a;
    }
}
