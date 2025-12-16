package com.avito.android.authorization.auto_recovery;

import com.avito.android.authorization.generated.api.ar_flow_v_2.ArFlowV2Response;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import kotlin.Metadata;

/* compiled from: AutoRecoveryAvailabilityInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_authorization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: AutoRecoveryAvailabilityInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93076a;

        static {
            int[] iArr = new int[ArFlowV2Response.Flow.values().length];
            try {
                iArr[ArFlowV2Response.Flow.Reject.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArFlowV2Response.Flow.Support.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArFlowV2Response.Flow.FormReject.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ArFlowV2Response.Flow.FormSupport.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ArFlowV2Response.Flow.ResolutionSupport.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ArFlowV2Response.Flow.ResolutionReject.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f93076a = iArr;
        }
    }

    public static final BeduinUniversalPageLink a(String str) {
        return new BeduinUniversalPageLink(str, null, null, null, null, null, null, 120, null);
    }
}
