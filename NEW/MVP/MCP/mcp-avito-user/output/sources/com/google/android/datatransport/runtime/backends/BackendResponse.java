package com.google.android.datatransport.runtime.backends;

@VY0.c
/* loaded from: classes10.dex */
public abstract class BackendResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f343085b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f343086c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f343087d;

        /* renamed from: e, reason: collision with root package name */
        public static final Status f343088e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Status[] f343089f;

        static {
            Status status = new Status("OK", 0);
            f343085b = status;
            Status status2 = new Status("TRANSIENT_ERROR", 1);
            f343086c = status2;
            Status status3 = new Status("FATAL_ERROR", 2);
            f343087d = status3;
            Status status4 = new Status("INVALID_PAYLOAD", 3);
            f343088e = status4;
            f343089f = new Status[]{status, status2, status3, status4};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f343089f.clone();
        }
    }

    public static BackendResponse a() {
        return new b(Status.f343087d, -1L);
    }

    public static BackendResponse d() {
        return new b(Status.f343088e, -1L);
    }

    public static BackendResponse e(long j12) {
        return new b(Status.f343085b, j12);
    }

    public static BackendResponse f() {
        return new b(Status.f343086c, -1L);
    }

    public abstract long b();

    public abstract Status c();
}
