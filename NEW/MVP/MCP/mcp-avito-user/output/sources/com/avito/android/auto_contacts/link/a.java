package com.avito.android.auto_contacts.link;

import Ju.AbstractC14250d;
import Y41.p;
import Y61.k;
import Y61.l;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.auto_contacts.link.AutoContactsPackagesGetLink;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
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

/* compiled from: AutoContactsPackagesGetLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_contacts.link.AutoContactsPackagesGetLinkHandler$doHandle$1", f = "AutoContactsPackagesGetLinkHandler.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f94886q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f94887r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f94887r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f94887r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f94886q;
        b bVar = this.f94887r;
        a.g gVar = bVar.f94889g;
        if (i12 == 0) {
            C42729a0.b(obj);
            gVar.g(bVar.d(), true);
            this.f94886q = 1;
            obj = bVar.f94888f.f94872a.a(this);
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
            xe.g gVar2 = (xe.g) ((TypedResult.Success) typedResult).getResult();
            gVar.g(bVar.d(), false);
            bVar.i(AutoContactsPackagesGetLink.b.f94884b, bVar.f94891i, gVar2.getDeeplink());
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            gVar.g(bVar.d(), false);
            a.i.C4057a.e(bVar.f94890h, z.l(apiExceptionA), new f.c(apiExceptionA), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            bVar.j(AbstractC14250d.b.f9170c);
        }
        return G0.f406611a;
    }
}
