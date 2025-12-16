package com.avito.avcalls.android.video;

import com.avito.avcalls.android.config.Config;
import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.video.i;
import com.avito.avcalls.android.video.m;
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
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.C43238h;
import org.webrtc.CameraEnumerator;

/* compiled from: VideoController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/video/o;", "Lcom/avito/avcalls/android/video/l;", "Lcom/avito/avcalls/android/video/b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements l, com.avito.avcalls.android.video.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43238h f332496a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.rtc.y f332497b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.coroutines.h<CameraPosition> f332498c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f332499d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f332500e = new LinkedHashSet();

    /* compiled from: VideoController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.video.VideoController$startCapture$1", f = "VideoController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f332502r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CameraPosition f332503s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, CameraPosition cameraPosition, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f332502r = str;
            this.f332503s = cameraPosition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return o.this.new a(this.f332502r, this.f332503s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            o oVar = o.this;
            oVar.f332500e.add(this.f332502r);
            InterfaceC42726C interfaceC42726C = oVar.f332499d;
            if (((k) interfaceC42726C.getValue()).a()) {
                return G0.f406611a;
            }
            ((k) interfaceC42726C.getValue()).b(this.f332503s);
            return G0.f406611a;
        }
    }

    /* compiled from: VideoController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.video.VideoController$stopCapture$1", f = "VideoController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f332505r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f332505r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return o.this.new b(this.f332505r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            o oVar = o.this;
            if (!oVar.f332500e.remove(this.f332505r)) {
                return G0.f406611a;
            }
            InterfaceC42726C interfaceC42726C = oVar.f332499d;
            if (!((k) interfaceC42726C.getValue()).a()) {
                return G0.f406611a;
            }
            if (oVar.f332500e.isEmpty()) {
                ((k) interfaceC42726C.getValue()).stopCapture();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VideoController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.video.VideoController$switchCamera$1", f = "VideoController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CameraPosition f332507r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CameraPosition cameraPosition, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f332507r = cameraPosition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return o.this.new c(this.f332507r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            o oVar = o.this;
            if (!((k) oVar.f332499d.getValue()).a()) {
                return G0.f406611a;
            }
            k kVar = (k) oVar.f332499d.getValue();
            G0 g02 = null;
            e eVar = kVar instanceof e ? (e) kVar : null;
            if (eVar != null) {
                g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
                StringBuilder sb2 = new StringBuilder("switchCamera(position=");
                CameraPosition cameraPosition = this.f332507r;
                sb2.append(cameraPosition);
                sb2.append(')');
                String string = sb2.toString();
                companion.getClass();
                g.Companion.c("CameraVideoCapturer", string);
                i iVar = eVar.f332481d;
                if (iVar != null) {
                    g.Companion.c("RtcCameraCapturerWrapper", "switchCamera(cameraPosition=" + cameraPosition + ')');
                    i.Companion companion2 = i.INSTANCE;
                    CameraEnumerator cameraEnumerator = iVar.f332487b;
                    companion2.getClass();
                    f fVarA = i.Companion.a(cameraPosition, cameraEnumerator);
                    if (L.f(iVar.f332489d, fVarA)) {
                        g.Companion.c("RtcCameraCapturerWrapper", "switchCamera: currentDevice is equal to newDevice. No switch needed. currentDevice=" + iVar.f332489d);
                    } else if (fVarA == null) {
                        g.Companion.c("RtcCameraCapturerWrapper", "switchCamera: newDevice is null. No switch needed. currentDevice=" + iVar.f332489d);
                    } else {
                        g.Companion.c("RtcCameraCapturerWrapper", "switchCamera: newDevice=" + fVarA);
                        iVar.f332486a.switchCamera(new d(new j(iVar, fVarA)), fVarA.f332483b);
                    }
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    g.Companion.c("CameraVideoCapturer", "switchCamera: ignore, cause rtcCapturerWrapper is not capturing yet");
                }
            }
            return G0.f406611a;
        }
    }

    public o(@Y61.k x xVar, @Y61.k Config config, @Y61.k m.a aVar, @Y61.k C43238h c43238h, @Y61.k com.avito.avcalls.android.rtc.y yVar, @Y61.k com.avito.avcalls.android.utils.coroutines.h hVar) {
        this.f332496a = c43238h;
        this.f332497b = yVar;
        this.f332498c = hVar;
        this.f332499d = C42727D.c(new n(aVar, xVar, config, this));
    }

    @Override // com.avito.avcalls.android.video.l
    public final void b(@Y61.k String str) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        String strConcat = "stopCapture: clientId=".concat(str);
        companion.getClass();
        g.Companion.c("VideoController", strConcat);
        C43259k.d(this.f332496a, null, null, new b(str, null), 3);
    }

    @Override // com.avito.avcalls.android.video.l
    public final void c(@Y61.k CameraPosition cameraPosition, @Y61.k String str) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("VideoController", "startCapture(clientId=" + str + ", defaultCamera=" + cameraPosition + ')');
        C43259k.d(this.f332496a, null, null, new a(str, cameraPosition, null), 3);
    }

    @Override // com.avito.avcalls.android.video.b
    public final void d(@Y61.k CameraPosition cameraPosition) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("VideoController", "position: position=" + cameraPosition);
        C43259k.d(this.f332496a, null, null, new c(cameraPosition, null), 3);
    }
}
