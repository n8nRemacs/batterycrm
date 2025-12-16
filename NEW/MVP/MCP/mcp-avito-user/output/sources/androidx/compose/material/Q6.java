package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Q6 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f33079l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f33080m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f33081n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21291ob f33082o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f33083p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(boolean z12, boolean z13, androidx.compose.foundation.interaction.m mVar, InterfaceC21291ob interfaceC21291ob, androidx.compose.ui.graphics.h1 h1Var) {
        super(2);
        this.f33079l = z12;
        this.f33080m = z13;
        this.f33081n = mVar;
        this.f33082o = interfaceC21291ob;
        this.f33083p = h1Var;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C21317qb.f34002a.a(this.f33079l, this.f33080m, this.f33081n, this.f33082o, this.f33083p, 0.0f, 0.0f, a13, 12582912, 96);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
