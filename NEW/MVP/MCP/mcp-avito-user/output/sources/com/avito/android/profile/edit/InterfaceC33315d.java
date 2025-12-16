package com.avito.android.profile.edit;

import android.net.Uri;
import com.avito.android.profile.edit.refactoring.adapter.EditProfileItem;
import com.avito.android.profile.edit.refactoring.adapter.item.LocationItem;
import com.avito.android.profile.edit.refactoring.adapter.item.SubLocationItem;
import com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.util.Kundle;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.K0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EditProfileInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/edit/d;", "", "b", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile.edit.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33315d {

    /* compiled from: EditProfileInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.edit.d$a */
    public static final class a {
    }

    /* compiled from: EditProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/d$b;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.edit.d$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LocationItem f222078a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final SubLocationItem f222079b;

        public b(@Y61.k LocationItem locationItem, @Y61.l SubLocationItem subLocationItem) {
            this.f222078a = locationItem;
            this.f222079b = subLocationItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f222078a, bVar.f222078a) && kotlin.jvm.internal.L.f(this.f222079b, bVar.f222079b);
        }

        public final int hashCode() {
            int iHashCode = this.f222078a.hashCode() * 31;
            SubLocationItem subLocationItem = this.f222079b;
            return iHashCode + (subLocationItem == null ? 0 : subLocationItem.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "LocationItems(location=" + this.f222078a + ", subLocation=" + this.f222079b + ')';
        }
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<List<EditProfileItem>> a();

    @Y61.k
    io.reactivex.rxjava3.core.I<ProfileAvatar> b(@Y61.k Uri uri);

    @Y61.k
    List<NameIdEntity> c();

    @Y61.k
    B0 d(@Y61.l Location location, @Y61.l String str);

    @Y61.k
    Kundle d0();

    @Y61.k
    K0 g(@Y61.k List list);

    boolean h();
}
