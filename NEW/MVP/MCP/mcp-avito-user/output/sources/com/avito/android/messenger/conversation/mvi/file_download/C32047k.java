package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.messenger.conversation.mvi.file_download.FileDownloadException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import ru.avito.messenger.C0;

/* compiled from: FileDownloadRequestCallProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/k;", "Lcom/avito/android/messenger/conversation/mvi/file_download/j;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32047k implements InterfaceC32046j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<OkHttpClient> f190931a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f190932b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.service.d f190933c;

    /* compiled from: FileDownloadRequestCallProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/Call;", "sessionId", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_download.k$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f190935c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ HttpUrl f190936d;

        public a(String str, HttpUrl httpUrl) {
            this.f190935c = str;
            this.f190936d = httpUrl;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            C32047k c32047k = C32047k.this;
            Request.Builder builderAddHeader = new Request.Builder().get().addHeader("Origin", c32047k.f190933c.b()).addHeader("X-Session", (String) obj);
            String str = this.f190935c;
            if (str != null) {
                builderAddHeader = builderAddHeader.addHeader("X-File-Token", str);
            }
            return c32047k.f190931a.get().newCall(builderAddHeader.url(this.f190936d).build());
        }
    }

    @Inject
    public C32047k(@Y61.k h31.e<OkHttpClient> eVar, @Y61.k C0 c02, @Y61.k com.avito.android.messenger.service.d dVar) {
        this.f190931a = eVar;
        this.f190932b = c02;
        this.f190933c = dVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32046j
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Call> a(@Y61.k String str, @Y61.l String str2) {
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        return httpUrl != null ? this.f190932b.d().r(new a(str2, httpUrl)) : io.reactivex.rxjava3.core.I.l(new FileDownloadException.MalformedDownloadUrl(str));
    }
}
