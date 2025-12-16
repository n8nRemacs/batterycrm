package com.avito.android.publish.slots.images_groups;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ImageGroupResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ImagesGroupsSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.images_groups.ImagesGroupsSlotWrapper$requestImageScoring$1", f = "ImagesGroupsSlotWrapper.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f244124q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f244125r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f244126s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f244125r = bVar;
        this.f244126s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f244125r, this.f244126s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f244124q;
        String str = this.f244126s;
        b bVar = this.f244125r;
        if (i12 == 0) {
            C42729a0.b(obj);
            bVar.f244129d.x2(str);
            bVar.f244139n.add(str);
            this.f244124q = 1;
            obj = bVar.f244131f.u(str, this);
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
        if (typedResult instanceof TypedResult.Success) {
            ImageGroupResponse imageGroupResponse = (ImageGroupResponse) ((TypedResult.Success) typedResult).getResult();
            bVar.f244129d.H9(str, imageGroupResponse.getGroupId());
            bVar.f244139n.remove(str);
            String str2 = (String) bVar.f244140o.get(imageGroupResponse.getGroupId());
            if (str2 != null) {
                bVar.f244134i.d(str2, imageGroupResponse.getImageId());
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            bVar.f244129d.Vb(str);
            bVar.f244139n.remove(str);
            V2 v22 = V2.f318762a;
            String message = apiExceptionA.getMessage();
            if (message == null) {
                message = "Image scoring request failed";
            }
            v22.a("DEFAULT_TAG", message, apiExceptionA);
        }
        return G0.f406611a;
    }
}
