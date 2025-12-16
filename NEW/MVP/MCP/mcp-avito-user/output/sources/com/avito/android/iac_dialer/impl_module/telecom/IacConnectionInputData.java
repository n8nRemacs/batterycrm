package com.avito.android.iac_dialer.impl_module.telecom;

import Y41.l;
import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.concurrent.Executors;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: IacConnectionInputData.kt */
@P
@s0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R=\u00103\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u0002020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionInputData;", "LdL/d;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "", "isVideo", "Lcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionCallbacks;", "callbacks", "<init>", "(Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;ZLcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionCallbacks;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component3", "()Z", "component4", "()Lcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionCallbacks;", "copy", "(Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;ZLcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionCallbacks;)Lcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionInputData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "Z", "Lcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionCallbacks;", "getCallbacks", "Lkotlinx/coroutines/T;", "callScope", "Lkotlinx/coroutines/T;", "getCallScope", "()Lkotlinx/coroutines/T;", "callTerminationScope", "getCallTerminationScope", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "t", "Lkotlin/G0;", "onCallScopeException", "LY41/l;", "getOnCallScopeException", "()LY41/l;", "setOnCallScopeException", "(LY41/l;)V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacConnectionInputData implements dL.d {
    public static final int $stable = 8;

    @k
    private final String callId;

    @k
    private final IacConnectionCallbacks callbacks;

    @k
    private final IacCallDirection direction;
    private final boolean isVideo;

    @k
    private final T callScope = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), new b(N.f410714t2, this)).plus(new C43315z0(Executors.newSingleThreadExecutor(new com.avito.android.iac_dialer.impl_module.telecom.b(this)))));

    @k
    private final T callTerminationScope = U.a(Q0.a());

    @k
    private l<? super Throwable, G0> onCallScopeException = a.f166403l;

    /* compiled from: IacConnectionInputData.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f166403l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Throwable th2) {
            return G0.f406611a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractCoroutineContextElement implements N {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IacConnectionInputData f166404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(N.b bVar, IacConnectionInputData iacConnectionInputData) {
            super(bVar);
            this.f166404b = iacConnectionInputData;
        }

        @Override // kotlinx.coroutines.N
        public final void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            this.f166404b.getOnCallScopeException().invoke(th2);
        }
    }

    public IacConnectionInputData(@k String str, @k IacCallDirection iacCallDirection, boolean z12, @k IacConnectionCallbacks iacConnectionCallbacks) {
        this.callId = str;
        this.direction = iacCallDirection;
        this.isVideo = z12;
        this.callbacks = iacConnectionCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread callScope$lambda$1(IacConnectionInputData iacConnectionInputData, Runnable runnable) {
        return new Thread(runnable, "CallScopeThrad_...".concat(C43066x.u0(3, iacConnectionInputData.callId)));
    }

    public static /* synthetic */ IacConnectionInputData copy$default(IacConnectionInputData iacConnectionInputData, String str, IacCallDirection iacCallDirection, boolean z12, IacConnectionCallbacks iacConnectionCallbacks, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = iacConnectionInputData.callId;
        }
        if ((i12 & 2) != 0) {
            iacCallDirection = iacConnectionInputData.direction;
        }
        if ((i12 & 4) != 0) {
            z12 = iacConnectionInputData.isVideo;
        }
        if ((i12 & 8) != 0) {
            iacConnectionCallbacks = iacConnectionInputData.callbacks;
        }
        return iacConnectionInputData.copy(str, iacCallDirection, z12, iacConnectionCallbacks);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final IacCallDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final IacConnectionCallbacks getCallbacks() {
        return this.callbacks;
    }

    @k
    public final IacConnectionInputData copy(@k String callId, @k IacCallDirection direction, boolean isVideo, @k IacConnectionCallbacks callbacks) {
        return new IacConnectionInputData(callId, direction, isVideo, callbacks);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacConnectionInputData)) {
            return false;
        }
        IacConnectionInputData iacConnectionInputData = (IacConnectionInputData) other;
        return L.f(this.callId, iacConnectionInputData.callId) && this.direction == iacConnectionInputData.direction && this.isVideo == iacConnectionInputData.isVideo && L.f(this.callbacks, iacConnectionInputData.callbacks);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final T getCallScope() {
        return this.callScope;
    }

    @k
    public final T getCallTerminationScope() {
        return this.callTerminationScope;
    }

    @k
    public final IacConnectionCallbacks getCallbacks() {
        return this.callbacks;
    }

    @k
    public final IacCallDirection getDirection() {
        return this.direction;
    }

    @k
    public final l<Throwable, G0> getOnCallScopeException() {
        return this.onCallScopeException;
    }

    public int hashCode() {
        return this.callbacks.hashCode() + r.i((this.direction.hashCode() + (this.callId.hashCode() * 31)) * 31, 31, this.isVideo);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final void setOnCallScopeException(@k l<? super Throwable, G0> lVar) {
        this.onCallScopeException = lVar;
    }

    @k
    public String toString() {
        return "IacConnectionInputData(callId=" + this.callId + ", direction=" + this.direction + ", isVideo=" + this.isVideo + ", callbacks=" + this.callbacks + ')';
    }
}
