package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import io.reactivex.rxjava3.internal.operators.completable.K;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.MultipartUploadPart;

/* compiled from: ChunkedVideoUploadWorkerDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o;", "Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/n;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f194952f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f194953a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f194954b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f194955c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C31667x f194956d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f194957e;

    /* compiled from: ChunkedVideoUploadWorkerDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ChunkedVideoUploadWorkerDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b$a;", "Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ChunkedVideoUploadWorkerDelegate.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b$a;", "Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AbstractC32094s0.b f194958a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f194959b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Throwable f194960c;

            public a(@Y61.k AbstractC32094s0.b bVar, @Y61.l String str, @Y61.k Throwable th2) {
                super(null);
                this.f194958a = bVar;
                this.f194959b = str;
                this.f194960c = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f194958a, aVar.f194958a) && L.f(this.f194959b, aVar.f194959b) && L.f(this.f194960c, aVar.f194960c);
            }

            public final int hashCode() {
                int iHashCode = this.f194958a.hashCode() * 31;
                String str = this.f194959b;
                return this.f194960c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(uploadUniqueInfo=");
                sb2.append(this.f194958a);
                sb2.append(", filePath=");
                sb2.append(this.f194959b);
                sb2.append(", exception=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f194960c, ')');
            }
        }

        /* compiled from: ChunkedVideoUploadWorkerDelegate.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b$b;", "Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/o$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.video.chunked_upload.o$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5761b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final AbstractC32094s0.b f194961a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f194962b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final MultipartUploadPart f194963c;

            public C5761b(@Y61.k AbstractC32094s0.b bVar, @Y61.l String str, @Y61.k MultipartUploadPart multipartUploadPart) {
                super(null);
                this.f194961a = bVar;
                this.f194962b = str;
                this.f194963c = multipartUploadPart;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5761b)) {
                    return false;
                }
                C5761b c5761b = (C5761b) obj;
                return L.f(this.f194961a, c5761b.f194961a) && L.f(this.f194962b, c5761b.f194962b) && L.f(this.f194963c, c5761b.f194963c);
            }

            public final int hashCode() {
                int iHashCode = this.f194961a.hashCode() * 31;
                String str = this.f194962b;
                return this.f194963c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Success(uploadUniqueInfo=" + this.f194961a + ", filePath=" + this.f194962b + ", multipartUploadPart=" + this.f194963c + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public o(@Y61.k w wVar, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k C31667x c31667x, @Y61.k C30277e1 c30277e1) {
        this.f194953a = wVar;
        this.f194954b = interfaceC32024m;
        this.f194955c = nVar;
        this.f194956d = c31667x;
        this.f194957e = c30277e1;
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.chunked_upload.n
    @Y61.k
    public final K a(@Y61.k AbstractC32094s0.b bVar, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l String str6) {
        return this.f194953a.a(bVar, str, str2, str3, str4, str5, str6).r(new r(bVar, str4)).u(new k(bVar, str4, 1)).o(new t(this)).l(new u(this));
    }
}
