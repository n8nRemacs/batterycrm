package com.avito.android.beduin.common.container.layered;

import com.avito.android.lib.util.layout.ForegroundFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinLayeredContainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lcom/avito/android/beduin/common/container/componentsPool/j;", "invoke", "(I)Lcom/avito/android/beduin/common/container/componentsPool/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<Integer, com.avito.android.beduin.common.container.componentsPool.j> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f103141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ForegroundFrameLayout f103142m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ForegroundFrameLayout foregroundFrameLayout) {
        super(1);
        this.f103141l = aVar;
        this.f103142m = foregroundFrameLayout;
    }

    @Override // Y41.l
    public final com.avito.android.beduin.common.container.componentsPool.j invoke(Integer num) {
        int iIntValue = num.intValue();
        a aVar = this.f103141l;
        return a.p(aVar, this.f103142m, iIntValue, aVar.f103132e.getForegroundChildren());
    }
}
