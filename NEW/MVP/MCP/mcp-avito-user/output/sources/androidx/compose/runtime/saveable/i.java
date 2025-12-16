package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k<Object> f38568l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u<Object, ? extends Object> f38569m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f38570n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f38571o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f38572p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object[] f38573q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k<Object> kVar, u<Object, ? extends Object> uVar, r rVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f38568l = kVar;
        this.f38569m = uVar;
        this.f38570n = rVar;
        this.f38571o = str;
        this.f38572p = obj;
        this.f38573q = objArr;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
    @Override // Y41.a
    public final G0 invoke() {
        boolean z12;
        k<Object> kVar = this.f38568l;
        r rVar = kVar.f38575c;
        r rVar2 = this.f38570n;
        boolean z13 = true;
        if (rVar != rVar2) {
            kVar.f38575c = rVar2;
            z12 = true;
        } else {
            z12 = false;
        }
        String str = kVar.f38576d;
        String str2 = this.f38571o;
        if (L.f(str, str2)) {
            z13 = z12;
        } else {
            kVar.f38576d = str2;
        }
        kVar.f38574b = this.f38569m;
        kVar.f38577e = this.f38572p;
        kVar.f38578f = this.f38573q;
        r.a aVar = kVar.f38579g;
        if (aVar != null && z13) {
            aVar.a();
            kVar.f38579g = null;
            kVar.d();
        }
        return G0.f406611a;
    }
}
