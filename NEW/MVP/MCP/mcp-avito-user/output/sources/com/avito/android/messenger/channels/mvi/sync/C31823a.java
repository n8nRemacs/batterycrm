package com.avito.android.messenger.channels.mvi.sync;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C31823a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f188420a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MessengerUserHashInfo f188421b;

    /* renamed from: c, reason: collision with root package name */
    public final long f188422c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final MarkAction f188423d;

    /* compiled from: MessengerReadStatusSyncAgent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5554a {
        static {
            int[] iArr = new int[MarkAction.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MarkAction markAction = MarkAction.f188362b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C31823a(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo, long j12, @Y61.k MarkAction markAction) {
        this.f188420a = str;
        this.f188421b = messengerUserHashInfo;
        this.f188422c = j12;
        this.f188423d = markAction;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31823a)) {
            return false;
        }
        C31823a c31823a = (C31823a) obj;
        return kotlin.jvm.internal.L.f(this.f188420a, c31823a.f188420a) && kotlin.jvm.internal.L.f(this.f188421b, c31823a.f188421b) && this.f188422c == c31823a.f188422c && this.f188423d == c31823a.f188423d;
    }

    public final int hashCode() {
        return this.f188423d.hashCode() + androidx.appcompat.app.r.g((this.f188421b.hashCode() + (this.f188420a.hashCode() * 31)) * 31, 31, this.f188422c);
    }

    @Y61.k
    public final String toString() {
        return "ChannelReadRequest(channelId=" + this.f188420a + ", userInfo=" + this.f188421b + ", readLocallyTimeStamp=" + this.f188422c + ", action=" + this.f188423d + ')';
    }
}
