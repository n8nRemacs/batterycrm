package com.avito.android.upload_doc.mvi.logic;

import Y41.p;
import com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigUploadDocActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.upload_doc.mvi.logic.GigUploadDocActor$process$1", f = "GigUploadDocActor.kt", i = {1, 3, 5}, l = {47, 50, 51, 57, 61, 65, 66, 75, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 96, 97, 98}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super GigUploadDocInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f306938q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f306939r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ OG0.a f306940s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f306941t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ OG0.d f306942u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OG0.a aVar, b bVar, OG0.d dVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f306940s = aVar;
        this.f306941t = bVar;
        this.f306942u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f306940s, this.f306941t, this.f306942u, continuation);
        aVar.f306939r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super GigUploadDocInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.mvi.logic.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
