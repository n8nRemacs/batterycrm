package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C37580b extends I {

    /* renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport f360956a;

    /* renamed from: b, reason: collision with root package name */
    public final String f360957b;

    /* renamed from: c, reason: collision with root package name */
    public final File f360958c;

    public C37580b(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport == null) {
            throw new NullPointerException("Null report");
        }
        this.f360956a = crashlyticsReport;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f360957b = str;
        this.f360958c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.I
    public final CrashlyticsReport a() {
        return this.f360956a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.I
    public final File b() {
        return this.f360958c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.I
    public final String c() {
        return this.f360957b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i12 = (I) obj;
        return this.f360956a.equals(i12.a()) && this.f360957b.equals(i12.c()) && this.f360958c.equals(i12.b());
    }

    public final int hashCode() {
        return ((((this.f360956a.hashCode() ^ 1000003) * 1000003) ^ this.f360957b.hashCode()) * 1000003) ^ this.f360958c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f360956a + ", sessionId=" + this.f360957b + ", reportFile=" + this.f360958c + "}";
    }
}
