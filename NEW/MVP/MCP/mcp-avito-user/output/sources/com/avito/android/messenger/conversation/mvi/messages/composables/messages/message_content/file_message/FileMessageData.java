package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileMessageData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/file_message/FileMessageData;", "", "IconState", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FileMessageData {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f192469a;

    /* renamed from: b, reason: collision with root package name */
    public final long f192470b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IconState f192471c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FileMessageData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/file_message/FileMessageData$IconState;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconState {

        /* renamed from: b, reason: collision with root package name */
        public static final IconState f192472b;

        /* renamed from: c, reason: collision with root package name */
        public static final IconState f192473c;

        /* renamed from: d, reason: collision with root package name */
        public static final IconState f192474d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ IconState[] f192475e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f192476f;

        static {
            IconState iconState = new IconState("TRANSFER_IN_PROGRESS", 0);
            f192472b = iconState;
            IconState iconState2 = new IconState("DOWNLOAD_BUTTON", 1);
            f192473c = iconState2;
            IconState iconState3 = new IconState("FILE_ICON", 2);
            f192474d = iconState3;
            IconState[] iconStateArr = {iconState, iconState2, iconState3};
            f192475e = iconStateArr;
            f192476f = kotlin.enums.c.a(iconStateArr);
        }

        public IconState() {
            throw null;
        }

        public static IconState valueOf(String str) {
            return (IconState) Enum.valueOf(IconState.class, str);
        }

        public static IconState[] values() {
            return (IconState[]) f192475e.clone();
        }
    }

    public FileMessageData(@k String str, long j12, @k IconState iconState) {
        this.f192469a = str;
        this.f192470b = j12;
        this.f192471c = iconState;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileMessageData)) {
            return false;
        }
        FileMessageData fileMessageData = (FileMessageData) obj;
        return L.f(this.f192469a, fileMessageData.f192469a) && this.f192470b == fileMessageData.f192470b && this.f192471c == fileMessageData.f192471c;
    }

    public final int hashCode() {
        return this.f192471c.hashCode() + r.g(this.f192469a.hashCode() * 31, 31, this.f192470b);
    }

    @k
    public final String toString() {
        return "FileMessageData(name=" + this.f192469a + ", size=" + this.f192470b + ", iconState=" + this.f192471c + ')';
    }
}
