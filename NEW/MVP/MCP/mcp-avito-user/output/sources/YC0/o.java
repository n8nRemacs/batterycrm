package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.gallery.appending.ImageAppendingItem;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lyc0/o;", "Lyc0/D;", "a", "b", "Lyc0/o$a;", "Lyc0/o$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface o extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/o$a;", "Lyc0/o;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ImageAppendingItem f443324a;

        public a(@Y61.k ImageAppendingItem imageAppendingItem) {
            this.f443324a = imageAppendingItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443324a, ((a) obj).f443324a);
        }

        public final int hashCode() {
            return this.f443324a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GalleryImageAppendingAction(item=" + this.f443324a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/o$b;", "Lyc0/o;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final GalleryImageItem f443325a;

        public b(@Y61.k GalleryImageItem galleryImageItem) {
            this.f443325a = galleryImageItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443325a, ((b) obj).f443325a);
        }

        public final int hashCode() {
            return this.f443325a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GalleryImageWidgetAction(item=" + this.f443325a + ')';
        }
    }
}
