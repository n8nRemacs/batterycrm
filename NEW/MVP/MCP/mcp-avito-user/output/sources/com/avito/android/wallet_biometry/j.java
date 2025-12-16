package com.avito.android.wallet_biometry;

import Y41.p;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: WalletPinBiometryInteractorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LCP0/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)LCP0/d;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet_biometry.WalletPinBiometryInteractorImpl$getPinCipher$2", f = "WalletPinBiometryInteractorImpl.kt", i = {0}, l = {107}, m = "invokeSuspend", n = {ChannelContext.Item.USER_ID}, s = {"L$0"})
/* loaded from: classes5.dex */
final class j extends SuspendLambda implements p<T, Continuation<? super CP0.d>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f329503q;

    /* renamed from: r, reason: collision with root package name */
    public int f329504r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f329505s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f329505s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f329505s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super CP0.d> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f329504r
            r2 = 1
            com.avito.android.wallet_biometry.g r3 = r8.f329505s
            r4 = 0
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.String r0 = r8.f329503q
            kotlin.C42729a0.b(r9)
            goto L3c
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            kotlin.C42729a0.b(r9)
            com.avito.android.account.E r9 = r3.f329479a
            java.lang.String r9 = r9.a()
            if (r9 == 0) goto La8
            int r1 = r9.length()
            if (r1 != 0) goto L2f
            goto La8
        L2f:
            r8.f329503q = r9
            r8.f329504r = r2
            java.lang.Object r1 = r3.c(r8)
            if (r1 != r0) goto L3a
            return r0
        L3a:
            r0 = r9
            r9 = r1
        L3c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L45
            return r4
        L45:
            com.avito.android.wallet_biometry.data.a r9 = r3.f329481c
            java.lang.String r1 = "WalletPinBiometryUserStorage"
            AK0.l r5 = r9.f329476b     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            java.lang.String r7 = "wallet_c_text_"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            r6.append(r0)     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            java.lang.String r5 = r5.getString(r6, r4)     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            if (r5 == 0) goto L7b
            h31.e<com.google.gson.Gson> r6 = r9.f329475a     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            com.google.gson.Gson r6 = (com.google.gson.Gson) r6     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            java.lang.Class<zP0.a> r7 = zP0.C50501a.class
            java.lang.Object r5 = r6.d(r7, r5)     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            zP0.a r5 = (zP0.C50501a) r5     // Catch: java.lang.Exception -> L70 com.google.gson.JsonParseException -> L72
            goto L89
        L70:
            r9 = move-exception
            goto L74
        L72:
            r5 = move-exception
            goto L7d
        L74:
            com.avito.android.util.V2 r5 = com.avito.android.util.V2.f318762a
            java.lang.String r6 = "Failed to get ciphertext: "
            r5.a(r1, r6, r9)
        L7b:
            r5 = r4
            goto L89
        L7d:
            com.avito.android.util.V2 r6 = com.avito.android.util.V2.f318762a
            java.lang.String r7 = "Invalid ciphertext json: "
            r6.a(r1, r7, r5)
            r1 = 0
            r9.a(r0, r1)
            goto L7b
        L89:
            if (r5 != 0) goto L8c
            return r4
        L8c:
            com.avito.android.wallet_biometry.data.g r9 = r3.f329480b     // Catch: java.lang.Exception -> L95 java.security.InvalidKeyException -> L97
            byte[] r1 = r5.f444039b     // Catch: java.lang.Exception -> L95 java.security.InvalidKeyException -> L97
            javax.crypto.Cipher r9 = r9.a(r1)     // Catch: java.lang.Exception -> L95 java.security.InvalidKeyException -> L97
            goto L9d
        L95:
            r9 = r4
            goto L9d
        L97:
            com.avito.android.wallet_biometry.data.a r9 = r3.f329481c
            r9.a(r0, r2)
            goto L95
        L9d:
            if (r9 != 0) goto La0
            return r4
        La0:
            CP0.d r0 = new CP0.d
            byte[] r1 = r5.f444038a
            r0.<init>(r1, r9)
            return r0
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet_biometry.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
