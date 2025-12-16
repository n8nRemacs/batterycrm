package Le0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishRequestInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LLe0/b;", "", "a", "b", "c", "d", "LLe0/b$a;", "LLe0/b$b;", "LLe0/b$c;", "LLe0/b$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Le0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14385b {

    /* compiled from: PublishRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLe0/b$a;", "LLe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Le0.b$a */
    public static final /* data */ class a implements InterfaceC14385b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10052a;

        public a(@k String str) {
            this.f10052a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f10052a, ((a) obj).f10052a);
        }

        public final int hashCode() {
            return this.f10052a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(error="), this.f10052a, ')');
        }
    }

    /* compiled from: PublishRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLe0/b$b;", "LLe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Le0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0622b implements InterfaceC14385b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0622b f10053a = new C0622b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0622b);
        }

        public final int hashCode() {
            return -570594087;
        }

        @k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: PublishRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLe0/b$c;", "LLe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Le0.b$c */
    public static final /* data */ class c implements InterfaceC14385b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f10054a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1496299318;
        }

        @k
        public final String toString() {
            return "ShowPhotoUploadingError";
        }
    }

    /* compiled from: PublishRequestInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLe0/b$d;", "LLe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Le0.b$d */
    public static final /* data */ class d implements InterfaceC14385b {

        /* renamed from: a, reason: collision with root package name */
        public final int f10055a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10056b;

        public d(int i12, int i13) {
            this.f10055a = i12;
            this.f10056b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f10055a == dVar.f10055a && this.f10056b == dVar.f10056b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f10056b) + (Integer.hashCode(this.f10055a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdatePhotoUploadingProgress(count=");
            sb2.append(this.f10055a);
            sb2.append(", current=");
            return r.t(sb2, this.f10056b, ')');
        }
    }
}
