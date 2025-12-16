package com.avito.android.di.module;

import android.content.Context;
import com.avito.android.util.C35759b4;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.CookieJar;

/* compiled from: ApiModule_ProvidePreferencesCookieJarFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/G0;", "Ldagger/internal/h;", "Lokhttp3/CookieJar;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class G0 implements dagger.internal.h<CookieJar> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f143963b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f143964a;

    /* compiled from: ApiModule_ProvidePreferencesCookieJarFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/G0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public G0(@Y61.k B0 b02, @Y61.k C30102l3 c30102l3) {
        this.f143964a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f143964a.get();
        f143963b.getClass();
        return new C35759b4(new AK0.j().a(context, "CookieStore"));
    }
}
