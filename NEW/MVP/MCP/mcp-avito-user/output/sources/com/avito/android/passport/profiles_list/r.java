package com.avito.android.passport.profiles_list;

import com.avito.android.passport.profiles_list.mvi.entity.PassportProfilesListInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import java.util.List;
import jz.C42454e;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: ProfilesListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lp60/b;", "profilesResponse", "Ljz/e;", "employeeModes", "", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;Ljz/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profiles_list.ProfilesListInteractorImpl$loadProfilesList$1", f = "ProfilesListInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class r extends SuspendLambda implements Y41.q<TypedResult<p60.b>, C42454e, Continuation<? super Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ TypedResult f213858q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ C42454e f213859r;

    public r() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(TypedResult<p60.b> typedResult, C42454e c42454e, Continuation<? super Object> continuation) {
        r rVar = new r(3, continuation);
        rVar.f213858q = typedResult;
        rVar.f213859r = c42454e;
        return rVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        TypedResult success = this.f213858q;
        C42454e c42454e = this.f213859r;
        if (success instanceof TypedResult.Success) {
            success = new TypedResult.Success(((p60.b) ((TypedResult.Success) success).getResult()).a());
        } else if (!(success instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        if (success instanceof TypedResult.Success) {
            return new PassportProfilesListInternalAction.ContentV2((List) ((TypedResult.Success) success).getResult(), c42454e);
        }
        if (!(success instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) success;
        return new PassportProfilesListInternalAction.Error(C35936s.a(error.getError(), error.getCause()));
    }
}
