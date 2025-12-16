package com.avito.android.wallet_biometry;

import Y41.p;
import android.app.Activity;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: WalletPinBiometryInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LCP0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)LCP0/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet_biometry.WalletPinBiometryInteractorImpl$encrypt$2", f = "WalletPinBiometryInteractorImpl.kt", i = {0, 0, 1, 1}, l = {55, 64}, m = "invokeSuspend", n = {"$this$withContext", ChannelContext.Item.USER_ID, "$this$withContext", ChannelContext.Item.USER_ID}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super CP0.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f329495q;

    /* renamed from: r, reason: collision with root package name */
    public int f329496r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f329497s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f329498t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f329499u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f329500v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AP0.b f329501w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f329502x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, boolean z12, Activity activity, AP0.b bVar, String str, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f329498t = gVar;
        this.f329499u = z12;
        this.f329500v = activity;
        this.f329501w = bVar;
        this.f329502x = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f329498t, this.f329499u, this.f329500v, this.f329501w, this.f329502x, continuation);
        iVar.f329497s = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super CP0.b> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if ((r8 == null ? false : r8.contains(r1)) != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet_biometry.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
