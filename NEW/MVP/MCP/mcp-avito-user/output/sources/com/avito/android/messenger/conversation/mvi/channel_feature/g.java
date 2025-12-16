package com.avito.android.messenger.conversation.mvi.channel_feature;

import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.util.R0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LMY/b;", "LMY/d;", "LMY/g;", "LMY/e;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<q<MY.b, MY.d, MY.g, MY.e>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f189721l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f189722m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f189723n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ R0 f189724o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, l lVar, j jVar, R0 r02) {
        super(1);
        this.f189721l = aVar;
        this.f189722m = lVar;
        this.f189723n = jVar;
        this.f189724o = r02;
    }

    @Override // Y41.l
    public final G0 invoke(q<MY.b, MY.d, MY.g, MY.e> qVar) {
        q<MY.b, MY.d, MY.g, MY.e> qVar2 = qVar;
        qVar2.f92009e = this.f189721l;
        qVar2.f92011g = this.f189722m;
        qVar2.f92010f = this.f189723n;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92013i = this.f189724o.c();
        qVar2.f92014j = new r(true, true);
        return G0.f406611a;
    }
}
