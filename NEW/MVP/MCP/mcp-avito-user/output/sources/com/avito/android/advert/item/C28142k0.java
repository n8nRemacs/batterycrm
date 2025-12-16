package com.avito.android.advert.item;

import com.avito.android.component.toast.util.g;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.AdvertDetailsPresenterImpl$attachView$11", f = "AdvertDetailsPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.advert.item.k0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28142k0 extends SuspendLambda implements Y41.p<String, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f77241q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I1 f77242r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28142k0(I1 i12, Continuation continuation) {
        super(2, continuation);
        this.f77242r = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C28142k0 c28142k0 = new C28142k0(this.f77242r, continuation);
        c28142k0.f77241q = obj;
        return c28142k0;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super kotlin.G0> continuation) {
        return ((C28142k0) create(str, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = (String) this.f77241q;
        I1 i12 = this.f77242r;
        if (i12 != null) {
            g.a.a(i12, com.avito.android.printable_text.b.f(str), ToastBarPosition.f181046d, null, 190);
        }
        return kotlin.G0.f406611a;
    }
}
