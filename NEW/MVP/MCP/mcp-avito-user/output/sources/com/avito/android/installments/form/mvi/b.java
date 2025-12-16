package com.avito.android.installments.form.mvi;

import Y41.p;
import com.avito.android.credits.web_handler.post_message.RedirectPostMessage;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InstallmentsFormActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.installments.form.mvi.InstallmentsFormActor$handlePostMessage$1", f = "InstallmentsFormActor.kt", i = {0, 1, 2, 2}, l = {99, 105, 125, 128}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "postMessage"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InstallmentsFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f172729q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.installments.form.mvi.a f172730r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f172731s;

    /* renamed from: t, reason: collision with root package name */
    public int f172732t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f172733u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.installments.form.mvi.a f172734v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f172735w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f172736x;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<RedirectPostMessage> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.installments.form.mvi.a aVar, String str, String str2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f172734v = aVar;
        this.f172735w = str;
        this.f172736x = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f172734v, this.f172735w, this.f172736x, continuation);
        bVar.f172733u = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InstallmentsFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:55:0x011d, B:57:0x012a, B:59:0x0133, B:61:0x013e, B:60:0x013a), top: B:86:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.installments.form.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
