package vA;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BannerImageEditAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LvA/a;", "", "a", "b", "c", "d", "LvA/a$a;", "LvA/a$b;", "LvA/a$c;", "LvA/a$d;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vA.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49183a {

    /* compiled from: BannerImageEditAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/a$a;", "LvA/a;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.a$a, reason: collision with other inner class name */
    public static final class C12745a implements InterfaceC49183a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12745a f440489a = new C12745a();

        @k
        public final String toString() {
            return "OnWarningViewClicked";
        }
    }

    /* compiled from: BannerImageEditAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvA/a$b;", "LvA/a;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.a$b */
    public static final /* data */ class b implements InterfaceC49183a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y41.a<Bitmap> f440490a;

        public b(@k Y41.a<Bitmap> aVar) {
            this.f440490a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f440490a, ((b) obj).f440490a);
        }

        public final int hashCode() {
            return this.f440490a.hashCode();
        }

        @k
        public final String toString() {
            return r.v(new StringBuilder("SaveCroppedBitmap(bitmapProvider="), this.f440490a, ')');
        }
    }

    /* compiled from: BannerImageEditAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvA/a$c;", "LvA/a;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.a$c */
    public static final /* data */ class c implements InterfaceC49183a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final N f440491a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k Y41.a<Bitmap> aVar) {
            this.f440491a = (N) aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f440491a.equals(((c) obj).f440491a);
        }

        public final int hashCode() {
            return this.f440491a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.d(new StringBuilder("ValidateCroppedBitmap(bitmapProvider="), this.f440491a, ')');
        }
    }

    /* compiled from: BannerImageEditAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/a$d;", "LvA/a;", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vA.a$d */
    public static final class d implements InterfaceC49183a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f440492a = new d();

        @k
        public final String toString() {
            return "WarningDialogDismiss";
        }
    }
}
