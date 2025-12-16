package com.avito.android.publish.details;

import com.avito.android.publish.details.K1;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f2 extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1 f234619l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(K1 k12) {
        super(1);
        this.f234619l = k12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        K1 k12 = this.f234619l;
        ItemDetailsView itemDetailsView = k12.f232991n0;
        if (itemDetailsView != null) {
            itemDetailsView.i();
        }
        ItemDetailsView itemDetailsView2 = k12.f232991n0;
        if (itemDetailsView2 != null) {
            itemDetailsView2.C0();
        }
        k12.f232997t0.setValue(new K1.AbstractC33668b.j(com.avito.android.error.z.l(th3)));
        return kotlin.G0.f406611a;
    }
}
