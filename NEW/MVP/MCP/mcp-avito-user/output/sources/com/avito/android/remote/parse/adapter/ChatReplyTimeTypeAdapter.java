package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.messenger.context.ChatReplyTime;
import com.avito.android.util.C2;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ChatReplyTimeTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ChatReplyTimeTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/context/ChatReplyTime;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChatReplyTimeTypeAdapter implements com.google.gson.o<ChatReplyTime>, com.google.gson.h<ChatReplyTime> {

    /* compiled from: ChatReplyTimeTypeAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f254162a;

        static {
            int[] iArr = new int[ChatReplyTime.ActionType.values().length];
            try {
                iArr[ChatReplyTime.ActionType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatReplyTime.ActionType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f254162a = iArr;
        }
    }

    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        String key;
        ChatReplyTime chatReplyTime = (ChatReplyTime) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.t("text", nVar.c(chatReplyTime.getText()));
        if (chatReplyTime.getTime() != null) {
            kVar.t(CrashHianalyticsData.TIME, nVar.c(chatReplyTime.getTime()));
        }
        int i12 = a.f254162a[chatReplyTime.getActionType().ordinal()];
        if (i12 == 1) {
            key = ChatReplyTime.ActionType.CALL.getKey();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            key = ChatReplyTime.ActionType.DEFAULT.getKey();
        }
        kVar.y("type", key);
        return kVar;
    }

    @Override // com.google.gson.h
    public final ChatReplyTime deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        if (iVar instanceof com.google.gson.j) {
            return null;
        }
        if (!(iVar instanceof com.google.gson.k)) {
            throw new IllegalArgumentException("Expected object or null. but got: " + iVar);
        }
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("text").s();
        Long lB2 = C2.b(kVarI, CrashHianalyticsData.TIME);
        String strC = C2.c(kVarI, "type");
        ChatReplyTime.ActionType actionType = ChatReplyTime.ActionType.CALL;
        if (!kotlin.jvm.internal.L.f(strC, actionType.getKey())) {
            actionType = ChatReplyTime.ActionType.DEFAULT;
        }
        return new ChatReplyTime(actionType, strS, lB2);
    }
}
