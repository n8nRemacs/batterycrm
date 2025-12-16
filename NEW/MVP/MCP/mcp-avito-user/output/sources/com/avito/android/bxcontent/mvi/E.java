package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ByStringId;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<String, BxContentInternalAction.RemoveItem.ByStringId> {

    /* renamed from: l, reason: collision with root package name */
    public static final E f111253l = new E();

    public E() {
        super(1);
    }

    @Override // Y41.l
    public final BxContentInternalAction.RemoveItem.ByStringId invoke(String str) {
        return new BxContentInternalAction.RemoveItem.ByStringId(str);
    }
}
