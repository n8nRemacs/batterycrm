package com.avito.avcalls.signaling;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SignalingError.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/avcalls/signaling/v;", "", "Companion", "a", "b", "c", "d", "e", "f", "Lcom/avito/avcalls/signaling/v$a;", "Lcom/avito/avcalls/signaling/v$b;", "Lcom/avito/avcalls/signaling/v$d;", "Lcom/avito/avcalls/signaling/v$e;", "Lcom/avito/avcalls/signaling/v$f;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class v {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f333437a;

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/signaling/v$a;", "Lcom/avito/avcalls/signaling/v;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends v {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f333438b = new a();

        public a() {
            super("bad_request", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 558878620;
        }

        @Y61.k
        public final String toString() {
            return "BadRequest";
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/signaling/v$b;", "Lcom/avito/avcalls/signaling/v;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends v {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f333439b = new b();

        public b() {
            super("call_not_exist", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 51228852;
        }

        @Y61.k
        public final String toString() {
            return "CallNotExist";
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/avcalls/signaling/v$c;", "", "<init>", "()V", "", "BAD_REQUEST", "Ljava/lang/String;", "CALL_NOT_EXIST_CODE", "HANDLED_ELSEWHERE_CODE", "SERVER_ERROR", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.signaling.v$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Y61.k
        public static v a(@Y61.k String str) {
            switch (str.hashCode()) {
                case -2054838772:
                    if (str.equals("server_error")) {
                        return e.f333441b;
                    }
                    break;
                case -816224790:
                    if (str.equals("call_not_exist")) {
                        return b.f333439b;
                    }
                    break;
                case 1207582805:
                    if (str.equals("bad_request")) {
                        return a.f333438b;
                    }
                    break;
                case 1437073931:
                    if (str.equals("handled_elsewhere")) {
                        return d.f333440b;
                    }
                    break;
            }
            return new f(str, null);
        }

        public Companion() {
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/signaling/v$d;", "Lcom/avito/avcalls/signaling/v;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends v {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f333440b = new d();

        public d() {
            super("handled_elsewhere", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 307081924;
        }

        @Y61.k
        public final String toString() {
            return "HandledElsewhere";
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/signaling/v$e;", "Lcom/avito/avcalls/signaling/v;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends v {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final e f333441b = new e();

        public e() {
            super("server_error", null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1937669619;
        }

        @Y61.k
        public final String toString() {
            return "ServerError";
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/signaling/v$f;", "Lcom/avito/avcalls/signaling/v;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends v {
    }

    public v(String str, C42822w c42822w) {
        this.f333437a = str;
    }
}
