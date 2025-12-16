package com.avito.android.messenger.conversation.mvi.send;

import android.net.Uri;
import io.reactivex.rxjava3.internal.operators.observable.H1;
import kotlin.Metadata;

/* compiled from: PhotoPickerResultHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/j;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.send.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32218j {

    /* compiled from: PhotoPickerResultHandler.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/j$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.send.j$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f194522a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Uri f194523b;

        public a(@Y61.k Uri uri, long j12) {
            this.f194522a = j12;
            this.f194523b = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f194522a == aVar.f194522a && kotlin.jvm.internal.L.f(this.f194523b, aVar.f194523b);
        }

        public final int hashCode() {
            return this.f194523b.hashCode() + (Long.hashCode(this.f194522a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Photo(uploadId=");
            sb2.append(this.f194522a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f194523b, ')');
        }
    }

    @Y61.k
    H1 a(@Y61.k String str);
}
