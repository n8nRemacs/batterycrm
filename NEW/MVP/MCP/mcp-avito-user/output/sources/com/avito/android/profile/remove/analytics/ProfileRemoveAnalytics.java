package com.avito.android.profile.remove.analytics;

import I90.b;
import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: ProfileRemoveAnalytics.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/analytics/ProfileRemoveAnalytics;", "", "ErrorType", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileRemoveAnalytics {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f223771a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f223772b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileRemoveAnalytics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/analytics/ProfileRemoveAnalytics$ErrorType;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorType {

        /* renamed from: c, reason: collision with root package name */
        public static final ErrorType f223773c;

        /* renamed from: d, reason: collision with root package name */
        public static final ErrorType f223774d;

        /* renamed from: e, reason: collision with root package name */
        public static final ErrorType f223775e;

        /* renamed from: f, reason: collision with root package name */
        public static final ErrorType f223776f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ErrorType[] f223777g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a f223778h;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f223779b;

        static {
            ErrorType errorType = new ErrorType("OBLIGATIONS_UPDATE", 0, "obligations_update");
            f223773c = errorType;
            ErrorType errorType2 = new ErrorType("WRONG_PASSWORD", 1, "wrong_password");
            f223774d = errorType2;
            ErrorType errorType3 = new ErrorType("START_SERVER_ERROR", 2, "start_confirm_server_problem");
            f223775e = errorType3;
            ErrorType errorType4 = new ErrorType("CONFIRM_SERVER_ERROR", 3, "confirm_removal_server_problem");
            f223776f = errorType4;
            ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4};
            f223777g = errorTypeArr;
            f223778h = c.a(errorTypeArr);
        }

        public ErrorType(String str, int i12, String str2) {
            this.f223779b = str2;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) f223777g.clone();
        }
    }

    @Inject
    public ProfileRemoveAnalytics(@k E e12, @k InterfaceC28373a interfaceC28373a) {
        this.f223771a = interfaceC28373a;
        this.f223772b = e12;
    }

    public final void a(@k ErrorType errorType) {
        String strA = this.f223772b.a();
        if (strA == null) {
            return;
        }
        this.f223771a.c(new b(strA, errorType.f223779b));
    }
}
