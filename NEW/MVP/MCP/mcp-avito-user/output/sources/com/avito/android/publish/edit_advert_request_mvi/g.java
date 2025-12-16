package com.avito.android.publish.edit_advert_request_mvi;

import Y41.p;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.util.R0;
import de0.InterfaceC39719d;
import ee0.InterfaceC40095b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nI0.InterfaceC44261b;
import yc.C50213a;

/* compiled from: EditRequestInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/g;", "Lcom/avito/android/publish/edit_advert_request_mvi/f;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f235565i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39719d f235566a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f235567b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f235568c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C50213a f235569d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.edit_advert_request.a f235570e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f235571f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final eH0.c f235572g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f235573h;

    /* compiled from: EditRequestInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/g$a;", "", "<init>", "()V", "", "REQ_FEES", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditRequestInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lee0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.EditRequestInteractorImpl$edit$1", f = "EditRequestInteractor.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {69, 73, 74, 76, 80}, m = "invokeSuspend", n = {"$this$flow", "params", "item", "$this$flow", "item", "$this$flow", "item"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40095b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Parcelable f235574q;

        /* renamed from: r, reason: collision with root package name */
        public ItemBrief f235575r;

        /* renamed from: s, reason: collision with root package name */
        public int f235576s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f235577t;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = g.this.new b(continuation);
            bVar.f235577t = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC40095b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01e9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.edit_advert_request_mvi.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k InterfaceC39719d interfaceC39719d, @Y61.k C0 c02, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k com.avito.android.publish.edit_advert_request.a aVar, @Y61.k R0 r02, @Y61.k eH0.c cVar, @Y61.k InterfaceC44261b interfaceC44261b) {
        this.f235566a = interfaceC39719d;
        this.f235567b = c02;
        this.f235568c = interfaceC28373a;
        this.f235569d = c50213a;
        this.f235570e = aVar;
        this.f235571f = r02;
        this.f235572g = cVar;
        this.f235573h = interfaceC44261b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.publish.edit_advert_request_mvi.g r4, com.avito.android.remote.model.TypedResult r5, com.avito.android.remote.model.ItemBrief r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.avito.android.publish.edit_advert_request_mvi.h
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.publish.edit_advert_request_mvi.h r0 = (com.avito.android.publish.edit_advert_request_mvi.h) r0
            int r1 = r0.f235581s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f235581s = r1
            goto L1b
        L16:
            com.avito.android.publish.edit_advert_request_mvi.h r0 = new com.avito.android.publish.edit_advert_request_mvi.h
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f235579q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f235581s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r7)
            goto L4e
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.C42729a0.b(r7)
            java.lang.String r7 = r6.getCategoryId()
            java.lang.String r6 = r6.getId()
            com.avito.android.publish.edit_advert_request.a r4 = r4.f235570e
            io.reactivex.rxjava3.core.I r4 = r4.a(r5, r7, r6)
            r0.f235581s = r3
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.b(r4, r0)
            if (r7 != r1) goto L4e
            goto L4f
        L4e:
            r1 = r7
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.edit_advert_request_mvi.g.b(com.avito.android.publish.edit_advert_request_mvi.g, com.avito.android.remote.model.TypedResult, com.avito.android.remote.model.ItemBrief, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.publish.edit_advert_request_mvi.g r11, com.avito.android.remote.model.ItemBrief r12, com.avito.android.remote.model.category_parameters.CategoryParameters r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof com.avito.android.publish.edit_advert_request_mvi.i
            if (r0 == 0) goto L16
            r0 = r14
            com.avito.android.publish.edit_advert_request_mvi.i r0 = (com.avito.android.publish.edit_advert_request_mvi.i) r0
            int r1 = r0.f235584s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f235584s = r1
            goto L1b
        L16:
            com.avito.android.publish.edit_advert_request_mvi.i r0 = new com.avito.android.publish.edit_advert_request_mvi.i
            r0.<init>(r11, r14)
        L1b:
            java.lang.Object r14 = r0.f235582q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f235584s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r14)
            goto L62
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.C42729a0.b(r14)
            java.lang.String r5 = r12.getId()
            java.lang.String r14 = r12.getCategoryId()
            if (r14 != 0) goto L43
            java.lang.String r14 = ""
        L43:
            r6 = r14
            com.avito.android.publish.C0 r14 = r11.f235567b
            com.avito.android.publish.PublishState r2 = r14.f231861Y
            com.avito.android.remote.model.Navigation r7 = r2.getNavigation()
            java.lang.String r8 = r12.getVersion()
            java.lang.String r10 = r14.f231868f0
            de0.d r4 = r11.f235566a
            r9 = r13
            io.reactivex.rxjava3.core.I r11 = r4.a(r5, r6, r7, r8, r9, r10)
            r0.f235584s = r3
            java.lang.Object r14 = kotlinx.coroutines.rx3.C43292o.b(r11, r0)
            if (r14 != r1) goto L62
            goto L63
        L62:
            r1 = r14
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.edit_advert_request_mvi.g.c(com.avito.android.publish.edit_advert_request_mvi.g, com.avito.android.remote.model.ItemBrief, com.avito.android.remote.model.category_parameters.CategoryParameters, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.publish.edit_advert_request_mvi.f
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.remote.model.publish.EditAdvertResult.Ok r22, @Y61.k java.lang.String r23, @Y61.k kotlinx.coroutines.flow.InterfaceC43172j r24, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.edit_advert_request_mvi.g.a(com.avito.android.remote.model.publish.EditAdvertResult$Ok, java.lang.String, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Map r8, kotlinx.coroutines.flow.InterfaceC43172j r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.avito.android.publish.edit_advert_request_mvi.k
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.publish.edit_advert_request_mvi.k r0 = (com.avito.android.publish.edit_advert_request_mvi.k) r0
            int r1 = r0.f235597u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235597u = r1
            goto L18
        L13:
            com.avito.android.publish.edit_advert_request_mvi.k r0 = new com.avito.android.publish.edit_advert_request_mvi.k
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f235595s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f235597u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r10)
            goto L8d
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlinx.coroutines.flow.j r9 = r0.f235594r
            java.util.Map r8 = r0.f235593q
            java.util.Map r8 = (java.util.Map) r8
            kotlin.C42729a0.b(r10)
            goto L5d
        L3f:
            kotlin.C42729a0.b(r10)
            com.avito.android.util.R0 r10 = r7.f235571f
            kotlinx.coroutines.d1 r10 = r10.b()
            com.avito.android.publish.edit_advert_request_mvi.l r2 = new com.avito.android.publish.edit_advert_request_mvi.l
            r2.<init>(r7, r8, r5)
            r6 = r8
            java.util.Map r6 = (java.util.Map) r6
            r0.f235593q = r6
            r0.f235594r = r9
            r0.f235597u = r4
            java.lang.Object r10 = kotlinx.coroutines.C43259k.g(r10, r2, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L90
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = kotlin.collections.C42745f0.F(r8)
            com.avito.android.remote.model.PretendErrorValue r8 = (com.avito.android.remote.model.PretendErrorValue) r8
            if (r8 == 0) goto L79
            java.lang.String r8 = r8.getSingleMessage()
            if (r8 != 0) goto L7b
        L79:
            java.lang.String r8 = ""
        L7b:
            ee0.b$d r10 = new ee0.b$d
            r10.<init>(r8)
            r0.f235593q = r5
            r0.f235594r = r5
            r0.f235597u = r3
            java.lang.Object r8 = r9.emit(r10, r0)
            if (r8 != r1) goto L8d
            return r1
        L8d:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L90:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.edit_advert_request_mvi.g.d(java.util.Map, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.publish.edit_advert_request_mvi.f
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public final InterfaceC43160i<InterfaceC40095b> edit() {
        return C43175k.I(this.f235571f.a(), C43175k.G(new b(null)));
    }
}
