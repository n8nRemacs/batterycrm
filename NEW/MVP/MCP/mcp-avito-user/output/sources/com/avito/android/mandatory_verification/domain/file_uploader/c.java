package com.avito.android.mandatory_verification.domain.file_uploader;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.avito.android.R;
import com.avito.android.mandatory_verification.domain.file_uploader.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.InterfaceC35741a1;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.MultipartBody;
import zZ.C50528b;

/* compiled from: FileUploaderInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/c;", "", "a", "b", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.data.d f184508a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f184509b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f184510c;

    /* compiled from: FileUploaderInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/c$a;", "", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f184511a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f184512b;

        /* renamed from: c, reason: collision with root package name */
        public final long f184513c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f184514d;

        public a(@Y61.k Uri uri, @Y61.k String str, long j12, @Y61.k String str2, @Y61.k String str3) {
            this.f184511a = uri;
            this.f184512b = str;
            this.f184513c = j12;
            this.f184514d = str2;
        }
    }

    /* compiled from: FileUploaderInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b;", "", "a", "b", "c", "Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b$a;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b$b;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b$c;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: FileUploaderInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b$a;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f184515a = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 425971078;
            }

            @Y61.k
            public final String toString() {
                return "FileSizeExceeded";
            }
        }

        /* compiled from: FileUploaderInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b$b;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mandatory_verification.domain.file_uploader.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5413b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final a f184516a;

            public C5413b(@Y61.k a aVar) {
                this.f184516a = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5413b) && L.f(this.f184516a, ((C5413b) obj).f184516a);
            }

            public final int hashCode() {
                return this.f184516a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(fileMetaData=" + this.f184516a + ')';
            }
        }

        /* compiled from: FileUploaderInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b$c;", "Lcom/avito/android/mandatory_verification/domain/file_uploader/c$b;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mandatory_verification.domain.file_uploader.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C5414c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5414c f184517a = new C5414c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C5414c);
            }

            public final int hashCode() {
                return 531698382;
            }

            @Y61.k
            public final String toString() {
                return "WrongFormat";
            }
        }
    }

    @Inject
    public c(@Y61.k com.avito.android.mandatory_verification.data.d dVar, @Y61.k ContentResolver contentResolver, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f184508a = dVar;
        this.f184509b = contentResolver;
        this.f184510c = interfaceC35741a1;
    }

    @Y61.k
    public final C43152f0 a(@Y61.k String str, @Y61.k String str2) {
        return new C43152f0(new e(new d(this.f184508a.c(str2, str)), str), new f(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final InterfaceC43160i b(@Y61.k ArrayList arrayList, @Y61.k m mVar, @Y61.k String str) {
        Q q12;
        b c5413b;
        Uri uri = (Uri) C42745f0.w0(arrayList);
        if (uri == null) {
            c5413b = b.C5414c.f184517a;
        } else {
            String str2 = uri.getLastPathSegment() + System.currentTimeMillis();
            String type = this.f184509b.getType(uri);
            String str3 = "";
            String str4 = type == null ? "" : type;
            Cursor cursorQuery = this.f184509b.query(uri, null, null, null, null, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    int columnIndex = cursor2.getColumnIndex("_size");
                    Long lValueOf = (!cursor2.moveToFirst() || columnIndex < 0) ? null : Long.valueOf(cursor2.getLong(columnIndex));
                    Long lValueOf2 = Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L);
                    int columnIndex2 = cursor2.getColumnIndex("_display_name");
                    String string = (!cursor2.moveToFirst() || columnIndex2 < 0) ? null : cursor2.getString(columnIndex2);
                    if (string != null) {
                        str3 = string;
                    }
                    q12 = new Q(lValueOf2, str3);
                    kotlin.io.c.a(cursor, null);
                } finally {
                }
            } else {
                q12 = new Q(0L, "");
            }
            long jLongValue = ((Number) q12.f406619b).longValue();
            c5413b = !mVar.f184574a.contains(str4) ? b.C5414c.f184517a : jLongValue > mVar.f184575b ? b.a.f184515a : new b.C5413b(new a(uri, str2, jLongValue, (String) q12.f406620c, str4));
        }
        if (c5413b instanceof b.C5414c) {
            return new C43210w(new l.b(com.avito.android.printable_text.b.f(mVar.f184576c)));
        }
        if (c5413b instanceof b.a) {
            return new C43210w(new l.b(com.avito.android.printable_text.b.f(mVar.f184577d)));
        }
        if (!(c5413b instanceof b.C5413b)) {
            throw new NoWhenBranchMatchedException();
        }
        a aVar = ((b.C5413b) c5413b).f184516a;
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.file_upload_error_message, new Serializable[0]);
        C50528b c50528b = new C50528b(aVar.f184511a, this.f184509b, 0, null, com.avito.android.mandatory_verification.domain.file_uploader.b.f184507l, 12, null);
        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
        String str5 = aVar.f184514d;
        return new C43152f0(C43175k.G(new h(new C43152f0(new g(this.f184508a.b(str, companion.createFormData("file", str5, c50528b))), new i(this, null)), null, str5, aVar.f184513c, printableTextC, aVar.f184512b)), new j(printableTextC, null));
    }
}
