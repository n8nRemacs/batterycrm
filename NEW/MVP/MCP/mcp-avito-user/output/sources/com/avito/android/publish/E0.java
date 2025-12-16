package com.avito.android.publish;

import com.avito.android.publish.restriction.l;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.Metadata;

/* compiled from: PublishViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class E0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0 f231896l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CategoryPublishStep.Restriction f231897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(C0 c02, CategoryPublishStep.Restriction restriction) {
        super(1);
        this.f231896l = c02;
        this.f231897m = restriction;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        C0.ke(this.f231896l, new l.b(th2), this.f231897m);
        return kotlin.G0.f406611a;
    }
}
