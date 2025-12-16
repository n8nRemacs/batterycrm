package com.avito.android.publish.screen.step.request.publish.mvi;

import Le0.InterfaceC14384a;
import Le0.InterfaceC14385b;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.photo_picker.b0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.W0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PublishRequestActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/screen/step/request/publish/mvi/j;", "Lcom/avito/android/arch/mvi/a;", "LLe0/a;", "LLe0/b;", "LLe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements com.avito.android.arch.mvi.a<InterfaceC14384a, InterfaceC14385b, Le0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f241921a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f241922b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33544d f241923c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.publish_advert_request.data.a f241924d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final W0 f241925e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f241926f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final R0 f241927g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final b0 f241928h;

    @Inject
    public j(@Y61.k C0 c02, @Y61.k com.avito.android.photo_cache.j jVar, @Y61.k InterfaceC33544d interfaceC33544d, @Y61.k com.avito.android.publish.publish_advert_request.data.a aVar, @Y61.k W0 w02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02, @Y61.k b0 b0Var) {
        this.f241921a = c02;
        this.f241922b = jVar;
        this.f241923c = interfaceC33544d;
        this.f241924d = aVar;
        this.f241925e = w02;
        this.f241926f = interfaceC28373a;
        this.f241927g = r02;
        this.f241928h = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.publish.screen.step.request.publish.mvi.j r10, kotlinx.coroutines.flow.InterfaceC43172j r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.publish.mvi.j.c(com.avito.android.publish.screen.step.request.publish.mvi.j, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.publish.screen.step.request.publish.mvi.j r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.avito.android.publish.screen.step.request.publish.mvi.i
            if (r0 == 0) goto L16
            r0 = r10
            com.avito.android.publish.screen.step.request.publish.mvi.i r0 = (com.avito.android.publish.screen.step.request.publish.mvi.i) r0
            int r1 = r0.f241920t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f241920t = r1
            goto L1b
        L16:
            com.avito.android.publish.screen.step.request.publish.mvi.i r0 = new com.avito.android.publish.screen.step.request.publish.mvi.i
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f241918r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f241920t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.remote.model.category_parameters.PhotoParameter r9 = r0.f241917q
            kotlin.C42729a0.b(r10)
            goto L66
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            kotlin.C42729a0.b(r10)
            com.avito.android.publish.C0 r10 = r9.f241921a
            com.avito.android.remote.model.category_parameters.CategoryParameters r10 = r10.f231873k0
            if (r10 != 0) goto L43
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto Lb0
        L43:
            java.lang.Class<com.avito.android.remote.model.category_parameters.PhotoParameter> r2 = com.avito.android.remote.model.category_parameters.PhotoParameter.class
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r10 = r10.getFirstParameterOfType(r2)
            com.avito.android.remote.model.category_parameters.base.CategoryParameter r10 = (com.avito.android.remote.model.category_parameters.base.CategoryParameter) r10
            com.avito.android.remote.model.category_parameters.PhotoParameter r10 = (com.avito.android.remote.model.category_parameters.PhotoParameter) r10
            if (r10 != 0) goto L52
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto Lb0
        L52:
            com.avito.android.photo_cache.j r9 = r9.f241922b
            io.reactivex.rxjava3.internal.operators.observable.B0 r9 = r9.a()
            r0.f241917q = r10
            r0.f241920t = r3
            java.lang.Object r9 = kotlinx.coroutines.rx3.C43292o.c(r9, r0)
            if (r9 != r1) goto L63
            goto Lb0
        L63:
            r8 = r10
            r10 = r9
            r9 = r8
        L66:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            int r0 = r9.getMaxCount()
            java.util.List r10 = kotlin.collections.C42745f0.E0(r10, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C42745f0.q(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L83:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r10.next()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            com.avito.android.remote.model.ImageUploadResult r1 = new com.avito.android.remote.model.ImageUploadResult
            com.avito.android.remote.model.Image r4 = new com.avito.android.remote.model.Image
            java.util.Map r2 = kotlin.collections.P0.c()
            r4.<init>(r2)
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r1)
            goto L83
        La6:
            com.avito.android.remote.model.category_parameters.PhotoParameter$ImageUploadListWrapper r10 = new com.avito.android.remote.model.category_parameters.PhotoParameter$ImageUploadListWrapper
            r10.<init>(r0)
            r9.setValue(r10)
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.publish.mvi.j.d(com.avito.android.publish.screen.step.request.publish.mvi.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14385b> b(InterfaceC14384a interfaceC14384a, Le0.d dVar) {
        InterfaceC14384a interfaceC14384a2 = interfaceC14384a;
        if (interfaceC14384a2 instanceof InterfaceC14384a.e) {
            return C43175k.G(new g((InterfaceC14384a.e) interfaceC14384a2, this, null));
        }
        if (interfaceC14384a2.equals(InterfaceC14384a.c.f10049a)) {
            return C43175k.G(new e(this, null));
        }
        if (interfaceC14384a2.equals(InterfaceC14384a.d.f10050a)) {
            return C43175k.G(new f(this, null));
        }
        if (interfaceC14384a2.equals(InterfaceC14384a.b.f10048a)) {
            return C43175k.G(new d(this, null));
        }
        if (interfaceC14384a2.equals(InterfaceC14384a.C0621a.f10047a)) {
            return C43175k.G(new c(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.avito.android.remote.model.PretendResult r7, kotlinx.coroutines.flow.InterfaceC43172j r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.avito.android.publish.screen.step.request.publish.mvi.a
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.publish.screen.step.request.publish.mvi.a r0 = (com.avito.android.publish.screen.step.request.publish.mvi.a) r0
            int r1 = r0.f241896u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241896u = r1
            goto L18
        L13:
            com.avito.android.publish.screen.step.request.publish.mvi.a r0 = new com.avito.android.publish.screen.step.request.publish.mvi.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f241894s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f241896u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r9)
            goto L8c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlinx.coroutines.flow.j r8 = r0.f241893r
            com.avito.android.remote.model.PretendResult r7 = r0.f241892q
            kotlin.C42729a0.b(r9)
            goto L58
        L3d:
            kotlin.C42729a0.b(r9)
            com.avito.android.util.R0 r9 = r6.f241927g
            kotlinx.coroutines.d1 r9 = r9.d()
            com.avito.android.publish.screen.step.request.publish.mvi.b r2 = new com.avito.android.publish.screen.step.request.publish.mvi.b
            r2.<init>(r6, r7, r5)
            r0.f241892q = r7
            r0.f241893r = r8
            r0.f241896u = r4
            java.lang.Object r9 = kotlinx.coroutines.C43259k.g(r9, r2, r0)
            if (r9 != r1) goto L58
            return r1
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L8f
            java.util.Map r7 = r7.getErrors()
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = kotlin.collections.C42745f0.F(r7)
            com.avito.android.remote.model.PretendErrorValue r7 = (com.avito.android.remote.model.PretendErrorValue) r7
            if (r7 == 0) goto L78
            java.lang.String r7 = r7.getSingleMessage()
            if (r7 != 0) goto L7a
        L78:
            java.lang.String r7 = ""
        L7a:
            Le0.b$a r9 = new Le0.b$a
            r9.<init>(r7)
            r0.f241892q = r5
            r0.f241893r = r5
            r0.f241896u = r3
            java.lang.Object r7 = r8.emit(r9, r0)
            if (r7 != r1) goto L8c
            return r1
        L8c:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L8f:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.publish.mvi.j.e(com.avito.android.remote.model.PretendResult, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
