package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import j.N;
import java.util.Arrays;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes4.dex */
final class g extends CrashlyticsReport.e.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f361255a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f361256b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    public static final class b extends CrashlyticsReport.e.b.a {

        /* renamed from: a, reason: collision with root package name */
        public String f361257a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f361258b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b.a
        public final CrashlyticsReport.e.b a() {
            String strQ = this.f361257a == null ? " filename" : "";
            if (this.f361258b == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " contents");
            }
            if (strQ.isEmpty()) {
                return new g(this.f361257a, this.f361258b, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b.a
        public final CrashlyticsReport.e.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f361258b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b.a
        public final CrashlyticsReport.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f361257a = str;
            return this;
        }
    }

    public g(String str, byte[] bArr, a aVar) {
        this.f361255a = str;
        this.f361256b = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b
    @N
    public final byte[] b() {
        return this.f361256b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.e.b
    @N
    public final String c() {
        return this.f361255a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.e.b)) {
            return false;
        }
        CrashlyticsReport.e.b bVar = (CrashlyticsReport.e.b) obj;
        if (this.f361255a.equals(bVar.c())) {
            if (Arrays.equals(this.f361256b, bVar instanceof g ? ((g) bVar).f361256b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f361255a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f361256b);
    }

    public final String toString() {
        return "File{filename=" + this.f361255a + ", contents=" + Arrays.toString(this.f361256b) + "}";
    }
}
