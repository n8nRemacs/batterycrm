package com.avito.android.delivery_tarifikator.domain;

import Ov.C14739b;
import aw.InterfaceC24182a;
import bw.C25727a;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29813i;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: CustomTariffsInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/b;", "Lcom/avito/android/delivery_tarifikator/domain/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* renamed from: com.avito.android.delivery_tarifikator.domain.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29806b implements InterfaceC29804a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC24182a f135268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryTarifikatorParams f135269b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f135270c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h0 f135271d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final x0 f135272e;

    /* compiled from: CustomTariffsInteractor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/delivery_tarifikator/domain/i;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/delivery_tarifikator/domain/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.domain.CustomTariffsInteractorImpl$deleteTariff$2", f = "CustomTariffsInteractor.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.delivery_tarifikator.domain.b$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super InterfaceC29813i>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135273q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f135275s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f135275s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C29806b.this.new a(this.f135275s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super InterfaceC29813i> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f135273q;
            long j12 = this.f135275s;
            C29806b c29806b = C29806b.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC24182a interfaceC24182a = c29806b.f135268a;
                String str = c29806b.f135269b.f135220b;
                Long lBoxLong = Boxing.boxLong(j12);
                this.f135273q = 1;
                obj = interfaceC24182a.b(str, lBoxLong, this);
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
                return new InterfaceC29813i.a(C35936s.a(error.getError(), error.getCause()));
            }
            C25727a c25727a = (C25727a) ((TypedResult.Success) typedResult).getResult();
            c29806b.f135271d.e(j12);
            c29806b.f135272e.b(c29806b.f135271d.d());
            return new InterfaceC29813i.b(c25727a.getMessage());
        }
    }

    @Inject
    public C29806b(@Y61.k InterfaceC24182a interfaceC24182a, @Y61.k DeliveryTarifikatorParams deliveryTarifikatorParams, @Y61.k R0 r02, @Y61.k h0 h0Var, @Y61.k x0 x0Var) {
        this.f135268a = interfaceC24182a;
        this.f135269b = deliveryTarifikatorParams;
        this.f135270c = r02;
        this.f135271d = h0Var;
        this.f135272e = x0Var;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.InterfaceC29804a
    @Y61.l
    public final Object a(long j12, @Y61.k Continuation<? super InterfaceC29813i> continuation) {
        return C43259k.g(this.f135270c.a(), new a(j12, null), continuation);
    }

    @Override // com.avito.android.delivery_tarifikator.domain.InterfaceC29804a
    public final void b(@Y61.k C14739b c14739b) {
        h0 h0Var = this.f135271d;
        h0Var.b(c14739b);
        this.f135272e.b(h0Var.d());
    }

    @Override // com.avito.android.delivery_tarifikator.domain.InterfaceC29804a
    public final void c(@Y61.k C14739b c14739b) {
        h0 h0Var = this.f135271d;
        h0Var.c(c14739b);
        this.f135272e.b(h0Var.d());
    }
}
