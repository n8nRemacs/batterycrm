package com.avito.android.analytics.screens.tracker;

import androidx.compose.runtime.C22026a;
import androidx.media3.common.C23088b;
import com.avito.android.util.V2;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: DuplicateScreenInitEventsDetector.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/m;", "Lcom/avito/android/analytics/screens/tracker/l;", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28491m implements InterfaceC28490l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f90892a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f90893b = new LinkedHashMap();

    /* compiled from: DuplicateScreenInitEventsDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/m$a;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.screens.tracker.m$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f90894a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f90895b;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f90894a = str;
            this.f90895b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f90894a, aVar.f90894a) && kotlin.jvm.internal.L.f(this.f90895b, aVar.f90895b);
        }

        public final int hashCode() {
            return this.f90895b.hashCode() + (this.f90894a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenInitEventMask(screenName=");
            sb2.append(this.f90894a);
            sb2.append(", contentType=");
            return C22026a.c(sb2, this.f90895b, ')');
        }
    }

    @Inject
    public C28491m(@Y61.k com.avito.android.util.C c12) {
        this.f90892a = c12;
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28490l
    public final void a(@Y61.k com.avito.android.analytics.screens.r rVar, @Y61.k pc.g gVar) {
        String str = gVar.f428654b;
        String str2 = gVar.f428655c;
        a aVar = new a(str, str2);
        LinkedHashMap linkedHashMap = this.f90893b;
        String str3 = (String) linkedHashMap.get(aVar);
        String str4 = rVar.f90695b;
        if (str3 != null && !str3.equals(str4)) {
            String strH = androidx.camera.camera2.internal.G.h(C23088b.b("ScreenInit tracking events must have unique screenName and contentType combination.\n                ", str4, " was reported as (screenName=", str, ", contentType="), str2, "), \n                but this combination was already used for ", str3, " reporting.\n                Check if arguments passed for ScreenTrackerFactory.createInitTracker() are correct.");
            this.f90892a.o().getClass();
            V2.f318762a.d("Analytics", strH);
        }
        linkedHashMap.put(aVar, str4);
    }
}
