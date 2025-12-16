package com.avito.android.messenger.conversation.mvi.file_upload;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileUploadInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/t;", "", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32095t {

    /* compiled from: FileUploadInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a$a;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.t$a */
    public static abstract class a {

        /* compiled from: FileUploadInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a$a;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.t$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5648a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Throwable f191226a;

            /* JADX WARN: Multi-variable type inference failed */
            public C5648a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5648a) && kotlin.jvm.internal.L.f(this.f191226a, ((C5648a) obj).f191226a);
            }

            public final int hashCode() {
                Throwable th2 = this.f191226a;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failed(exception="), this.f191226a, ')');
            }

            public C5648a(@Y61.l Throwable th2) {
                super(null);
                this.f191226a = th2;
            }

            public /* synthetic */ C5648a(Throwable th2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : th2);
            }
        }

        /* compiled from: FileUploadInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a$b;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.t$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f191227a;

            public b(@Y61.k String str) {
                super(null);
                this.f191227a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f191227a, ((b) obj).f191227a);
            }

            public final int hashCode() {
                return this.f191227a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(fileId="), this.f191227a, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FileUploadInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b$a;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.t$b */
    public static abstract class b {

        /* compiled from: FileUploadInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b$a;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.t$b$a */
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Throwable f191228a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f191228a, ((a) obj).f191228a);
            }

            public final int hashCode() {
                Throwable th2 = this.f191228a;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failed(exception="), this.f191228a, ')');
            }

            public a(@Y61.l Throwable th2) {
                super(null);
                this.f191228a = th2;
            }

            public /* synthetic */ a(Throwable th2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : th2);
            }
        }

        /* compiled from: FileUploadInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b$b;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.t$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5649b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f191229a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f191230b;

            public C5649b(@Y61.k String str, @Y61.k String str2) {
                super(null);
                this.f191229a = str;
                this.f191230b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5649b)) {
                    return false;
                }
                C5649b c5649b = (C5649b) obj;
                return kotlin.jvm.internal.L.f(this.f191229a, c5649b.f191229a) && kotlin.jvm.internal.L.f(this.f191230b, c5649b.f191230b);
            }

            public final int hashCode() {
                return this.f191230b.hashCode() + (this.f191229a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(fileId=");
                sb2.append(this.f191229a);
                sb2.append(", voiceId=");
                return C22026a.c(sb2, this.f191230b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.U a(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.U b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k MessageBody.File file);
}
