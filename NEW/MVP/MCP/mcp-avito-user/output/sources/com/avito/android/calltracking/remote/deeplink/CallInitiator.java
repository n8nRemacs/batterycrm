package com.avito.android.calltracking.remote.deeplink;

import Y61.k;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessengerReallContactMethodLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/CallInitiator;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "SELLER", "BUYER", GrsBaseInfo.CountryCodeSource.UNKNOWN, "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CallInitiator {

    @c("buyer")
    public static final CallInitiator BUYER;

    @c("seller")
    public static final CallInitiator SELLER;

    @c("unknown")
    public static final CallInitiator UNKNOWN;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f113761c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CallInitiator[] f113762d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f113763e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f113764b;

    /* compiled from: MessengerReallContactMethodLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/CallInitiator$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        CallInitiator callInitiator = new CallInitiator("SELLER", 0, "seller");
        SELLER = callInitiator;
        CallInitiator callInitiator2 = new CallInitiator("BUYER", 1, "buyer");
        BUYER = callInitiator2;
        CallInitiator callInitiator3 = new CallInitiator(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
        UNKNOWN = callInitiator3;
        CallInitiator[] callInitiatorArr = {callInitiator, callInitiator2, callInitiator3};
        f113762d = callInitiatorArr;
        f113763e = kotlin.enums.c.a(callInitiatorArr);
        f113761c = new a(null);
    }

    private CallInitiator(String str, int i12, String str2) {
        this.f113764b = str2;
    }

    public static CallInitiator valueOf(String str) {
        return (CallInitiator) Enum.valueOf(CallInitiator.class, str);
    }

    public static CallInitiator[] values() {
        return (CallInitiator[]) f113762d.clone();
    }
}
