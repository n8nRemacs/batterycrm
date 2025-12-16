package com.avito.android.account.analytics.event;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: SaveSuggestEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/account/analytics/event/SaveSuggestEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "LoginType", "Source", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SaveSuggestEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f68100b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SaveSuggestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/analytics/event/SaveSuggestEvent$LoginType;", "", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoginType {

        /* renamed from: c, reason: collision with root package name */
        public static final LoginType f68101c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoginType f68102d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoginType f68103e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ LoginType[] f68104f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f68105g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f68106b;

        static {
            LoginType loginType = new LoginType("EMAIL", 0, "email");
            f68101c = loginType;
            LoginType loginType2 = new LoginType("PHONE", 1, "phone");
            f68102d = loginType2;
            LoginType loginType3 = new LoginType("SOCIAL", 2, "social");
            f68103e = loginType3;
            LoginType[] loginTypeArr = {loginType, loginType2, loginType3};
            f68104f = loginTypeArr;
            f68105g = c.a(loginTypeArr);
        }

        public LoginType(String str, int i12, String str2) {
            this.f68106b = str2;
        }

        public static LoginType valueOf(String str) {
            return (LoginType) Enum.valueOf(LoginType.class, str);
        }

        public static LoginType[] values() {
            return (LoginType[]) f68104f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SaveSuggestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/analytics/event/SaveSuggestEvent$Source;", "", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Source {

        /* renamed from: c, reason: collision with root package name */
        public static final Source f68107c;

        /* renamed from: d, reason: collision with root package name */
        public static final Source f68108d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Source[] f68109e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f68110f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f68111b;

        static {
            Source source = new Source("AUTH", 0, "auth");
            f68107c = source;
            Source source2 = new Source("REGISTRATION", 1, "registration");
            f68108d = source2;
            Source[] sourceArr = {source, source2};
            f68109e = sourceArr;
            f68110f = c.a(sourceArr);
        }

        public Source(String str, int i12, String str2) {
            this.f68111b = str2;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f68109e.clone();
        }
    }

    public SaveSuggestEvent(@k Source source, @k LoginType loginType) {
        this.f68100b = new ParametrizedClickStreamEvent(2769, 6, P0.g(new Q("s", source.f68111b), new Q("login_type", loginType.f68106b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f68100b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f68100b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f68100b.f90248c;
    }
}
