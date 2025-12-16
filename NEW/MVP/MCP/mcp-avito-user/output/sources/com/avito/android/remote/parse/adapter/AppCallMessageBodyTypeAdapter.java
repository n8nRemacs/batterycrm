package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.messenger.message.MessageBody;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AppCallMessageBodyTypeAdapter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AppCallMessageBodyTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$AppCall;", "Lcom/google/gson/h;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AppCallMessageBodyTypeAdapter implements com.google.gson.o<MessageBody.AppCall>, com.google.gson.h<MessageBody.AppCall> {

    /* compiled from: AppCallMessageBodyTypeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AppCallMessageBodyTypeAdapter$a;", "", "<init>", "()V", "", "CALL_ID_JSON_KEY", "Ljava/lang/String;", "CALL_JSON_KEY", "DIRECTION_INCOMING_JSON_VALUE", "DIRECTION_JSON_KEY", "DIRECTION_OUTGOING_JSON_VALUE", "DURATION_JSON_KEY", "IS_VIDEO_JSON_KEY", "STATUS_BUSY_JSON_VALUE", "STATUS_CANCELED_JSON_VALUE", "STATUS_JSON_KEY", "STATUS_MISSED_JSON_VALUE", "STATUS_NOT_DELIVERED_JSON_VALUE", "STATUS_REJECTED_JSON_VALUE", "STATUS_SUCCESS_JSON_VALUE", "SUBTITLE_JSON_KEY", "TEXT_JSON_KEY", "TITLE_JSON_KEY", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        String name;
        String name2;
        MessageBody.AppCall appCall = (MessageBody.AppCall) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.y(MessageBody.RANDOM_ID, appCall.getRandomId());
        kVar.t("text", nVar.c(appCall.getText()));
        kVar.t("call", nVar.c(appCall.getCall()));
        String callId = appCall.getCallId();
        if (callId != null) {
            kVar.t(FailedBinderCallBack.CALLER_ID, nVar.c(callId));
        }
        Long duration = appCall.getDuration();
        if (duration != null) {
            kVar.t("duration", nVar.c(Long.valueOf(duration.longValue())));
        }
        MessageBody.AppCall.Direction direction = appCall.getDirection();
        if (direction != null) {
            if (direction.equals(MessageBody.AppCall.Direction.Incoming.INSTANCE)) {
                name2 = "in";
            } else if (direction.equals(MessageBody.AppCall.Direction.Outgoing.INSTANCE)) {
                name2 = "out";
            } else {
                if (!(direction instanceof MessageBody.AppCall.Direction.Unsupported)) {
                    throw new NoWhenBranchMatchedException();
                }
                name2 = ((MessageBody.AppCall.Direction.Unsupported) direction).getName();
            }
            if (name2 != null) {
                kVar.t("direction", nVar.c(name2));
            }
        }
        MessageBody.AppCall.Status status = appCall.getStatus();
        if (status != null) {
            if (status.equals(MessageBody.AppCall.Status.Busy.INSTANCE)) {
                name = "busy";
            } else if (status.equals(MessageBody.AppCall.Status.Canceled.INSTANCE)) {
                name = "cancelled";
            } else if (status.equals(MessageBody.AppCall.Status.Missed.INSTANCE)) {
                name = "missed";
            } else if (status.equals(MessageBody.AppCall.Status.NotDelivered.INSTANCE)) {
                name = "not_delivered";
            } else if (status.equals(MessageBody.AppCall.Status.Rejected.INSTANCE)) {
                name = "rejected";
            } else if (status.equals(MessageBody.AppCall.Status.Success.INSTANCE)) {
                name = "success";
            } else {
                if (!(status instanceof MessageBody.AppCall.Status.Unsupported)) {
                    throw new NoWhenBranchMatchedException();
                }
                name = ((MessageBody.AppCall.Status.Unsupported) status).getName();
            }
            if (name != null) {
                kVar.t("status", nVar.c(name));
            }
        }
        String title = appCall.getTitle();
        if (title != null) {
            kVar.t("title", nVar.c(title));
        }
        String subtitle = appCall.getSubtitle();
        if (subtitle != null) {
            kVar.t("subTitle", nVar.c(subtitle));
        }
        Boolean boolIsVideo = appCall.isVideo();
        if (boolIsVideo != null) {
            kVar.t("isVideo", nVar.c(boolIsVideo));
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:4:0x0010, B:6:0x0042, B:12:0x0053, B:14:0x005b, B:18:0x0065, B:20:0x006d, B:22:0x0074, B:24:0x007c, B:26:0x0083, B:28:0x008b, B:30:0x0091, B:32:0x0099, B:38:0x00ae, B:40:0x00b6, B:42:0x00bc, B:43:0x00c0, B:45:0x00c4, B:48:0x00cd, B:71:0x0113, B:50:0x00d1, B:53:0x00da, B:54:0x00dd, B:57:0x00e6, B:58:0x00e9, B:61:0x00f2, B:62:0x00f5, B:65:0x00fe, B:66:0x0101, B:69:0x010a, B:70:0x010d, B:34:0x009d, B:36:0x00a5, B:37:0x00a8, B:9:0x0048), top: B:77:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:4:0x0010, B:6:0x0042, B:12:0x0053, B:14:0x005b, B:18:0x0065, B:20:0x006d, B:22:0x0074, B:24:0x007c, B:26:0x0083, B:28:0x008b, B:30:0x0091, B:32:0x0099, B:38:0x00ae, B:40:0x00b6, B:42:0x00bc, B:43:0x00c0, B:45:0x00c4, B:48:0x00cd, B:71:0x0113, B:50:0x00d1, B:53:0x00da, B:54:0x00dd, B:57:0x00e6, B:58:0x00e9, B:61:0x00f2, B:62:0x00f5, B:65:0x00fe, B:66:0x0101, B:69:0x010a, B:70:0x010d, B:34:0x009d, B:36:0x00a5, B:37:0x00a8, B:9:0x0048), top: B:77:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:4:0x0010, B:6:0x0042, B:12:0x0053, B:14:0x005b, B:18:0x0065, B:20:0x006d, B:22:0x0074, B:24:0x007c, B:26:0x0083, B:28:0x008b, B:30:0x0091, B:32:0x0099, B:38:0x00ae, B:40:0x00b6, B:42:0x00bc, B:43:0x00c0, B:45:0x00c4, B:48:0x00cd, B:71:0x0113, B:50:0x00d1, B:53:0x00da, B:54:0x00dd, B:57:0x00e6, B:58:0x00e9, B:61:0x00f2, B:62:0x00f5, B:65:0x00fe, B:66:0x0101, B:69:0x010a, B:70:0x010d, B:34:0x009d, B:36:0x00a5, B:37:0x00a8, B:9:0x0048), top: B:77:0x0010 }] */
    @Override // com.google.gson.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.messenger.message.MessageBody.AppCall deserialize(com.google.gson.i r17, java.lang.reflect.Type r18, com.google.gson.g r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.AppCallMessageBodyTypeAdapter.deserialize(com.google.gson.i, java.lang.reflect.Type, com.google.gson.g):java.lang.Object");
    }
}
