package com.avito.avcalls.android.signaling;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SignalingError.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/avcalls/android/signaling/t;", "", "Companion", "a", "b", "c", "d", "e", "f", "Lcom/avito/avcalls/android/signaling/t$a;", "Lcom/avito/avcalls/android/signaling/t$b;", "Lcom/avito/avcalls/android/signaling/t$d;", "Lcom/avito/avcalls/android/signaling/t$e;", "Lcom/avito/avcalls/android/signaling/t$f;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class t {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f332160a;

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/signaling/t$a;", "Lcom/avito/avcalls/android/signaling/t;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends t {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f332161b = new a();

        public a() {
            super("bad_request", null);
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/signaling/t$b;", "Lcom/avito/avcalls/android/signaling/t;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends t {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f332162b = new b();

        public b() {
            super("call_not_exist", null);
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/avcalls/android/signaling/t$c;", "", "<init>", "()V", "", "BAD_REQUEST", "Ljava/lang/String;", "CALL_NOT_EXIST_CODE", "HANDLED_ELSEWHERE_CODE", "SERVER_ERROR", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.signaling.t$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Y61.k
        public static t a(@Y61.k String str) {
            switch (str.hashCode()) {
                case -2054838772:
                    if (str.equals("server_error")) {
                        return e.f332164b;
                    }
                    break;
                case -816224790:
                    if (str.equals("call_not_exist")) {
                        return b.f332162b;
                    }
                    break;
                case 1207582805:
                    if (str.equals("bad_request")) {
                        return a.f332161b;
                    }
                    break;
                case 1437073931:
                    if (str.equals("handled_elsewhere")) {
                        return d.f332163b;
                    }
                    break;
            }
            return new f(str, null);
        }

        public Companion() {
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/signaling/t$d;", "Lcom/avito/avcalls/android/signaling/t;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends t {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f332163b = new d();

        public d() {
            super("handled_elsewhere", null);
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/signaling/t$e;", "Lcom/avito/avcalls/android/signaling/t;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends t {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final e f332164b = new e();

        public e() {
            super("server_error", null);
        }
    }

    /* compiled from: SignalingError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/signaling/t$f;", "Lcom/avito/avcalls/android/signaling/t;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends t {
    }

    public t(String str, C42822w c42822w) {
        this.f332160a = str;
    }
}
