package com.avito.android.extended_profile.location;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.location.r;
import com.avito.android.remote.model.Location;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.reactivex.rxjava3.core.z;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: ExtendedProfileLocationProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/Location;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/Location;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.location.ExtendedProfileLocationProviderImpl$getLocation$2", f = "ExtendedProfileLocationProvider.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super Location>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150029q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f150030r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f150030r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f150030r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Location> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150029q;
        if (i12 == 0) {
            C42729a0.b(obj);
            z zVarB = r.a.b(this.f150030r.f150024a, false, 3);
            this.f150029q = 1;
            obj = C43292o.c(zVarB, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        Location location = (Location) obj;
        this.f150030r.f150025b = location;
        return location;
    }
}
