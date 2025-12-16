package com.avito.android.photo_download.feature.mvi;

import Y41.p;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhotoDownloadActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LJ70/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.photo_download.feature.mvi.PhotoDownloadActor$process$1", f = "PhotoDownloadActor.kt", i = {0}, l = {33, 35, 37, 40}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super J70.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f216444q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f216445r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f216446s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J70.a f216447t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, J70.a aVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f216446s = cVar;
        this.f216447t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f216446s, this.f216447t, continuation);
        aVar.f216445r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super J70.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f216444q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L21
            if (r1 == r4) goto L14
            if (r1 == r3) goto L14
            if (r1 != r2) goto L19
        L14:
            kotlin.C42729a0.b(r10)
            goto Lb2
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f216445r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L76
        L29:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f216445r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.photo_download.feature.mvi.c r10 = r9.f216446s
            com.avito.android.util.C r6 = r10.f216452c
            int r6 = r6.getF125487g()
            r7 = 29
            J70.a r8 = r9.f216447t
            if (r6 >= r7) goto L61
            com.avito.android.permissions.t$a r6 = com.avito.android.permissions.t.f215141z
            r6.getClass()
            java.lang.String r6 = com.avito.android.permissions.t.a.f215143b
            com.avito.android.permissions.u r7 = r10.f216451b
            boolean r6 = r7.b(r6)
            if (r6 == 0) goto L4f
            goto L61
        L4f:
            J70.b$a r10 = new J70.b$a
            J70.a$a r8 = (J70.a.C0506a) r8
            java.lang.String r3 = r8.f8787a
            r10.<init>(r3)
            r9.f216444q = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lb2
            return r0
        L61:
            J70.a$a r8 = (J70.a.C0506a) r8
            java.lang.String r2 = r8.f8787a
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r9.f216445r = r1
            r9.f216444q = r5
            com.avito.android.photo_download.d r10 = r10.f216450a
            java.lang.Object r10 = r10.a(r2, r9)
            if (r10 != r0) goto L76
            return r0
        L76:
            com.avito.android.arch.mvi.utils.c r10 = (com.avito.android.arch.mvi.utils.c) r10
            boolean r10 = r10.a()
            r2 = 0
            r5 = 0
            if (r10 == 0) goto L99
            J70.b$b r10 = new J70.b$b
            r3 = 2131956102(0x7f131186, float:1.954875E38)
            java.io.Serializable[] r5 = new java.io.Serializable[r5]
            com.avito.android.printable_text.PrintableText r3 = com.avito.android.printable_text.b.c(r3, r5)
            r10.<init>(r3)
            r9.f216445r = r2
            r9.f216444q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lb2
            return r0
        L99:
            J70.b$b r10 = new J70.b$b
            r4 = 2131956100(0x7f131184, float:1.9548746E38)
            java.io.Serializable[] r5 = new java.io.Serializable[r5]
            com.avito.android.printable_text.PrintableText r4 = com.avito.android.printable_text.b.c(r4, r5)
            r10.<init>(r4)
            r9.f216445r = r2
            r9.f216444q = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lb2
            return r0
        Lb2:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_download.feature.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
