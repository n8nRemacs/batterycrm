package ru.avito.messenger.internal;

import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ru.avito.messenger.C0;
import ru.avito.messenger.InterfaceC47728a0;

/* compiled from: OkHttpMessengerImageUploader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/I;", "Lru/avito/messenger/a0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class I implements InterfaceC47728a0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<OkHttpClient> f431193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HttpUrl f431194b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f431195c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C0 f431196d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f431197e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f431198f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Gson f431199g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f431200h;

    /* compiled from: OkHttpMessengerImageUploader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/Request;", "sessionId", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f431201b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f431202c;

        public a(File file, I i12) {
            this.f431201b = file;
            this.f431202c = i12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            String str = (String) obj;
            MultipartBody multipartBodyBuild = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM).addFormDataPart("uploadfile[]", "image", RequestBody.INSTANCE.create(J.f431206a, this.f431201b)).build();
            Request.Builder builder = new Request.Builder();
            I i12 = this.f431202c;
            return (i12.f431197e ? builder.addHeader("Cookie", androidx.compose.foundation.H.o(new StringBuilder(), i12.f431198f, '=', str)) : builder.addHeader("X-Session", str)).addHeader("Origin", i12.f431195c).url(i12.f431194b).post(multipartBodyBuild).build();
        }
    }

    /* compiled from: OkHttpMessengerImageUploader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return I.this.f431193a.get().newCall((Request) obj);
        }
    }

    /* compiled from: OkHttpMessengerImageUploader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "call", "Lokhttp3/Call;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f431204b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((Call) obj).execute();
        }
    }

    /* compiled from: OkHttpMessengerImageUploader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lokhttp3/Response;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<T, R> implements l41.o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) throws IOException {
            Response response = (Response) obj;
            I i12 = I.this;
            i12.getClass();
            if (!response.isSuccessful()) {
                throw new IOException("Image upload failed with response code: " + response.code());
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Reader readerCharStream = responseBodyBody.charStream();
            Gson gson = i12.f431199g;
            gson.getClass();
            com.google.gson.stream.a aVar = new com.google.gson.stream.a(readerCharStream);
            aVar.f362208c = false;
            Object objC = gson.c(aVar, com.google.gson.k.class);
            Gson.a(aVar, objC);
            com.google.gson.k kVar = (com.google.gson.k) com.google.gson.internal.A.b(com.google.gson.k.class).cast(objC);
            if (kVar.f362194b.containsKey("error")) {
                throw new IOException(kVar.D("error").s());
            }
            return (String) ((Map.Entry) C42745f0.D(kVar.f362194b.entrySet())).getKey();
        }
    }

    public I(@Y61.k h31.e<OkHttpClient> eVar, @Y61.k HttpUrl httpUrl, @Y61.k String str, @Y61.k C0 c02, boolean z12, @Y61.k String str2, @Y61.k Gson gson, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f431193a = eVar;
        this.f431194b = httpUrl;
        this.f431195c = str;
        this.f431196d = c02;
        this.f431197e = z12;
        this.f431198f = str2;
        this.f431199g = gson;
        this.f431200h = interfaceC35745a5;
    }

    @Override // ru.avito.messenger.InterfaceC47728a0
    @Y61.k
    public final io.reactivex.rxjava3.core.I<String> a(@Y61.k File file) {
        U uD2 = this.f431196d.d();
        InterfaceC35745a5 interfaceC35745a5 = this.f431200h;
        return uD2.s(interfaceC35745a5.c()).r(new a(file, this)).r(new b()).s(interfaceC35745a5.a()).r(c.f431204b).s(interfaceC35745a5.c()).r(new d());
    }
}
