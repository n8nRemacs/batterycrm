package coil.fetch;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.fetch.h;
import coil.request.t;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.text.C43066x;
import okio.AbstractC44811v;
import okio.S;

/* compiled from: FileFetcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/i;", "Lcoil/fetch/h;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final File f58388a;

    /* compiled from: FileFetcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/i$a;", "Lcoil/fetch/h$a;", "Ljava/io/File;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements h.a<File> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, t tVar) {
            return new i((File) obj);
        }
    }

    public i(@Y61.k File file) {
        this.f58388a = file;
    }

    @Override // coil.fetch.h
    @Y61.l
    public final Object b(@Y61.k Continuation<? super g> continuation) {
        S.a aVar = S.f420033c;
        File file = this.f58388a;
        return new m(new coil.decode.m(S.a.a(aVar, file), AbstractC44811v.f420161a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(C43066x.n0('.', file.getName(), "")), DataSource.f58270d);
    }
}
