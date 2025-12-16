package com.avito.android.beduin.common.component.file_uploader;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FileUploaderState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x;", "", "a", "b", "c", "d", "Lcom/avito/android/beduin/common/component/file_uploader/x$a;", "Lcom/avito/android/beduin/common/component/file_uploader/x$b;", "Lcom/avito/android/beduin/common/component/file_uploader/x$c;", "Lcom/avito/android/beduin/common/component/file_uploader/x$d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface x {

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$a;", "Lcom/avito/android/beduin/common/component/file_uploader/x;", "a", "b", "Lcom/avito/android/beduin/common/component/file_uploader/x$a$a;", "Lcom/avito/android/beduin/common/component/file_uploader/x$a$b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f101352a;

        /* compiled from: FileUploaderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$a$a;", "Lcom/avito/android/beduin/common/component/file_uploader/x$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.component.file_uploader.x$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3038a extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f101353b;

            public C3038a(@Y61.k String str) {
                super(str, null);
                this.f101353b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3038a) && L.f(this.f101353b, ((C3038a) obj).f101353b);
            }

            public final int hashCode() {
                return this.f101353b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Delete(_id="), this.f101353b, ')');
            }
        }

        /* compiled from: FileUploaderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$a$b;", "Lcom/avito/android/beduin/common/component/file_uploader/x$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f101354b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final FileUploadResult.Success f101355c;

            public b(@Y61.k String str, @Y61.k FileUploadResult.Success success) {
                super(str, null);
                this.f101354b = str;
                this.f101355c = success;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f101354b, bVar.f101354b) && L.f(this.f101355c, bVar.f101355c);
            }

            public final int hashCode() {
                return this.f101355c.hashCode() + (this.f101354b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Upload(_id=" + this.f101354b + ", response=" + this.f101355c + ')';
            }
        }

        public a(String str, C42822w c42822w) {
            this.f101352a = str;
        }
    }

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$b;", "Lcom/avito/android/beduin/common/component/file_uploader/x;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f101356a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101357b;

        public b(@Y61.k String str, @Y61.k String str2) {
            this.f101356a = str;
            this.f101357b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f101356a, bVar.f101356a) && L.f(this.f101357b, bVar.f101357b);
        }

        public final int hashCode() {
            return this.f101357b.hashCode() + (this.f101356a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(id=");
            sb2.append(this.f101356a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f101357b, ')');
        }
    }

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$c;", "Lcom/avito/android/beduin/common/component/file_uploader/x;", "a", "b", "Lcom/avito/android/beduin/common/component/file_uploader/x$c$a;", "Lcom/avito/android/beduin/common/component/file_uploader/x$c$b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.beduin.common.component.file_uploader.validation.a f101358a;

        /* compiled from: FileUploaderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$c$a;", "Lcom/avito/android/beduin/common/component/file_uploader/x$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.beduin.common.component.file_uploader.validation.a f101359b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f101360c;

            public a(@Y61.k com.avito.android.beduin.common.component.file_uploader.validation.a aVar, @Y61.k String str) {
                super(aVar, null);
                this.f101359b = aVar;
                this.f101360c = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f101359b, aVar.f101359b) && L.f(this.f101360c, aVar.f101360c);
            }

            public final int hashCode() {
                return this.f101360c.hashCode() + (this.f101359b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(_metaData=");
                sb2.append(this.f101359b);
                sb2.append(", message=");
                return C22026a.c(sb2, this.f101360c, ')');
            }
        }

        /* compiled from: FileUploaderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$c$b;", "Lcom/avito/android/beduin/common/component/file_uploader/x$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.beduin.common.component.file_uploader.validation.a f101361b;

            public b(@Y61.k com.avito.android.beduin.common.component.file_uploader.validation.a aVar) {
                super(aVar, null);
                this.f101361b = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f101361b, ((b) obj).f101361b);
            }

            public final int hashCode() {
                return this.f101361b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Loading(_metaData=" + this.f101361b + ')';
            }
        }

        public c(com.avito.android.beduin.common.component.file_uploader.validation.a aVar, C42822w c42822w) {
            this.f101358a = aVar;
        }
    }

    /* compiled from: FileUploaderState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$d;", "Lcom/avito/android/beduin/common/component/file_uploader/x;", "a", "b", "Lcom/avito/android/beduin/common/component/file_uploader/x$d$a;", "Lcom/avito/android/beduin/common/component/file_uploader/x$d$b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d implements x {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f101362a;

        /* compiled from: FileUploaderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$d$a;", "Lcom/avito/android/beduin/common/component/file_uploader/x$d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f101363b;

            public a(@Y61.k String str) {
                super(str, null);
                this.f101363b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f101363b, ((a) obj).f101363b);
            }

            public final int hashCode() {
                return this.f101363b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Delete(_id="), this.f101363b, ')');
            }
        }

        /* compiled from: FileUploaderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/x$d$b;", "Lcom/avito/android/beduin/common/component/file_uploader/x$d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f101364b;

            /* renamed from: c, reason: collision with root package name */
            public final float f101365c;

            public b(@Y61.k String str, float f12) {
                super(str, null);
                this.f101364b = str;
                this.f101365c = f12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f101364b, bVar.f101364b) && Float.compare(this.f101365c, bVar.f101365c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f101365c) + (this.f101364b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Upload(_id=");
                sb2.append(this.f101364b);
                sb2.append(", progress=");
                return androidx.appcompat.app.r.k(')', this.f101365c, sb2);
            }
        }

        public d(String str, C42822w c42822w) {
            this.f101362a = str;
        }
    }
}
