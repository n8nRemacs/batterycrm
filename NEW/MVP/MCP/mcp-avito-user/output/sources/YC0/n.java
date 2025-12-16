package yc0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lyc0/n;", "Lyc0/D;", "a", "b", "c", "d", "Lyc0/n$a;", "Lyc0/n$b;", "Lyc0/n$c;", "Lyc0/n$d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface n extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc0/n$a;", "Lyc0/n;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f443313a = new a();
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/n$b;", "Lyc0/n;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443314a;

        public b(@Y61.k String str) {
            this.f443314a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443314a, ((b) obj).f443314a);
        }

        public final int hashCode() {
            return this.f443314a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveGalleryOrder(fieldName="), this.f443314a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/n$c;", "Lyc0/n;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443315a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443316b;

        /* renamed from: c, reason: collision with root package name */
        public final int f443317c;

        /* renamed from: d, reason: collision with root package name */
        public final int f443318d;

        /* renamed from: e, reason: collision with root package name */
        public final int f443319e;

        /* renamed from: f, reason: collision with root package name */
        public final int f443320f;

        public c(int i12, @Y61.k String str, @Y61.k String str2, int i13, int i14, int i15) {
            this.f443315a = str;
            this.f443316b = str2;
            this.f443317c = i12;
            this.f443318d = i13;
            this.f443319e = i14;
            this.f443320f = i15;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f443315a, cVar.f443315a) && L.f(this.f443316b, cVar.f443316b) && this.f443317c == cVar.f443317c && this.f443318d == cVar.f443318d && this.f443319e == cVar.f443319e && this.f443320f == cVar.f443320f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f443320f) + androidx.appcompat.app.r.e(this.f443319e, androidx.appcompat.app.r.e(this.f443318d, androidx.appcompat.app.r.e(this.f443317c, H.d(this.f443315a.hashCode() * 31, 31, this.f443316b), 31), 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowGalleryImagePlaceholder(imageFieldName=");
            sb2.append(this.f443315a);
            sb2.append(", imageValueId=");
            sb2.append(this.f443316b);
            sb2.append(", x=");
            sb2.append(this.f443317c);
            sb2.append(", y=");
            sb2.append(this.f443318d);
            sb2.append(", width=");
            sb2.append(this.f443319e);
            sb2.append(", height=");
            return androidx.appcompat.app.r.t(sb2, this.f443320f, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/n$d;", "Lyc0/n;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443321a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443322b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f443323c;

        public d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f443321a = str;
            this.f443322b = str2;
            this.f443323c = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f443321a, dVar.f443321a) && L.f(this.f443322b, dVar.f443322b) && L.f(this.f443323c, dVar.f443323c);
        }

        public final int hashCode() {
            return this.f443323c.hashCode() + H.d(this.f443321a.hashCode() * 31, 31, this.f443322b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SwapGalleryItems(fieldName=");
            sb2.append(this.f443321a);
            sb2.append(", currentValueId=");
            sb2.append(this.f443322b);
            sb2.append(", targetValueId=");
            return C22026a.c(sb2, this.f443323c, ')');
        }
    }
}
