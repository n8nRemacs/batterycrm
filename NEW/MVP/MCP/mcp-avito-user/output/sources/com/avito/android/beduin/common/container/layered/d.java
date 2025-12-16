package com.avito.android.beduin.common.container.layered;

import Y41.p;
import android.view.ViewGroup;
import com.avito.android.beduin.common.container.layered.a;
import com.avito.android.lib.util.layout.ForegroundFrameLayout;
import ej.InterfaceC40116e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinLayeredContainer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lcom/avito/android/beduin/common/container/componentsPool/k;", "recycledComponent", "Lkotlin/G0;", "invoke", "(ILcom/avito/android/beduin/common/container/componentsPool/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements p<Integer, com.avito.android.beduin.common.container.componentsPool.k, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ForegroundFrameLayout f103144l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f103145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, ForegroundFrameLayout foregroundFrameLayout) {
        super(2);
        this.f103144l = foregroundFrameLayout;
        this.f103145m = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, com.avito.android.beduin.common.container.componentsPool.k kVar) {
        com.avito.android.beduin.common.container.componentsPool.k kVar2 = kVar;
        if (num.intValue() == 0) {
            int i12 = a.f103131i;
            a aVar = this.f103145m;
            aVar.getClass();
            ForegroundFrameLayout foregroundFrameLayout = this.f103144l;
            ViewGroup.LayoutParams layoutParams = foregroundFrameLayout.getLayoutParams();
            int i13 = a.c.f103138a[aVar.f103132e.getLayoutMode().ordinal()];
            if (i13 != 1) {
                InterfaceC40116e interfaceC40116e = kVar2.f103016b;
                if (i13 == 2) {
                    layoutParams.width = -1;
                    layoutParams.height = interfaceC40116e.getF103243b().getLayoutParams().height;
                } else if (i13 == 3) {
                    layoutParams.width = interfaceC40116e.getF103243b().getLayoutParams().width;
                    layoutParams.height = -1;
                } else if (i13 == 4) {
                    layoutParams.width = interfaceC40116e.getF103243b().getLayoutParams().width;
                    layoutParams.height = interfaceC40116e.getF103243b().getLayoutParams().height;
                }
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            foregroundFrameLayout.setLayoutParams(layoutParams);
        }
        return G0.f406611a;
    }
}
