package com.avito.android.photo_storage;

import X41.n;
import android.content.Context;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LegacySharedPhotosStorage_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_storage/f;", "Ldagger/internal/h;", "Lcom/avito/android/photo_storage/e;", "a", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f219952b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Context> f219953a;

    /* compiled from: LegacySharedPhotosStorage_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_storage/f$a;", "", "<init>", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k Provider<Context> provider) {
        this.f219953a = provider;
    }

    @n
    @Y61.k
    public static final f a(@Y61.k Provider<Context> provider) {
        f219952b.getClass();
        return new f(provider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f219953a.get();
        f219952b.getClass();
        return new e(context);
    }
}
