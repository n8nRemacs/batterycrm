package com.avito.android.analytics.event;

import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ActivityLifecycleEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/analytics/event/d;", "Lcom/avito/android/analytics/j;", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/analytics/event/d$a;", "Lcom/avito/android/analytics/event/d$b;", "Lcom/avito/android/analytics/event/d$c;", "Lcom/avito/android/analytics/event/d$d;", "Lcom/avito/android/analytics/event/d$e;", "Lcom/avito/android/analytics/event/d$f;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC28409d implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f90029b;

    /* compiled from: ActivityLifecycleEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/d$a;", "Lcom/avito/android/analytics/event/d;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.event.d$a */
    public static final class a extends AbstractC28409d {
    }

    /* compiled from: ActivityLifecycleEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/d$b;", "Lcom/avito/android/analytics/event/d;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.event.d$b */
    public static final class b extends AbstractC28409d {
    }

    /* compiled from: ActivityLifecycleEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/d$c;", "Lcom/avito/android/analytics/event/d;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.event.d$c */
    public static final class c extends AbstractC28409d {
    }

    /* compiled from: ActivityLifecycleEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/d$d;", "Lcom/avito/android/analytics/event/d;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.event.d$d, reason: collision with other inner class name */
    public static final class C2671d extends AbstractC28409d {
    }

    /* compiled from: ActivityLifecycleEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/d$e;", "Lcom/avito/android/analytics/event/d;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.event.d$e */
    public static final class e extends AbstractC28409d {
    }

    /* compiled from: ActivityLifecycleEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/d$f;", "Lcom/avito/android/analytics/event/d;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.event.d$f */
    public static final class f extends AbstractC28409d {
    }

    public AbstractC28409d(String str, C42822w c42822w) {
        this.f90029b = C28461l.a(com.avito.android.error_reporting.error_reporter.w.a(str));
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f90029b.getEvents();
    }
}
