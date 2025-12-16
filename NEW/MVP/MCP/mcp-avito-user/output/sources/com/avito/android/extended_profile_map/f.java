package com.avito.android.extended_profile_map;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.extended_profile_map.analytics.ExtendedProfileMapActionEvent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import xA.C49802a;
import zA.InterfaceC50427a;

/* compiled from: ExtendedProfileMapAnalyticsInteractorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/f;", "LzA/a;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements InterfaceC50427a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f151249a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f151250b;

    /* compiled from: ExtendedProfileMapAnalyticsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/a;", "invoke", "()Lcom/avito/android/analytics/provider/clickstream/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.analytics.provider.clickstream.a> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f151252m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f151252m = str;
        }

        @Override // Y41.a
        public final com.avito.android.analytics.provider.clickstream.a invoke() {
            return f.e(f.this, this.f151252m, ExtendedProfileMapActionEvent.ActionType.f151174c);
        }
    }

    /* compiled from: ExtendedProfileMapAnalyticsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/a;", "invoke", "()Lcom/avito/android/analytics/provider/clickstream/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.provider.clickstream.a> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f151254m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f151254m = str;
        }

        @Override // Y41.a
        public final com.avito.android.analytics.provider.clickstream.a invoke() {
            return f.e(f.this, this.f151254m, ExtendedProfileMapActionEvent.ActionType.f151176e);
        }
    }

    /* compiled from: ExtendedProfileMapAnalyticsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/a;", "invoke", "()Lcom/avito/android/analytics/provider/clickstream/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.analytics.provider.clickstream.a> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f151256m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f151256m = str;
        }

        @Override // Y41.a
        public final com.avito.android.analytics.provider.clickstream.a invoke() {
            return f.e(f.this, this.f151256m, ExtendedProfileMapActionEvent.ActionType.f151177f);
        }
    }

    /* compiled from: ExtendedProfileMapAnalyticsInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/a;", "invoke", "()Lcom/avito/android/analytics/provider/clickstream/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.analytics.provider.clickstream.a> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f151258m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f151258m = str;
        }

        @Override // Y41.a
        public final com.avito.android.analytics.provider.clickstream.a invoke() {
            String strA = f.this.f151249a.a();
            if (strA != null) {
                return new C49802a(strA, this.f151258m);
            }
            return null;
        }
    }

    @Inject
    public f(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f151249a = e12;
        this.f151250b = interfaceC28373a;
    }

    public static final ExtendedProfileMapActionEvent e(f fVar, String str, ExtendedProfileMapActionEvent.ActionType actionType) {
        String strA = fVar.f151249a.a();
        if (strA != null) {
            return new ExtendedProfileMapActionEvent(strA, str, actionType);
        }
        return null;
    }

    @Override // zA.InterfaceC50427a
    public final void a(@Y61.k String str) {
        f(new b(str));
    }

    @Override // zA.InterfaceC50427a
    public final void b(@Y61.k String str) {
        f(new a(str));
    }

    @Override // zA.InterfaceC50427a
    public final void c(@Y61.k String str) {
        f(new d(str));
    }

    @Override // zA.InterfaceC50427a
    public final void d(@Y61.k String str) {
        f(new c(str));
    }

    public final void f(Y41.a<? extends com.avito.android.analytics.provider.clickstream.a> aVar) {
        com.avito.android.analytics.provider.clickstream.a aVarInvoke = aVar.invoke();
        if (aVarInvoke != null) {
            this.f151250b.c(aVarInvoke);
        }
    }
}
