package com.avito.android.notification;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: NotificationProblem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/notification/q;", "", "a", "b", "c", "Lcom/avito/android/notification/q$a;", "Lcom/avito/android/notification/q$b;", "Lcom/avito/android/notification/q$c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface q {

    /* compiled from: NotificationProblem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification/q$a;", "Lcom/avito/android/notification/q;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f207472a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1325220851;
        }

        @Y61.k
        public final String toString() {
            return "MessengerNotificationChannelDisabled";
        }
    }

    /* compiled from: NotificationProblem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification/q$b;", "Lcom/avito/android/notification/q;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f207473a;

        public b(@Y61.k ArrayList arrayList) {
            this.f207473a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f207473a.equals(((b) obj).f207473a);
        }

        public final int hashCode() {
            return this.f207473a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ProfileMessengerPushDisabled(disabledSectionsNames="), this.f207473a, ')');
        }
    }

    /* compiled from: NotificationProblem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification/q$c;", "Lcom/avito/android/notification/q;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f207474a;

        public c(boolean z12) {
            this.f207474a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f207474a == ((c) obj).f207474a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f207474a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("SystemPermissionDisabled(isForeverDenied="), this.f207474a, ')');
        }
    }
}
