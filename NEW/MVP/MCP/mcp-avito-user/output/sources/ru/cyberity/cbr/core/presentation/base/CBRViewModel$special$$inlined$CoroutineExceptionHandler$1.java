package ru.cyberity.cbr.core.presentation.base;

import Y61.k;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.log.c;
import ru.cyberity.log.logger.Logger;

/* compiled from: CoroutineExceptionHandler.kt */
@s0
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "Lkotlin/G0;", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRViewModel$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements N {
    final /* synthetic */ CBRViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRViewModel$special$$inlined$CoroutineExceptionHandler$1(N.b bVar, CBRViewModel cBRViewModel) {
        super(bVar);
        this.this$0 = cBRViewModel;
    }

    @Override // kotlinx.coroutines.N
    public void handleException(@k CoroutineContext context, @k Throwable exception) {
        Logger.v$default(ru.cyberity.log.a.f436064a, c.a(this.this$0), "Prepare error: " + exception, null, 4, null);
        if (this.this$0._strings == null) {
            this.this$0._strings = new c.C12476c(null, null, 3, null);
        }
        j0.a(this.this$0._viewModelInternalState, CBRViewModel$prepareExceptionHandler$1$1.INSTANCE);
        CBRViewModel cBRViewModel = this.this$0;
        CBRViewModel.throwError$default(cBRViewModel, exception, cBRViewModel.getDocumentType(), null, 4, null);
    }
}
