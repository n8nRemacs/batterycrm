package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/l1;", "it", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateItem;", "invoke", "(Lcom/avito/android/serp/adapter/l1;)Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateItem;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class D extends kotlin.jvm.internal.N implements Y41.l<l1, BxContentInternalAction.UpdateItem> {

    /* renamed from: l, reason: collision with root package name */
    public static final D f111243l = new D();

    public D() {
        super(1);
    }

    @Override // Y41.l
    public final BxContentInternalAction.UpdateItem invoke(l1 l1Var) {
        return new BxContentInternalAction.UpdateItem(l1Var);
    }
}
