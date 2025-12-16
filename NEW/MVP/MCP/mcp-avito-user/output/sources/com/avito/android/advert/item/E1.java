package com.avito.android.advert.item;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import k4.C42498b;
import kotlin.AbstractC40048c;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk4/b;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lk4/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class E1 extends kotlin.jvm.internal.N implements Y41.l<C42498b, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I1 f71620l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(I1 i12) {
        super(1);
        this.f71620l = i12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C42498b c42498b) {
        C42498b c42498b2 = c42498b;
        I1 i12 = this.f71620l;
        D1 d12 = new D1(i12, c42498b2);
        A7.b bVar = i12.f71671Q;
        bVar.l();
        d12.invoke(c42498b2);
        AbstractC40048c abstractC40048c = c42498b2.f406059b;
        if ((abstractC40048c instanceof AbstractC40048c.a) && abstractC40048c.getPerfTrackerParams() != null) {
            bVar.k();
            abstractC40048c.setPerfTrackerParams(null);
        }
        bVar.f();
        return kotlin.G0.f406611a;
    }
}
