package androidx.compose.foundation;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: BasicTooltip.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class M extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f26774l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f26775m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Y y12, kotlinx.coroutines.T t12) {
        super(0);
        this.f26774l = y12;
        this.f26775m = t12;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        C20411b0 c20411b0 = (C20411b0) this.f26774l;
        if (c20411b0.isVisible()) {
            C43259k.d(this.f26775m, null, null, new L(c20411b0, null), 3);
        }
        return kotlin.G0.f406611a;
    }
}
