package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.android.play.core.appupdate.C37094a;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.ktx.j;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.I0;

/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/google/android/play/core/ktx/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", f = "AppUpdateManagerKtx.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class b extends SuspendLambda implements Y41.p<I0<? super j>, Continuation<? super G0>, Object> {

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/play/core/appupdate/a;", "kotlin.jvm.PlatformType", "updateInfo", "Lkotlin/G0;", "onSuccess", "(Lcom/google/android/play/core/appupdate/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<TResult> implements InterfaceC37024g {
        public a() {
            throw null;
        }

        @Override // com.google.android.gms.tasks.InterfaceC37024g
        public final void onSuccess(Object obj) {
            int i12 = ((C37094a) obj).f358005a;
            if (i12 == 0) {
                new InstallException(-2);
                throw null;
            }
            if (i12 == 1) {
                h.a(null, j.d.f358598a);
                throw null;
            }
            if (i12 == 2 || i12 == 3) {
                throw null;
            }
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Exception;", "exception", "Lkotlin/G0;", "onFailure", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.google.android.play.core.ktx.b$b, reason: collision with other inner class name */
    public static final class C10649b implements InterfaceC37023f {
        @Override // com.google.android.gms.tasks.InterfaceC37023f
        public final void onFailure(@Y61.k Exception exc) {
            throw null;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends N implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            throw null;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/play/core/install/InstallState;", UpdateKey.MARKET_INSTALL_STATE, "Lkotlin/G0;", "onStateUpdate", "(Lcom/google/android/play/core/install/InstallState;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d implements com.google.android.play.core.install.a {
        public d() {
            throw null;
        }

        @Override // MY0.a
        public final void a(InstallState installState) {
            if (installState.c() == 11) {
                throw null;
            }
            h.a(null, new j.c(null));
            throw null;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/play/core/ktx/i;", "Lkotlin/G0;", "invoke", "(Lcom/google/android/play/core/ktx/i;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e extends N implements Y41.l<i, G0> {
        @Override // Y41.l
        public final G0 invoke(i iVar) {
            throw null;
        }
    }

    public b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super j> i02, Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        throw null;
    }
}
