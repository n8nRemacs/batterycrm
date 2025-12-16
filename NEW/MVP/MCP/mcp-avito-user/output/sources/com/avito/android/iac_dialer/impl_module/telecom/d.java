package com.avito.android.iac_dialer.impl_module.telecom;

import Y61.k;
import Y61.l;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.N;

/* compiled from: IacTelecomManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/d;", "", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f166409a = a.f166410a;

    /* compiled from: IacTelecomManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/d$a;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f166410a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static N f166411b = C4940a.f166412l;

        /* compiled from: IacTelecomManager.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.telecom.d$a$a, reason: collision with other inner class name */
        public static final class C4940a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C4940a f166412l = new C4940a();

            public C4940a() {
                super(0);
            }

            @Override // Y41.a
            public final /* bridge */ /* synthetic */ G0 invoke() {
                return G0.f406611a;
            }
        }
    }

    @l
    Object b(@k String str, @k IacCallDirection iacCallDirection, boolean z12, @l List<String> list, @k Y41.l<? super com.avito.android.iac_dialer.impl_module.telecom.a, G0> lVar, @k Y41.l<? super Throwable, G0> lVar2, @k Y41.a<G0> aVar, @k Y41.l<? super Boolean, G0> lVar3, @k Y41.l<? super TerminateReasonBundle, G0> lVar4, @k Y41.l<? super AudioState, G0> lVar5, @k Continuation<? super G0> continuation);
}
