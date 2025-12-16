package retrofit2.converter.protobuf;

import com.google.protobuf.InterfaceC37707w0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.L0;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.f;

/* compiled from: ProtoResponseBodyConverter.java */
/* loaded from: classes9.dex */
final class c<T extends InterfaceC37707w0> implements f<ResponseBody, T> {

    /* renamed from: a, reason: collision with root package name */
    public final L0<T> f429983a;

    public c(L0 l02) {
        this.f429983a = l02;
    }

    @Override // retrofit2.f
    public final Object convert(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        try {
            try {
                return this.f429983a.a(responseBody2.byteStream());
            } catch (InvalidProtocolBufferException e12) {
                throw new RuntimeException(e12);
            }
        } finally {
            responseBody2.close();
        }
    }
}
