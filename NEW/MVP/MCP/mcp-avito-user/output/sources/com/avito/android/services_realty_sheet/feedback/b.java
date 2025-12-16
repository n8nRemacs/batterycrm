package com.avito.android.services_realty_sheet.feedback;

import Y61.k;
import com.avito.android.B2;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import tv0.C48728b;
import uv0.InterfaceC49118a;

/* compiled from: ServiceRealtySheetFeedbackHelperImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_realty_sheet/feedback/b;", "Luv0/a;", "a", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC49118a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f280410a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C48728b f280411b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B2 f280412c;

    /* compiled from: ServiceRealtySheetFeedbackHelperImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/services_realty_sheet/feedback/b$a;", "", "<init>", "()V", "", "UX_FEEDBACK_DELAY", "J", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b(@k SK0.b bVar, @k C48728b c48728b, @k B2 b22) {
        this.f280410a = bVar;
        this.f280411b = c48728b;
        this.f280412c = b22;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // uv0.InterfaceC49118a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.services_realty_sheet.feedback.d
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.services_realty_sheet.feedback.d r0 = (com.avito.android.services_realty_sheet.feedback.d) r0
            int r1 = r0.f280417t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280417t = r1
            goto L18
        L13:
            com.avito.android.services_realty_sheet.feedback.d r0 = new com.avito.android.services_realty_sheet.feedback.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f280415r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f280417t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.services_realty_sheet.feedback.b r0 = r0.f280414q
            kotlin.C42729a0.b(r8)
            goto L77
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.C42729a0.b(r8)
            com.avito.android.B2 r8 = r7.f280412c
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.B2.f67184X
            r4 = 29
            r2 = r2[r4]
            com.avito.android.A0$a r8 = r8.f67189E
            DE0.a r8 = r8.a()
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lab
            tv0.b r8 = r7.f280411b
            boolean r2 = r8.c()
            if (r2 != 0) goto L5e
            boolean r2 = r8.d()
            if (r2 == 0) goto Lab
        L5e:
            AK0.l r8 = r8.f439663a
            java.lang.String r2 = "services_realty_sheet_ux_feedback_shown_key"
            r4 = 0
            boolean r8 = r8.getBoolean(r2, r4)
            if (r8 != 0) goto Lab
            r0.f280414q = r7
            r0.f280417t = r3
            r2 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r8 = kotlinx.coroutines.C43131e0.b(r2, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            r0 = r7
        L77:
            r0.getClass()
            com.avito.android.services_realty_sheet.feedback.c r5 = new com.avito.android.services_realty_sheet.feedback.c
            r5.<init>(r0)
            tv0.b r8 = r0.f280411b
            boolean r1 = r8.c()
            if (r1 == 0) goto L95
            com.avito.android.services_realty_sheet.feedback.a r2 = new com.avito.android.services_realty_sheet.feedback.a
            r2.<init>()
            SK0.b r1 = r0.f280410a
            r6 = 6
            r3 = 0
            r4 = 0
            SK0.b.a.a(r1, r2, r3, r4, r5, r6)
            goto La8
        L95:
            boolean r8 = r8.d()
            if (r8 == 0) goto La8
            com.avito.android.services_realty_sheet.feedback.g r2 = new com.avito.android.services_realty_sheet.feedback.g
            r2.<init>()
            SK0.b r1 = r0.f280410a
            r6 = 6
            r3 = 0
            r4 = 0
            SK0.b.a.a(r1, r2, r3, r4, r5, r6)
        La8:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Lab:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_realty_sheet.feedback.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
