package ru.avito.messenger.api.entity;

import Y61.k;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CreateVoiceFileResponse.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lru/avito/messenger/api/entity/CreateVoiceFileResponse;", "", "fileId", "", MessageBody.Voice.VOICE_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getFileId", "()Ljava/lang/String;", "getVoiceId", "Companion", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateVoiceFileResponse {

    @c("fileId")
    @k
    private final String fileId;

    @c(MessageBody.Voice.VOICE_ID)
    @k
    private final String voiceId;

    public CreateVoiceFileResponse(@k String str, @k String str2) {
        this.fileId = str;
        this.voiceId = str2;
    }

    @k
    public final String getFileId() {
        return this.fileId;
    }

    @k
    public final String getVoiceId() {
        return this.voiceId;
    }
}
