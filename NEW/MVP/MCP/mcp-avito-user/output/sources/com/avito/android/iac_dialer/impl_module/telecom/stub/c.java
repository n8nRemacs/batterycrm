package com.avito.android.iac_dialer.impl_module.telecom.stub;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionCallbacks;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionInputData;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.util.R0;
import h31.e;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.N;

/* compiled from: IacTelecomManagerStub.kt */
@Singleton
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/stub/c;", "Lcom/avito/android/iac_dialer/impl_module/telecom/d;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.iac_dialer.impl_module.telecom.d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f166489b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e<com.avito.android.iac_dialer.impl_module.audio.audio_devices.b> f166490c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Object f166491d = B0.f406639b;

    /* compiled from: IacTelecomManagerStub.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f166493m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f166493m = str;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
        @Override // Y41.a
        public final G0 invoke() {
            c cVar = c.this;
            cVar.a(b1.i(cVar.f166491d, this.f166493m));
            return G0.f406611a;
        }
    }

    /* compiled from: IacTelecomManagerStub.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f166495m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f166495m = str;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
        @Override // Y41.a
        public final G0 invoke() {
            c cVar = c.this;
            cVar.a(b1.e(cVar.f166491d, this.f166495m));
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k R0 r02, @k e<com.avito.android.iac_dialer.impl_module.audio.audio_devices.b> eVar) {
        this.f166489b = r02;
        this.f166490c = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    public final void a(@k LinkedHashSet linkedHashSet) {
        boolean zIsEmpty = ((Collection) this.f166491d).isEmpty();
        e<com.avito.android.iac_dialer.impl_module.audio.audio_devices.b> eVar = this.f166490c;
        if (!zIsEmpty && linkedHashSet.isEmpty()) {
            eVar.get().stop();
        } else if (this.f166491d.isEmpty() && !linkedHashSet.isEmpty()) {
            eVar.get().start();
        }
        this.f166491d = linkedHashSet;
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.d
    @l
    public final Object b(@k String str, @k IacCallDirection iacCallDirection, boolean z12, @l List<String> list, @k Y41.l<? super com.avito.android.iac_dialer.impl_module.telecom.a, G0> lVar, @k Y41.l<? super Throwable, G0> lVar2, @k Y41.a<G0> aVar, @k Y41.l<? super Boolean, G0> lVar3, @k Y41.l<? super TerminateReasonBundle, G0> lVar4, @k Y41.l<? super AudioState, G0> lVar5, @k Continuation<? super G0> continuation) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacTelecomManagerStub", C22491k0.a(')', "addCall(callId=", str), null);
        new com.avito.android.iac_dialer.impl_module.telecom.stub.b(new IacConnectionInputData(str, iacCallDirection, z12, new IacConnectionCallbacks(lVar, lVar2, aVar, lVar3, lVar4, lVar5)), this.f166489b, this.f166490c.get(), new a(str), new b(str));
        return G0.f406611a;
    }
}
