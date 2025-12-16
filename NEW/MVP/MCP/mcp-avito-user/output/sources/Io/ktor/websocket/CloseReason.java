package io.ktor.websocket;

import androidx.compose.runtime.C22026a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CloseReason.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/websocket/CloseReason;", "", "Codes", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CloseReason {

    /* renamed from: a, reason: collision with root package name */
    public final short f401388a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f401389b;

    /* compiled from: CloseReason.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes;", "", "a", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Codes {
        NORMAL(1000),
        /* JADX INFO: Fake field, exist only in values array */
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        /* JADX INFO: Fake field, exist only in values array */
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_CONSISTENT(1007),
        /* JADX INFO: Fake field, exist only in values array */
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        /* JADX INFO: Fake field, exist only in values array */
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        /* JADX INFO: Fake field, exist only in values array */
        SERVICE_RESTART(1012),
        /* JADX INFO: Fake field, exist only in values array */
        TRY_AGAIN_LATER(1013);


        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f401390c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final LinkedHashMap f401391d;

        /* renamed from: b, reason: collision with root package name */
        public final short f401398b;

        /* compiled from: CloseReason.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes$a;", "", "<init>", "()V", "", "", "Lio/ktor/websocket/CloseReason$Codes;", "byCodeMap", "Ljava/util/Map;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            Codes[] codesArrValues = values();
            int iF2 = P0.f(codesArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
            for (Codes codes : codesArrValues) {
                linkedHashMap.put(Short.valueOf(codes.f401398b), codes);
            }
            f401391d = linkedHashMap;
        }

        Codes(short s5) {
            this.f401398b = s5;
        }
    }

    public CloseReason(@Y61.k String str, short s5) {
        this.f401388a = s5;
        this.f401389b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseReason)) {
            return false;
        }
        CloseReason closeReason = (CloseReason) obj;
        return this.f401388a == closeReason.f401388a && kotlin.jvm.internal.L.f(this.f401389b, closeReason.f401389b);
    }

    public final int hashCode() {
        return this.f401389b.hashCode() + (Short.hashCode(this.f401388a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloseReason(reason=");
        Codes.f401390c.getClass();
        LinkedHashMap linkedHashMap = Codes.f401391d;
        short s5 = this.f401388a;
        Object objValueOf = (Codes) linkedHashMap.get(Short.valueOf(s5));
        if (objValueOf == null) {
            objValueOf = Short.valueOf(s5);
        }
        sb2.append(objValueOf);
        sb2.append(", message=");
        return C22026a.c(sb2, this.f401389b, ')');
    }

    public CloseReason(@Y61.k Codes codes, @Y61.k String str) {
        this(str, codes.f401398b);
    }
}
