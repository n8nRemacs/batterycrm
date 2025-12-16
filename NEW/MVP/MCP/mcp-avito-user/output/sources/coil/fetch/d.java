package coil.fetch;

import android.net.Uri;
import coil.fetch.h;
import coil.request.t;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ContentUriFetcher.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/d;", "Lcoil/fetch/h;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Uri f58381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f58382b;

    /* compiled from: ContentUriFetcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/d$a;", "Lcoil/fetch/h$a;", "Landroid/net/Uri;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements h.a<Uri> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, t tVar) {
            Uri uri = (Uri) obj;
            if (L.f(uri.getScheme(), "content")) {
                return new d(uri, tVar);
            }
            return null;
        }
    }

    public d(@Y61.k Uri uri, @Y61.k t tVar) {
        this.f58381a = uri;
        this.f58382b = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    @Override // coil.fetch.h
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.Continuation<? super coil.fetch.g> r9) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
