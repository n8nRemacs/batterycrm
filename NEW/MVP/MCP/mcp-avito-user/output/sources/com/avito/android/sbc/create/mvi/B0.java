package com.avito.android.sbc.create.mvi;

import Uo0.e;
import android.os.Bundle;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class B0 extends kotlin.jvm.internal.N implements Y41.p<String, Bundle, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CreateDiscountDispatchFragment f259219l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(CreateDiscountDispatchFragment createDiscountDispatchFragment) {
        super(2);
        this.f259219l = createDiscountDispatchFragment;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(String str, Bundle bundle) {
        String string = bundle.getString("slug");
        if (string != null) {
            CreateDiscountDispatchFragment.a aVar = CreateDiscountDispatchFragment.f259243G0;
            this.f259219l.q5().accept(new e.m(string));
        }
        return kotlin.G0.f406611a;
    }
}
