package com.avito.android.iac_dialer.impl_module.telecom.impl;

import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: IacConnection.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/impl/a;", "Lcom/avito/android/iac_dialer/impl_module/telecom/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.iac_dialer.impl_module.telecom.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.telecom.impl.b f166429a;

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacCallControlImpl", f = "IacConnection.kt", i = {}, l = {303}, m = "answer-gIAlu-s", n = {}, s = {})
    /* renamed from: com.avito.android.iac_dialer.impl_module.telecom.impl.a$a, reason: collision with other inner class name */
    public static final class C4941a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f166430q;

        /* renamed from: s, reason: collision with root package name */
        public int f166432s;

        public C4941a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f166430q = obj;
            this.f166432s |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objE = a.this.e(false, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Z.a(objE);
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f166434m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12) {
            super(0);
            this.f166434m = z12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f166429a.setVideoState(this.f166434m ? 3 : 0);
            return G0.f406611a;
        }
    }

    /* compiled from: IacConnection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.telecom.impl.IacCallControlImpl", f = "IacConnection.kt", i = {}, l = {298}, m = "setActive-IoAF18A", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f166435q;

        /* renamed from: s, reason: collision with root package name */
        public int f166437s;

        public c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f166435q = obj;
            this.f166437s |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objA = a.this.a(this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Z.a(objA);
        }
    }

    public a(@Y61.k com.avito.android.iac_dialer.impl_module.telecom.impl.b bVar) {
        this.f166429a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<kotlin.G0>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.iac_dialer.impl_module.telecom.impl.a.c
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.iac_dialer.impl_module.telecom.impl.a$c r0 = (com.avito.android.iac_dialer.impl_module.telecom.impl.a.c) r0
            int r1 = r0.f166437s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f166437s = r1
            goto L1a
        L13:
            com.avito.android.iac_dialer.impl_module.telecom.impl.a$c r0 = new com.avito.android.iac_dialer.impl_module.telecom.impl.a$c
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f166435q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f166437s
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r8)
            kotlin.Z r8 = (kotlin.Z) r8
            java.lang.Object r8 = r8.f406625b
            goto L53
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.C42729a0.b(r8)
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r8 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
            com.avito.android.iac_dialer.impl_module.telecom.impl.b r2 = r7.f166429a
            java.lang.String r4 = r2.a()
            r5 = 0
            java.lang.String r6 = "control: setActive"
            r8.a(r4, r6, r5)
            r0.f166437s = r3
            com.avito.android.iac_dialer.impl_module.telecom.impl.d r8 = com.avito.android.iac_dialer.impl_module.telecom.impl.d.f166454l
            java.lang.Object r8 = r2.c(r8, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.telecom.impl.a.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    public final void b(@Y61.k TerminateReasonBundle terminateReasonBundle) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        com.avito.android.iac_dialer.impl_module.telecom.impl.b bVar2 = this.f166429a;
        bVar.a(bVar2.a(), "control: disconnect(reason=" + terminateReasonBundle + ')', null);
        com.avito.android.iac_dialer.impl_module.telecom.impl.b.d(bVar2, "callControl.disconnect", terminateReasonBundle, null, 4);
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    public final boolean c() {
        return true;
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    public final void d(@Y61.k AudioDevice audioDevice) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        com.avito.android.iac_dialer.impl_module.telecom.impl.b bVar2 = this.f166429a;
        bVar.a(bVar2.a(), "control: requestAudioDevice(device=" + audioDevice + ')', null);
        bVar2.b("requestAudioDevice(" + audioDevice + ')');
        C43259k.d(bVar2.f166438a.getCallScope(), null, null, new g(bVar2, audioDevice, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<kotlin.G0>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.avito.android.iac_dialer.impl_module.telecom.impl.a.C4941a
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.iac_dialer.impl_module.telecom.impl.a$a r0 = (com.avito.android.iac_dialer.impl_module.telecom.impl.a.C4941a) r0
            int r1 = r0.f166432s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f166432s = r1
            goto L1a
        L13:
            com.avito.android.iac_dialer.impl_module.telecom.impl.a$a r0 = new com.avito.android.iac_dialer.impl_module.telecom.impl.a$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f166430q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f166432s
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r9)
            kotlin.Z r9 = (kotlin.Z) r9
            java.lang.Object r8 = r9.f406625b
            goto L67
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.C42729a0.b(r9)
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r9 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
            com.avito.android.iac_dialer.impl_module.telecom.impl.b r2 = r7.f166429a
            java.lang.String r4 = r2.a()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "control: answer(isVideo="
            r5.<init>(r6)
            r5.append(r8)
            r6 = 41
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = 0
            r9.a(r4, r5, r6)
            com.avito.android.iac_dialer.impl_module.telecom.impl.a$b r9 = new com.avito.android.iac_dialer.impl_module.telecom.impl.a$b
            r9.<init>(r8)
            r0.f166432s = r3
            java.lang.Object r8 = r2.c(r9, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.telecom.impl.a.e(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
