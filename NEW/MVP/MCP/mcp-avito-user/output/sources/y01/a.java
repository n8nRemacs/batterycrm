package Y01;

import Y01.e;
import Y61.k;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import okhttp3.ResponseBody;
import retrofit2.f;

/* compiled from: DeserializationStrategyConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0004"}, d2 = {"LY01/a;", "T", "Lretrofit2/f;", "Lokhttp3/ResponseBody;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class a<T> implements f<ResponseBody, T> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f19250a;

    /* renamed from: b, reason: collision with root package name */
    public final e.b f19251b;

    public a(@k KSerializer kSerializer, @k e.b bVar) {
        this.f19250a = kSerializer;
        this.f19251b = bVar;
    }

    @Override // retrofit2.f
    public final Object convert(ResponseBody responseBody) {
        KSerializer kSerializer = this.f19250a;
        e.b bVar = this.f19251b;
        bVar.getClass();
        return bVar.f19257a.d(responseBody.string(), kSerializer);
    }
}
