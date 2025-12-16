package com.avito.android.remote.error;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Status.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/error/Status;", "", "c", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Status {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f253396c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<Set<String>> f253397d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<Set<String>> f253398e;

    /* renamed from: f, reason: collision with root package name */
    public static final Status f253399f;

    /* renamed from: g, reason: collision with root package name */
    public static final Status f253400g;

    /* renamed from: h, reason: collision with root package name */
    public static final Status f253401h;

    /* renamed from: i, reason: collision with root package name */
    public static final Status f253402i;

    /* renamed from: j, reason: collision with root package name */
    public static final Status f253403j;

    /* renamed from: k, reason: collision with root package name */
    public static final Status f253404k;

    /* renamed from: l, reason: collision with root package name */
    public static final Status f253405l;

    /* renamed from: m, reason: collision with root package name */
    public static final Status f253406m;

    /* renamed from: n, reason: collision with root package name */
    public static final Status f253407n;

    /* renamed from: o, reason: collision with root package name */
    public static final Status f253408o;

    /* renamed from: p, reason: collision with root package name */
    public static final Status f253409p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ Status[] f253410q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f253411r;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f253412b;

    /* compiled from: Status.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Set<? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f253413l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends String> invoke() {
            c cVar = Status.f253396c;
            return C42756l.l0(new String[]{"unauthenticated", "unauthorized", "forbidden", "bad-request", "internal-error", "too-many-requests", "not-found", "failure", "incorrect-data", "error-dialog", "action"});
        }
    }

    /* compiled from: Status.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Set<String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f253414l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Set<String> invoke() {
            Status[] statusArrValues = Status.values();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Status status : statusArrValues) {
                linkedHashSet.add(status.f253412b);
            }
            return linkedHashSet;
        }
    }

    /* compiled from: Status.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/error/Status$c;", "", "<init>", "()V", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static Status a(@Y61.l String str) {
            for (Status status : Status.values()) {
                if (status.f253412b.equals(str)) {
                    return status;
                }
            }
            return null;
        }

        public c() {
        }
    }

    static {
        Status status = new Status("OK", 0, "ok");
        Status status2 = new Status("UNAUTHENTICATED", 1, "unauthenticated");
        Status status3 = new Status("UNAUTHORIZED", 2, "unauthorized");
        f253399f = status3;
        Status status4 = new Status("FORBIDDEN", 3, "forbidden");
        f253400g = status4;
        Status status5 = new Status("BAD_REQUEST", 4, "bad-request");
        f253401h = status5;
        Status status6 = new Status("INTERNAL_ERROR", 5, "internal-error");
        f253402i = status6;
        Status status7 = new Status("NOT_FOUND", 6, "not-found");
        f253403j = status7;
        Status status8 = new Status("FAILURE", 7, "failure");
        f253404k = status8;
        Status status9 = new Status("INCORRECT_DATA", 8, "incorrect-data");
        f253405l = status9;
        Status status10 = new Status("ERROR_DIALOG", 9, "error-dialog");
        f253406m = status10;
        Status status11 = new Status("TOO_MANY_REQUESTS", 10, "too-many-requests");
        f253407n = status11;
        Status status12 = new Status("ACTION", 11, "action");
        f253408o = status12;
        Status status13 = new Status(GrsBaseInfo.CountryCodeSource.UNKNOWN, 12, "unknown");
        f253409p = status13;
        Status[] statusArr = {status, status2, status3, status4, status5, status6, status7, status8, status9, status10, status11, status12, status13, new Status("INCORRECT_FIELD_VALUES", 13, "incorrect-field-values"), new Status("NO_SUITABLE_SURVEY", 14, "no-suitable-survey"), new Status("NO_SEARCH_RESULT", 15, "no-search-result"), new Status("NEED_SUPPORT", 16, "need-support"), new Status("CONFLICT", 17, "conflict"), new Status("NOT_REQUIRED", 18, "not-required"), new Status("EMPTY_BODY", 19, "empty-body"), new Status("FORM_INCORRECT_DATA", 20, "form-incorrect-data"), new Status("PHONE_VERIFICATION_NEEDED", 21, "phone-verification-needed"), new Status("REMOVED_ACCOUNT_FOUND", 22, "removed-account-found"), new Status("VERIFY_BY_CALL", 23, "verifyByCall"), new Status("BLOCKED_ACCOUNT", 24, "blocked-account"), new Status("DELETED_ACCOUNT", 25, "deleted-account"), new Status("PASSWORD_RESET", 26, "password-reset"), new Status("WRONG_CREDENTIALS", 27, "wrong-credentials"), new Status("CONFIRMED", 28, "confirmed"), new Status("PHANTOM_ACCOUNT", 29, "phantom-account"), new Status("NEED_PHONE_VERIFICATION", 30, "need-phone-verification"), new Status("SOCIAL_WRONG_USER", 31, "social-wrong-user"), new Status("TFA_CHECK", 32, "tfa-check"), new Status("ACCOUNT_SUGGEST", 33, "account-suggest"), new Status("PARSING_PERMISSION", 34, "parsing-permission"), new Status("NEED_CONFIRM", 35, "need-confirm"), new Status("NEED_CONFIRMATION", 36, "need_confirmation"), new Status("ALLOW_REVERIFICATION", 37, "allow-reverification"), new Status("DISALLOW_REVERIFICATION", 38, "disallow-reverification"), new Status("PLACEHOLDER", 39, ChannelContext.Item.PLACEHOLDER), new Status("NOT_SAFE_ERROR", 40, "unsafe"), new Status("OUT_OF_DATE", 41, "out-of-date"), new Status("DELIVERY_UNAVAILABLE", 42, "delivery-unavailable"), new Status("LIST_EXPIRED", 43, "list-expired"), new Status("BEDUIN_ACTIONS", 44, "beduin-actions")};
        f253410q = statusArr;
        f253411r = kotlin.enums.c.a(statusArr);
        f253396c = new c(null);
        f253397d = C42727D.c(b.f253414l);
        f253398e = C42727D.c(a.f253413l);
    }

    public Status(String str, int i12, String str2) {
        this.f253412b = str2;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) f253410q.clone();
    }
}
