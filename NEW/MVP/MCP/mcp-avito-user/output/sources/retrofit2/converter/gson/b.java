package retrofit2.converter.gson;

import com.adjust.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.C44802l;
import okio.C44802l.c;
import retrofit2.f;

/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes9.dex */
final class b<T> implements f<T, RequestBody> {

    /* renamed from: c, reason: collision with root package name */
    public static final MediaType f429976c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f429977d = Charset.forName(Constants.ENCODING);

    /* renamed from: a, reason: collision with root package name */
    public final Gson f429978a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f429979b;

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f429978a = gson;
        this.f429979b = typeAdapter;
    }

    @Override // retrofit2.f
    public final RequestBody convert(Object obj) throws IOException {
        C44802l c44802l = new C44802l();
        com.google.gson.stream.c cVarI = this.f429978a.i(new OutputStreamWriter(c44802l.new c(), f429977d));
        this.f429979b.write(cVarI, obj);
        cVarI.close();
        return RequestBody.create(f429976c, c44802l.W0(c44802l.f420125c));
    }
}
