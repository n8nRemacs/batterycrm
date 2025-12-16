package com.avito.android.avl_analytics;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: AvlAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_analytics/a;", "", "_avito_avl-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: AvlAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.avl_analytics.a$a, reason: collision with other inner class name */
    public static final class C2949a {
    }

    void a(@k String str);

    void b(@l String str, @l String str2, @l Double d12, @l Double d13, @l Integer num, @l String str3, @k VideoStopReason videoStopReason);

    void c(@l String str, @l String str2, @l Integer num, @l Integer num2, boolean z12);

    void d(@l String str);

    void e(@k String str, @l String str2, @l Integer num, @l Integer num2, boolean z12, @l ArrayList arrayList, @l String str3);

    void f(@l Double d12, @l Integer num, @l String str, @l String str2, @l String str3);

    void g(@l Integer num, @l String str, @l String str2, @l String str3);

    void h(@l Double d12, @l Integer num, @l String str, @l String str2, @l String str3);

    @k
    String i();

    void j();

    void k(@l Double d12, @l Integer num, @l String str, @l String str2, @l String str3);

    void l(@l String str, @l Integer num, @l String str2, @l Integer num2, @l AvlEntryType avlEntryType, @k AvlFromPage avlFromPage, @l String str3);

    void m(@l Boolean bool, @l String str, @l String str2);
}
