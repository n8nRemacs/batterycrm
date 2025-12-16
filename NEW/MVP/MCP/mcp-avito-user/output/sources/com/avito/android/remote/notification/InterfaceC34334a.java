package com.avito.android.remote.notification;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ActiveNotificationProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/notification/a;", "", "a", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.notification.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34334a {

    /* compiled from: ActiveNotificationProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/a$a;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.notification.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7612a {

        /* renamed from: a, reason: collision with root package name */
        public final int f253993a;

        /* renamed from: b, reason: collision with root package name */
        public final long f253994b;

        public C7612a(int i12, long j12) {
            this.f253993a = i12;
            this.f253994b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7612a)) {
                return false;
            }
            C7612a c7612a = (C7612a) obj;
            return this.f253993a == c7612a.f253993a && this.f253994b == c7612a.f253994b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f253994b) + (Integer.hashCode(this.f253993a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActiveNotificationInfo(id=");
            sb2.append(this.f253993a);
            sb2.append(", shownTime=");
            return androidx.appcompat.app.r.u(sb2, this.f253994b, ')');
        }
    }

    @Y61.k
    ArrayList a(int i12);
}
