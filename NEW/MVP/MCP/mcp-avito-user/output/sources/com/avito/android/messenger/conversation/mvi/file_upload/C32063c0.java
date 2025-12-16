package com.avito.android.messenger.conversation.mvi.file_upload;

import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: MessengerFileUploadConfigProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/c0;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/b0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.c0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32063c0 implements InterfaceC32061b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.C0 f191130a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.service.d f191131b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f191132c = C42727D.c(new a());

    /* compiled from: MessengerFileUploadConfigProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/HttpUrl;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.c0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<HttpUrl> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final HttpUrl invoke() {
            HttpUrl httpUrl = HttpUrl.INSTANCE.parse(C32063c0.this.f191131b.g());
            if (httpUrl != null) {
                return httpUrl;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Inject
    public C32063c0(@Y61.k ru.avito.messenger.C0 c02, @Y61.k com.avito.android.messenger.service.d dVar) {
        this.f191130a = c02;
        this.f191131b = dVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32061b0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O getConfig() {
        return this.f191130a.d().r(new C32065d0(this));
    }
}
