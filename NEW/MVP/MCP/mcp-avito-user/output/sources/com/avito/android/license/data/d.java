package com.avito.android.license.data;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.V2;
import java.io.IOException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: LicenseRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.license.data.LicenseRepositoryImpl$getLicensesHtml$2", f = "LicenseRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super String>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f181510q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f181510q = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f181510q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super String> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><style> body { font-family: sans-serif; } pre { background-color: #eeeeee; padding: 1em; white-space: pre-wrap; } </style></head><body>");
        try {
            e.b(this.f181510q, sb2);
        } catch (IOException e12) {
            V2.f318762a.a("LicenseRepository", "read files", e12);
        }
        sb2.append("</body></html>");
        return sb2.toString();
    }
}
