package com.avito.android.auth_passwordless.generated.api.passwordless_auth_start_get;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PasswordlessAuthStartGetRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/auth_passwordless/generated/api/passwordless_auth_start_get/Flow;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PasswordlessAuth", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Flow {

    @c("passwordlessAuth")
    public static final Flow PasswordlessAuth;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Flow[] f92628c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f92629d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92630b;

    static {
        Flow flow = new Flow("PasswordlessAuth", 0, "passwordlessAuth");
        PasswordlessAuth = flow;
        Flow[] flowArr = {flow};
        f92628c = flowArr;
        f92629d = kotlin.enums.c.a(flowArr);
    }

    private Flow(String str, int i12, String str2) {
        this.f92630b = str2;
    }

    public static Flow valueOf(String str) {
        return (Flow) Enum.valueOf(Flow.class, str);
    }

    public static Flow[] values() {
        return (Flow[]) f92628c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f92630b.toString();
    }
}
