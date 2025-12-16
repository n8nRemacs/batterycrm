package ys;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditPartnerAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lys/a;", "", "a", "b", "c", "d", "e", "f", "Lys/a$a;", "Lys/a$b;", "Lys/a$c;", "Lys/a$d;", "Lys/a$e;", "Lys/a$f;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ys.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC50286a {

    /* compiled from: CreditPartnerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/a$a;", "Lys/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12922a implements InterfaceC50286a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ValueCallback<Uri[]> f443524a;

        public C12922a(@l ValueCallback<Uri[]> valueCallback) {
            this.f443524a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12922a) && L.f(this.f443524a, ((C12922a) obj).f443524a);
        }

        public final int hashCode() {
            ValueCallback<Uri[]> valueCallback = this.f443524a;
            if (valueCallback == null) {
                return 0;
            }
            return valueCallback.hashCode();
        }

        @k
        public final String toString() {
            return "OnCameraPermissionGranted(filePathCallback=" + this.f443524a + ')';
        }
    }

    /* compiled from: CreditPartnerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/a$b;", "Lys/a;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.a$b */
    public static final class b implements InterfaceC50286a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f443525a = new b();
    }

    /* compiled from: CreditPartnerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/a$c;", "Lys/a;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.a$c */
    public static final class c implements InterfaceC50286a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f443526a = new c();
    }

    /* compiled from: CreditPartnerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/a$d;", "Lys/a;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.a$d */
    public static final class d implements InterfaceC50286a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f443527a = new d();
    }

    /* compiled from: CreditPartnerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/a$e;", "Lys/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.a$e */
    public static final /* data */ class e implements InterfaceC50286a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ValueCallback<Uri[]> f443528a;

        public e(@k ValueCallback<Uri[]> valueCallback) {
            this.f443528a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f443528a, ((e) obj).f443528a);
        }

        public final int hashCode() {
            return this.f443528a.hashCode();
        }

        @k
        public final String toString() {
            return "OnWebShowFileChooserCalled(filePathCallback=" + this.f443528a + ')';
        }
    }

    /* compiled from: CreditPartnerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/a$f;", "Lys/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.a$f */
    public static final /* data */ class f implements InterfaceC50286a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PowerWebViewStateChangeEvent f443529a;

        public f(@k PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
            this.f443529a = powerWebViewStateChangeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f443529a, ((f) obj).f443529a);
        }

        public final int hashCode() {
            return this.f443529a.hashCode();
        }

        @k
        public final String toString() {
            return "OnWebViewStateChanged(event=" + this.f443529a + ')';
        }
    }
}
