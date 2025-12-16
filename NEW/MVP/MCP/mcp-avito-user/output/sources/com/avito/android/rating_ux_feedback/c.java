package com.avito.android.rating_ux_feedback;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingUxFeedbackDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ux_feedback/c;", "Lcom/avito/android/rating_ux_feedback/b;", "a", "_avito_rating-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f250486a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f250487b;

    /* compiled from: RatingUxFeedbackDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_ux_feedback/c$a;", "", "<init>", "()V", "", "MESSAGE", "Ljava/lang/String;", "TAG", "_avito_rating-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@k SK0.b bVar, @k f fVar) {
        this.f250486a = bVar;
        this.f250487b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.rating_ux_feedback.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.rating_ux_feedback.i r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.avito.android.rating_ux_feedback.d
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.rating_ux_feedback.d r0 = (com.avito.android.rating_ux_feedback.d) r0
            int r1 = r0.f250491t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250491t = r1
            goto L18
        L13:
            com.avito.android.rating_ux_feedback.d r0 = new com.avito.android.rating_ux_feedback.d
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f250489r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f250491t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.rating_ux_feedback.c r10 = r0.f250488q
            kotlin.C42729a0.b(r11)
            goto L46
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.C42729a0.b(r11)
            java.lang.String r10 = r10.f250501a
            r0.f250488q = r9
            r0.f250491t = r3
            com.avito.android.rating_ux_feedback.f r11 = r9.f250487b
            java.lang.Object r11 = r11.f(r10, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            r10 = r9
        L46:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r0 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            r1 = 0
            java.lang.String r2 = "RatingUxFeedback"
            if (r0 == 0) goto L93
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r11 = r11.getResult()
            com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult r11 = (com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult) r11
            boolean r0 = r11 instanceof com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult.Ok
            if (r0 == 0) goto L71
            SK0.b r3 = r10.f250486a
            com.avito.android.rating_ux_feedback.a r4 = new com.avito.android.rating_ux_feedback.a
            com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult$Ok r11 = (com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult.Ok) r11
            java.lang.String r10 = r11.getEventName()
            r4.<init>(r10)
            r6 = 0
            r7 = 0
            r5 = 0
            r8 = 14
            SK0.b.a.a(r3, r4, r5, r6, r7, r8)
            goto Lb8
        L71:
            boolean r10 = r11 instanceof com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult.Error
            if (r10 == 0) goto Lb8
            com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult$Error r11 = (com.avito.android.remote.model.ux_feedback.RatingUxFeedbackResult.Error) r11
            java.lang.String r10 = r11.getError()
            if (r10 == 0) goto L85
            java.lang.String r11 = " because: "
            java.lang.String r10 = r11.concat(r10)
            if (r10 != 0) goto L87
        L85:
            java.lang.String r10 = ""
        L87:
            com.avito.android.util.V2 r11 = com.avito.android.util.V2.f318762a
            java.lang.String r0 = "The Rating UX Feedback could not start"
            java.lang.String r10 = r0.concat(r10)
            r11.j(r2, r10, r1)
            goto Lb8
        L93:
            boolean r10 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto Lbb
            com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
            com.avito.android.remote.error.ApiError r10 = r11.getError()
            java.lang.Throwable r11 = r11.getCause()
            com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r10, r11)
            com.avito.android.util.V2 r11 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "The Rating UX Feedback could not start because: "
            r0.<init>(r3)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.j(r2, r10, r1)
        Lb8:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        Lbb:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_ux_feedback.c.a(com.avito.android.rating_ux_feedback.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
