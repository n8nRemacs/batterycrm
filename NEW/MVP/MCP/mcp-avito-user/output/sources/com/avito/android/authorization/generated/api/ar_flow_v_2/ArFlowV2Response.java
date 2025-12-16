package com.avito.android.authorization.generated.api.ar_flow_v_2;

import Y61.k;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ArFlowV2Response.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response;", "", "Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response$Flow;", MessageBody.SystemMessageBody.Platform.FLOW, "<init>", "(Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response$Flow;)V", "Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response$Flow;", "a", "()Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response$Flow;", "Flow", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ArFlowV2Response {

    @c(MessageBody.SystemMessageBody.Platform.FLOW)
    @k
    private final Flow flow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArFlowV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/authorization/generated/api/ar_flow_v_2/ArFlowV2Response$Flow;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Support", "ResolutionSupport", "FormSupport", "FormReject", "ResolutionReject", "Reject", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Flow {

        @c("form-reject")
        public static final Flow FormReject;

        @c("form-support")
        public static final Flow FormSupport;

        @c("reject")
        public static final Flow Reject;

        @c("resolution-reject")
        public static final Flow ResolutionReject;

        @c("resolution-support")
        public static final Flow ResolutionSupport;

        @c(AttachMenuItem.Support.KEY)
        public static final Flow Support;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Flow[] f93855b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f93856c;

        static {
            Flow flow = new Flow("Support", 0, AttachMenuItem.Support.KEY);
            Support = flow;
            Flow flow2 = new Flow("ResolutionSupport", 1, "resolution-support");
            ResolutionSupport = flow2;
            Flow flow3 = new Flow("FormSupport", 2, "form-support");
            FormSupport = flow3;
            Flow flow4 = new Flow("FormReject", 3, "form-reject");
            FormReject = flow4;
            Flow flow5 = new Flow("ResolutionReject", 4, "resolution-reject");
            ResolutionReject = flow5;
            Flow flow6 = new Flow("Reject", 5, "reject");
            Reject = flow6;
            Flow[] flowArr = {flow, flow2, flow3, flow4, flow5, flow6};
            f93855b = flowArr;
            f93856c = kotlin.enums.c.a(flowArr);
        }

        private Flow(String str, int i12, String str2) {
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) f93855b.clone();
        }
    }

    public ArFlowV2Response(@k Flow flow) {
        this.flow = flow;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Flow getFlow() {
        return this.flow;
    }
}
