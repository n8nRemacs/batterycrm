package xb;

import com.avito.android.remote.interceptor.U0;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: R8$$SyntheticClass */
/* renamed from: xb.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C49917c implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f442568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f442569c;

    public /* synthetic */ C49917c(U0 u02, String str) {
        this.f442568b = u02;
        this.f442569c = str;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader(this.f442568b.getKey(), this.f442569c).build());
    }
}
