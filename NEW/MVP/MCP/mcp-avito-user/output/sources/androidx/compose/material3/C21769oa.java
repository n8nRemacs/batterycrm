package androidx.compose.material3;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21769oa extends kotlin.jvm.internal.N implements Y41.l<Float, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f36963l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Me f36964m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f36965n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21769oa(Y41.a aVar, Me me2, kotlinx.coroutines.T t12) {
        super(1);
        this.f36963l = t12;
        this.f36964m = me2;
        this.f36965n = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Float f12) {
        float fFloatValue = f12.floatValue();
        Me me2 = this.f36964m;
        ((kotlinx.coroutines.V0) C43259k.d(this.f36963l, null, null, new C21723ma(me2, fFloatValue, null), 3)).k(new C21746na(me2, this.f36965n));
        return kotlin.G0.f406611a;
    }
}
