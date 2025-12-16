package com.avito.android.messenger.conversation.mvi.file_upload;

import androidx.compose.runtime.C22026a;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/u0;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.u0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32098u0 {

    /* compiled from: VideoUploadInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a$a;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.u0$a */
    public static abstract class a {

        /* compiled from: VideoUploadInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a$a;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.u0$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5650a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Throwable f191242a;

            /* JADX WARN: Multi-variable type inference failed */
            public C5650a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5650a) && kotlin.jvm.internal.L.f(this.f191242a, ((C5650a) obj).f191242a);
            }

            public final int hashCode() {
                Throwable th2 = this.f191242a;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failed(exception="), this.f191242a, ')');
            }

            public C5650a(@Y61.l Throwable th2) {
                super(null);
                this.f191242a = th2;
            }

            public /* synthetic */ C5650a(Throwable th2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : th2);
            }
        }

        /* compiled from: VideoUploadInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a$b;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.u0$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f191243a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f191244b;

            public b(@Y61.k String str, @Y61.k String str2) {
                super(null);
                this.f191243a = str;
                this.f191244b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.L.f(this.f191243a, bVar.f191243a) && kotlin.jvm.internal.L.f(this.f191244b, bVar.f191244b);
            }

            public final int hashCode() {
                return this.f191244b.hashCode() + (this.f191243a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(fileId=");
                sb2.append(this.f191243a);
                sb2.append(", videoId=");
                return C22026a.c(sb2, this.f191244b, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Y61.k
    C42022u a(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);
}
