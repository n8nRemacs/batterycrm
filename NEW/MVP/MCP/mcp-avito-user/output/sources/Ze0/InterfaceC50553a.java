package ze0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScannerAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lze0/a;", "", "a", "b", "c", "d", "Lze0/a$a;", "Lze0/a$b;", "Lze0/a$c;", "Lze0/a$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ze0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50553a {

    /* compiled from: ScannerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze0/a$a;", "Lze0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12961a implements InterfaceC50553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12961a f444109a = new C12961a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12961a);
        }

        public final int hashCode() {
            return -976158104;
        }

        @k
        public final String toString() {
            return "CancelScanning";
        }
    }

    /* compiled from: ScannerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze0/a$b;", "Lze0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.a$b */
    public static final /* data */ class b implements InterfaceC50553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f444110a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 706180972;
        }

        @k
        public final String toString() {
            return "CloseClicked";
        }
    }

    /* compiled from: ScannerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze0/a$c;", "Lze0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.a$c */
    public static final /* data */ class c implements InterfaceC50553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Uri> f444111a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Navigation f444112b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final CategoryParameters f444113c;

        public c(@k List list, @k Navigation navigation2, @k CategoryParameters categoryParameters) {
            this.f444111a = list;
            this.f444112b = navigation2;
            this.f444113c = categoryParameters;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f444111a, cVar.f444111a) && L.f(this.f444112b, cVar.f444112b) && L.f(this.f444113c, cVar.f444113c);
        }

        public final int hashCode() {
            return this.f444113c.hashCode() + ((this.f444112b.hashCode() + r.i(this.f444111a.hashCode() * 31, 31, true)) * 31);
        }

        @k
        public final String toString() {
            return "OnNewPhotos(uris=" + this.f444111a + ", isFromGallery=true, navigation=" + this.f444112b + ", categoryParameters=" + this.f444113c + ')';
        }
    }

    /* compiled from: ScannerAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze0/a$d;", "Lze0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.a$d */
    public static final /* data */ class d implements InterfaceC50553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f444114a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2137449976;
        }

        @k
        public final String toString() {
            return "RetryScan";
        }
    }
}
