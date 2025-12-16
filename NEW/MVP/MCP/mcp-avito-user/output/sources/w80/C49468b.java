package w80;

import X41.n;
import Y61.k;
import android.os.Build;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.photo_storage.e;
import com.avito.android.photo_storage.g;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotosStorageModule_ProvideSharedFilesStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lw80/b;", "Ldagger/internal/h;", "Lcom/avito/android/photo_storage/SharedPhotosStorage;", "a", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w80.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49468b implements h<SharedPhotosStorage> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f441303c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<e> f441304a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.photo_storage.h f441305b;

    /* compiled from: PhotosStorageModule_ProvideSharedFilesStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw80/b$a;", "", "<init>", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w80.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static SharedPhotosStorage a(@k e eVar, @k g gVar) {
            int i12 = C49467a.f441302a;
            return Build.VERSION.SDK_INT < 29 ? eVar : gVar;
        }

        public a() {
        }
    }

    public C49468b(@k Provider provider, @k com.avito.android.photo_storage.h hVar) {
        this.f441304a = provider;
        this.f441305b = hVar;
    }

    @n
    @k
    public static final C49468b a(@k Provider provider, @k com.avito.android.photo_storage.h hVar) {
        f441303c.getClass();
        return new C49468b(provider, hVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f441304a.get();
        g gVar = (g) this.f441305b.get();
        f441303c.getClass();
        return a.a(eVar, gVar);
    }
}
