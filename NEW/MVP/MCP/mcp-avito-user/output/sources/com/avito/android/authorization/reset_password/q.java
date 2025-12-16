package com.avito.android.authorization.reset_password;

import com.avito.android.remote.model.ResetPasswordResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ResetPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ResetPasswordResult;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/ResetPasswordResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q extends N implements Y41.l<ResetPasswordResult, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f94190l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(1);
        this.f94190l = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(com.avito.android.remote.model.ResetPasswordResult r20) throws android.content.res.Resources.NotFoundException {
        /*
            r19 = this;
            r0 = r20
            com.avito.android.remote.model.ResetPasswordResult r0 = (com.avito.android.remote.model.ResetPasswordResult) r0
            r1 = r19
            com.avito.android.authorization.reset_password.s r2 = r1.f94190l
            r2.getClass()
            boolean r3 = r0 instanceof com.avito.android.remote.model.ResetPasswordResult.ViaCode
            if (r3 == 0) goto L65
            com.avito.android.authorization.reset_password.ResetPasswordActivity r3 = r2.f94200i
            if (r3 == 0) goto L19
            com.avito.android.authorization.AuthSource r4 = com.avito.android.authorization.AuthSource.f92694c
            java.lang.String r4 = "restore_auth"
            r3.f94108q = r4
        L19:
            com.avito.android.code_check_public.CodeCheckLink r3 = new com.avito.android.code_check_public.CodeCheckLink
            com.avito.android.code_check_public.CodeCheckLink$Flow$ResetPassword r4 = com.avito.android.code_check_public.CodeCheckLink.Flow.ResetPassword.f119256b
            com.avito.android.code_check_public.CodeCheckLink$Arguments r12 = new com.avito.android.code_check_public.CodeCheckLink$Arguments
            java.lang.String r5 = r2.f94203l
            kotlin.text.p r6 = com.avito.android.util.C5.f318570d
            java.lang.String r7 = ""
            java.lang.String r5 = r6.f(r5, r7)
            java.lang.String r6 = "7"
            boolean r6 = kotlin.text.C43066x.i0(r5, r6)
            if (r6 != 0) goto L39
            java.lang.String r6 = "8"
            boolean r6 = kotlin.text.C43066x.i0(r5, r6)
            if (r6 == 0) goto L3d
        L39:
            java.lang.CharSequence r5 = kotlin.text.C43066x.w(r5)
        L3d:
            java.lang.String r6 = r5.toString()
            com.avito.android.remote.model.ResetPasswordResult$ViaCode r0 = (com.avito.android.remote.model.ResetPasswordResult.ViaCode) r0
            long r7 = r0.getCodeTimeout()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r11 = 0
            r9 = 0
            r10 = 8
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.<init>(r4, r12)
            com.avito.android.deeplink_handler.handler.composite.a r0 = r2.f94198g
            r2 = 4
            java.lang.String r4 = "code_check.confirm_reset_password"
            r5 = 0
            com.avito.android.deeplink_handler.handler.b.a.a(r0, r3, r4, r5, r2)
            goto La5
        L65:
            boolean r3 = r0 instanceof com.avito.android.remote.model.ResetPasswordResult.ViaLink
            if (r3 == 0) goto La5
            android.content.res.Resources r3 = r2.f94197f
            r4 = 2131956602(0x7f13137a, float:1.9549764E38)
            java.lang.String r6 = r3.getString(r4)
            com.avito.android.remote.model.ResetPasswordResult$ViaLink r0 = (com.avito.android.remote.model.ResetPasswordResult.ViaLink) r0
            java.lang.String r7 = r0.getText()
            r9 = 0
            r10 = 1
            com.avito.android.dialog.a r5 = r2.f94194c
            r8 = 0
            io.reactivex.rxjava3.internal.operators.maybe.j r12 = r5.e(r6, r7, r8, r9, r10)
            com.avito.android.authorization.reset_password.l r0 = new com.avito.android.authorization.reset_password.l
            r3 = 1
            r0.<init>(r2, r3)
            io.reactivex.rxjava3.internal.operators.maybe.g0 r3 = new io.reactivex.rxjava3.internal.operators.maybe.g0
            l41.g<java.lang.Object> r4 = io.reactivex.rxjava3.internal.functions.a.f401994d
            l41.a r5 = io.reactivex.rxjava3.internal.functions.a.f401993c
            r11 = r3
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r0
            r17 = r5
            r18 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            l41.g<java.lang.Throwable> r0 = io.reactivex.rxjava3.internal.functions.a.f401996f
            io.reactivex.rxjava3.disposables.d r0 = r3.n(r4, r0, r5)
            io.reactivex.rxjava3.disposables.c r2 = r2.f94202k
            r2.b(r0)
        La5:
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.reset_password.q.invoke(java.lang.Object):java.lang.Object");
    }
}
