package bh;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.CameraFlashState;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.PermissionDenialType;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeScannerState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lbh/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "e", "Lbh/c$a;", "Lbh/c$c;", "Lbh/c$d;", "Lbh/c$e;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC25650c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f57385b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C2011c f57386c = new C2011c(PermissionDenialType.f98998c);

    /* compiled from: BarcodeScannerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/c$a;", "Lbh/c;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.c$a */
    public static final /* data */ class a extends AbstractC25650c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f57387d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Bitmap f57388e;

        public a(@l Bitmap bitmap, @k String str) {
            super(null);
            this.f57387d = str;
            this.f57388e = bitmap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f57387d, aVar.f57387d) && L.f(this.f57388e, aVar.f57388e);
        }

        public final int hashCode() {
            int iHashCode = this.f57387d.hashCode() * 31;
            Bitmap bitmap = this.f57388e;
            return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        @k
        public final String toString() {
            return "BarcodeFound(barcodeValue=" + this.f57387d + ", barcodeImage=" + this.f57388e + ')';
        }
    }

    /* compiled from: BarcodeScannerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/c$b;", "", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: BarcodeScannerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/c$c;", "Lbh/c;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.c$c, reason: collision with other inner class name */
    public static final /* data */ class C2011c extends AbstractC25650c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PermissionDenialType f57389d;

        public C2011c(@k PermissionDenialType permissionDenialType) {
            super(null);
            this.f57389d = permissionDenialType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2011c) && this.f57389d == ((C2011c) obj).f57389d;
        }

        public final int hashCode() {
            return this.f57389d.hashCode();
        }

        @k
        public final String toString() {
            return "NoCameraPermission(denialType=" + this.f57389d + ')';
        }
    }

    /* compiled from: BarcodeScannerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/c$d;", "Lbh/c;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.c$d */
    public static final class d extends AbstractC25650c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final d f57390d = new d();

        public d() {
            super(null);
        }
    }

    /* compiled from: BarcodeScannerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/c$e;", "Lbh/c;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.c$e */
    public static final /* data */ class e extends AbstractC25650c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f57391d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final CameraFlashState f57392e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f57393f;

        public e(@k PrintableText printableText, @k CameraFlashState cameraFlashState, boolean z12) {
            super(null);
            this.f57391d = printableText;
            this.f57392e = cameraFlashState;
            this.f57393f = z12;
        }

        public static e a(e eVar, CameraFlashState cameraFlashState, boolean z12, int i12) {
            if ((i12 & 2) != 0) {
                cameraFlashState = eVar.f57392e;
            }
            if ((i12 & 4) != 0) {
                z12 = eVar.f57393f;
            }
            return new e(eVar.f57391d, cameraFlashState, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f57391d, eVar.f57391d) && this.f57392e == eVar.f57392e && this.f57393f == eVar.f57393f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57393f) + ((this.f57392e.hashCode() + (this.f57391d.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Scanning(scannerDescription=");
            sb2.append(this.f57391d);
            sb2.append(", flashState=");
            sb2.append(this.f57392e);
            sb2.append(", hasBoundScanner=");
            return r.x(sb2, this.f57393f, ')');
        }
    }

    public /* synthetic */ AbstractC25650c(C42822w c42822w) {
        this();
    }

    public AbstractC25650c() {
    }
}
