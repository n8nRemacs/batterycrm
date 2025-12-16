package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21700la extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Me f36799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f36800m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f36801n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21700la(Y41.a aVar, Me me2, kotlinx.coroutines.T t12) {
        super(0);
        this.f36799l = me2;
        this.f36800m = t12;
        this.f36801n = aVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        Me me2 = this.f36799l;
        if (me2.f35135c.f37492d.invoke(SheetValue.f35417b).booleanValue()) {
            ((kotlinx.coroutines.V0) C43259k.d(this.f36800m, null, null, new C21654ja(me2, null), 3)).k(new C21677ka(me2, this.f36801n));
        }
        return kotlin.G0.f406611a;
    }
}
