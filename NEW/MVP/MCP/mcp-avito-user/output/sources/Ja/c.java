package JA;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionImageState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LJA/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f8836f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f8837g = new c(null, null, false, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f8838b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UploadImage.ImageFromPhotoPicker f8839c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8840d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8841e;

    /* compiled from: ExtendedProfileSetSelectionImageState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJA/c$a;", "", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l Image image, @l UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, boolean z12, boolean z13) {
        this.f8838b = image;
        this.f8839c = imageFromPhotoPicker;
        this.f8840d = z12;
        this.f8841e = z13;
    }

    public static c a(c cVar, Image image, UploadImage.ImageFromPhotoPicker imageFromPhotoPicker, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            image = cVar.f8838b;
        }
        if ((i12 & 2) != 0) {
            imageFromPhotoPicker = cVar.f8839c;
        }
        if ((i12 & 4) != 0) {
            z12 = cVar.f8840d;
        }
        if ((i12 & 8) != 0) {
            z13 = cVar.f8841e;
        }
        cVar.getClass();
        return new c(image, imageFromPhotoPicker, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f8838b, cVar.f8838b) && L.f(this.f8839c, cVar.f8839c) && this.f8840d == cVar.f8840d && this.f8841e == cVar.f8841e;
    }

    public final int hashCode() {
        Image image = this.f8838b;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = this.f8839c;
        return Boolean.hashCode(this.f8841e) + r.i((iHashCode + (imageFromPhotoPicker != null ? imageFromPhotoPicker.hashCode() : 0)) * 31, 31, this.f8840d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSetSelectionImageState(savedImage=");
        sb2.append(this.f8838b);
        sb2.append(", selectedImage=");
        sb2.append(this.f8839c);
        sb2.append(", wasChanged=");
        sb2.append(this.f8840d);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f8841e, ')');
    }
}
