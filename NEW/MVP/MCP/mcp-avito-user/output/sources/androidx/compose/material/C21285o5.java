package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21285o5 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f33860l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.style.h f33861m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f33862n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21285o5(androidx.compose.ui.text.x0 x0Var, androidx.compose.ui.text.style.h hVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
        super(2);
        this.f33860l = x0Var;
        this.f33861m = hVar;
        this.f33862n = pVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            dc.a(androidx.compose.ui.text.x0.b(this.f33860l, 0L, 0L, null, null, 0L, 0, 0L, null, this.f33861m, 15728639), this.f33862n, a13, 0);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
