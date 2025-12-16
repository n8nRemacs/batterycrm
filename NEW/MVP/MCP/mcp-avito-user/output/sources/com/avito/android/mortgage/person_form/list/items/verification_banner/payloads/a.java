package com.avito.android.mortgage.person_form.list.items.verification_banner.payloads;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBannerPayload.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$c;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$d;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: VerificationBannerPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$a;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.person_form.list.items.verification_banner.payloads.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5952a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f200843a;

        public C5952a(boolean z12) {
            this.f200843a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5952a) && this.f200843a == ((C5952a) obj).f200843a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f200843a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ActionEnabledPayload(isEnabled="), this.f200843a, ')');
        }
    }

    /* compiled from: VerificationBannerPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$b;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f200844a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f200845b;

        public b(@l String str, boolean z12) {
            this.f200844a = str;
            this.f200845b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f200844a, bVar.f200844a) && this.f200845b == bVar.f200845b;
        }

        public final int hashCode() {
            String str = this.f200844a;
            return Boolean.hashCode(this.f200845b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionPayload(actionTitle=");
            sb2.append(this.f200844a);
            sb2.append(", isActionLoading=");
            return r.x(sb2, this.f200845b, ')');
        }
    }

    /* compiled from: VerificationBannerPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$c;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f200846a;

        public c(@l String str) {
            this.f200846a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f200846a, ((c) obj).f200846a);
        }

        public final int hashCode() {
            String str = this.f200846a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DescriptionPayload(description="), this.f200846a, ')');
        }
    }

    /* compiled from: VerificationBannerPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$d;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f200847a;

        public d(@l String str) {
            this.f200847a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f200847a, ((d) obj).f200847a);
        }

        public final int hashCode() {
            String str = this.f200847a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ImagePayload(imageUrl="), this.f200847a, ')');
        }
    }

    /* compiled from: VerificationBannerPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a$e;", "Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f200848a;

        public e(@k String str) {
            this.f200848a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f200848a, ((e) obj).f200848a);
        }

        public final int hashCode() {
            return this.f200848a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TitlePayload(title="), this.f200848a, ')');
        }
    }
}
