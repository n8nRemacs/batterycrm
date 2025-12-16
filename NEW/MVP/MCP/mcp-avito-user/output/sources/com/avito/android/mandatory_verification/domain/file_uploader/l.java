package com.avito.android.mandatory_verification.domain.file_uploader;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileUploaderState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/l;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l$a;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l$b;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l$c;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l$d;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l$e;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface l {

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/l$a;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f184567a;

        public a(@Y61.k String str) {
            this.f184567a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f184567a, ((a) obj).f184567a);
        }

        public final int hashCode() {
            return this.f184567a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeleteComplete(id="), this.f184567a, ')');
        }
    }

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/l$b;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f184568a;

        public b(@Y61.k PrintableText printableText) {
            this.f184568a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f184568a, ((b) obj).f184568a);
        }

        public final int hashCode() {
            return this.f184568a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("Error(message="), this.f184568a, ')');
        }
    }

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/l$c;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f184569a;

        public c(@Y61.k PrintableText printableText) {
            this.f184569a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f184569a, ((c) obj).f184569a);
        }

        public final int hashCode() {
            return this.f184569a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("ErrorToast(message="), this.f184569a, ')');
        }
    }

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/l$d;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f184570a;

        public d(@Y61.k String str) {
            this.f184570a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f184570a, ((d) obj).f184570a);
        }

        public final int hashCode() {
            return this.f184570a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Loading(id="), this.f184570a, ')');
        }
    }

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/l$e;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/l;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f184571a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f184572b;

        /* renamed from: c, reason: collision with root package name */
        public final long f184573c;

        public e(@Y61.k String str, @Y61.k String str2, long j12) {
            this.f184571a = str;
            this.f184572b = str2;
            this.f184573c = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f184571a, eVar.f184571a) && L.f(this.f184572b, eVar.f184572b) && this.f184573c == eVar.f184573c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f184573c) + H.d(this.f184571a.hashCode() * 31, 31, this.f184572b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UploadComplete(id=");
            sb2.append(this.f184571a);
            sb2.append(", name=");
            sb2.append(this.f184572b);
            sb2.append(", size=");
            return r.u(sb2, this.f184573c, ')');
        }
    }
}
