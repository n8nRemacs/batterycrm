package com.avito.android.email.email_update.mvi;

import Fy.InterfaceC13853a;
import Y41.p;
import com.avito.android.email.email_update.mvi.entity.EmailUpdateInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EmailUpdateActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.email.email_update.mvi.EmailUpdateActor$process$1", f = "EmailUpdateActor.kt", i = {0, 1, 2}, l = {44, 47, 49, 52, 55, 58}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super EmailUpdateInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public boolean f147204q;

    /* renamed from: r, reason: collision with root package name */
    public int f147205r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f147206s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f147207t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f147208u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13853a f147209v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z12, d dVar, InterfaceC13853a interfaceC13853a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f147207t = z12;
        this.f147208u = dVar;
        this.f147209v = interfaceC13853a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f147207t, this.f147208u, this.f147209v, continuation);
        aVar.f147206s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EmailUpdateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.email.email_update.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
