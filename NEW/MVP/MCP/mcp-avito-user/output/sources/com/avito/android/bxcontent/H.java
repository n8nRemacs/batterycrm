package com.avito.android.bxcontent;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.mvi.entity.g;
import com.avito.android.remote.model.BxContentBusiness360;
import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class H extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g.C f109339l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109340m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(BxContentFragment bxContentFragment, g.C c12) {
        super(0);
        this.f109339l = c12;
        this.f109340m = bxContentFragment;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        BxContentBusiness360.ReplaceMain replaceMain = ((g.N) this.f109339l).f112217c;
        BxContentBusiness360.ReplaceMain.ToastReplaceMain toast = replaceMain != null ? replaceMain.getToast() : null;
        if (toast != null) {
            BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
            this.f109340m.K5().SU(toast);
        }
        return kotlin.G0.f406611a;
    }
}
