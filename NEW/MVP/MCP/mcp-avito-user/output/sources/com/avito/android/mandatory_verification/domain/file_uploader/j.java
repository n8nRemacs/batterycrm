package com.avito.android.mandatory_verification.domain.file_uploader;

import Y41.q;
import com.avito.android.mandatory_verification.domain.file_uploader.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FileUploaderInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l;", "", "throwable", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mandatory_verification.domain.file_uploader.FileUploaderInteractor$uploadFile$4", f = "FileUploaderInteractor.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class j extends SuspendLambda implements q<InterfaceC43172j<? super l>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184560q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f184561r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f184562s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PrintableText f184563t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PrintableText printableText, Continuation<? super j> continuation) {
        super(3, continuation);
        this.f184563t = printableText;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super l> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        j jVar = new j(this.f184563t, continuation);
        jVar.f184561r = interfaceC43172j;
        jVar.f184562s = th2;
        return jVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184560q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f184561r;
            PrintableText printableText = this.f184562s instanceof n ? this.f184563t : null;
            if (printableText != null) {
                l.c cVar = new l.c(printableText);
                this.f184561r = null;
                this.f184560q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
