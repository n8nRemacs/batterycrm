package com.avito.android.publish.analytics;

import Cd0.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.NavigationKt;
import com.google.gson.Gson;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import yc.C50213a;

/* compiled from: PhotoPickerOnPublishEventTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/c;", "Lcom/avito/android/publish/analytics/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.analytics.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33517c implements InterfaceC33515a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232195a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232196b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f232197c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Gson f232198d;

    /* renamed from: e, reason: collision with root package name */
    public io.reactivex.rxjava3.internal.observers.y f232199e;

    public C33517c(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k com.jakewharton.rxrelay3.c cVar, @Y61.k Gson gson) {
        this.f232195a = interfaceC28373a;
        this.f232196b = c50213a;
        this.f232197c = cVar;
        this.f232198d = gson;
    }

    public static Map d(String str) {
        Long lZ02;
        return (str == null || (lZ02 = C43066x.z0(str)) == null) ? P0.c() : Collections.singletonMap("imgid", String.valueOf(lZ02.longValue()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33515a
    public final void a() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f232199e;
        if (yVar == null) {
            yVar = null;
        }
        yVar.getClass();
        DisposableHelper.a(yVar);
    }

    @Override // tr.InterfaceC48705a
    public final void b() {
        this.f232195a.c(new M0(this.f232196b.c()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33515a
    public final void c(@Y61.k C0 c02) {
        this.f232199e = (io.reactivex.rxjava3.internal.observers.y) this.f232197c.t0(new C33516b(this, c02));
    }

    public final Map<String, Object> e(Navigation navigation2) {
        kotlin.Q q12 = new kotlin.Q("cid", String.valueOf(navigation2.getCategoryId()));
        List<Integer> categoryIds = navigation2.getCategoryIds();
        if (categoryIds == null) {
            categoryIds = C42784z0.f406748b;
        }
        kotlin.Q q13 = new kotlin.Q("categories", categoryIds);
        List<Map<String, String>> attributes = navigation2.getAttributes();
        String analyticsFormat = attributes != null ? NavigationKt.toAnalyticsFormat(attributes, this.f232198d) : null;
        if (analyticsFormat == null) {
            analyticsFormat = "";
        }
        return P0.g(q12, q13, new kotlin.Q("infm_raw_params", analyticsFormat));
    }
}
