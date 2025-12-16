package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.decode.s;
import coil.fetch.h;
import coil.request.t;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import okio.M;
import okio.Y;

/* compiled from: AssetUriFetcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/a;", "Lcoil/fetch/h;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Uri f58375a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f58376b;

    /* compiled from: AssetUriFetcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/a$a;", "Lcoil/fetch/h$a;", "Landroid/net/Uri;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.fetch.a$a, reason: collision with other inner class name */
    public static final class C2072a implements h.a<Uri> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, t tVar) {
            Uri uri = (Uri) obj;
            if (coil.util.l.d(uri)) {
                return new a(uri, tVar);
            }
            return null;
        }
    }

    public a(@Y61.k Uri uri, @Y61.k t tVar) {
        this.f58375a = uri;
        this.f58376b = tVar;
    }

    @Override // coil.fetch.h
    @Y61.l
    public final Object b(@Y61.k Continuation<? super g> continuation) {
        String strO = C42745f0.O(C42745f0.w(this.f58375a.getPathSegments(), 1), "/", null, null, null, 62);
        t tVar = this.f58376b;
        return new m(s.b(new Y(M.g(tVar.f58717a.getAssets().open(strO))), tVar.f58717a, new coil.decode.a()), coil.util.l.b(MimeTypeMap.getSingleton(), strO), DataSource.f58270d);
    }
}
