package com.avito.avcalls.rtc.device.video.capturing;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.avcalls.call.models.CameraPosition;
import java.util.LinkedHashSet;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: VideoCapturerController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/device/video/capturing/f;", "Lcom/avito/avcalls/rtc/device/video/capturing/d;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43238h f333103a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f333104b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashSet f333105c = new LinkedHashSet();

    /* compiled from: VideoCapturerController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.rtc.device.video.capturing.VideoCapturerControllerImpl$startCapture$1", f = "VideoCapturerController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f333107r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CameraPosition f333108s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, CameraPosition cameraPosition, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f333107r = str;
            this.f333108s = cameraPosition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return f.this.new a(this.f333107r, this.f333108s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f fVar = f.this;
            fVar.f333105c.add(this.f333107r);
            InterfaceC42726C interfaceC42726C = fVar.f333104b;
            if (((com.avito.avcalls.rtc.device.video.capturing.a) interfaceC42726C.getValue()).a()) {
                return G0.f406611a;
            }
            ((com.avito.avcalls.rtc.device.video.capturing.a) interfaceC42726C.getValue()).j(this.f333108s);
            return G0.f406611a;
        }
    }

    /* compiled from: VideoCapturerController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.rtc.device.video.capturing.VideoCapturerControllerImpl$stopCapture$1", f = "VideoCapturerController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f333110r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f333110r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return f.this.new b(this.f333110r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f fVar = f.this;
            if (!fVar.f333105c.remove(this.f333110r)) {
                return G0.f406611a;
            }
            InterfaceC42726C interfaceC42726C = fVar.f333104b;
            if (!((com.avito.avcalls.rtc.device.video.capturing.a) interfaceC42726C.getValue()).a()) {
                return G0.f406611a;
            }
            if (fVar.f333105c.isEmpty()) {
                ((com.avito.avcalls.rtc.device.video.capturing.a) interfaceC42726C.getValue()).stopCapture();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VideoCapturerController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.rtc.device.video.capturing.VideoCapturerControllerImpl$switchCamera$1", f = "VideoCapturerController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CameraPosition f333112r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CameraPosition cameraPosition, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f333112r = cameraPosition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return f.this.new c(this.f333112r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f fVar = f.this;
            if (!((com.avito.avcalls.rtc.device.video.capturing.a) fVar.f333104b.getValue()).a()) {
                return G0.f406611a;
            }
            ((com.avito.avcalls.rtc.device.video.capturing.a) fVar.f333104b.getValue()).d(this.f333112r);
            return G0.f406611a;
        }
    }

    public f(@k com.avito.avcalls.rtc.device.video.capturing.b bVar, @k com.avito.avcalls.rtc.media.k kVar, @k com.avito.avcalls.config.f fVar, @k com.avito.android.str_seller_orders.orders_seller.d dVar, @k C43238h c43238h) {
        this.f333103a = c43238h;
        this.f333104b = C42727D.c(new e(bVar, kVar, fVar, dVar));
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.d
    public final void b(@k String str) {
        C43259k.d(this.f333103a, null, null, new b(str, null), 3);
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.d
    public final void d(@k CameraPosition cameraPosition) {
        C43259k.d(this.f333103a, null, null, new c(cameraPosition, null), 3);
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.d
    public final void r(@k CameraPosition cameraPosition, @k String str) {
        C43259k.d(this.f333103a, null, null, new a(str, cameraPosition, null), 3);
    }
}
