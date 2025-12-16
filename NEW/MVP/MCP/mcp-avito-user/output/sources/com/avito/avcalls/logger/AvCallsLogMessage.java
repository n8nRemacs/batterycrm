package com.avito.avcalls.logger;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsLogMessage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/logger/AvCallsLogMessage;", "", "Kind", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvCallsLogMessage {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Kind f332927a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f332928b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LogSeverity f332929c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f332930d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Exception f332931e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvCallsLogMessage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/logger/AvCallsLogMessage$Kind;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Kind {

        /* renamed from: b, reason: collision with root package name */
        public static final Kind f332932b;

        /* renamed from: c, reason: collision with root package name */
        public static final Kind f332933c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Kind[] f332934d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f332935e;

        static {
            Kind kind = new Kind("Sdk", 0);
            f332932b = kind;
            Kind kind2 = new Kind("Rtc", 1);
            f332933c = kind2;
            Kind[] kindArr = {kind, kind2};
            f332934d = kindArr;
            f332935e = kotlin.enums.c.a(kindArr);
        }

        public Kind() {
            throw null;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f332934d.clone();
        }
    }

    public AvCallsLogMessage(@k Kind kind, @k String str, @k LogSeverity logSeverity, @k String str2, @l Exception exc) {
        this.f332927a = kind;
        this.f332928b = str;
        this.f332929c = logSeverity;
        this.f332930d = str2;
        this.f332931e = exc;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvCallsLogMessage)) {
            return false;
        }
        AvCallsLogMessage avCallsLogMessage = (AvCallsLogMessage) obj;
        return this.f332927a == avCallsLogMessage.f332927a && L.f(this.f332928b, avCallsLogMessage.f332928b) && this.f332929c == avCallsLogMessage.f332929c && L.f(this.f332930d, avCallsLogMessage.f332930d) && L.f(this.f332931e, avCallsLogMessage.f332931e);
    }

    public final int hashCode() {
        int iD2 = H.d((this.f332929c.hashCode() + H.d(this.f332927a.hashCode() * 31, 31, this.f332928b)) * 31, 31, this.f332930d);
        Exception exc = this.f332931e;
        return iD2 + (exc == null ? 0 : exc.hashCode());
    }

    @k
    public final String toString() {
        return "AvCallsLogMessage(kind=" + this.f332927a + ", tag=" + this.f332928b + ", severity=" + this.f332929c + ", message=" + this.f332930d + ", error=" + this.f332931e + ')';
    }
}
