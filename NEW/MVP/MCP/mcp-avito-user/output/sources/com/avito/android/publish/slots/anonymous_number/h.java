package com.avito.android.publish.slots.anonymous_number;

import com.avito.android.phone_protection_info.item.b;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;
import u70.InterfaceC48811a;
import v70.C49176a;

/* compiled from: AnonymousNumberSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/phone_protection_info/item/b$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.anonymous_number.AnonymousNumberSlotWrapper$performServiceCheck$1", f = "AnonymousNumberSlotWrapper.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<b.a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f243027q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f243028r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ItemBrief f243029s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f243030t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, ItemBrief itemBrief, String str, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f243028r = lVar;
        this.f243029s = itemBrief;
        this.f243030t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f243028r, this.f243029s, this.f243030t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<b.a>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String id2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f243027q;
        b.a aVar = null;
        l lVar = this.f243028r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC48811a interfaceC48811a = lVar.f243039g;
            ItemBrief itemBrief = this.f243029s;
            Long lZ02 = (itemBrief == null || (id2 = itemBrief.getId()) == null) ? null : C43066x.z0(id2);
            this.f243027q = 1;
            obj = interfaceC48811a.a(lZ02, this.f243030t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        C49176a c49176a = (C49176a) ((TypedResult.Success) typedResult).getResult();
        if (c49176a.getShouldShowBanner()) {
            v70.b banner = c49176a.getBanner();
            v70.c moreDetails = c49176a.getBanner().getMoreDetails();
            aVar = moreDetails == null ? new b.a(com.avito.android.printable_text.b.f(banner.getTitle()), com.avito.android.printable_text.b.f(banner.getText()), null, null, 12, null) : new b.a(com.avito.android.printable_text.b.f(banner.getTitle()), com.avito.android.printable_text.b.f(banner.getText()), com.avito.android.printable_text.b.f(moreDetails.getTitle()), lVar.f243041i.b(moreDetails.getDeeplink()));
        }
        return new TypedResult.Success(aVar);
    }
}
