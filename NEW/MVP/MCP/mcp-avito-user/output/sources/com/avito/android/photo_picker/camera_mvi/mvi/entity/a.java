package com.avito.android.photo_picker.camera_mvi.mvi.entity;

import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CameraInternalAction.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0011\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$b;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$c;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$d;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$e;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$f;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$g;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$h;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$i;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$k;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$l;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$m;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$n;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$o;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$p;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$q;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.camera_mvi.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6587a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C6587a f219180a = new C6587a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C6587a);
        }

        public final int hashCode() {
            return -427351618;
        }

        @Y61.k
        public final String toString() {
            return "CameraLoading";
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$b;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CameraState.CameraType f219181a;

        public b(@Y61.k CameraState.CameraType cameraType) {
            this.f219181a = cameraType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f219181a == ((b) obj).f219181a;
        }

        public final int hashCode() {
            return this.f219181a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeCameraType(cameraType=" + this.f219181a + ')';
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$c;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CameraState.Flash f219182a;

        public c(@Y61.k CameraState.Flash flash) {
            this.f219182a = flash;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f219182a == ((c) obj).f219182a;
        }

        public final int hashCode() {
            return this.f219182a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeFlash(flash=" + this.f219182a + ')';
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$d;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CameraState.Ratio f219183a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CameraState.Ratio f219184b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f219185c;

        public d(@Y61.k CameraState.Ratio ratio, @Y61.k CameraState.Ratio ratio2, boolean z12) {
            this.f219183a = ratio;
            this.f219184b = ratio2;
            this.f219185c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f219183a == dVar.f219183a && this.f219184b == dVar.f219184b && this.f219185c == dVar.f219185c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f219185c) + ((this.f219184b.hashCode() + (this.f219183a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeRatio(iconRatio=");
            sb2.append(this.f219183a);
            sb2.append(", cameraRatio=");
            sb2.append(this.f219184b);
            sb2.append(", isLandscape=");
            return r.x(sb2, this.f219185c, ')');
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$e;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f219186a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -843614771;
        }

        @Y61.k
        public final String toString() {
            return "ClosePicker";
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$f;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f219187a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -828566913;
        }

        @Y61.k
        public final String toString() {
            return "GoToSettings";
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$g;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f219188a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1174990545;
        }

        @Y61.k
        public final String toString() {
            return "GrantedPermission";
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$h;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f219189a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1034895277;
        }

        @Y61.k
        public final String toString() {
            return "OpenEdit";
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$i;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f219190a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1313268017;
        }

        @Y61.k
        public final String toString() {
            return "OpenGallery";
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$j;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f219191a;

        public j(boolean z12) {
            this.f219191a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f219191a == ((j) obj).f219191a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f219191a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("PermissionDenied(needShowSettings="), this.f219191a, ')');
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$k;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f219192a;

        public k(@Y61.k Uri uri) {
            this.f219192a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f219192a, ((k) obj).f219192a);
        }

        public final int hashCode() {
            return this.f219192a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("RegisterPhoto(uri="), this.f219192a, ')');
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$l;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        public final float f219193a;

        /* renamed from: b, reason: collision with root package name */
        public final float f219194b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f219195c;

        public l(float f12, float f13, boolean z12) {
            this.f219193a = f12;
            this.f219194b = f13;
            this.f219195c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Float.compare(this.f219193a, lVar.f219193a) == 0 && Float.compare(this.f219194b, lVar.f219194b) == 0 && this.f219195c == lVar.f219195c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f219195c) + r.d(this.f219194b, Float.hashCode(this.f219193a) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Rotate(degree=");
            sb2.append(this.f219193a);
            sb2.append(", alpha=");
            sb2.append(this.f219194b);
            sb2.append(", isLandscape=");
            return r.x(sb2, this.f219195c, ')');
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$m;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f219196a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1523459461;
        }

        @Y61.k
        public final String toString() {
            return "ShowCamera";
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$n;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f219197a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PrintableText f219198b;

        public n(@Y61.k PrintableText printableText, @Y61.k PrintableText printableText2) {
            this.f219197a = printableText;
            this.f219198b = printableText2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f219197a, nVar.f219197a) && L.f(this.f219198b, nVar.f219198b);
        }

        public final int hashCode() {
            return this.f219198b.hashCode() + (this.f219197a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowCameraError(title=");
            sb2.append(this.f219197a);
            sb2.append(", description=");
            return AK.c.m(sb2, this.f219198b, ')');
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$o;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f219199a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -2032897299;
        }

        @Y61.k
        public final String toString() {
            return "ShowRequestCameraPermission";
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$p;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CameraState.c f219200a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f219201b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f219202c;

        public p(@Y61.k CameraState.c cVar, @Y61.k String str, boolean z12) {
            this.f219200a = cVar;
            this.f219201b = str;
            this.f219202c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f219200a, pVar.f219200a) && L.f(this.f219201b, pVar.f219201b) && this.f219202c == pVar.f219202c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f219202c) + H.d(this.f219200a.hashCode() * 31, 31, this.f219201b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSelectedPhotos(selectedPhotos=");
            sb2.append(this.f219200a);
            sb2.append(", limits=");
            sb2.append(this.f219201b);
            sb2.append(", isLimitReached=");
            return r.x(sb2, this.f219202c, ')');
        }
    }

    /* compiled from: CameraInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a$q;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f219203a = new q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1979969746;
        }

        @Y61.k
        public final String toString() {
            return "TakePhoto";
        }
    }
}
