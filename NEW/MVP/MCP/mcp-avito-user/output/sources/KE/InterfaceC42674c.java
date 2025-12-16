package ke;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ArCodeRequestV2Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lke/c;", "", "a", "b", "Lke/c$a;", "Lke/c$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ke.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC42674c {

    /* compiled from: ArCodeRequestV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lke/c$a;", "Lke/c;", "Lke/a;", "messages", "<init>", "(Lke/a;)V", "Lke/a;", "a", "()Lke/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ke.c$a */
    public static final class a implements InterfaceC42674c {

        @com.google.gson.annotations.c("messages")
        @k
        private final C42672a messages;

        public a(@k C42672a c42672a) {
            this.messages = c42672a;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C42672a getMessages() {
            return this.messages;
        }
    }

    /* compiled from: ArCodeRequestV2Response.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lke/c$b;", "Lke/c;", "", "isPhoneUsed", "", "lastTryTime", "nextTryTime", "<init>", "(ZJJ)V", "Z", "c", "()Z", "J", "a", "()J", "b", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ke.c$b */
    public static final class b implements InterfaceC42674c {

        @com.google.gson.annotations.c("isPhoneUsed")
        private final boolean isPhoneUsed;

        @com.google.gson.annotations.c("lastTryTime")
        private final long lastTryTime;

        @com.google.gson.annotations.c("nextTryTime")
        private final long nextTryTime;

        public b(boolean z12, long j12, long j13) {
            this.isPhoneUsed = z12;
            this.lastTryTime = j12;
            this.nextTryTime = j13;
        }

        /* renamed from: a, reason: from getter */
        public final long getLastTryTime() {
            return this.lastTryTime;
        }

        /* renamed from: b, reason: from getter */
        public final long getNextTryTime() {
            return this.nextTryTime;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsPhoneUsed() {
            return this.isPhoneUsed;
        }
    }
}
