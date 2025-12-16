package com.avito.android.iac_dialer.impl_module.telecom;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.splitter.ab.configs.CoreTelecomIncomingCallsTestGroup;
import com.avito.android.iac_dialer.impl_module.splitter.ab.configs.CoreTelecomOutgoingCallsTestGroup;
import com.avito.android.iac_dialer.impl_module.telecom.impl.j;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.reflect.n;

/* compiled from: IacTelecomManagerSplitter.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/f;", "Lcom/avito/android/iac_dialer/impl_module/telecom/d;", "Lcom/avito/android/iac_dialer/impl_module/telecom/e;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes14.dex */
public final class f implements d, e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<j> f166413b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<com.avito.android.iac_dialer.impl_module.telecom.stub.c> f166414c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FK.a f166415d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.splitter.features.a f166416e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f166417f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f166418g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final F f166419h;

    /* compiled from: IacTelecomManagerSplitter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166420a;

        static {
            int[] iArr = new int[IacCallDirection.values().length];
            try {
                iArr[IacCallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacCallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166420a = iArr;
        }
    }

    @Inject
    public f(@k h31.e<j> eVar, @k h31.e<com.avito.android.iac_dialer.impl_module.telecom.stub.c> eVar2, @k FK.a aVar, @k com.avito.android.iac_dialer.impl_module.splitter.features.a aVar2, @k Context context, @k InterfaceC28373a interfaceC28373a, @k F f12) {
        this.f166413b = eVar;
        this.f166414c = eVar2;
        this.f166415d = aVar;
        this.f166416e = aVar2;
        this.f166417f = context;
        this.f166418g = interfaceC28373a;
        this.f166419h = f12;
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.e
    public final boolean a() {
        if (!(this.f166417f.checkSelfPermission("android.permission.MANAGE_OWN_CALLS") == 0)) {
            return false;
        }
        com.avito.android.iac_dialer.impl_module.splitter.features.a aVar = this.f166416e;
        aVar.getClass();
        n<Object>[] nVarArr = com.avito.android.iac_dialer.impl_module.splitter.features.a.f166390j;
        n<Object> nVar = nVarArr[5];
        if (!((Boolean) aVar.f166397h.a().invoke()).booleanValue()) {
            n<Object> nVar2 = nVarArr[4];
            if (!((Boolean) aVar.f166396g.a().invoke()).booleanValue()) {
                return false;
            }
            CoreTelecomOutgoingCallsTestGroup coreTelecomOutgoingCallsTestGroup = this.f166415d.b().f439745a.f439749b;
            coreTelecomOutgoingCallsTestGroup.getClass();
            if (coreTelecomOutgoingCallsTestGroup != CoreTelecomOutgoingCallsTestGroup.f166386d) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.d
    @l
    public final Object b(@k String str, @k IacCallDirection iacCallDirection, boolean z12, @l List<String> list, @k Y41.l<? super com.avito.android.iac_dialer.impl_module.telecom.a, G0> lVar, @k Y41.l<? super Throwable, G0> lVar2, @k Y41.a<G0> aVar, @k Y41.l<? super Boolean, G0> lVar3, @k Y41.l<? super TerminateReasonBundle, G0> lVar4, @k Y41.l<? super AudioState, G0> lVar5, @k Continuation<? super G0> continuation) {
        com.avito.android.iac_dialer.impl_module.telecom.stub.c cVar;
        boolean z13 = this.f166417f.checkSelfPermission("android.permission.MANAGE_OWN_CALLS") == 0;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacTelecomManagerSplitter", "permission.MANAGE_OWN_CALLS isGranted=" + z13, null);
        this.f166418g.c(new y.a(this.f166419h.a("calls.telecom.manage_own_calls_permission", iacCallDirection.toString(), String.valueOf(z13)).f91030a, 1L));
        int i12 = a.f166420a[iacCallDirection.ordinal()];
        h31.e<com.avito.android.iac_dialer.impl_module.telecom.stub.c> eVar = this.f166414c;
        h31.e<j> eVar2 = this.f166413b;
        FK.a aVar2 = this.f166415d;
        if (i12 == 1) {
            aVar2.b().b();
            cVar = a() ? eVar2.get() : eVar.get();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.a().b();
            cVar = c(list) ? eVar2.get() : eVar.get();
        }
        Object objB = cVar.b(str, iacCallDirection, z12, list, lVar, lVar2, aVar, lVar3, lVar4, lVar5, continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.e
    public final boolean c(@l List<String> list) {
        if (!(this.f166417f.checkSelfPermission("android.permission.MANAGE_OWN_CALLS") == 0)) {
            return false;
        }
        com.avito.android.iac_dialer.impl_module.splitter.features.a aVar = this.f166416e;
        aVar.getClass();
        n<Object>[] nVarArr = com.avito.android.iac_dialer.impl_module.splitter.features.a.f166390j;
        n<Object> nVar = nVarArr[3];
        if (((Boolean) aVar.f166395f.a().invoke()).booleanValue()) {
            return true;
        }
        if (list != null && list.contains("tag_buyer")) {
            n<Object> nVar2 = nVarArr[1];
            if (((Boolean) aVar.f166393d.a().invoke()).booleanValue()) {
                CoreTelecomIncomingCallsTestGroup coreTelecomIncomingCallsTestGroup = this.f166415d.a().f439745a.f439749b;
                coreTelecomIncomingCallsTestGroup.getClass();
                return coreTelecomIncomingCallsTestGroup == CoreTelecomIncomingCallsTestGroup.f166381d;
            }
        }
        n<Object> nVar3 = nVarArr[2];
        return ((Boolean) aVar.f166394e.a().invoke()).booleanValue();
    }
}
