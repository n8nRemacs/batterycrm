package com.avito.android.avl_entry.impl.domain;

import Mg.InterfaceC14486a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.P2;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ShortVideosInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "", "Lcom/avito/conveyor_item/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl_entry.impl.domain.ShortVideosInteractorImpl$loadShortVideos$1", f = "ShortVideosInteractorImpl.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super P2<? super List<? extends com.avito.conveyor_item.a>>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98481q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f98482r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f98483s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f98484t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f98485u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f98486v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str, String str2, String str3, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f98483s = eVar;
        this.f98484t = str;
        this.f98485u = str2;
        this.f98486v = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f98483s, this.f98484t, this.f98485u, this.f98486v, continuation);
        bVar.f98482r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super P2<? super List<? extends com.avito.conveyor_item.a>>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98481q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f98482r;
            InterfaceC14486a interfaceC14486a = this.f98483s.f98491a;
            this.f98482r = interfaceC43172j;
            this.f98481q = 1;
            obj = interfaceC14486a.a(this.f98484t, (8 & 2) != 0 ? null : this.f98485u, (8 & 4) != 0 ? null : this.f98486v, (8 & 8) != 0 ? null : null, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f98482r;
            C42729a0.b(obj);
        }
        P2.b bVar = new P2.b((List) obj);
        this.f98482r = null;
        this.f98481q = 2;
        if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
