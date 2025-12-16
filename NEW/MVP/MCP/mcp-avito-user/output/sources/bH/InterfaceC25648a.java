package bh;

import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.PermissionDenialType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeScannerAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lbh/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Lbh/a$a;", "Lbh/a$b;", "Lbh/a$c;", "Lbh/a$d;", "Lbh/a$e;", "Lbh/a$f;", "Lbh/a$g;", "Lbh/a$h;", "Lbh/a$i;", "Lbh/a$j;", "Lbh/a$k;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC25648a {

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/a$a;", "Lbh/a;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$a, reason: collision with other inner class name */
    public static final class C2009a implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C2009a f57367a = new C2009a();
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/a$b;", "Lbh/a;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$b */
    public static final /* data */ class b implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f57368a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bitmap f57369b;

        public b(@l Bitmap bitmap, @Y61.k String str) {
            this.f57368a = str;
            this.f57369b = bitmap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f57368a, bVar.f57368a) && L.f(this.f57369b, bVar.f57369b);
        }

        public final int hashCode() {
            int iHashCode = this.f57368a.hashCode() * 31;
            Bitmap bitmap = this.f57369b;
            return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "BarcodeFound(barcodeValue=" + this.f57368a + ", imageBitmap=" + this.f57369b + ')';
        }
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/a$c;", "Lbh/a;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$c */
    public static final /* data */ class c implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PermissionDenialType f57370a;

        public c(@Y61.k PermissionDenialType permissionDenialType) {
            this.f57370a = permissionDenialType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f57370a == ((c) obj).f57370a;
        }

        public final int hashCode() {
            return this.f57370a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CameraPermissionDenied(denialType=" + this.f57370a + ')';
        }
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/a$d;", "Lbh/a;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$d */
    public static final class d implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f57371a = new d();
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/a$e;", "Lbh/a;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$e */
    public static final class e implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f57372a = new e();
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/a$f;", "Lbh/a;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$f */
    public static final class f implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f57373a = new f();
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/a$g;", "Lbh/a;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$g */
    public static final class g implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f57374a = new g();
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/a$h;", "Lbh/a;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$h */
    public static final class h implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f57375a = new h();
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/a$i;", "Lbh/a;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$i */
    public static final class i implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f57376a = new i();
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/a$j;", "Lbh/a;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$j */
    public static final /* data */ class j implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f57377a;

        public j(boolean z12) {
            this.f57377a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f57377a == ((j) obj).f57377a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57377a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("ScannerBindComplete(isFlashlightAvailable="), this.f57377a, ')');
        }
    }

    /* compiled from: BarcodeScannerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/a$k;", "Lbh/a;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.a$k */
    public static final /* data */ class k implements InterfaceC25648a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f57378a;

        public k(@Y61.k Throwable th2) {
            this.f57378a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f57378a, ((k) obj).f57378a);
        }

        public final int hashCode() {
            return this.f57378a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ScannerFeatureFailure(error="), this.f57378a, ')');
        }
    }
}
