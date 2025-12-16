package com.avito.android.user_advert.advert.request_launcher;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: MyAdvertPhotoGalleryRequestLauncher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_advert/advert/request_launcher/i;", "", "a", "b", "Lcom/avito/android/user_advert/advert/request_launcher/i$a;", "Lcom/avito/android/user_advert/advert/request_launcher/i$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
interface i {

    /* compiled from: MyAdvertPhotoGalleryRequestLauncher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/request_launcher/i$a;", "Lcom/avito/android/user_advert/advert/request_launcher/i;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f310607a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -25151942;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: MyAdvertPhotoGalleryRequestLauncher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/request_launcher/i$b;", "Lcom/avito/android/user_advert/advert/request_launcher/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public final int f310608a;

        public b(int i12) {
            this.f310608a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f310608a == ((b) obj).f310608a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f310608a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("PhotoPosition(position="), this.f310608a, ')');
        }
    }
}
