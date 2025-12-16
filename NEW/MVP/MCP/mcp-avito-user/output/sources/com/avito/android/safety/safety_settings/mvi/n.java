package com.avito.android.safety.safety_settings.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SafetySettingsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/n;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/safety/safety_settings/mvi/entity/a;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "Lcom/avito/android/safety/safety_settings/mvi/entity/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements com.avito.android.arch.mvi.a<com.avito.android.safety.safety_settings.mvi.entity.a, SafetySettingsInternalAction, com.avito.android.safety.safety_settings.mvi.entity.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.safety_settings.domain.a f257781a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f257782b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f257783c;

    @Inject
    public n(@Y61.k com.avito.android.safety.safety_settings.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f257781a = aVar;
        this.f257782b = aVar2;
        this.f257783c = interfaceC28373a;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.safety.safety_settings.mvi.n r6, kotlinx.coroutines.flow.InterfaceC43172j r7, com.avito.android.safety.safety_settings.mvi.entity.b r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.mvi.n.c(com.avito.android.safety.safety_settings.mvi.n, kotlinx.coroutines.flow.j, com.avito.android.safety.safety_settings.mvi.entity.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    @Override // com.avito.android.arch.mvi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction> b(com.avito.android.safety.safety_settings.mvi.entity.a r6, com.avito.android.safety.safety_settings.mvi.entity.b r7) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.mvi.n.b(java.lang.Object, java.lang.Object):kotlinx.coroutines.flow.i");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlinx.coroutines.flow.InterfaceC43172j r12, com.avito.android.remote.error.ApiError r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.avito.android.safety.safety_settings.mvi.C34433a
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.safety.safety_settings.mvi.a r0 = (com.avito.android.safety.safety_settings.mvi.C34433a) r0
            int r1 = r0.f257660t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257660t = r1
            goto L18
        L13:
            com.avito.android.safety.safety_settings.mvi.a r0 = new com.avito.android.safety.safety_settings.mvi.a
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f257658r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f257660t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r14)
            goto L75
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            kotlinx.coroutines.flow.j r12 = r0.f257657q
            kotlin.C42729a0.b(r14)
            goto L65
        L3a:
            kotlin.C42729a0.b(r14)
            com.avito.android.safety.safety_settings.mvi.b r6 = com.avito.android.safety.safety_settings.mvi.C34434b.f257661l
            r14 = 0
            java.io.Serializable[] r14 = new java.io.Serializable[r14]
            r2 = 2131952221(0x7f13025d, float:1.9540879E38)
            com.avito.android.printable_text.PrintableText r9 = com.avito.android.printable_text.b.c(r2, r14)
            r7 = 0
            r8 = 0
            r10 = 14
            r5 = r13
            java.lang.Object r13 = com.avito.android.error.z.q(r5, r6, r7, r8, r9, r10)
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$ShowToastBarError r13 = (com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.ShowToastBarError) r13
            java.lang.String r13 = r13.f257720b
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$ShowToastBarError r13 = com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.ShowToastBarError.c(r13)
            r0.f257657q = r12
            r0.f257660t = r4
            java.lang.Object r13 = r12.emit(r13, r0)
            if (r13 != r1) goto L65
            return r1
        L65:
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$SwitchTfa r13 = com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.SwitchTfa.c(r4)
            r14 = 0
            r0.f257657q = r14
            r0.f257660t = r3
            java.lang.Object r12 = r12.emit(r13, r0)
            if (r12 != r1) goto L75
            return r1
        L75:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.mvi.n.d(kotlinx.coroutines.flow.j, com.avito.android.remote.error.ApiError, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlinx.coroutines.flow.InterfaceC43172j r7, lo0.InterfaceC43811a r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.avito.android.safety.safety_settings.mvi.C34435c
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.safety.safety_settings.mvi.c r0 = (com.avito.android.safety.safety_settings.mvi.C34435c) r0
            int r1 = r0.f257665t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257665t = r1
            goto L18
        L13:
            com.avito.android.safety.safety_settings.mvi.c r0 = new com.avito.android.safety.safety_settings.mvi.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f257663r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f257665t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r9)
            goto L78
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlinx.coroutines.flow.j r7 = r0.f257662q
            kotlin.C42729a0.b(r9)
            goto L6a
        L3d:
            kotlin.C42729a0.b(r9)
            goto L53
        L41:
            kotlin.C42729a0.b(r9)
            boolean r9 = r8 instanceof lo0.InterfaceC43811a.C11804a
            if (r9 == 0) goto L56
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$OpenDisableTfaConfirmScreen r8 = com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.OpenDisableTfaConfirmScreen.f257714b
            r0.f257665t = r5
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L56:
            boolean r8 = r8 instanceof lo0.InterfaceC43811a.b
            if (r8 == 0) goto L7b
            r8 = 0
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$SwitchTfa r8 = com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.SwitchTfa.c(r8)
            r0.f257662q = r7
            r0.f257665t = r4
            java.lang.Object r8 = r7.emit(r8, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$ShowSuccessDisableTfaToastBar r8 = com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.ShowSuccessDisableTfaToastBar.f257719b
            r9 = 0
            r0.f257662q = r9
            r0.f257665t = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L78
            return r1
        L78:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L7b:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.mvi.n.e(kotlinx.coroutines.flow.j, lo0.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlinx.coroutines.flow.InterfaceC43172j r13, com.avito.android.remote.error.ApiError r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.avito.android.safety.safety_settings.mvi.C34436d
            if (r0 == 0) goto L13
            r0 = r15
            com.avito.android.safety.safety_settings.mvi.d r0 = (com.avito.android.safety.safety_settings.mvi.C34436d) r0
            int r1 = r0.f257669t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257669t = r1
            goto L18
        L13:
            com.avito.android.safety.safety_settings.mvi.d r0 = new com.avito.android.safety.safety_settings.mvi.d
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f257667r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f257669t
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.C42729a0.b(r15)
            goto L70
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlinx.coroutines.flow.j r13 = r0.f257666q
            kotlin.C42729a0.b(r15)
            goto L60
        L3b:
            kotlin.C42729a0.b(r15)
            com.avito.android.safety.safety_settings.mvi.e r7 = com.avito.android.safety.safety_settings.mvi.C34437e.f257670l
            com.avito.android.safety.safety_settings.mvi.f r9 = com.avito.android.safety.safety_settings.mvi.C34438f.f257754l
            r15 = 2131952221(0x7f13025d, float:1.9540879E38)
            java.io.Serializable[] r2 = new java.io.Serializable[r3]
            com.avito.android.printable_text.PrintableText r10 = com.avito.android.printable_text.b.c(r15, r2)
            r11 = 10
            r8 = 0
            r6 = r14
            java.lang.Object r14 = com.avito.android.error.z.q(r6, r7, r8, r9, r10, r11)
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction r14 = (com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction) r14
            r0.f257666q = r13
            r0.f257669t = r5
            java.lang.Object r14 = r13.emit(r14, r0)
            if (r14 != r1) goto L60
            return r1
        L60:
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$SwitchTfa r14 = com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.SwitchTfa.c(r3)
            r15 = 0
            r0.f257666q = r15
            r0.f257669t = r4
            java.lang.Object r13 = r13.emit(r14, r0)
            if (r13 != r1) goto L70
            return r1
        L70:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.mvi.n.f(kotlinx.coroutines.flow.j, com.avito.android.remote.error.ApiError, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlinx.coroutines.flow.InterfaceC43172j r12, mo0.InterfaceC44112a r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.avito.android.safety.safety_settings.mvi.C34439g
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.safety.safety_settings.mvi.g r0 = (com.avito.android.safety.safety_settings.mvi.C34439g) r0
            int r1 = r0.f257758t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257758t = r1
            goto L18
        L13:
            com.avito.android.safety.safety_settings.mvi.g r0 = new com.avito.android.safety.safety_settings.mvi.g
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f257756r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f257758t
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.C42729a0.b(r14)
            goto L5e
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            kotlinx.coroutines.flow.j r12 = r0.f257755q
            kotlin.C42729a0.b(r14)
            goto L51
        L3b:
            kotlin.C42729a0.b(r14)
            boolean r14 = r13 instanceof mo0.InterfaceC44112a.b
            if (r14 == 0) goto L61
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$SwitchTfa r13 = com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.SwitchTfa.c(r5)
            r0.f257755q = r12
            r0.f257758t = r5
            java.lang.Object r13 = r12.emit(r13, r0)
            if (r13 != r1) goto L51
            return r1
        L51:
            com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction$SuccessEnableTfa r13 = com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction.SuccessEnableTfa.f257722b
            r0.f257755q = r3
            r0.f257758t = r4
            java.lang.Object r12 = r12.emit(r13, r0)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        L61:
            boolean r12 = r13 instanceof mo0.InterfaceC44112a.C11841a
            if (r12 == 0) goto L85
            com.avito.android.code_check_public.CodeCheckLink r12 = new com.avito.android.code_check_public.CodeCheckLink
            com.avito.android.code_check_public.CodeCheckLink$Flow$TfaEnableConfirm r14 = com.avito.android.code_check_public.CodeCheckLink.Flow.TfaEnableConfirm.f119265b
            com.avito.android.code_check_public.CodeCheckLink$Arguments r0 = new com.avito.android.code_check_public.CodeCheckLink$Arguments
            mo0.a$a r13 = (mo0.InterfaceC44112a.C11841a) r13
            java.util.List r8 = r13.a()
            r6 = 0
            r7 = 0
            r5 = 0
            r9 = 7
            r10 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.<init>(r14, r0)
            com.avito.android.deeplink_handler.handler.composite.a r13 = r11.f257782b
            java.lang.String r14 = "reqTfaEnable"
            r0 = 4
            com.avito.android.deeplink_handler.handler.b.a.a(r13, r12, r14, r3, r0)
        L85:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.mvi.n.g(kotlinx.coroutines.flow.j, mo0.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
