package com.avito.android.mortgage_invite.common.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.mortgage_invite.common.domain.d;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
import e20.InterfaceC39928a;
import g20.C40520a;
import g20.C40521b;
import g20.C40522c;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: UpdateContactInfoUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/mortgage_invite/common/domain/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/mortgage_invite/common/domain/d;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.common.domain.UpdateContactInfoUseCase$invoke$2", f = "UpdateContactInfoUseCase.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super d>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205514q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y10.a f205515r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f205516s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f205517t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y10.a aVar, f fVar, String str, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f205515r = aVar;
        this.f205516s = fVar;
        this.f205517t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f205515r, this.f205516s, this.f205517t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super d> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object next;
        Object next2;
        String str;
        String strConcat;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205514q;
        f fVar = this.f205516s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Y10.a aVar = this.f205515r;
            Iterator<T> it = aVar.f19259b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Y10.b) next).f19261a == ContactInfoFieldId.f205532j) {
                    break;
                }
            }
            Y10.b bVar = (Y10.b) next;
            Iterator<T> it2 = aVar.f19259b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((Y10.b) next2).f19261a == ContactInfoFieldId.f205533k) {
                    break;
                }
            }
            Y10.b bVar2 = (Y10.b) next2;
            InterfaceC39928a interfaceC39928a = fVar.f205518a;
            if (bVar == null || (str = bVar.f19269i) == null || bVar.f19263c) {
                str = null;
            }
            if (bVar2 == null || (strConcat = bVar2.f19269i) == null || bVar2.f19263c) {
                strConcat = null;
            }
            if (strConcat == null) {
                strConcat = null;
            } else if (!C43066x.h0(strConcat, "7", false) || strConcat.length() != 11) {
                strConcat = "7".concat(strConcat);
            }
            C40521b c40521b = new C40521b(null, str, strConcat);
            this.f205514q = 1;
            obj = interfaceC39928a.d(this.f205517t, c40521b, this);
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
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            return new d.a(C35936s.a(error.getError(), error.getCause()));
        }
        C40520a c40520a = (C40520a) ((TypedResult.Success) typedResult).getResult();
        fVar.getClass();
        List<C40522c> listA = c40520a.a();
        kotlin.collections.builders.d dVarA = listA != null ? fVar.f205520c.a(listA) : null;
        return (dVarA == null || dVarA.isEmpty()) ? d.c.f205513a : new d.b(dVarA);
    }
}
