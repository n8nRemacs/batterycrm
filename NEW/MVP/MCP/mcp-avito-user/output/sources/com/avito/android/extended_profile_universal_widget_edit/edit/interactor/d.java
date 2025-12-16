package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import Y41.p;
import Y41.q;
import Y61.l;
import Za0.InterfaceC19524a;
import android.net.Uri;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import jB.InterfaceC42227a;
import jB.InterfaceC42228b;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UniversalWidgetEditInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/interactor/d;", "Lcom/avito/android/extended_profile_universal_widget_edit/edit/interactor/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f153865a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC19524a> f153866b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f153867c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetEditArguments f153868d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.converter.f f153869e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j f153870f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f153871g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_universal_widget_edit.j f153872h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap f153873i = new ConcurrentHashMap();

    /* compiled from: UniversalWidgetEditInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LjB/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl$editSectionVisibility$1", f = "UniversalWidgetEditInteractor.kt", i = {0, 1}, l = {103, 105, 112}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC42228b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153874q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f153875r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f153877t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f153877t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(this.f153877t, continuation);
            aVar.f153875r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC42228b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws com.avito.android.util.ApiException {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f153874q
                boolean r2 = r8.f153877t
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.C42729a0.b(r9)
                goto L85
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f153875r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L66
            L27:
                java.lang.Object r1 = r8.f153875r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L44
            L2f:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f153875r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                jB.b$h r1 = jB.InterfaceC42228b.h.f405478a
                r8.f153875r = r9
                r8.f153874q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L43
                return r0
            L43:
                r1 = r9
            L44:
                com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d r9 = com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d.this
                h31.e<Za0.a> r5 = r9.f153866b
                java.lang.Object r5 = r5.get()
                Za0.a r5 = (Za0.InterfaceC19524a) r5
                gb0.b r6 = new gb0.b
                com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments r9 = r9.f153868d
                java.lang.String r9 = r9.f153653c
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r6.<init>(r9, r7)
                r8.f153875r = r1
                r8.f153874q = r4
                java.lang.Object r9 = r5.a(r6, r8)
                if (r9 != r0) goto L66
                return r0
            L66:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto L88
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                gb0.a r9 = (gb0.C40647a) r9
                jB.b$c r9 = new jB.b$c
                r9.<init>(r2)
                r2 = 0
                r8.f153875r = r2
                r8.f153874q = r3
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L85
                return r0
            L85:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            L88:
                boolean r0 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto L9b
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r0 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r0, r9)
                throw r9
            L9b:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UniversalWidgetEditInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LjB/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl$editSectionVisibility$2", f = "UniversalWidgetEditInteractor.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC42228b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153878q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f153879r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f153880s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f153881t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f153881t = z12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC42228b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(this.f153881t, continuation);
            bVar.f153879r = interfaceC43172j;
            bVar.f153880s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153878q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f153879r;
                InterfaceC42228b.C11551b c11551b = new InterfaceC42228b.C11551b(this.f153880s, new InterfaceC42227a.C11550a(this.f153881t));
                this.f153879r = null;
                this.f153878q = 1;
                if (interfaceC43172j.emit(c11551b, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    /* compiled from: UniversalWidgetEditInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LjB/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl$removeSection$1", f = "UniversalWidgetEditInteractor.kt", i = {0, 1}, l = {130, 132, 135}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC42228b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153882q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f153883r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = d.this.new c(continuation);
            cVar.f153883r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC42228b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) throws com.avito.android.util.ApiException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f153882q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r7)
                goto L7c
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r1 = r6.f153883r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L60
            L25:
                java.lang.Object r1 = r6.f153883r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L42
            L2d:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f153883r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                jB.b$h r1 = jB.InterfaceC42228b.h.f405478a
                r6.f153883r = r7
                r6.f153882q = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L41
                return r0
            L41:
                r1 = r7
            L42:
                com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d r7 = com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d.this
                h31.e<Za0.a> r4 = r7.f153866b
                java.lang.Object r4 = r4.get()
                Za0.a r4 = (Za0.InterfaceC19524a) r4
                db0.a r5 = new db0.a
                com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments r7 = r7.f153868d
                java.lang.String r7 = r7.f153653c
                r5.<init>(r7)
                r6.f153883r = r1
                r6.f153882q = r3
                java.lang.Object r7 = r4.e(r5, r6)
                if (r7 != r0) goto L60
                return r0
            L60:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L7f
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                db0.b r7 = (db0.C39699b) r7
                jB.b$m r7 = jB.InterfaceC42228b.m.f405484a
                r3 = 0
                r6.f153883r = r3
                r6.f153882q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L7c
                return r0
            L7c:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L7f:
                boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto L92
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r0 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r0, r7)
                throw r7
            L92:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UniversalWidgetEditInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LjB/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl$removeSection$2", f = "UniversalWidgetEditInteractor.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d$d, reason: collision with other inner class name */
    public static final class C4492d extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC42228b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153885q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f153886r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f153887s;

        public C4492d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC42228b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C4492d c4492d = new C4492d(3, continuation);
            c4492d.f153886r = interfaceC43172j;
            c4492d.f153887s = th2;
            return c4492d.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153885q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f153886r;
                InterfaceC42228b.l lVar = new InterfaceC42228b.l(this.f153887s, InterfaceC42227a.k.f405466a);
                this.f153886r = null;
                this.f153885q = 1;
                if (interfaceC43172j.emit(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    /* compiled from: UniversalWidgetEditInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.interactor.UniversalWidgetEditInteractorImpl$wipeCroppedImages$2", f = "UniversalWidgetEditInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            d dVar = d.this;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            try {
                Iterator it = dVar.f153873i.entrySet().iterator();
                while (it.hasNext()) {
                    dVar.f153871g.b((Uri) ((Map.Entry) it.next()).getValue());
                }
                dVar.f153873i.clear();
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "UniversalWidgetEditInteractor", e12);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k h31.e<D0> eVar, @Y61.k h31.e<InterfaceC19524a> eVar2, @Y61.k R0 r02, @Y61.k UniversalWidgetEditArguments universalWidgetEditArguments, @Y61.k com.avito.android.photo_picker.converter.f fVar, @Y61.k j jVar, @Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k com.avito.android.extended_profile_universal_widget_edit.j jVar2) {
        this.f153865a = eVar;
        this.f153866b = eVar2;
        this.f153867c = r02;
        this.f153868d = universalWidgetEditArguments;
        this.f153869e = fVar;
        this.f153870f = jVar;
        this.f153871g = sharedPhotosStorage;
        this.f153872h = jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d r5, android.net.Uri r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws com.avito.android.util.ApiException {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.avito.android.extended_profile_universal_widget_edit.edit.interactor.e
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.extended_profile_universal_widget_edit.edit.interactor.e r0 = (com.avito.android.extended_profile_universal_widget_edit.edit.interactor.e) r0
            int r1 = r0.f153892t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f153892t = r1
            goto L1b
        L16:
            com.avito.android.extended_profile_universal_widget_edit.edit.interactor.e r0 = new com.avito.android.extended_profile_universal_widget_edit.edit.interactor.e
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f153890r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f153892t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r7)
            goto L6e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d r5 = r0.f153889q
            kotlin.C42729a0.b(r7)
            goto L51
        L3d:
            kotlin.C42729a0.b(r7)
            com.avito.android.photo_picker.converter.f r7 = r5.f153869e
            io.reactivex.rxjava3.core.z r6 = r7.a(r6)
            r0.f153889q = r5
            r0.f153892t = r4
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.c(r6, r0)
            if (r7 != r1) goto L51
            goto L84
        L51:
            java.io.File r7 = (java.io.File) r7
            h31.e<com.avito.android.remote.D0> r5 = r5.f153865a
            java.lang.Object r5 = r5.get()
            com.avito.android.remote.D0 r5 = (com.avito.android.remote.D0) r5
            r6 = 3
            okhttp3.MultipartBody$Part r6 = com.avito.http.b.a(r7, r6)
            r7 = 0
            r0.f153889q = r7
            r0.f153892t = r3
            java.lang.String r7 = "universal_widget_section"
            java.lang.Object r7 = r5.i(r7, r6, r0)
            if (r7 != r1) goto L6e
            goto L84
        L6e:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L85
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r5 = r7.getResult()
            com.avito.android.remote.model.extended.ExtendedProfileSettingsUploadResult r5 = (com.avito.android.remote.model.extended.ExtendedProfileSettingsUploadResult) r5
            long r5 = r5.getImageId()
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
        L84:
            return r1
        L85:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L98
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            java.lang.Throwable r6 = r7.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L98:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d.f(com.avito.android.extended_profile_universal_widget_edit.edit.interactor.d, android.net.Uri, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k UniversalWidgetSectionModel.Section section) {
        return C43175k.I(this.f153867c.a(), new C43152f0(C43175k.G(new com.avito.android.extended_profile_universal_widget_edit.edit.interactor.b(section, this, null)), new com.avito.android.extended_profile_universal_widget_edit.edit.interactor.c(3, null)));
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a
    public final void b(@Y61.k UniversalWidgetSectionModel.ImageWithTextBlock imageWithTextBlock) {
        Uri uri = imageWithTextBlock.f153574m;
        ConcurrentHashMap concurrentHashMap = this.f153873i;
        if (uri != null) {
            concurrentHashMap.put(uri.toString(), uri);
        }
        Uri uri2 = imageWithTextBlock.f153578q;
        if (uri2 != null) {
            concurrentHashMap.put(uri2.toString(), uri2);
        }
        Uri uri3 = imageWithTextBlock.f153582u;
        if (uri3 != null) {
            concurrentHashMap.put(uri3.toString(), uri3);
        }
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a
    @l
    public final Object c(@Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f153867c.a(), new e(null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a
    @Y61.k
    public final InterfaceC43160i<InterfaceC42228b> d(boolean z12) {
        return C43175k.I(this.f153867c.a(), new C43152f0(C43175k.G(new a(z12, null)), new b(z12, null)));
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a
    @Y61.k
    public final InterfaceC43160i<InterfaceC42228b> e() {
        return C43175k.I(this.f153867c.a(), new C43152f0(C43175k.G(new c(null)), new C4492d(3, null)));
    }
}
