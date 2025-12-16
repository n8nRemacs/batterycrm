package com.avito.android.credman;

import android.content.Context;
import androidx.credentials.InterfaceC22858k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: CredmanLoader.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credman/g;", "Lcom/avito/android/credman/f;", "_avito_credman_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22858k f129090a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f129091b;

    /* compiled from: CredmanLoader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.credman.CredmanLoaderImpl", f = "CredmanLoader.kt", i = {}, l = {21}, m = "load", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f129092q;

        /* renamed from: s, reason: collision with root package name */
        public int f129094s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f129092q = obj;
            this.f129094s |= BeduinInputModel.MIN_TEXT_VERSION;
            return g.this.a(this);
        }
    }

    @Inject
    public g(@Y61.k InterfaceC22858k interfaceC22858k, @Y61.k Context context) {
        this.f129090a = interfaceC22858k;
        this.f129091b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.credman.f
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.Continuation<? super com.avito.android.credman.f.a> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "Credman – loaded successfully with "
            boolean r3 = r0 instanceof com.avito.android.credman.g.a
            if (r3 == 0) goto L19
            r3 = r0
            com.avito.android.credman.g$a r3 = (com.avito.android.credman.g.a) r3
            int r4 = r3.f129094s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f129094s = r4
            goto L20
        L19:
            com.avito.android.credman.g$a r3 = new com.avito.android.credman.g$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r0 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r0
            r3.<init>(r0)
        L20:
            java.lang.Object r0 = r3.f129092q
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.f129094s
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L3d
            if (r5 != r7) goto L35
            kotlin.C42729a0.b(r0)     // Catch: java.lang.Exception -> L32
            goto L74
        L32:
            r0 = move-exception
            goto Laa
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3d:
            kotlin.C42729a0.b(r0)
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Exception -> L32
            java.lang.String r5 = "Credman – getting credential"
            r0.b(r5, r6)     // Catch: java.lang.Exception -> L32
            androidx.credentials.k r0 = r1.f129090a     // Catch: java.lang.Exception -> L32
            android.content.Context r5 = r1.f129091b     // Catch: java.lang.Exception -> L32
            androidx.credentials.K r15 = new androidx.credentials.K     // Catch: java.lang.Exception -> L32
            androidx.credentials.N r14 = new androidx.credentials.N     // Catch: java.lang.Exception -> L32
            r10 = 0
            r11 = 0
            r12 = 7
            r13 = 0
            r9 = 0
            r8 = r14
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L32
            java.util.List r9 = java.util.Collections.singletonList(r14)     // Catch: java.lang.Exception -> L32
            r12 = 0
            r13 = 0
            r14 = 30
            r16 = 0
            r10 = 0
            r11 = 0
            r8 = r15
            r6 = r15
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L32
            r3.f129094s = r7     // Catch: java.lang.Exception -> L32
            java.lang.Object r0 = r0.a(r5, r6, r3)     // Catch: java.lang.Exception -> L32
            if (r0 != r4) goto L74
            return r4
        L74:
            androidx.credentials.L r0 = (androidx.credentials.L) r0     // Catch: java.lang.Exception -> L32
            androidx.credentials.j r0 = r0.f45181a     // Catch: java.lang.Exception -> L32
            boolean r3 = r0 instanceof androidx.credentials.P     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto La2
            com.avito.android.util.V2 r3 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Exception -> L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L32
            r4.<init>(r2)     // Catch: java.lang.Exception -> L32
            r2 = r0
            androidx.credentials.P r2 = (androidx.credentials.P) r2     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = r2.f45187b     // Catch: java.lang.Exception -> L32
            r4.append(r2)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L32
            r4 = 0
            r3.b(r2, r4)     // Catch: java.lang.Exception -> L32
            com.avito.android.credman.f$a$b r2 = new com.avito.android.credman.f$a$b     // Catch: java.lang.Exception -> L32
            r3 = r0
            androidx.credentials.P r3 = (androidx.credentials.P) r3     // Catch: java.lang.Exception -> L32
            java.lang.String r3 = r3.f45187b     // Catch: java.lang.Exception -> L32
            androidx.credentials.P r0 = (androidx.credentials.P) r0     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = r0.f45188c     // Catch: java.lang.Exception -> L32
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L32
            return r2
        La2:
            java.lang.String r0 = "Only password credentials is expected here"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L32
            r2.<init>(r0)     // Catch: java.lang.Exception -> L32
            throw r2     // Catch: java.lang.Exception -> L32
        Laa:
            com.avito.android.util.V2 r2 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Credman – failed with "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r2.b(r3, r4)
            java.lang.String r2 = r0.getMessage()
            com.avito.android.credman.f$a$a r3 = new com.avito.android.credman.f$a$a
            r3.<init>(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.credman.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
