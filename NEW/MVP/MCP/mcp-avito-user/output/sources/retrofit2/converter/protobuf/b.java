package retrofit2.converter.protobuf;

import com.google.protobuf.InterfaceC37707w0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.f;

/* compiled from: ProtoRequestBodyConverter.java */
/* loaded from: classes9.dex */
final class b<T extends InterfaceC37707w0> implements f<T, RequestBody> {

    /* renamed from: a, reason: collision with root package name */
    public static final MediaType f429982a = MediaType.get("application/x-protobuf");

    @Override // retrofit2.f
    public final RequestBody convert(Object obj) {
        return RequestBody.create(f429982a, ((InterfaceC37707w0) obj).toByteArray());
    }
}
