package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallDirection;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.camera.IacCameraPosition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: AvCallsBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30853v {

    /* compiled from: AvCallsBootstrap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.v$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165404a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f165405b;

        static {
            int[] iArr = new int[AvCallsCallDirection.values().length];
            try {
                iArr[AvCallsCallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvCallsCallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f165404a = iArr;
            int[] iArr2 = new int[AvCallsCameraPosition.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AvCallsCameraPosition avCallsCameraPosition = AvCallsCameraPosition.f164614b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[IacCameraPosition.values().length];
            try {
                iArr3[IacCameraPosition.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[IacCameraPosition.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f165405b = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState a(com.avito.android.iac_avcalls.public_module.models.AvCallsCallState r36, com.avito.android.deep_linking.x r37) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.C30853v.a(com.avito.android.iac_avcalls.public_module.models.AvCallsCallState, com.avito.android.deep_linking.x):com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState");
    }

    public static final DeepLink b(com.avito.android.deep_linking.x xVar, String str) {
        if (str == null) {
            return null;
        }
        Object objC = xVar.c(str);
        int i12 = kotlin.Z.f406624c;
        if (objC instanceof Z.b) {
            objC = null;
        }
        DeepLink deepLink = (DeepLink) objC;
        if (deepLink == null || (deepLink instanceof NoMatchLink)) {
            return null;
        }
        return deepLink;
    }

    public static final TerminateReason c(AvCallsTerminateReason avCallsTerminateReason) {
        if (kotlin.jvm.internal.L.f(avCallsTerminateReason, AvCallsTerminateReason.AnswerTimeout.INSTANCE)) {
            return TerminateReason.AnswerTimeout.INSTANCE;
        }
        if (kotlin.jvm.internal.L.f(avCallsTerminateReason, AvCallsTerminateReason.Busy.INSTANCE)) {
            return TerminateReason.Busy.INSTANCE;
        }
        if (kotlin.jvm.internal.L.f(avCallsTerminateReason, AvCallsTerminateReason.ConnectTimeout.INSTANCE)) {
            return TerminateReason.ConnectTimeout.INSTANCE;
        }
        if (kotlin.jvm.internal.L.f(avCallsTerminateReason, AvCallsTerminateReason.Hangup.INSTANCE)) {
            return TerminateReason.Hangup.INSTANCE;
        }
        if (kotlin.jvm.internal.L.f(avCallsTerminateReason, AvCallsTerminateReason.InternalError.INSTANCE)) {
            return TerminateReason.InternalError.INSTANCE;
        }
        if (kotlin.jvm.internal.L.f(avCallsTerminateReason, AvCallsTerminateReason.NoMicAccess.INSTANCE)) {
            return TerminateReason.NoMicAccess.INSTANCE;
        }
        if (kotlin.jvm.internal.L.f(avCallsTerminateReason, AvCallsTerminateReason.Reject.INSTANCE)) {
            return TerminateReason.Reject.INSTANCE;
        }
        if (kotlin.jvm.internal.L.f(avCallsTerminateReason, AvCallsTerminateReason.ServerError.INSTANCE)) {
            return TerminateReason.ServerError.INSTANCE;
        }
        if (avCallsTerminateReason instanceof AvCallsTerminateReason.Unknown) {
            return new TerminateReason.Unknown(((AvCallsTerminateReason.Unknown) avCallsTerminateReason).getReason());
        }
        throw new NoWhenBranchMatchedException();
    }
}
