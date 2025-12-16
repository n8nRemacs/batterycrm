package Y01;

import Y01.e;
import Y61.k;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.f;

/* compiled from: SerializationStrategyConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"LY01/d;", "T", "Lretrofit2/f;", "Lokhttp3/RequestBody;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class d<T> implements f<T, RequestBody> {

    /* renamed from: a, reason: collision with root package name */
    public final MediaType f19254a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f19255b;

    /* renamed from: c, reason: collision with root package name */
    public final e.b f19256c;

    public d(@k MediaType mediaType, @k KSerializer kSerializer, @k e.b bVar) {
        this.f19254a = mediaType;
        this.f19255b = kSerializer;
        this.f19256c = bVar;
    }

    @Override // retrofit2.f
    public final RequestBody convert(Object obj) {
        return RequestBody.create(this.f19254a, this.f19256c.f19257a.c(this.f19255b, obj));
    }
}
