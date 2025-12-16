package com.avito.android.photo_storage;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.appcompat.app.r;
import java.io.File;
import java.util.Calendar;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SharedPhotosStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_storage/SharedPhotosStorage;", "", "a", "CantSaveToSharedVolumeException", "b", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface SharedPhotosStorage {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f219943a = b.f219946a;

    /* compiled from: SharedPhotosStorage.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_storage/SharedPhotosStorage$CantSaveToSharedVolumeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantSaveToSharedVolumeException extends RuntimeException {
    }

    /* compiled from: SharedPhotosStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_storage/SharedPhotosStorage$a;", "", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Bitmap.CompressFormat f219944a;

        /* renamed from: b, reason: collision with root package name */
        public final int f219945b;

        public a(@Y61.k Bitmap.CompressFormat compressFormat, int i12) {
            this.f219944a = compressFormat;
            this.f219945b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f219944a == aVar.f219944a && this.f219945b == aVar.f219945b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f219945b) + (this.f219944a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BitmapSaveProperties(format=");
            sb2.append(this.f219944a);
            sb2.append(", quality=");
            return r.t(sb2, this.f219945b, ')');
        }
    }

    /* compiled from: SharedPhotosStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_storage/SharedPhotosStorage$b;", "", "<init>", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f219946a = new b();
    }

    /* compiled from: SharedPhotosStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public static Uri a(SharedPhotosStorage sharedPhotosStorage, Bitmap bitmap, Map map, a aVar, int i12) {
            SharedPhotosStorage.f219943a.getClass();
            String str = "avito-" + Calendar.getInstance().getTime().getTime() + "-shot.jpg";
            String str2 = "Avito" + File.separator;
            if ((i12 & 8) != 0) {
                map = null;
            }
            Map map2 = map;
            if ((i12 & 16) != 0) {
                aVar = new a(Bitmap.CompressFormat.JPEG, 90);
            }
            return sharedPhotosStorage.c(bitmap, str, str2, map2, aVar);
        }
    }

    boolean a(@Y61.k Uri uri);

    void b(@Y61.k Uri uri);

    @Y61.k
    Uri c(@Y61.k Bitmap bitmap, @Y61.k String str, @Y61.l String str2, @Y61.l Map<String, String> map, @Y61.k a aVar);

    boolean d(@Y61.k Uri uri);
}
