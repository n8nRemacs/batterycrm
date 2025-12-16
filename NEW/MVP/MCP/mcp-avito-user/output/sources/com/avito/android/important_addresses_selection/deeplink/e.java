package com.avito.android.important_addresses_selection.deeplink;

import Ju.AbstractC14250d;
import Y41.p;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;

/* compiled from: ImportantAddressesSelectionDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.important_addresses_selection.deeplink.ImportantAddressesSelectionDeeplinkHandler$handleScreenOpening$3", f = "ImportantAddressesSelectionDeeplinkHandler.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"message"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class e extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f169731q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f169732r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f169733s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f169734t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f169733s = fVar;
        this.f169734t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f169733s, this.f169734t, continuation);
        eVar.f169732r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super G0> continuation) {
        return ((e) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f169731q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str2 = (String) this.f169732r;
            this.f169732r = str2;
            this.f169731q = 1;
            if (C43131e0.b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) this.f169732r;
            C42729a0.b(obj);
            str = str3;
        }
        f fVar = this.f169733s;
        fVar.f169740k.g(fVar.d(), false);
        fVar.f169742m.c(new PM.e(this.f169734t, "selection"));
        f.c.f125255c.getClass();
        a.i.C4057a.e(fVar.f169741l, str, f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        fVar.j(AbstractC14250d.b.f9170c);
        return G0.f406611a;
    }
}
