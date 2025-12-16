package com.avito.android.edit_carousel.adapter.advert;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ly.InterfaceC43848a;

/* compiled from: EditCarouselAdvertItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/advert/a;", "Lly/a;", "b", "c", "Lcom/avito/android/edit_carousel/adapter/advert/a$b;", "Lcom/avito/android/edit_carousel/adapter/advert/a$c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a extends InterfaceC43848a {

    /* compiled from: EditCarouselAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.edit_carousel.adapter.advert.a$a, reason: collision with other inner class name */
    public static final class C4251a {
    }

    /* compiled from: EditCarouselAdvertItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/advert/a$c;", "Lcom/avito/android/edit_carousel/adapter/advert/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ExtendedProfileSettingsAdvert f146242b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f146243c;

        /* renamed from: d, reason: collision with root package name */
        public final int f146244d;

        public c(ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert, String str, int i12, int i13, C42822w c42822w) {
            str = (i13 & 2) != 0 ? String.valueOf(extendedProfileSettingsAdvert.f230267b) : str;
            this.f146242b = extendedProfileSettingsAdvert;
            this.f146243c = str;
            this.f146244d = i12;
        }

        @Override // com.avito.android.edit_carousel.adapter.advert.a
        @Y61.k
        /* renamed from: c2, reason: from getter */
        public final ExtendedProfileSettingsAdvert getF146242b() {
            return this.f146242b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f146242b, cVar.f146242b) && L.f(this.f146243c, cVar.f146243c) && this.f146244d == cVar.f146244d;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF121506b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF146243c() {
            return this.f146243c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f146244d) + H.d(this.f146242b.hashCode() * 31, 31, this.f146243c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SettingsAdvertItem(advert=");
            sb2.append(this.f146242b);
            sb2.append(", stringId=");
            sb2.append(this.f146243c);
            sb2.append(", number=");
            return r.t(sb2, this.f146244d, ')');
        }
    }

    @Y61.k
    /* renamed from: c2 */
    ExtendedProfileSettingsAdvert getF146242b();

    /* compiled from: EditCarouselAdvertItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/advert/a$b;", "Lcom/avito/android/edit_carousel/adapter/advert/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ExtendedProfileSettingsAdvert f146239b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f146240c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f146241d;

        public b(ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert, String str, boolean z12, int i12, C42822w c42822w) {
            this(extendedProfileSettingsAdvert, (i12 & 2) != 0 ? String.valueOf(extendedProfileSettingsAdvert.f230267b) : str, z12);
        }

        @Override // com.avito.android.edit_carousel.adapter.advert.a
        @Y61.k
        /* renamed from: c2, reason: from getter */
        public final ExtendedProfileSettingsAdvert getF146242b() {
            return this.f146239b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f146239b, bVar.f146239b) && L.f(this.f146240c, bVar.f146240c) && this.f146241d == bVar.f146241d;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF121506b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF146243c() {
            return this.f146240c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f146241d) + H.d(this.f146239b.hashCode() * 31, 31, this.f146240c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchAdvertItem(advert=");
            sb2.append(this.f146239b);
            sb2.append(", stringId=");
            sb2.append(this.f146240c);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f146241d, ')');
        }

        public b(@Y61.k ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert, @Y61.k String str, boolean z12) {
            this.f146239b = extendedProfileSettingsAdvert;
            this.f146240c = str;
            this.f146241d = z12;
        }
    }
}
