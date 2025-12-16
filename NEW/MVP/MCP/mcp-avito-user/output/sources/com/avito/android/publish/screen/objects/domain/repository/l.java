package com.avito.android.publish.screen.objects.domain.repository;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.u1;
import com.avito.android.validation.d1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: ObjectValidateRepository.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/repository/l;", "Lcom/avito/android/publish/screen/objects/domain/repository/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u1 f240062a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f240063b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C50213a f240064c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d1 f240065d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f240066e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f240067f = new CategoryParametersConverter(null, null, null, 7, null);

    @Inject
    public l(@Y61.k u1 u1Var, @Y61.k a aVar, @Y61.k C50213a c50213a, @Y61.k d1 d1Var, @Y61.k Q1 q12) {
        this.f240062a = u1Var;
        this.f240063b = aVar;
        this.f240064c = c50213a;
        this.f240065d = d1Var;
        this.f240066e = q12;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.publish.screen.objects.domain.repository.i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.objects.domain.repository.l.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k com.avito.android.remote.model.category_parameters.ObjectsParameter r11, int r12, @Y61.k com.avito.android.remote.model.category_parameters.CategoryParameters r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.avito.android.publish.screen.objects.domain.repository.k
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.publish.screen.objects.domain.repository.k r0 = (com.avito.android.publish.screen.objects.domain.repository.k) r0
            int r1 = r0.f240061v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240061v = r1
            goto L18
        L13:
            com.avito.android.publish.screen.objects.domain.repository.k r0 = new com.avito.android.publish.screen.objects.domain.repository.k
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f240059t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f240061v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r12 = r0.f240058s
            com.avito.android.remote.model.category_parameters.ObjectsParameter r11 = r0.f240057r
            com.avito.android.publish.screen.objects.domain.repository.l r13 = r0.f240056q
            kotlin.C42729a0.b(r14)
            goto L70
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.C42729a0.b(r14)
            java.util.List r14 = java.util.Collections.singletonList(r11)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            com.avito.android.remote.model.category_parameters.CategoryParametersConverter r2 = r10.f240067f
            java.util.Map r8 = r2.convertToFieldMap(r14)
            com.avito.android.remote.model.Navigation r13 = r13.getNavigation()
            java.util.Map r5 = r2.convertToFieldMap(r13)
            yc.a r13 = r10.f240064c
            java.lang.String r9 = r13.b()
            r6 = 0
            r7 = 0
            com.avito.android.remote.u1 r4 = r10.f240062a
            io.reactivex.rxjava3.core.I r13 = r4.a(r5, r6, r7, r8, r9)
            io.reactivex.rxjava3.internal.operators.single.y r13 = com.avito.android.util.rx3.g1.a(r13)
            r0.f240056q = r10
            r0.f240057r = r11
            r0.f240058s = r12
            r0.f240061v = r3
            java.lang.Object r14 = kotlinx.coroutines.rx3.C43292o.b(r13, r0)
            if (r14 != r1) goto L6f
            return r1
        L6f:
            r13 = r10
        L70:
            com.avito.android.remote.model.adverts.PretendAdvertResult r14 = (com.avito.android.remote.model.adverts.PretendAdvertResult) r14
            boolean r0 = r14 instanceof com.avito.android.remote.model.adverts.PretendAdvertResult.Ok
            r1 = 0
            if (r0 == 0) goto L7e
            com.avito.android.remote.model.PretendResult r14 = new com.avito.android.remote.model.PretendResult
            r0 = 2
            r14.<init>(r3, r1, r0, r1)
            goto L88
        L7e:
            boolean r0 = r14 instanceof com.avito.android.remote.model.adverts.PretendAdvertResult.InputErrors
            if (r0 == 0) goto Lc5
            com.avito.android.remote.model.adverts.PretendAdvertResult$InputErrors r14 = (com.avito.android.remote.model.adverts.PretendAdvertResult.InputErrors) r14
            com.avito.android.remote.model.PretendResult r14 = r14.getMessages()
        L88:
            java.util.Map r14 = r14.getErrors()
            java.lang.String r11 = r11.getId()
            java.lang.Object r11 = r14.get(r11)
            boolean r14 = r11 instanceof com.avito.android.remote.model.PretendErrorValue.ObjectsMessages
            if (r14 == 0) goto L9b
            r1 = r11
            com.avito.android.remote.model.PretendErrorValue$ObjectsMessages r1 = (com.avito.android.remote.model.PretendErrorValue.ObjectsMessages) r1
        L9b:
            if (r1 == 0) goto Lb4
            java.util.Map r11 = r1.getObjectsErrorParams()
            if (r11 == 0) goto Laf
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
            java.lang.Object r11 = r11.get(r12)
            java.util.Map r11 = (java.util.Map) r11
            if (r11 != 0) goto Lb8
        Laf:
            java.util.Map r11 = kotlin.collections.P0.c()
            goto Lb8
        Lb4:
            java.util.Map r11 = kotlin.collections.P0.c()
        Lb8:
            r13.getClass()
            com.avito.android.remote.model.PretendResult r12 = new com.avito.android.remote.model.PretendResult
            boolean r13 = r11.isEmpty()
            r12.<init>(r13, r11)
            return r12
        Lc5:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.objects.domain.repository.l.b(com.avito.android.remote.model.category_parameters.ObjectsParameter, int, com.avito.android.remote.model.category_parameters.CategoryParameters, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
