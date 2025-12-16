package androidx.compose.material;

import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: BackdropScaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class A0 extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.K0 f32333l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32334m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(androidx.compose.ui.layout.K0 k02, ArrayList arrayList) {
        super(1);
        this.f32333l = k02;
        this.f32334m = arrayList;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(K0.a aVar) {
        K0.a aVar2 = aVar;
        aVar2.h(this.f32333l, 0, 0, 0.0f);
        ArrayList arrayList = this.f32334m;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            aVar2.h((androidx.compose.ui.layout.K0) arrayList.get(i12), 0, 0, 0.0f);
        }
        return kotlin.G0.f406611a;
    }
}
