package zZ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileUploadState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LzZ/c;", "", "a", "b", "c", "LzZ/c$a;", "LzZ/c$b;", "LzZ/c$c;", "_common_okhttp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zZ.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC50529c {

    /* compiled from: FileUploadState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzZ/c$a;", "LzZ/c;", "_common_okhttp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zZ.c$a */
    public static final /* data */ class a implements InterfaceC50529c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Exception f444071a;

        public a(@k Exception exc) {
            this.f444071a = exc;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f444071a, ((a) obj).f444071a);
        }

        public final int hashCode() {
            return this.f444071a.hashCode();
        }

        @k
        public final String toString() {
            return "Error(error=" + this.f444071a + ')';
        }
    }

    /* compiled from: FileUploadState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzZ/c$b;", "LzZ/c;", "<init>", "()V", "_common_okhttp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zZ.c$b */
    public static final /* data */ class b implements InterfaceC50529c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f444072a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1101066326;
        }

        @k
        public final String toString() {
            return "Uploaded";
        }
    }

    /* compiled from: FileUploadState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzZ/c$c;", "LzZ/c;", "_common_okhttp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zZ.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12957c implements InterfaceC50529c {

        /* renamed from: a, reason: collision with root package name */
        public final float f444073a;

        /* renamed from: b, reason: collision with root package name */
        public final long f444074b;

        /* renamed from: c, reason: collision with root package name */
        public final long f444075c;

        public C12957c(long j12, long j13, float f12) {
            this.f444073a = f12;
            this.f444074b = j12;
            this.f444075c = j13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12957c)) {
                return false;
            }
            C12957c c12957c = (C12957c) obj;
            return Float.compare(this.f444073a, c12957c.f444073a) == 0 && this.f444074b == c12957c.f444074b && this.f444075c == c12957c.f444075c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f444075c) + r.g(Float.hashCode(this.f444073a) * 31, 31, this.f444074b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Uploading(progress=");
            sb2.append(this.f444073a);
            sb2.append(", uploadedBytes=");
            sb2.append(this.f444074b);
            sb2.append(", totalBytes=");
            return r.u(sb2, this.f444075c, ')');
        }
    }
}
