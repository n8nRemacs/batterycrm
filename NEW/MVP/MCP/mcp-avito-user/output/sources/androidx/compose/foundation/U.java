package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: BasicTooltip.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f26869l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f26870m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y f26871n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(String str, kotlinx.coroutines.T t12, Y y12) {
        super(1);
        this.f26869l = str;
        this.f26870m = t12;
        this.f26871n = y12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
        androidx.compose.ui.semantics.C.i(f12, this.f26869l, new T(this.f26871n, this.f26870m));
        return kotlin.G0.f406611a;
    }
}
