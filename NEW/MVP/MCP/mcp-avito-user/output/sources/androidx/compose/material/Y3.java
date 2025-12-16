package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/DrawerValue;", "it", "Landroidx/compose/material/W3;", "invoke", "(Landroidx/compose/material/DrawerValue;)Landroidx/compose/material/W3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Y3 extends kotlin.jvm.internal.N implements Y41.l<DrawerValue, W3> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DrawerValue, Boolean> f33370l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y3(Y41.l<? super DrawerValue, Boolean> lVar) {
        super(1);
        this.f33370l = lVar;
    }

    @Override // Y41.l
    public final W3 invoke(DrawerValue drawerValue) {
        return new W3(drawerValue, this.f33370l);
    }
}
