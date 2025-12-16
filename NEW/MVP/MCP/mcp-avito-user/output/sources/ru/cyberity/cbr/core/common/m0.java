package ru.cyberity.cbr.core.common;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.gms.tasks.InterfaceC37021d;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.InterfaceC37024g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.InterfaceC43271q;

/* compiled from: DocumentRotationUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/common/m0;", "Lru/cyberity/cbr/core/common/k;", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
final class m0 implements k {

    /* compiled from: DocumentRotationUtils.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.MLKitDocumentRotationDetector", f = "DocumentRotationUtils.kt", i = {0, 0}, l = {75}, m = "detectRotation", n = {"faceDetector", "image"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432774a;

        /* renamed from: b, reason: collision with root package name */
        Object f432775b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f432776c;

        /* renamed from: e, reason: collision with root package name */
        int f432778e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432776c = obj;
            this.f432778e |= BeduinInputModel.MIN_TEXT_VERSION;
            return m0.this.a(null, this);
        }
    }

    /* compiled from: DocumentRotationUtils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "onCanceled", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b implements InterfaceC37021d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TZ0.d f432779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC43271q<Integer> f432780b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(TZ0.d dVar, InterfaceC43271q<? super Integer> interfaceC43271q) {
            this.f432779a = dVar;
            this.f432780b = interfaceC43271q;
        }

        @Override // com.google.android.gms.tasks.InterfaceC37021d
        public final void onCanceled() {
            this.f432779a.close();
            this.f432780b.C(null, 0);
        }
    }

    /* compiled from: DocumentRotationUtils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Exception;", "it", "Lkotlin/G0;", "onFailure", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c implements InterfaceC37023f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TZ0.d f432781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC43271q<Integer> f432782b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(TZ0.d dVar, InterfaceC43271q<? super Integer> interfaceC43271q) {
            this.f432781a = dVar;
            this.f432782b = interfaceC43271q;
        }

        @Override // com.google.android.gms.tasks.InterfaceC37023f
        public final void onFailure(@Y61.k Exception exc) {
            this.f432781a.close();
            InterfaceC43271q<Integer> interfaceC43271q = this.f432782b;
            int i12 = Z.f406624c;
            interfaceC43271q.resumeWith(new Z.b(exc));
        }
    }

    /* compiled from: DocumentRotationUtils.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "LTZ0/a;", "kotlin.jvm.PlatformType", "", "faces", "Lkotlin/G0;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 7, 1})
    public static final class d<TResult> implements InterfaceC37024g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TZ0.d f432783a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC43271q<Integer> f432784b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(TZ0.d dVar, InterfaceC43271q<? super Integer> interfaceC43271q) {
            this.f432783a = dVar;
            this.f432784b = interfaceC43271q;
        }

        @Override // com.google.android.gms.tasks.InterfaceC37024g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onSuccess(List<TZ0.a> list) {
            TZ0.a aVar = (TZ0.a) C42745f0.G(list);
            this.f432783a.close();
            if (aVar != null) {
                this.f432784b.C(null, Integer.valueOf((int) aVar.f15711h));
            } else {
                this.f432784b.C(null, 0);
                this.f432783a.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.common.k
    @kotlinx.coroutines.B0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.k android.graphics.Bitmap r6, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ru.cyberity.cbr.core.common.m0.a
            if (r0 == 0) goto L13
            r0 = r7
            ru.cyberity.cbr.core.common.m0$a r0 = (ru.cyberity.cbr.core.common.m0.a) r0
            int r1 = r0.f432778e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432778e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.common.m0$a r0 = new ru.cyberity.cbr.core.common.m0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f432776c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432778e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f432775b
            com.google.mlkit.vision.common.a r6 = (com.google.mlkit.vision.common.a) r6
            java.lang.Object r6 = r0.f432774a
            TZ0.d r6 = (TZ0.d) r6
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L99
            goto L92
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.C42729a0.b(r7)
            TZ0.e$a r7 = new TZ0.e$a     // Catch: java.lang.Throwable -> L99
            r7.<init>()     // Catch: java.lang.Throwable -> L99
            r2 = 2
            r7.f15726d = r2     // Catch: java.lang.Throwable -> L99
            r7.f15723a = r2     // Catch: java.lang.Throwable -> L99
            r7.f15725c = r2     // Catch: java.lang.Throwable -> L99
            TZ0.e r7 = r7.a()     // Catch: java.lang.Throwable -> L99
            com.google.mlkit.vision.face.internal.a r7 = TZ0.c.a(r7)     // Catch: java.lang.Throwable -> L99
            com.google.mlkit.vision.common.a r6 = com.google.mlkit.vision.common.a.a(r6)     // Catch: java.lang.Throwable -> L99
            r0.f432774a = r7     // Catch: java.lang.Throwable -> L99
            r0.f432775b = r6     // Catch: java.lang.Throwable -> L99
            r0.f432778e = r3     // Catch: java.lang.Throwable -> L99
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L99
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L99
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L99
            r2.p()     // Catch: java.lang.Throwable -> L99
            com.google.android.gms.tasks.Task r6 = r7.b(r6)     // Catch: java.lang.Throwable -> L99
            ru.cyberity.cbr.core.common.m0$b r3 = new ru.cyberity.cbr.core.common.m0$b     // Catch: java.lang.Throwable -> L99
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L99
            r6.a(r3)     // Catch: java.lang.Throwable -> L99
            ru.cyberity.cbr.core.common.m0$c r3 = new ru.cyberity.cbr.core.common.m0$c     // Catch: java.lang.Throwable -> L99
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L99
            r6.e(r3)     // Catch: java.lang.Throwable -> L99
            ru.cyberity.cbr.core.common.m0$d r3 = new ru.cyberity.cbr.core.common.m0$d     // Catch: java.lang.Throwable -> L99
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L99
            r6.g(r3)     // Catch: java.lang.Throwable -> L99
            java.lang.Object r7 = r2.o()     // Catch: java.lang.Throwable -> L99
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L99
            if (r7 != r6) goto L8f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L99
        L8f:
            if (r7 != r1) goto L92
            return r1
        L92:
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L99
            int r6 = r7.intValue()     // Catch: java.lang.Throwable -> L99
            goto L9a
        L99:
            r6 = 0
        L9a:
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.m0.a(android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
