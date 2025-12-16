package com.avito.avcalls.android.logger;

import Y61.k;
import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import com.avito.avcalls.android.logger.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: CallbackLogger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/logger/b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f331740a;

    /* compiled from: CallbackLogger.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AvCallsLoggingConfiguration.SdkSeverity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvCallsLoggingConfiguration.SdkSeverity sdkSeverity = AvCallsLoggingConfiguration.SdkSeverity.f331729b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvCallsLoggingConfiguration.SdkSeverity sdkSeverity2 = AvCallsLoggingConfiguration.SdkSeverity.f331729b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AvCallsLoggingConfiguration.SdkSeverity sdkSeverity3 = AvCallsLoggingConfiguration.SdkSeverity.f331729b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(@k f fVar) {
        AvCallsLoggingConfiguration.SdkSeverity sdkSeverity = AvCallsLoggingConfiguration.SdkSeverity.f331729b;
        this.f331740a = fVar;
    }

    public final void a(String str, a.AbstractC10309a.b.AbstractC10311a abstractC10311a, String str2) {
        boolean zF2 = L.f(abstractC10311a, a.AbstractC10309a.b.AbstractC10311a.c.f331739a);
        AvCallsLoggingConfiguration.SdkSeverity sdkSeverity = AvCallsLoggingConfiguration.SdkSeverity.f331729b;
        if (!zF2 && !L.f(abstractC10311a, a.AbstractC10309a.b.AbstractC10311a.C10312a.f331737a) && !(abstractC10311a instanceof a.AbstractC10309a.b.AbstractC10311a.C10313b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f331740a.b(new com.avito.avcalls.android.logger.a(str, new a.AbstractC10309a.b(abstractC10311a), str2));
    }
}
