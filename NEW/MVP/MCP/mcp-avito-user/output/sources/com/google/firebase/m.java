package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.B;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f361724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361725b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361726c;

    /* renamed from: d, reason: collision with root package name */
    public final String f361727d;

    /* renamed from: e, reason: collision with root package name */
    public final String f361728e;

    /* renamed from: f, reason: collision with root package name */
    public final String f361729f;

    /* renamed from: g, reason: collision with root package name */
    public final String f361730g;

    /* compiled from: FirebaseOptions.java */
    public static final class b {
    }

    @P
    public static m a(@N Context context) {
        A a12 = new A(context);
        String strA = a12.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new m(strA, a12.a("google_api_key"), a12.a("firebase_database_url"), a12.a("ga_trackingId"), a12.a("gcm_defaultSenderId"), a12.a("google_storage_bucket"), a12.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C36727t.a(this.f361725b, mVar.f361725b) && C36727t.a(this.f361724a, mVar.f361724a) && C36727t.a(this.f361726c, mVar.f361726c) && C36727t.a(this.f361727d, mVar.f361727d) && C36727t.a(this.f361728e, mVar.f361728e) && C36727t.a(this.f361729f, mVar.f361729f) && C36727t.a(this.f361730g, mVar.f361730g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f361725b, this.f361724a, this.f361726c, this.f361727d, this.f361728e, this.f361729f, this.f361730g});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f361725b, "applicationId");
        aVarB.a(this.f361724a, "apiKey");
        aVarB.a(this.f361726c, "databaseUrl");
        aVarB.a(this.f361728e, "gcmSenderId");
        aVarB.a(this.f361729f, "storageBucket");
        aVarB.a(this.f361730g, "projectId");
        return aVarB.toString();
    }

    public m(@N String str, @N String str2, @P String str3, @P String str4, @P String str5, @P String str6, @P String str7) {
        int i12 = B.f349598a;
        C36729v.l("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f361725b = str;
        this.f361724a = str2;
        this.f361726c = str3;
        this.f361727d = str4;
        this.f361728e = str5;
        this.f361729f = str6;
        this.f361730g = str7;
    }
}
