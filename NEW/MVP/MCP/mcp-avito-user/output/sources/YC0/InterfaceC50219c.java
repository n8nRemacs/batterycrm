package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.adapter.banner.ExtendedSettingsBannerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lyc0/c;", "Lyc0/D;", "a", "b", "c", "Lyc0/c$a;", "Lyc0/c$b;", "Lyc0/c$c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yc0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50219c extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/c$a;", "Lyc0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.c$a */
    public static final /* data */ class a implements InterfaceC50219c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedSettingsBannerItem f443227a;

        public a(@Y61.k ExtendedSettingsBannerItem extendedSettingsBannerItem) {
            this.f443227a = extendedSettingsBannerItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443227a, ((a) obj).f443227a);
        }

        public final int hashCode() {
            return this.f443227a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "BannerButtonClick(item=" + this.f443227a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/c$b;", "Lyc0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.c$b */
    public static final /* data */ class b implements InterfaceC50219c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UploadImage f443228a;

        public b(@Y61.k UploadImage uploadImage) {
            this.f443228a = uploadImage;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443228a, ((b) obj).f443228a);
        }

        public final int hashCode() {
            return this.f443228a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "BannerImageClick(image=" + this.f443228a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/c$c;", "Lyc0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12909c implements InterfaceC50219c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443229a;

        public C12909c(@Y61.k String str) {
            this.f443229a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12909c) {
                return L.f(this.f443229a, ((C12909c) obj).f443229a);
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(1) + (this.f443229a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return AK.c.s(new StringBuilder("PickBannerImage(fieldName="), this.f443229a, ", maxPhotoCount=1)");
        }
    }
}
