package bh;

import QZ0.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeScannerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lbh/b;", "", "a", "b", "c", "d", "e", "f", "Lbh/b$a;", "Lbh/b$b;", "Lbh/b$c;", "Lbh/b$d;", "Lbh/b$e;", "Lbh/b$f;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC25649b {

    /* compiled from: BarcodeScannerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/b$a;", "Lbh/b;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.b$a */
    public static final class a implements InterfaceC25649b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f57379a = new a();
    }

    /* compiled from: BarcodeScannerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/b$b;", "Lbh/b;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2010b implements InterfaceC25649b {

        /* renamed from: a, reason: collision with root package name */
        public final int f57380a;

        public C2010b(@a.b int i12) {
            this.f57380a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2010b) && this.f57380a == ((C2010b) obj).f57380a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57380a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("BindCameraAndScanner(barcodeFormat="), this.f57380a, ')');
        }
    }

    /* compiled from: BarcodeScannerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/b$c;", "Lbh/b;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.b$c */
    public static final class c implements InterfaceC25649b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f57381a = new c();
    }

    /* compiled from: BarcodeScannerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbh/b$d;", "Lbh/b;", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.b$d */
    public static final /* data */ class d implements InterfaceC25649b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57382a;

        public d(@k String str) {
            this.f57382a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f57382a, ((d) obj).f57382a);
        }

        public final int hashCode() {
            return this.f57382a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SubmitResult(barcodeValue="), this.f57382a, ')');
        }
    }

    /* compiled from: BarcodeScannerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/b$e;", "Lbh/b;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.b$e */
    public static final class e implements InterfaceC25649b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f57383a = new e();
    }

    /* compiled from: BarcodeScannerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh/b$f;", "Lbh/b;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh.b$f */
    public static final class f implements InterfaceC25649b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f57384a = new f();
    }
}
