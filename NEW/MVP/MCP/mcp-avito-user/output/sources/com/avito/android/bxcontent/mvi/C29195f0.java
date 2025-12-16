package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/l1;", "it", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "invoke", "(Lcom/avito/android/serp/adapter/l1;)Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.mvi.f0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29195f0 extends kotlin.jvm.internal.N implements Y41.l<l1, BxContentInternalAction> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29126a.b f112451l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29195f0(C29126a.b bVar) {
        super(1);
        this.f112451l = bVar;
    }

    @Override // Y41.l
    public final BxContentInternalAction invoke(l1 l1Var) {
        return new BxContentInternalAction.BeduinNativeInternalAction.UpdateBlock(C29126a.b.a(this.f112451l, l1Var));
    }
}
