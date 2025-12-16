package com.avito.beduin.v2.utils.filepicker;

import Y41.p;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.beduin.v2.interaction.flow.file_picker.flow.j;
import com.avito.beduin.v2.logger.LogLevel;
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

/* compiled from: ScreenAwareFilePickerClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/utils/filepicker/g;", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/f;", "<init>", "()V", "file-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements com.avito.beduin.v2.interaction.flow.file_picker.flow.f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public c f338431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.client.permission.f f338432c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public f f338433d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.client.permission.a f338434e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.client.permission.g f338435f;

    /* compiled from: ScreenAwareFilePickerClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.utils.filepicker.ScreenAwareFilePickerClient$bind$1$1", f = "ScreenAwareFilePickerClient.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f338436q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ FV0.a f338437r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ FV0.a f338438s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ g f338439t;

        /* compiled from: ScreenAwareFilePickerClient.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.beduin.v2.utils.filepicker.ScreenAwareFilePickerClient$bind$1$1$1", f = "ScreenAwareFilePickerClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.beduin.v2.utils.filepicker.g$a$a, reason: collision with other inner class name */
        public static final class C10489a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ FV0.a f338440q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ g f338441r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10489a(FV0.a aVar, g gVar, Continuation<? super C10489a> continuation) {
                super(2, continuation);
                this.f338440q = aVar;
                this.f338441r = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C10489a(this.f338440q, this.f338441r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10489a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                FV0.a aVar = this.f338440q;
                boolean z12 = aVar instanceof FV0.c;
                g gVar = this.f338441r;
                if (z12) {
                    FV0.c cVar = (FV0.c) aVar;
                    gVar.f338434e = new com.avito.beduin.v2.client.permission.a(cVar.j1(), gVar.f338435f);
                    gVar.f338431b = new c(cVar.j1(), gVar.f338433d);
                } else if (aVar instanceof FV0.b) {
                    FV0.b bVar = (FV0.b) aVar;
                    gVar.f338434e = new com.avito.beduin.v2.client.permission.a(bVar.N3(), gVar.f338435f);
                    gVar.f338431b = new c(bVar.N3(), gVar.f338433d);
                }
                gVar.f338432c = aVar instanceof com.avito.beduin.v2.client.permission.f ? (com.avito.beduin.v2.client.permission.f) aVar : null;
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FV0.a aVar, FV0.a aVar2, g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f338437r = aVar;
            this.f338438s = aVar2;
            this.f338439t = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f338437r, this.f338438s, this.f338439t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f338436q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                C10489a c10489a = new C10489a(this.f338438s, this.f338439t, null);
                this.f338436q = 1;
                if (C23056p0.b(this.f338437r, state, c10489a, this) == coroutine_suspended) {
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

    @Override // FV0.h
    public final void P() {
        this.f338431b = null;
        this.f338434e = null;
        this.f338432c = null;
    }

    @Override // FV0.h
    public final void Q(@Y61.k FV0.a aVar) {
        C43259k.d(C22981N.a(aVar.getLifecycle()), null, null, new a(aVar, aVar, this, null), 3);
    }

    public final void b(@Y61.k com.avito.beduin.v2.interaction.flow.file_picker.flow.l lVar, @Y61.k j.a aVar) {
        if (this.f338431b == null) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (3 >= RU0.b.f14469c) {
                RU0.b.f14468b.e(RU0.b.f14470d + ":FilePicker", "Attempting to pick a file when filePicker is unset");
            }
        }
        l lVar2 = new l(aVar, this);
        if (!(lVar instanceof com.avito.beduin.v2.interaction.flow.file_picker.flow.c)) {
            c cVar = this.f338431b;
            this.f338433d = cVar != null ? cVar.d(lVar, lVar2) : null;
        } else {
            com.avito.beduin.v2.client.permission.a aVar2 = this.f338434e;
            if (aVar2 != null) {
                com.avito.beduin.v2.client.permission.e.a(aVar2, new h(this, lVar, lVar2), new i(this), new j(aVar), new k(this));
            }
        }
    }
}
