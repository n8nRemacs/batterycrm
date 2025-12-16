package com.fasterxml.jackson.databind.util;

import androidx.compose.foundation.H;
import java.io.Serializable;

/* compiled from: NameTransformer.java */
/* loaded from: classes4.dex */
public abstract class t {

    /* renamed from: b, reason: collision with root package name */
    public static final e f342628b = new e();

    /* compiled from: NameTransformer.java */
    public static class a extends t {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f342629c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f342630d;

        public a(String str, String str2) {
            this.f342629c = str;
            this.f342630d = str2;
        }

        @Override // com.fasterxml.jackson.databind.util.t
        public final String b(String str) {
            return this.f342629c + str + this.f342630d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[PreAndSuffixTransformer('");
            sb2.append(this.f342629c);
            sb2.append("','");
            return AK.c.s(sb2, this.f342630d, "')]");
        }
    }

    /* compiled from: NameTransformer.java */
    public static class b extends t {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f342631c;

        public b(String str) {
            this.f342631c = str;
        }

        @Override // com.fasterxml.jackson.databind.util.t
        public final String b(String str) {
            return AK.c.s(new StringBuilder(), this.f342631c, str);
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("[PrefixTransformer('"), this.f342631c, "')]");
        }
    }

    /* compiled from: NameTransformer.java */
    public static class c extends t {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f342632c;

        public c(String str) {
            this.f342632c = str;
        }

        @Override // com.fasterxml.jackson.databind.util.t
        public final String b(String str) {
            StringBuilder sbR = H.r(str);
            sbR.append(this.f342632c);
            return sbR.toString();
        }

        public final String toString() {
            return AK.c.s(new StringBuilder("[SuffixTransformer('"), this.f342632c, "')]");
        }
    }

    /* compiled from: NameTransformer.java */
    public static class d extends t implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: c, reason: collision with root package name */
        public final t f342633c;

        /* renamed from: d, reason: collision with root package name */
        public final t f342634d;

        public d(t tVar, t tVar2) {
            this.f342633c = tVar;
            this.f342634d = tVar2;
        }

        @Override // com.fasterxml.jackson.databind.util.t
        public final String b(String str) {
            return this.f342633c.b(this.f342634d.b(str));
        }

        public final String toString() {
            return "[ChainedTransformer(" + this.f342633c + ", " + this.f342634d + ")]";
        }
    }

    public static t a(String str, String str2) {
        boolean z12 = false;
        boolean z13 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z12 = true;
        }
        return z13 ? z12 ? new a(str, str2) : new b(str) : z12 ? new c(str2) : f342628b;
    }

    public abstract String b(String str);

    /* compiled from: NameTransformer.java */
    public static final class e extends t implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.t
        public final String b(String str) {
            return str;
        }
    }
}
