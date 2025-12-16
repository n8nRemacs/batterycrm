package o80;

import androidx.appcompat.app.r;
import androidx.camera.core.InterfaceC20120j0;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CameraAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lo80/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "Lo80/a$a;", "Lo80/a$b;", "Lo80/a$c;", "Lo80/a$d;", "Lo80/a$e;", "Lo80/a$f;", "Lo80/a$g;", "Lo80/a$h;", "Lo80/a$i;", "Lo80/a$j;", "Lo80/a$k;", "Lo80/a$l;", "Lo80/a$m;", "Lo80/a$n;", "Lo80/a$o;", "Lo80/a$p;", "Lo80/a$q;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC44600a {

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$a;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12165a implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12165a f419448a = new C12165a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C12165a);
        }

        public final int hashCode() {
            return -1294406147;
        }

        @Y61.k
        public final String toString() {
            return "CamaraInitialized";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$b;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$b */
    public static final /* data */ class b implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f419449a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1198007525;
        }

        @Y61.k
        public final String toString() {
            return "CamaraLoading";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo80/a$c;", "Lo80/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$c */
    public static final /* data */ class c implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f419450a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f419451b;

        public c(boolean z12, boolean z13) {
            this.f419450a = z12;
            this.f419451b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f419450a == cVar.f419450a && this.f419451b == cVar.f419451b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f419451b) + (Boolean.hashCode(this.f419450a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CameraPermissionResult(isGranted=");
            sb2.append(this.f419450a);
            sb2.append(", showRationale=");
            return r.x(sb2, this.f419451b, ')');
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$d;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$d */
    public static final /* data */ class d implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f419452a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -155038381;
        }

        @Y61.k
        public final String toString() {
            return "CameraTypeClick";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo80/a$e;", "Lo80/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$e */
    public static final /* data */ class e implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        public final int f419453a;

        public e(int i12) {
            this.f419453a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f419453a == ((e) obj).f419453a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f419453a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("CameraUnavailable(reason="), this.f419453a, ')');
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo80/a$f;", "Lo80/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$f */
    public static final /* data */ class f implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f419454a;

        public f(boolean z12) {
            this.f419454a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f419454a == ((f) obj).f419454a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f419454a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("CheckCameraPermission(showRationale="), this.f419454a, ')');
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$g;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$g */
    public static final /* data */ class g implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f419455a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1305917530;
        }

        @Y61.k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$h;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$h */
    public static final /* data */ class h implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f419456a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1818968272;
        }

        @Y61.k
        public final String toString() {
            return "DoneClick";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$i;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$i */
    public static final /* data */ class i implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f419457a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -439111506;
        }

        @Y61.k
        public final String toString() {
            return "FlashClick";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo80/a$j;", "Lo80/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$j */
    public static final class j implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC20120j0 f419458a;

        public j(@Y61.k InterfaceC20120j0 interfaceC20120j0) {
            this.f419458a = interfaceC20120j0;
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$k;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$k */
    public static final /* data */ class k implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f419459a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1426183821;
        }

        @Y61.k
        public final String toString() {
            return "RatioClick";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo80/a$l;", "Lo80/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$l */
    public static final /* data */ class l implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f419460a;

        public l(boolean z12) {
            this.f419460a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f419460a == ((l) obj).f419460a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f419460a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("RequestPermissionClick(showRationale="), this.f419460a, ')');
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo80/a$m;", "Lo80/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$m */
    public static final class m implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.device_orientation.c f419461a;

        public m(@Y61.k com.avito.android.device_orientation.c cVar) {
            this.f419461a = cVar;
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo80/a$n;", "Lo80/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$n */
    public static final class n implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f419462a;

        /* renamed from: b, reason: collision with root package name */
        public final int f419463b;

        public n(int i12, @Y61.k ArrayList arrayList) {
            this.f419462a = arrayList;
            this.f419463b = i12;
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$o;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$o */
    public static final /* data */ class o implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f419464a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1440140426;
        }

        @Y61.k
        public final String toString() {
            return "SelectedPhotosClick";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$p;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$p */
    public static final /* data */ class p implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f419465a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -671038317;
        }

        @Y61.k
        public final String toString() {
            return "TakePhotoClick";
        }
    }

    /* compiled from: CameraAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo80/a$q;", "Lo80/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o80.a$q */
    public static final /* data */ class q implements InterfaceC44600a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f419466a = new q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 321129478;
        }

        @Y61.k
        public final String toString() {
            return "VolumeButtonClick";
        }
    }
}
