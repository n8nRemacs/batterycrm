package com.avito.android.error;

import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ErrorsHandlings.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "Output", "Result", "it", "", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.error.ErrorsHandlingsKt$mapApiResultSuspendable$2", f = "ErrorsHandlings.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class w extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f147763q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f147764r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f147765s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(Y41.p pVar, Continuation continuation) {
        super(2, continuation);
        this.f147765s = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        w wVar = new w(this.f147765s, continuation);
        wVar.f147764r = obj;
        return wVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((Map) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f147763q;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = (String) C42745f0.F(((Map) this.f147764r).values());
            if (str == null) {
                str = "";
            }
            this.f147763q = 1;
            obj = this.f147765s.invoke(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
