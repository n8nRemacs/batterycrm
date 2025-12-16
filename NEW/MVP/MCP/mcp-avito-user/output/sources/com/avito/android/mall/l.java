package com.avito.android.mall;

import com.avito.android.C31100l2;
import com.avito.android.mall.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MallView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/mall/m;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mall/m;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l extends N implements Y41.l<m, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f184339l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar) {
        super(1);
        this.f184339l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(m mVar) {
        m mVar2 = mVar;
        d dVar = this.f184339l;
        dVar.getClass();
        boolean z12 = mVar2 instanceof m.a;
        C31100l2 c31100l2 = dVar.f184253g;
        if (z12) {
            c31100l2.f174866f.close();
        } else if (mVar2 instanceof m.b) {
            c31100l2.k();
        }
        return G0.f406611a;
    }
}
