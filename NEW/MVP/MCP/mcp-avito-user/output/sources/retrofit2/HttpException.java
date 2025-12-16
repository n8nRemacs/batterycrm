package retrofit2;

import java.util.Objects;
import okhttp3.Response;

/* loaded from: classes9.dex */
public class HttpException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final int f429952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f429953c;

    /* renamed from: d, reason: collision with root package name */
    public final transient y<?> f429954d;

    public HttpException(y<?> yVar) {
        Objects.requireNonNull(yVar, "response == null");
        StringBuilder sb2 = new StringBuilder("HTTP ");
        Response response = yVar.f430118a;
        sb2.append(response.code());
        sb2.append(" ");
        sb2.append(response.message());
        super(sb2.toString());
        this.f429952b = response.code();
        this.f429953c = response.message();
        this.f429954d = yVar;
    }
}
