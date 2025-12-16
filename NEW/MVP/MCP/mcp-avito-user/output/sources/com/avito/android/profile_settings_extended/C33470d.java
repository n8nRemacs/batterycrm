package com.avito.android.profile_settings_extended;

import com.avito.android.profile_settings_extended.C33468b;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CommonValueInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/b$a;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.CommonValueInteractorImpl$deleteValue$2", f = "CommonValueInteractor.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33470d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super C33468b.a>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230041q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f230042r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f230043s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33468b f230044t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CommonValueId f230045u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33470d(C33468b c33468b, CommonValueId commonValueId, Continuation<? super C33470d> continuation) {
        super(3, continuation);
        this.f230044t = c33468b;
        this.f230045u = commonValueId;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super C33468b.a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C33470d c33470d = new C33470d(this.f230044t, this.f230045u, continuation);
        c33470d.f230042r = interfaceC43172j;
        c33470d.f230043s = th2;
        return c33470d.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230041q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f230042r;
            Throwable th2 = this.f230043s;
            ConcurrentHashMap.KeySetView keySetView = this.f230044t.f229994c;
            CommonValueId commonValueId = this.f230045u;
            keySetView.remove(commonValueId);
            C33468b.a.C7001a c7001a = new C33468b.a.C7001a(commonValueId, th2);
            this.f230042r = null;
            this.f230041q = 1;
            if (interfaceC43172j.emit(c7001a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
