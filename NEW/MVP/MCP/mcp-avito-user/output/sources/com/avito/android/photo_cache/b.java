package com.avito.android.photo_cache;

import android.net.Uri;
import com.avito.android.remote.model.CloseableDataSource;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: PhotoInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_cache/b;", "", "b", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: PhotoInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: PhotoInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_cache/b$b;", "", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_cache.b$b, reason: collision with other inner class name */
    public interface InterfaceC6487b {
        void a(@Y61.k String str);
    }

    @Y61.k
    z<CloseableDataSource<? extends PhotoUpload>> a(@Y61.k String str);

    boolean b(@Y61.k String str);

    boolean c(int i12, int i13, @Y61.k String str);

    void d(@Y61.k String str);

    @Y61.k
    z<CloseableDataSource<? extends PhotoUpload>> e(@Y61.k String str);

    boolean f(@Y61.k String str, @Y61.k Uri uri, int i12);

    @Y61.k
    z g(long j12, @Y61.k String str);

    boolean h(@Y61.k String str, @Y61.k PhotoUpload photoUpload);

    long i(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, int i12, int i13, @Y61.l Uri uri, @Y61.l Uri uri2, @Y61.k EnhanceState enhanceState);
}
