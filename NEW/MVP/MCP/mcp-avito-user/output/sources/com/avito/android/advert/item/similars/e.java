package com.avito.android.advert.item.similars;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: AdvertAsyncComplementaryPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl$loadComplementaryBlockBottomSheet$1", f = "AdvertAsyncComplementaryPresenter.kt", i = {1, 2, 4}, l = {525, 533, 546, 572, 596, 613}, m = "invokeSuspend", n = {"currentBottomSheetState", "currentBottomSheetState", "currentBottomSheetState"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes10.dex */
final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f80273q;

    /* renamed from: r, reason: collision with root package name */
    public c f80274r;

    /* renamed from: s, reason: collision with root package name */
    public String f80275s;

    /* renamed from: t, reason: collision with root package name */
    public int f80276t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f80277u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f80278v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, String str, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f80277u = cVar;
        this.f80278v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f80277u, this.f80278v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x01a2: IPUT (r3v1 ?? I:T), (r1 I:kotlin.jvm.internal.l0$h) (LINE:419) kotlin.jvm.internal.l0.h.b java.lang.Object, block:B:76:0x01a2 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112 A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #0 {all -> 0x002a, blocks: (B:8:0x0025, B:51:0x0112, B:53:0x012e, B:56:0x0134, B:58:0x0146, B:60:0x014e, B:62:0x0151, B:64:0x015d, B:66:0x0160, B:70:0x017e, B:71:0x0185), top: B:105:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dc  */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.avito.android.advert.item.similars.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.advert.item.similars.m] */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, com.avito.android.advert.item.similars.m] */
    /* JADX WARN: Type inference failed for: r3v18, types: [T, com.avito.android.advert.item.similars.m] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.similars.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
