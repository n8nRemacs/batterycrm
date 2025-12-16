package com.avito.android.replace_main.exit_onboarding;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import zm0.InterfaceC50590a;

/* compiled from: ReplaceMainExitOnboardingInteractorImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/exit_onboarding/c;", "Lcom/avito/android/replace_main/exit_onboarding/b;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final U20.d f254503a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final U20.c f254504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f254505c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC50590a> f254506d;

    /* compiled from: ReplaceMainExitOnboardingInteractorImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public c(@k U20.d dVar, @k U20.c cVar, @k R0 r02, @k h31.e<InterfaceC50590a> eVar) {
        this.f254503a = dVar;
        this.f254504b = cVar;
        this.f254505c = r02;
        this.f254506d = eVar;
    }

    @Override // com.avito.android.replace_main.exit_onboarding.b
    public final boolean a() {
        boolean z12 = false;
        if (!this.f254503a.c()) {
            return false;
        }
        int iOrdinal = this.f254504b.e().f16134a.ordinal();
        if (iOrdinal != 0) {
            z12 = true;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.replace_main.exit_onboarding.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.replace_main.exit_onboarding.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.replace_main.exit_onboarding.d r0 = (com.avito.android.replace_main.exit_onboarding.d) r0
            int r1 = r0.f254509s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254509s = r1
            goto L18
        L13:
            com.avito.android.replace_main.exit_onboarding.d r0 = new com.avito.android.replace_main.exit_onboarding.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f254507q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f254509s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.C42729a0.b(r6)
            boolean r6 = r5.a()
            r2 = 0
            if (r6 != 0) goto L3c
            return r2
        L3c:
            com.avito.android.util.R0 r6 = r5.f254505c
            kotlinx.coroutines.scheduling.b r6 = r6.a()
            com.avito.android.replace_main.exit_onboarding.e r4 = new com.avito.android.replace_main.exit_onboarding.e
            r4.<init>(r5, r2)
            r0.f254509s = r3
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r6, r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L71
            com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding r6 = new com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding
            r0 = 0
            java.io.Serializable[] r1 = new java.io.Serializable[r0]
            r2 = 2131956574(0x7f13135e, float:1.9549708E38)
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.c(r2, r1)
            r2 = 2131956573(0x7f13135d, float:1.9549706E38)
            java.io.Serializable[] r0 = new java.io.Serializable[r0]
            com.avito.android.printable_text.PrintableText r0 = com.avito.android.printable_text.b.c(r2, r0)
            java.lang.String r2 = "ab360_exit_default_main"
            r6.<init>(r1, r0, r2)
            goto L7d
        L71:
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L7e
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding r6 = (com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding) r6
        L7d:
            return r6
        L7e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.replace_main.exit_onboarding.c.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
