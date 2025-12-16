package com.avito.android.publish;

import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.Metadata;

/* compiled from: PublishViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/restriction/l;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/restriction/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class F0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.publish.restriction.l, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0 f231900l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CategoryPublishStep.Restriction f231901m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(C0 c02, CategoryPublishStep.Restriction restriction) {
        super(1);
        this.f231900l = c02;
        this.f231901m = restriction;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.android.publish.restriction.l lVar) {
        C0.ke(this.f231900l, lVar, this.f231901m);
        return kotlin.G0.f406611a;
    }
}
