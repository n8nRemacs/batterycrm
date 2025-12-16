package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.video.VideoInfo;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VideoInfoSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/Q0;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Q0 extends S20.a<b> {

    /* compiled from: VideoInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/Q0$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: VideoInfoSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<String, VideoInfo> f194684a;

        public b(@Y61.k Map<String, VideoInfo> map) {
            this.f194684a = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f194684a, ((b) obj).f194684a);
        }

        public final int hashCode() {
            return this.f194684a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.w(new StringBuilder("State(videoInfoById="), this.f194684a, ')');
        }
    }

    void Cb(@Y61.k ArrayList arrayList);
}
