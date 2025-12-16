package vA;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.photo_cache.PhotoUpload;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerImageEditInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LvA/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LvA/b$a;", "LvA/b$b;", "LvA/b$c;", "LvA/b$d;", "LvA/b$e;", "LvA/b$f;", "LvA/b$g;", "LvA/b$h;", "LvA/b$i;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vA.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49184b {

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvA/b$a;", "LvA/b;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$a */
    public static final /* data */ class a implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f440493a;

        public a(boolean z12) {
            this.f440493a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f440493a == ((a) obj).f440493a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440493a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("BitmapValidation(isInvalid="), this.f440493a, ')');
        }
    }

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/b$b;", "LvA/b;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$b, reason: collision with other inner class name */
    public static final class C12746b implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12746b f440494a = new C12746b();

        @k
        public final String toString() {
            return "HideWarningDialog - internal";
        }
    }

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvA/b$c;", "LvA/b;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$c */
    public static final /* data */ class c implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440495a;

        public c(@k String str) {
            this.f440495a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f440495a, ((c) obj).f440495a);
        }

        public final int hashCode() {
            return this.f440495a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LeaveScreenWithSuccess(operationId="), this.f440495a, ')');
        }
    }

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/b$d;", "LvA/b;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$d */
    public static final class d implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f440496a = new d();

        @k
        public final String toString() {
            return "LoadingFailure - internal";
        }
    }

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvA/b$e;", "LvA/b;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$e */
    public static final /* data */ class e implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PhotoUpload f440497a;

        public e(@k PhotoUpload photoUpload) {
            this.f440497a = photoUpload;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f440497a, ((e) obj).f440497a);
        }

        public final int hashCode() {
            return this.f440497a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingSuccess(selectedImage=" + this.f440497a + ')';
        }
    }

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/b$f;", "LvA/b;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$f */
    public static final class f implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f440498a = new f();

        @k
        public final String toString() {
            return "SavingFinished - internal";
        }
    }

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/b$g;", "LvA/b;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$g */
    public static final class g implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f440499a = new g();

        @k
        public final String toString() {
            return "SavingInProgress - internal";
        }
    }

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/b$h;", "LvA/b;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$h */
    public static final class h implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f440500a = new h();

        @k
        public final String toString() {
            return "ShowToastBar - internal";
        }
    }

    /* compiled from: BannerImageEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/b$i;", "LvA/b;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.b$i */
    public static final class i implements InterfaceC49184b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f440501a = new i();

        @k
        public final String toString() {
            return "ShowWarningDialog - internal";
        }
    }
}
