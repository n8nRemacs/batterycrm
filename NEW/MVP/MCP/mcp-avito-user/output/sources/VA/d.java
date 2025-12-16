package vA;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.photo_cache.PhotoUpload;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BannerImageEditState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LvA/d;", "", "a", "b", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f440505e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d f440506f = new d(null, false, null, false, 15, null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final PhotoUpload f440507a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f440508b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f440509c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440510d;

    /* compiled from: BannerImageEditState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvA/d$a;", "", "<init>", "()V", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BannerImageEditState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvA/d$b;", "", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440511a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f440512b;

        public b(@k String str, @k String str2) {
            this.f440511a = str;
            this.f440512b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f440511a, bVar.f440511a) && L.f(this.f440512b, bVar.f440512b);
        }

        public final int hashCode() {
            return this.f440512b.hashCode() + (this.f440511a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WarningDialog(header=");
            sb2.append(this.f440511a);
            sb2.append(", body=");
            return C22026a.c(sb2, this.f440512b, ')');
        }
    }

    public d() {
        this(null, false, null, false, 15, null);
    }

    public static d a(d dVar, PhotoUpload photoUpload, boolean z12, b bVar, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            photoUpload = dVar.f440507a;
        }
        if ((i12 & 2) != 0) {
            z12 = dVar.f440508b;
        }
        if ((i12 & 4) != 0) {
            bVar = dVar.f440509c;
        }
        if ((i12 & 8) != 0) {
            z13 = dVar.f440510d;
        }
        dVar.getClass();
        return new d(photoUpload, z12, bVar, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f440507a, dVar.f440507a) && this.f440508b == dVar.f440508b && L.f(this.f440509c, dVar.f440509c) && this.f440510d == dVar.f440510d;
    }

    public final int hashCode() {
        PhotoUpload photoUpload = this.f440507a;
        int i12 = r.i((photoUpload == null ? 0 : photoUpload.hashCode()) * 31, 31, this.f440508b);
        b bVar = this.f440509c;
        return Boolean.hashCode(this.f440510d) + ((i12 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BannerImageEditState(selectedImage=");
        sb2.append(this.f440507a);
        sb2.append(", isSaveButtonLoading=");
        sb2.append(this.f440508b);
        sb2.append(", warningDialog=");
        sb2.append(this.f440509c);
        sb2.append(", isImageInvalid=");
        return r.x(sb2, this.f440510d, ')');
    }

    public d(@l PhotoUpload photoUpload, boolean z12, @l b bVar, boolean z13) {
        this.f440507a = photoUpload;
        this.f440508b = z12;
        this.f440509c = bVar;
        this.f440510d = z13;
    }

    public /* synthetic */ d(PhotoUpload photoUpload, boolean z12, b bVar, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : photoUpload, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : bVar, (i12 & 8) != 0 ? false : z13);
    }
}
