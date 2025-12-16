package com.avito.android.map_core.view.pin_items;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishFloatingViewsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/map_core/view/pin_items/h;", "Lcom/avito/android/floating_views/a;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.android.floating_views.a {

    /* renamed from: f, reason: collision with root package name */
    public boolean f185817f;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f185815d = new com.jakewharton.rxrelay3.c();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f185816e = new com.jakewharton.rxrelay3.c();

    /* renamed from: g, reason: collision with root package name */
    public int f185818g = -8;

    /* compiled from: PublishFloatingViewsProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/map_core/view/pin_items/h$a;", "", "<init>", "()V", "", "SCROLL_TO_TOP_VISIBLE_OFFSET", "I", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.floating_views.a, com.avito.android.floating_views.FloatingViewsPresenter
    public final void d(boolean z12) {
        this.f185817f = true;
    }

    @Override // com.avito.android.floating_views.a, com.avito.android.floating_views.j.a
    public final void f(int i12, int i13, int i14, int i15, int i16) {
        if (!this.f185817f) {
            super.f(i12, i13, i14, i15, i16);
            return;
        }
        com.jakewharton.rxrelay3.c cVar = this.f185816e;
        if (i13 < i12) {
            h();
            cVar.accept(ViewVisibility.f185805b);
            this.f185818g = i13 - 8;
        } else if (i13 > i12) {
            if (i12 == 0) {
                i();
                cVar.accept(ViewVisibility.f185805b);
                this.f185818g = -8;
            } else {
                this.f185815d.accept(ViewVisibility.f185806c);
            }
            if (this.f185818g >= i12) {
                cVar.accept(ViewVisibility.f185807d);
            }
        }
    }

    @Override // com.avito.android.floating_views.a
    public final void h() {
        this.f185815d.accept(ViewVisibility.f185805b);
    }

    @Override // com.avito.android.floating_views.a
    public final void i() {
        this.f185815d.accept(ViewVisibility.f185807d);
    }
}
