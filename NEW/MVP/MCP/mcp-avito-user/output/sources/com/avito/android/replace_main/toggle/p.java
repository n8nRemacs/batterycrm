package com.avito.android.replace_main.toggle;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import zm0.InterfaceC50590a;

/* compiled from: ReplaceMainToggleInteractorImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toggle/p;", "Lcom/avito/android/replace_main/toggle/m;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f254652a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation_config.manager.a f254653b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC50590a> f254654c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f254655d;

    @Inject
    public p(@Y61.k E e12, @Y61.k com.avito.android.navigation_config.manager.a aVar, @Y61.k h31.e eVar, @Y61.k R0 r02) {
        this.f254652a = e12;
        this.f254653b = aVar;
        this.f254654c = eVar;
        this.f254655d = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.replace_main.toggle.m
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.replace_main.toggle.n
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.replace_main.toggle.n r0 = (com.avito.android.replace_main.toggle.n) r0
            int r1 = r0.f254649t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254649t = r1
            goto L18
        L13:
            com.avito.android.replace_main.toggle.n r0 = new com.avito.android.replace_main.toggle.n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f254647r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f254649t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.avito.android.replace_main.toggle.p r0 = r0.f254646q
            kotlin.C42729a0.b(r6)
            goto L5c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C42729a0.b(r6)
            com.avito.android.account.E r6 = r5.f254652a
            boolean r6 = r6.b()
            if (r6 != 0) goto L45
            com.avito.android.remote.model.TypedResult$Success r6 = new com.avito.android.remote.model.TypedResult$Success
            r6.<init>(r4)
            return r6
        L45:
            com.avito.android.util.R0 r6 = r5.f254655d
            kotlinx.coroutines.scheduling.b r6 = r6.a()
            com.avito.android.replace_main.toggle.o r2 = new com.avito.android.replace_main.toggle.o
            r2.<init>(r5, r4)
            r0.f254646q = r5
            r0.f254649t = r3
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r6, r2, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r0 = r5
        L5c:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r1 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L76
            r1 = r6
            com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
            java.lang.Object r1 = r1.getResult()
            com.avito.android.replace_main.toggle.d r1 = (com.avito.android.replace_main.toggle.d) r1
            if (r1 == 0) goto L6f
            com.avito.android.bottom_navigation.space.BottomNavigationSpace r4 = r1.f254616a
        L6f:
            if (r4 == 0) goto L76
            com.avito.android.navigation_config.manager.a r0 = r0.f254653b
            r0.a(r4)
        L76:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.replace_main.toggle.p.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
