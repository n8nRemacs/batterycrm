package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import De0.InterfaceC13391b;
import Y41.p;
import android.net.Uri;
import com.avito.android.remote.model.StsRecognitionResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VinScannerActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/StsRecognitionResult;", VoiceInfo.STATE, "Lkotlinx/coroutines/flow/i;", "LDe0/b;", "<anonymous>", "(Lcom/avito/android/util/P2;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.scanner_v2.vinscanner.mvi.VinScannerActor$processStsImage$1", f = "VinScannerActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<P2<? super StsRecognitionResult>, Continuation<? super InterfaceC43160i<? extends InterfaceC13391b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f239487q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Uri f239488r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f239489s;

    /* compiled from: VinScannerActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LDe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.scanner_v2.vinscanner.mvi.VinScannerActor$processStsImage$1$1", f = "VinScannerActor.kt", i = {1, 3}, l = {67, 76, 77, 85, 86}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC13391b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f239490q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f239491r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ P2<StsRecognitionResult> f239492s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Uri f239493t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e f239494u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(P2<? super StsRecognitionResult> p22, Uri uri, e eVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f239492s = p22;
            this.f239493t = uri;
            this.f239494u = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f239492s, this.f239493t, this.f239494u, continuation);
            aVar.f239491r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC13391b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.scanner_v2.vinscanner.mvi.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Uri uri, e eVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f239488r = uri;
        this.f239489s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f239488r, this.f239489s, continuation);
        bVar.f239487q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(P2<? super StsRecognitionResult> p22, Continuation<? super InterfaceC43160i<? extends InterfaceC13391b>> continuation) {
        return ((b) create(p22, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43175k.G(new a((P2) this.f239487q, this.f239488r, this.f239489s, null));
    }
}
