package com.avito.android.iac_dialer.impl_module.telecom.impl;

import Y41.p;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: IacConnection.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnection$requestAudioDevice$1", f = "IacConnection.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f166463q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AudioDevice f166464r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, AudioDevice audioDevice, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f166463q = bVar;
        this.f166464r = audioDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f166463q, this.f166464r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String string;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b bVar = this.f166463q;
        IK.a aVar = bVar.f166440c;
        AudioDevice audioDevice = this.f166464r;
        Object objA = aVar.a(audioDevice);
        StringBuilder sb2 = new StringBuilder("requestAudioDevice(");
        sb2.append(audioDevice);
        sb2.append(") - done with result=");
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            string = objA.toString();
        } else {
            string = "Success(" + objA + ')';
        }
        sb2.append((Object) string);
        bVar.b(sb2.toString());
        return G0.f406611a;
    }
}
