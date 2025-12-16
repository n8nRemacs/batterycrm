package com.avito.android.service.short_task;

import android.os.Bundle;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: ShortTask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service/short_task/ShortTask;", "", "BackoffPolicy", "NetworkState", "Status", "_common_job-scheduler_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ShortTask {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/ShortTask$BackoffPolicy;", "", "_common_job-scheduler_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BackoffPolicy {

        /* renamed from: b, reason: collision with root package name */
        public static final BackoffPolicy f274019b;

        /* renamed from: c, reason: collision with root package name */
        public static final BackoffPolicy f274020c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ BackoffPolicy[] f274021d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274022e;

        static {
            BackoffPolicy backoffPolicy = new BackoffPolicy("EXPONENTIAL", 0);
            f274019b = backoffPolicy;
            BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
            f274020c = backoffPolicy2;
            BackoffPolicy[] backoffPolicyArr = {backoffPolicy, backoffPolicy2};
            f274021d = backoffPolicyArr;
            f274022e = kotlin.enums.c.a(backoffPolicyArr);
        }

        public BackoffPolicy() {
            throw null;
        }

        public static BackoffPolicy valueOf(String str) {
            return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
        }

        public static BackoffPolicy[] values() {
            return (BackoffPolicy[]) f274021d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/ShortTask$NetworkState;", "", "_common_job-scheduler_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkState {

        /* renamed from: b, reason: collision with root package name */
        public static final NetworkState f274023b;

        /* renamed from: c, reason: collision with root package name */
        public static final NetworkState f274024c;

        /* renamed from: d, reason: collision with root package name */
        public static final NetworkState f274025d;

        /* renamed from: e, reason: collision with root package name */
        public static final NetworkState f274026e;

        /* renamed from: f, reason: collision with root package name */
        public static final NetworkState f274027f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ NetworkState[] f274028g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274029h;

        static {
            NetworkState networkState = new NetworkState("ANY", 0);
            f274023b = networkState;
            NetworkState networkState2 = new NetworkState("CONNECTED", 1);
            f274024c = networkState2;
            NetworkState networkState3 = new NetworkState("UNMETERED", 2);
            f274025d = networkState3;
            NetworkState networkState4 = new NetworkState("NOT_ROAMING", 3);
            f274026e = networkState4;
            NetworkState networkState5 = new NetworkState("METERED", 4);
            f274027f = networkState5;
            NetworkState[] networkStateArr = {networkState, networkState2, networkState3, networkState4, networkState5};
            f274028g = networkStateArr;
            f274029h = kotlin.enums.c.a(networkStateArr);
        }

        public NetworkState() {
            throw null;
        }

        public static NetworkState valueOf(String str) {
            return (NetworkState) Enum.valueOf(NetworkState.class, str);
        }

        public static NetworkState[] values() {
            return (NetworkState[]) f274028g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/ShortTask$Status;", "", "_common_job-scheduler_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f274030b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f274031c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f274032d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Status[] f274033e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274034f;

        static {
            Status status = new Status("SUCCESS", 0);
            f274030b = status;
            Status status2 = new Status("FAILED", 1);
            f274031c = status2;
            Status status3 = new Status("FAILED_AND_NEED_RETRY", 2);
            f274032d = status3;
            Status[] statusArr = {status, status2, status3};
            f274033e = statusArr;
            f274034f = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f274033e.clone();
        }
    }

    @Y61.k
    I<Status> start(@Y61.k Bundle bundle);
}
