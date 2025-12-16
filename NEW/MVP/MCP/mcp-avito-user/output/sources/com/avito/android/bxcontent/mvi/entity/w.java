package com.avito.android.bxcontent.mvi.entity;

import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.serp.adapter.search_bar.SearchBarItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/w;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class w {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f112436f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112437a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f112438b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchBarItem f112439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f112440d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FloatingViewsPresenter.Subscriber.b f112441e;

    /* compiled from: BxContentState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/w$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(boolean z12, boolean z13, @Y61.k SearchBarItem searchBarItem, boolean z14, @Y61.k FloatingViewsPresenter.Subscriber.b bVar) {
        this.f112437a = z12;
        this.f112438b = z13;
        this.f112439c = searchBarItem;
        this.f112440d = z14;
        this.f112441e = bVar;
    }

    public static w a(w wVar, boolean z12, boolean z13, SearchBarItem searchBarItem, boolean z14, FloatingViewsPresenter.Subscriber.b bVar, int i12) {
        if ((i12 & 1) != 0) {
            z12 = wVar.f112437a;
        }
        boolean z15 = z12;
        if ((i12 & 2) != 0) {
            z13 = wVar.f112438b;
        }
        boolean z16 = z13;
        if ((i12 & 4) != 0) {
            searchBarItem = wVar.f112439c;
        }
        SearchBarItem searchBarItem2 = searchBarItem;
        if ((i12 & 8) != 0) {
            z14 = wVar.f112440d;
        }
        boolean z17 = z14;
        if ((i12 & 16) != 0) {
            bVar = wVar.f112441e;
        }
        wVar.getClass();
        return new w(z15, z16, searchBarItem2, z17, bVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f112437a == wVar.f112437a && this.f112438b == wVar.f112438b && L.f(this.f112439c, wVar.f112439c) && this.f112440d == wVar.f112440d && L.f(this.f112441e, wVar.f112441e);
    }

    public final int hashCode() {
        return this.f112441e.hashCode() + androidx.appcompat.app.r.i((this.f112439c.hashCode() + androidx.appcompat.app.r.i(Boolean.hashCode(this.f112437a) * 31, 31, this.f112438b)) * 31, 31, this.f112440d);
    }

    @Y61.k
    public final String toString() {
        return "HeaderBarState(isVisible=" + this.f112437a + ", isOpened=" + this.f112438b + ", item=" + this.f112439c + ", isFloatingEnabled=" + this.f112440d + ", floatingState=" + this.f112441e + ')';
    }
}
