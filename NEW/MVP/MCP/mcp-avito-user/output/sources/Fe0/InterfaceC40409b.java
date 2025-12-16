package fe0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FileUploaderState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0007\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lfe0/b;", "", "a", "b", "c", "d", "e", "Lfe0/b$a;", "Lfe0/b$b;", "Lfe0/b$c;", "Lfe0/b$c$a;", "Lfe0/b$c$b;", "Lfe0/b$d;", "Lfe0/b$e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fe0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40409b {

    /* compiled from: FileUploaderState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfe0/b$a;", "Lfe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fe0.b$a */
    public static final /* data */ class a implements InterfaceC40409b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395994a;

        public a(@k String str) {
            this.f395994a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f395994a, ((a) obj).f395994a);
        }

        public final int hashCode() {
            return this.f395994a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeleteComplete(id="), this.f395994a, ')');
        }
    }

    /* compiled from: FileUploaderState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfe0/b$b;", "Lfe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fe0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11163b implements InterfaceC40409b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395995a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f395996b;

        public C11163b(@k String str, @k String str2) {
            this.f395995a = str;
            this.f395996b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11163b)) {
                return false;
            }
            C11163b c11163b = (C11163b) obj;
            return L.f(this.f395995a, c11163b.f395995a) && L.f(this.f395996b, c11163b.f395996b);
        }

        public final int hashCode() {
            return this.f395996b.hashCode() + (this.f395995a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(id=");
            sb2.append(this.f395995a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f395996b, ')');
        }
    }

    /* compiled from: FileUploaderState.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lfe0/b$c;", "Lfe0/b;", "a", "b", "Lfe0/b$c$a;", "Lfe0/b$c$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fe0.b$c */
    public static abstract class c implements InterfaceC40409b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C40408a f395997a;

        /* compiled from: FileUploaderState.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lfe0/b$c$a;", "Lfe0/b;", "Lfe0/b$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: fe0.b$c$a */
        public static final /* data */ class a extends c implements InterfaceC40409b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C40408a f395998b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f395999c;

            public a(@k C40408a c40408a, @k String str) {
                super(c40408a, null);
                this.f395998b = c40408a;
                this.f395999c = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f395998b, aVar.f395998b) && L.f(this.f395999c, aVar.f395999c);
            }

            public final int hashCode() {
                return this.f395999c.hashCode() + (this.f395998b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(_metaData=");
                sb2.append(this.f395998b);
                sb2.append(", message=");
                return C22026a.c(sb2, this.f395999c, ')');
            }
        }

        /* compiled from: FileUploaderState.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lfe0/b$c$b;", "Lfe0/b;", "Lfe0/b$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: fe0.b$c$b, reason: collision with other inner class name */
        public static final /* data */ class C11164b extends c implements InterfaceC40409b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C40408a f396000b;

            public C11164b(@k C40408a c40408a) {
                super(c40408a, null);
                this.f396000b = c40408a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11164b) && L.f(this.f396000b, ((C11164b) obj).f396000b);
            }

            public final int hashCode() {
                return this.f396000b.hashCode();
            }

            @k
            public final String toString() {
                return "Loading(_metaData=" + this.f396000b + ')';
            }
        }

        public c(C40408a c40408a, C42822w c42822w) {
            this.f395997a = c40408a;
        }
    }

    /* compiled from: FileUploaderState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfe0/b$d;", "Lfe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fe0.b$d */
    public static final /* data */ class d implements InterfaceC40409b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396001a;

        /* renamed from: b, reason: collision with root package name */
        public final float f396002b;

        public d(@k String str, float f12) {
            this.f396001a = str;
            this.f396002b = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f396001a, dVar.f396001a) && Float.compare(this.f396002b, dVar.f396002b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f396002b) + (this.f396001a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loading(id=");
            sb2.append(this.f396001a);
            sb2.append(", progress=");
            return r.k(')', this.f396002b, sb2);
        }
    }

    /* compiled from: FileUploaderState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfe0/b$e;", "Lfe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fe0.b$e */
    public static final /* data */ class e implements InterfaceC40409b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396003a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FileUploadResult.Success f396004b;

        public e(@k String str, @k FileUploadResult.Success success) {
            this.f396003a = str;
            this.f396004b = success;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f396003a, eVar.f396003a) && L.f(this.f396004b, eVar.f396004b);
        }

        public final int hashCode() {
            return this.f396004b.hashCode() + (this.f396003a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "UploadComplete(id=" + this.f396003a + ", response=" + this.f396004b + ')';
        }
    }
}
