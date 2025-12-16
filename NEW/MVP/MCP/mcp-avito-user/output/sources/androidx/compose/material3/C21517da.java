package androidx.compose.material3;

import androidx.compose.ui.semantics.C22553a;
import kotlin.Metadata;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21517da extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Me f36198l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f36199m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f36200n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f36201o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f36202p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f36203q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21517da(Me me2, String str, String str2, String str3, Y41.a<kotlin.G0> aVar, kotlinx.coroutines.T t12) {
        super(1);
        this.f36198l = me2;
        this.f36199m = str;
        this.f36200n = str2;
        this.f36201o = str3;
        this.f36202p = aVar;
        this.f36203q = t12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
        androidx.compose.ui.semantics.F f13 = f12;
        androidx.compose.ui.semantics.C.d(f13, this.f36199m, new Y9(this.f36202p));
        Me me2 = this.f36198l;
        SheetValue sheetValueB = me2.b();
        SheetValue sheetValue = SheetValue.f35419d;
        kotlinx.coroutines.T t12 = this.f36203q;
        if (sheetValueB == sheetValue) {
            C21448aa c21448aa = new C21448aa(me2, t12, me2);
            String str = this.f36200n;
            androidx.compose.ui.semantics.k.f41760a.getClass();
            f13.a(androidx.compose.ui.semantics.k.f41779t, new C22553a(str, c21448aa));
        } else if (me2.f35135c.e().d(sheetValue)) {
            C21494ca c21494ca = new C21494ca(me2, t12);
            String str2 = this.f36201o;
            androidx.compose.ui.semantics.k.f41760a.getClass();
            f13.a(androidx.compose.ui.semantics.k.f41780u, new C22553a(str2, c21494ca));
        }
        return kotlin.G0.f406611a;
    }
}
