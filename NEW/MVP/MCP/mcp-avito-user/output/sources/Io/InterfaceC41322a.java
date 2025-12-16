package iO;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.interior_photos_block.entity.InteriorPhotoBlock;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InteriorPhotosBlockAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LiO/a;", "", "a", "b", "LiO/a$a;", "LiO/a$b;", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iO.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC41322a {

    /* compiled from: InteriorPhotosBlockAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiO/a$a;", "LiO/a;", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iO.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11374a implements InterfaceC41322a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InteriorPhotoBlock f398506a;

        public C11374a(@k InteriorPhotoBlock interiorPhotoBlock) {
            this.f398506a = interiorPhotoBlock;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11374a) && L.f(this.f398506a, ((C11374a) obj).f398506a);
        }

        public final int hashCode() {
            return this.f398506a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(interiorPhotoBlock=" + this.f398506a + ')';
        }
    }

    /* compiled from: InteriorPhotosBlockAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiO/a$b;", "LiO/a;", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iO.a$b */
    public static final /* data */ class b implements InterfaceC41322a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Image> f398507a;

        /* renamed from: b, reason: collision with root package name */
        public final int f398508b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f398509c;

        public b(int i12, @l String str, @k List list) {
            this.f398507a = list;
            this.f398508b = i12;
            this.f398509c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f398507a, bVar.f398507a) && this.f398508b == bVar.f398508b && L.f(this.f398509c, bVar.f398509c);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f398508b, this.f398507a.hashCode() * 31, 31);
            String str = this.f398509c;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGallery(images=");
            sb2.append(this.f398507a);
            sb2.append(", selectedPhoto=");
            sb2.append(this.f398508b);
            sb2.append(", url=");
            return C22026a.c(sb2, this.f398509c, ')');
        }
    }
}
