package com.avito.android.messenger.conversation.mvi.file_upload;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: UploadUniqueInfo.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/s0;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/file_upload/s0$a;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/s0$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.s0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC32094s0 {

    /* compiled from: UploadUniqueInfo.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/s0$a;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/s0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.s0$a */
    public static final /* data */ class a extends AbstractC32094s0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f191218a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f191219b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f191220c;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
            super(null);
            this.f191218a = str;
            this.f191219b = messengerUserHashInfo;
            this.f191220c = str2;
        }

        @Override // com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF191223c() {
            return this.f191220c;
        }

        @Override // com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF191221a() {
            return this.f191218a;
        }

        @Override // com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final MessengerUserHashInfo getF191222b() {
            return this.f191219b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f191218a, aVar.f191218a) && kotlin.jvm.internal.L.f(this.f191219b, aVar.f191219b) && kotlin.jvm.internal.L.f(this.f191220c, aVar.f191220c);
        }

        public final int hashCode() {
            return this.f191220c.hashCode() + ((this.f191219b.hashCode() + (this.f191218a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("File(localMessageId=");
            sb2.append(this.f191218a);
            sb2.append(", userInfo=");
            sb2.append(this.f191219b);
            sb2.append(", channelId=");
            return C22026a.c(sb2, this.f191220c, ')');
        }
    }

    /* compiled from: UploadUniqueInfo.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/s0$b;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/s0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.s0$b */
    public static final /* data */ class b extends AbstractC32094s0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f191221a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f191222b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f191223c;

        /* renamed from: d, reason: collision with root package name */
        public final long f191224d;

        /* renamed from: e, reason: collision with root package name */
        public final long f191225e;

        public b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str2, long j12, long j13) {
            super(null);
            this.f191221a = str;
            this.f191222b = messengerUserHashInfo;
            this.f191223c = str2;
            this.f191224d = j12;
            this.f191225e = j13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF191223c() {
            return this.f191223c;
        }

        @Override // com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF191221a() {
            return this.f191221a;
        }

        @Override // com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final MessengerUserHashInfo getF191222b() {
            return this.f191222b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f191221a, bVar.f191221a) && kotlin.jvm.internal.L.f(this.f191222b, bVar.f191222b) && kotlin.jvm.internal.L.f(this.f191223c, bVar.f191223c) && this.f191224d == bVar.f191224d && this.f191225e == bVar.f191225e;
        }

        public final int hashCode() {
            return Long.hashCode(this.f191225e) + androidx.appcompat.app.r.g(androidx.compose.foundation.H.d((this.f191222b.hashCode() + (this.f191221a.hashCode() * 31)) * 31, 31, this.f191223c), 31, this.f191224d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileChunk(localMessageId=");
            sb2.append(this.f191221a);
            sb2.append(", userInfo=");
            sb2.append(this.f191222b);
            sb2.append(", channelId=");
            sb2.append(this.f191223c);
            sb2.append(", partNumber=");
            sb2.append(this.f191224d);
            sb2.append(", totalNumberOfParts=");
            return androidx.appcompat.app.r.u(sb2, this.f191225e, ')');
        }
    }

    public /* synthetic */ AbstractC32094s0(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: a */
    public abstract String getF191223c();

    @Y61.k
    /* renamed from: b */
    public abstract String getF191221a();

    @Y61.k
    /* renamed from: c */
    public abstract MessengerUserHashInfo getF191222b();

    public AbstractC32094s0() {
    }
}
