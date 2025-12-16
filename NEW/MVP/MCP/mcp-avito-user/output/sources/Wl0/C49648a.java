package wl0;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.util.A4;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.c;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.C44802l;
import okio.C44802l.c;
import retrofit2.f;

/* compiled from: RequestBodyConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lwl0/a;", "T", "Lretrofit2/f;", "Lokhttp3/RequestBody;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49648a<T> implements f<T, RequestBody> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final MediaType f441769e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final MediaType f441770f;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Type f441771a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f441772b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Annotation[] f441773c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f441774d;

    /* compiled from: RequestBodyConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lwl0/a$a;", "", "<init>", "()V", "Lokhttp3/MediaType;", "MEDIA_TYPE_FORM_URLENCODED", "Lokhttp3/MediaType;", "MEDIA_TYPE_JSON", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wl0.a$a, reason: collision with other inner class name */
    public static final class C12829a {
        public /* synthetic */ C12829a(C42822w c42822w) {
            this();
        }

        public C12829a() {
        }
    }

    static {
        new C12829a(null);
        MediaType.Companion companion = MediaType.INSTANCE;
        f441769e = companion.get("application/x-www-form-urlencoded;charset=UTF-8");
        f441770f = companion.get("application/json;charset=UTF-8");
    }

    public C49648a(@k Type type, @k Gson gson, @k Annotation[] annotationArr, boolean z12) {
        this.f441771a = type;
        this.f441772b = gson;
        this.f441773c = annotationArr;
        this.f441774d = z12;
    }

    public final RequestBody a(T t12) {
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : this.f441773c) {
            if (annotation instanceof Named) {
                arrayList.add(annotation);
            }
        }
        Named named = (Named) C42745f0.G(arrayList);
        String strValue = named != null ? named.value() : null;
        if (strValue == null) {
            strValue = "";
        }
        StringBuilder sb2 = new StringBuilder();
        A4.a(t12, strValue, sb2);
        return RequestBody.INSTANCE.create(sb2.toString(), f441769e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.f
    public final RequestBody convert(Object obj) {
        if (!this.f441774d) {
            if (obj == 0) {
                return a(obj);
            }
            if (obj.getClass().isArray()) {
                return a(obj);
            }
            throw new UnsupportedOperationException(obj.getClass().toString() + " is unsupported");
        }
        com.google.gson.reflect.a<?> aVar = com.google.gson.reflect.a.get(this.f441771a);
        Gson gson = this.f441772b;
        TypeAdapter<T> typeAdapterF = gson.f(aVar);
        C44802l c44802l = new C44802l();
        c cVarI = gson.i(new OutputStreamWriter(c44802l.new c(), Constants.ENCODING));
        try {
            typeAdapterF.write(cVarI, obj);
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(cVarI, null);
            return RequestBody.INSTANCE.create(c44802l.W0(c44802l.f420125c), f441770f);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(cVarI, th2);
                throw th3;
            }
        }
    }
}
