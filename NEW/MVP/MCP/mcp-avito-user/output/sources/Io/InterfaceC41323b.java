package iO;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.interior_photos_block.entity.InteriorPhotoBlock;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InteriorPhotosBlockInternalAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LiO/b;", "", "a", "LiO/b$a;", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iO.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC41323b {

    /* compiled from: InteriorPhotosBlockInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiO/b$a;", "LiO/b;", "_avito_interior-photos-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iO.b$a */
    public static final /* data */ class a implements InterfaceC41323b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InteriorPhotoBlock f398510a;

        public a(@k InteriorPhotoBlock interiorPhotoBlock) {
            this.f398510a = interiorPhotoBlock;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f398510a, ((a) obj).f398510a);
        }

        public final int hashCode() {
            return this.f398510a.hashCode();
        }

        @k
        public final String toString() {
            return "SetContent(interiorPhotosBlock=" + this.f398510a + ')';
        }
    }
}
