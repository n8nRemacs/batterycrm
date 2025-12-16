package com.avito.android.authorization.deep_linking;

import kotlin.Metadata;

/* compiled from: PerformResetPasswordAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ResetPasswordResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/ResetPasswordResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class M<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f93699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f93700c;

    public M(S s5, String str) {
        this.f93699b = s5;
        this.f93700c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // l41.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 1
            com.avito.android.remote.model.ResetPasswordResult r13 = (com.avito.android.remote.model.ResetPasswordResult) r13
            com.avito.android.authorization.deep_linking.S r1 = r12.f93699b
            boolean r2 = r13 instanceof com.avito.android.remote.model.ResetPasswordResult.ViaCode
            if (r2 == 0) goto L5b
            com.avito.android.code_check_public.CodeCheckLink r2 = new com.avito.android.code_check_public.CodeCheckLink
            com.avito.android.code_check_public.CodeCheckLink$Flow$ResetPassword r3 = com.avito.android.code_check_public.CodeCheckLink.Flow.ResetPassword.f119256b
            com.avito.android.code_check_public.CodeCheckLink$Arguments r11 = new com.avito.android.code_check_public.CodeCheckLink$Arguments
            kotlin.text.p r4 = com.avito.android.util.C5.f318570d
            java.lang.String r5 = ""
            java.lang.String r6 = r12.f93700c
            java.lang.String r4 = r4.f(r6, r5)
            java.lang.String r5 = "7"
            boolean r5 = kotlin.text.C43066x.i0(r4, r5)
            if (r5 != 0) goto L29
            java.lang.String r5 = "8"
            boolean r5 = kotlin.text.C43066x.i0(r4, r5)
            if (r5 == 0) goto L2d
        L29:
            java.lang.CharSequence r4 = kotlin.text.C43066x.w(r4)
        L2d:
            java.lang.String r5 = r4.toString()
            com.avito.android.remote.model.ResetPasswordResult$ViaCode r13 = (com.avito.android.remote.model.ResetPasswordResult.ViaCode) r13
            long r6 = r13.getCodeTimeout()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            int r13 = r13.getCodeLength()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r10 = 0
            r8 = 0
            r9 = 8
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.<init>(r3, r11)
            com.avito.android.deep_linking.links.auth.PerformResetPasswordLink$b$a r13 = com.avito.android.deep_linking.links.auth.PerformResetPasswordLink.b.a.f133934b
            com.avito.android.deeplink_handler.handler.composite.a r3 = r1.f93713j
            com.avito.android.deep_linking.links.DeepLink[] r0 = new com.avito.android.deep_linking.links.DeepLink[r0]
            r4 = 0
            r0[r4] = r2
            r1.i(r13, r3, r0)
            goto L78
        L5b:
            boolean r2 = r13 instanceof com.avito.android.remote.model.ResetPasswordResult.ViaLink
            if (r2 == 0) goto L78
            com.avito.android.remote.model.UserDialog r2 = new com.avito.android.remote.model.UserDialog
            android.content.res.Resources r3 = r1.f93715l
            r4 = 2131956602(0x7f13137a, float:1.9549764E38)
            java.lang.String r3 = r3.getString(r4)
            com.avito.android.remote.model.ResetPasswordResult$ViaLink r13 = (com.avito.android.remote.model.ResetPasswordResult.ViaLink) r13
            java.lang.String r13 = r13.getText()
            kotlin.collections.z0 r4 = kotlin.collections.C42784z0.f406748b
            r2.<init>(r3, r13, r4, r0)
            r1.l(r2)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.deep_linking.M.accept(java.lang.Object):void");
    }
}
