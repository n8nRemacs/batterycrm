package com.avito.android.offlinization.analytics;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.offlinization.analytics.events.OfflineModeAction;
import com.avito.android.offlinization.q;
import com.avito.android.offlinization.ui.j;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import m40.e;
import w40.InterfaceC49441a;

/* compiled from: OfflineModeSwitchTracker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/analytics/b;", "Lcom/avito/android/offlinization/analytics/a;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.offlinization.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49441a f208479a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f208480b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final q f208481c;

    /* compiled from: OfflineModeSwitchTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "enabled", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.offlinization.analytics.OfflneModeSwitchTrackerImpl$subscribe$1", f = "OfflineModeSwitchTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ boolean f208482q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f208482q = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            OfflineModeAction offlineModeAction;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            boolean z12 = this.f208482q;
            InterfaceC28373a interfaceC28373a = b.this.f208480b;
            if (z12) {
                offlineModeAction = OfflineModeAction.f208508c;
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                offlineModeAction = OfflineModeAction.f208509d;
            }
            interfaceC28373a.c(new e(offlineModeAction));
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k InterfaceC49441a interfaceC49441a, @k InterfaceC28373a interfaceC28373a, @k q qVar) {
        this.f208479a = interfaceC49441a;
        this.f208480b = interfaceC28373a;
        this.f208481c = qVar;
    }

    @Override // com.avito.android.offlinization.analytics.a
    public final void b() {
        if (this.f208481c.a()) {
            com.avito.android.offlinization.ui.k.a(j.f208637l, new C43197r1(new a(null), C43175k.t(this.f208479a.a(), 1)));
        }
    }
}
