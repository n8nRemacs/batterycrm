package com.avito.android.publish.details.historical_suggest;

import Y41.p;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: HistoricalSuggestsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.details.historical_suggest.HistoricalSuggestsInteractorImpl$getHistoricalSuggests$1", f = "HistoricalSuggestsInteractor.kt", i = {0, 1, 1, 1}, l = {30, 37, 40}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "destination$iv$iv", "it"}, s = {"L$0", "L$0", "L$2", "L$4"})
/* loaded from: classes16.dex */
final class k extends SuspendLambda implements p<InterfaceC43172j<? super List<? extends AddressSuggestion>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public m f234681q;

    /* renamed from: r, reason: collision with root package name */
    public Collection f234682r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f234683s;

    /* renamed from: t, reason: collision with root package name */
    public AddressSuggestion f234684t;

    /* renamed from: u, reason: collision with root package name */
    public Collection f234685u;

    /* renamed from: v, reason: collision with root package name */
    public int f234686v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f234687w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f234688x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f234688x = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f234688x, continuation);
        kVar.f234687w = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super List<? extends AddressSuggestion>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cb -> B:28:0x00cf). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.details.historical_suggest.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
