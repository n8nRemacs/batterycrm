package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil.decode.DataSource;
import coil.fetch.h;
import coil.request.t;
import coil.util.p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: DrawableFetcher.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/e;", "Lcoil/fetch/h;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Drawable f58383a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f58384b;

    /* compiled from: DrawableFetcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/e$a;", "Lcoil/fetch/h$a;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements h.a<Drawable> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, t tVar) {
            return new e((Drawable) obj, tVar);
        }
    }

    public e(@Y61.k Drawable drawable, @Y61.k t tVar) {
        this.f58383a = drawable;
        this.f58384b = tVar;
    }

    @Override // coil.fetch.h
    @Y61.l
    public final Object b(@Y61.k Continuation<? super g> continuation) {
        Drawable bitmapDrawable = this.f58383a;
        Bitmap.Config[] configArr = coil.util.l.f58781a;
        boolean z12 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof androidx.vectordrawable.graphics.drawable.i);
        if (z12) {
            p pVar = p.f58788a;
            t tVar = this.f58384b;
            Bitmap.Config config = tVar.f58718b;
            pVar.getClass();
            bitmapDrawable = new BitmapDrawable(tVar.f58717a.getResources(), p.a(bitmapDrawable, config, tVar.f58720d, tVar.f58721e, tVar.f58722f));
        }
        return new f(bitmapDrawable, z12, DataSource.f58269c);
    }
}
