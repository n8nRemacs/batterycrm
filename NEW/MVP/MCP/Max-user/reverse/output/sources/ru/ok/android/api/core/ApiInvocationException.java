package ru.ok.android.api.core;

import defpackage.ho7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/api/core/ApiInvocationException;", "Lru/ok/android/api/core/ApiException;", "odnoklassniki-android-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ApiInvocationException extends ApiException {
    public final String X;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String o;

    public ApiInvocationException(int i, String str) {
        this(str, null, i, null, null, null);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("ApiInvocationException{errorCode=");
        sb.append(this.a);
        sb.append(", errorMessage='");
        sb.append(this.b);
        sb.append("', errorField='");
        sb.append(this.c);
        sb.append("', errorData='");
        sb.append(this.d);
        sb.append("', errorCustomData=");
        sb.append(this.X);
        sb.append(", errorCustomKey='");
        return ho7.l(sb, this.o, "'}");
    }

    public ApiInvocationException(String str, String str2, int i, String str3, String str4, String str5) {
        super(i + ' ' + str);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.o = str4;
        this.X = str5;
    }
}
