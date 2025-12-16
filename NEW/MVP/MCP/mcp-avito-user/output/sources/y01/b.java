package Y01;

import Y01.e;
import Y61.k;
import Y61.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlinx.serialization.C;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.json.AbstractC43443a;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.f;
import retrofit2.z;

/* compiled from: Factory.kt */
@InterfaceC43387f
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY01/b;", "Lretrofit2/f$a;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class b extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public final MediaType f19252a;

    /* renamed from: b, reason: collision with root package name */
    public final e.b f19253b;

    public b(@k MediaType mediaType, @k e.b bVar) {
        this.f19252a = mediaType;
        this.f19253b = bVar;
    }

    @Override // retrofit2.f.a
    @l
    public final f a(@k Type type, @k Annotation[] annotationArr, @k Annotation[] annotationArr2) {
        e.b bVar = this.f19253b;
        return new d(this.f19252a, C.d(((AbstractC43443a) bVar.a()).getF412956b(), type), bVar);
    }

    @Override // retrofit2.f.a
    @l
    public final f<ResponseBody, ?> b(@k Type type, @k Annotation[] annotationArr, @k z zVar) {
        e.b bVar = this.f19253b;
        return new a(C.d(((AbstractC43443a) bVar.a()).getF412956b(), type), bVar);
    }
}
