package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import coil.fetch.h;
import coil.request.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: BitmapFetcher.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/b;", "Lcoil/fetch/h;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Bitmap f58377a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f58378b;

    /* compiled from: BitmapFetcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/b$a;", "Lcoil/fetch/h$a;", "Landroid/graphics/Bitmap;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements h.a<Bitmap> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, t tVar) {
            return new b((Bitmap) obj, tVar);
        }
    }

    public b(@Y61.k Bitmap bitmap, @Y61.k t tVar) {
        this.f58377a = bitmap;
        this.f58378b = tVar;
    }

    @Override // coil.fetch.h
    @Y61.l
    public final Object b(@Y61.k Continuation<? super g> continuation) {
        return new f(new BitmapDrawable(this.f58378b.f58717a.getResources(), this.f58377a), false, DataSource.f58269c);
    }
}
