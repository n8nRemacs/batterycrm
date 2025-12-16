package com.avito.android.beduin.common.container.layered;

import com.avito.android.lib.util.layout.ForegroundFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinLayeredContainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lcom/avito/android/beduin/common/container/componentsPool/j;", "invoke", "(I)Lcom/avito/android/beduin/common/container/componentsPool/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<Integer, com.avito.android.beduin.common.container.componentsPool.j> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f103146l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f103147m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, i iVar) {
        super(1);
        this.f103146l = aVar;
        this.f103147m = iVar;
    }

    @Override // Y41.l
    public final com.avito.android.beduin.common.container.componentsPool.j invoke(Integer num) {
        int iIntValue = num.intValue();
        ForegroundFrameLayout foregroundFrameLayout = this.f103147m.f103150b;
        a aVar = this.f103146l;
        return a.p(aVar, foregroundFrameLayout, iIntValue, aVar.f103132e.getForegroundChildren());
    }
}
