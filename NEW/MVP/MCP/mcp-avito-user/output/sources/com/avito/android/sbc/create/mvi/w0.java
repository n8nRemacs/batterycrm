package com.avito.android.sbc.create.mvi;

import Uo0.e;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "closeIconClicked", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class w0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateDiscountDispatchFragment f259928b;

    public w0(CreateDiscountDispatchFragment createDiscountDispatchFragment) {
        this.f259928b = createDiscountDispatchFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        CreateDiscountDispatchFragment.a aVar = CreateDiscountDispatchFragment.f259243G0;
        this.f259928b.q5().accept(new e.t(zBooleanValue));
    }
}
