package com.google.android.play.core.ktx;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.InterfaceC37116e;
import java.util.LinkedHashSet;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.I0;

/* compiled from: com.google.android.play:asset-delivery-ktx@@2.1.0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/google/android/play/core/assetpacks/AssetPackState;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1", f = "AssetPackManagerKtx.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class n extends SuspendLambda implements Y41.p<I0<? super AssetPackState>, Continuation<? super G0>, Object> {

    /* compiled from: com.google.android.play:asset-delivery-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/play/core/assetpacks/f;", "states", "Lkotlin/G0;", "onSuccess", "(Lcom/google/android/play/core/assetpacks/f;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<TResult> implements InterfaceC37024g {
        public a() {
            throw null;
        }

        @Override // com.google.android.gms.tasks.InterfaceC37024g
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    /* compiled from: com.google.android.play:asset-delivery-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Exception;", "exception", "Lkotlin/G0;", "onFailure", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b implements InterfaceC37023f {
        @Override // com.google.android.gms.tasks.InterfaceC37023f
        public final void onFailure(@Y61.k Exception exc) {
            throw null;
        }
    }

    /* compiled from: com.google.android.play:asset-delivery-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends N implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            throw null;
        }
    }

    /* compiled from: com.google.android.play:asset-delivery-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/play/core/assetpacks/AssetPackState;", VoiceInfo.STATE, "Lkotlin/G0;", "onStateUpdate", "(Lcom/google/android/play/core/assetpacks/AssetPackState;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d implements InterfaceC37116e {
        @Override // MY0.a
        public final void a(AssetPackState assetPackState) {
            assetPackState.f();
            throw null;
        }
    }

    public n() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super AssetPackState> i02, Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        new LinkedHashSet();
        throw null;
    }
}
