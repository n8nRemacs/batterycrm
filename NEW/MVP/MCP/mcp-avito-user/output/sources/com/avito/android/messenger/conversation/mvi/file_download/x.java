package com.avito.android.messenger.conversation.mvi.file_download;

import android.app.NotificationChannel;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.w0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadWorkerDelegate.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/x;", "Lcom/avito/android/messenger/conversation/mvi/file_download/w;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f190960a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f190961b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f190962c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32046j f190963d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f190964e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f190965f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f190966g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.m f190967h;

    @Inject
    public x(@Y61.k w0 w0Var, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC32046j interfaceC32046j, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.notification.m mVar) {
        this.f190960a = w0Var;
        this.f190961b = interfaceC32024m;
        this.f190962c = interfaceC47842z;
        this.f190963d = interfaceC32046j;
        this.f190964e = nVar;
        this.f190965f = interfaceC28373a;
        this.f190966g = interfaceC35745a5;
        this.f190967h = mVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.w
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.L a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l Integer num) {
        return this.f190960a.g().S().o(new B(this, num, str, str2, messengerUserHashInfo)).s(new C(this, num, str, str2, messengerUserHashInfo));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_download.w
    public final void b(@Y61.k NotificationChannel notificationChannel) {
        this.f190967h.b().b(notificationChannel);
    }

    /* compiled from: FileDownloadWorkerDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/x$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f190968a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f190969b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f190970c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f190971d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f190972e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f190973f;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, boolean z12, boolean z13) {
            this.f190968a = str;
            this.f190969b = str2;
            this.f190970c = str3;
            this.f190971d = str4;
            this.f190972e = z12;
            this.f190973f = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f190968a, aVar.f190968a) && kotlin.jvm.internal.L.f(this.f190969b, aVar.f190969b) && kotlin.jvm.internal.L.f(this.f190970c, aVar.f190970c) && kotlin.jvm.internal.L.f(this.f190971d, aVar.f190971d) && this.f190972e == aVar.f190972e && this.f190973f == aVar.f190973f;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(this.f190968a.hashCode() * 31, 31, this.f190969b);
            String str = this.f190970c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f190971d;
            return Boolean.hashCode(this.f190973f) + androidx.appcompat.app.r.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f190972e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileInfo(remoteUrl=");
            sb2.append(this.f190968a);
            sb2.append(", name=");
            sb2.append(this.f190969b);
            sb2.append(", mimeType=");
            sb2.append(this.f190970c);
            sb2.append(", token=");
            sb2.append(this.f190971d);
            sb2.append(", shouldSaveToExternalStorage=");
            sb2.append(this.f190972e);
            sb2.append(", shouldTryToGetFileNameAndMimeTypeFromResponse=");
            return androidx.appcompat.app.r.x(sb2, this.f190973f, ')');
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, z12, z13);
        }
    }
}
