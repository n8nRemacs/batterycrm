package com.avito.android.analytics.screens;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenMask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/r;", "", "a", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f90693e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f90694a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f90695b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f90696c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f90697d;

    /* compiled from: ScreenMask.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/r$a;", "", "<init>", "()V", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static r a() {
            com.avito.android.time.c.f301452a.getClass();
            return new r("<none>", "<none>", Long.valueOf(com.avito.android.time.c.f301453b.a()), null, 8, null);
        }

        public a() {
        }
    }

    public r(String str, String str2, Long l12, String str3) {
        this.f90694a = str;
        this.f90695b = str2;
        this.f90696c = l12;
        this.f90697d = str3;
    }

    public /* synthetic */ r(String str, String str2, Long l12, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? null : str3);
    }

    public /* synthetic */ r(Fragment fragment, Long l12, String str, int i12, C42822w c42822w) {
        this(fragment, (i12 & 2) != 0 ? null : l12, (i12 & 4) != 0 ? null : str);
    }

    public r(@Y61.k Fragment fragment, @Y61.l Long l12, @Y61.l String str) {
        this(fragment.getClass().getSimpleName(), fragment.getClass().getName(), l12, str);
    }

    public r(Activity activity, Long l12, String str, int i12, C42822w c42822w) {
        this(activity.getClass().getSimpleName(), activity.getClass().getName(), (i12 & 2) != 0 ? null : l12, (i12 & 4) != 0 ? null : str);
    }

    public r(com.avito.android.lib.compose.design.shared.navigation.a aVar, Long l12, String str, int i12, C42822w c42822w) {
        this(aVar.getClass().getSimpleName(), aVar.getClass().getName(), (i12 & 2) != 0 ? null : l12, (i12 & 4) != 0 ? null : str);
    }
}
