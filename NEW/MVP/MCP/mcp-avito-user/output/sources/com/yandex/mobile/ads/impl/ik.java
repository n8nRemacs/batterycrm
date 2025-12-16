package com.yandex.mobile.ads.impl;

import androidx.compose.runtime.C22026a;

/* loaded from: classes8.dex */
public abstract class ik {

    public static final class a extends ik {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f386502a;

        public a(boolean z12) {
            super(0);
            this.f386502a = z12;
        }

        public final boolean a() {
            return this.f386502a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f386502a == ((a) obj).f386502a;
        }

        public final int hashCode() {
            boolean z12 = this.f386502a;
            if (z12) {
                return 1;
            }
            return z12 ? 1 : 0;
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(Cif.a("CmpPresent(value="), this.f386502a, ')');
        }
    }

    public static final class b extends ik {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private final String f386503a;

        public b(@Y61.l String str) {
            super(0);
            this.f386503a = str;
        }

        @Y61.l
        public final String a() {
            return this.f386503a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f386503a, ((b) obj).f386503a);
        }

        public final int hashCode() {
            String str = this.f386503a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(Cif.a("ConsentString(value="), this.f386503a, ')');
        }
    }

    public static final class c extends ik {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private final String f386504a;

        public c(@Y61.l String str) {
            super(0);
            this.f386504a = str;
        }

        @Y61.l
        public final String a() {
            return this.f386504a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f386504a, ((c) obj).f386504a);
        }

        public final int hashCode() {
            String str = this.f386504a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(Cif.a("Gdpr(value="), this.f386504a, ')');
        }
    }

    public static final class d extends ik {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private final String f386505a;

        public d(@Y61.l String str) {
            super(0);
            this.f386505a = str;
        }

        @Y61.l
        public final String a() {
            return this.f386505a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.L.f(this.f386505a, ((d) obj).f386505a);
        }

        public final int hashCode() {
            String str = this.f386505a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(Cif.a("PurposeConsents(value="), this.f386505a, ')');
        }
    }

    public static final class e extends ik {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        private final String f386506a;

        public e(@Y61.l String str) {
            super(0);
            this.f386506a = str;
        }

        @Y61.l
        public final String a() {
            return this.f386506a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.L.f(this.f386506a, ((e) obj).f386506a);
        }

        public final int hashCode() {
            String str = this.f386506a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(Cif.a("VendorConsents(value="), this.f386506a, ')');
        }
    }

    public /* synthetic */ ik(int i12) {
        this();
    }

    private ik() {
    }
}
