package com.avito.android.messenger.channels.adapter.konveyor.common.swipable;

import Y61.k;
import Y61.l;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.adapter.konveyor.common.swipable.c;
import java.lang.ref.WeakReference;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* compiled from: SwipableItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/d;", "Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f186915b;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.jakewharton.rxrelay3.d<c.a> f186917d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f186918e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f186919f;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f186916c = C42727D.c(new g(this));

    /* renamed from: g, reason: collision with root package name */
    @k
    public WeakReference<ObjectAnimator> f186920g = new WeakReference<>(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f186921h = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SwipableItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a;", "hideSwipeViews", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.a aVar = (c.a) obj;
            d dVar = d.this;
            if (dVar.a().getOffset() != 0) {
                if (aVar.equals(c.a.C5485a.f186913a)) {
                    ObjectAnimator objectAnimator = dVar.f186920g.get();
                    if (objectAnimator != null) {
                        dVar.f186920g.clear();
                        if (objectAnimator.isRunning()) {
                            objectAnimator.end();
                        }
                    }
                    ObjectAnimator objectAnimator2 = new ObjectAnimator();
                    objectAnimator2.setTarget(dVar.a());
                    objectAnimator2.setPropertyName("offset");
                    objectAnimator2.setInterpolator(new AccelerateInterpolator());
                    objectAnimator2.setIntValues(dVar.a().getOffset(), 0);
                    objectAnimator2.setDuration(200L);
                    objectAnimator2.start();
                    dVar.f186920g = new WeakReference<>(objectAnimator2);
                    return;
                }
                if (aVar instanceof c.a.b) {
                    if (((c.a.b) aVar).f186914a != ((Number) dVar.f186916c.getValue()).intValue()) {
                        ObjectAnimator objectAnimator3 = dVar.f186920g.get();
                        if (objectAnimator3 != null) {
                            dVar.f186920g.clear();
                            if (objectAnimator3.isRunning()) {
                                objectAnimator3.end();
                            }
                        }
                        ObjectAnimator objectAnimator4 = new ObjectAnimator();
                        objectAnimator4.setTarget(dVar.a());
                        objectAnimator4.setPropertyName("offset");
                        objectAnimator4.setInterpolator(new AccelerateInterpolator());
                        objectAnimator4.setIntValues(dVar.a().getOffset(), 0);
                        objectAnimator4.setDuration(200L);
                        objectAnimator4.start();
                        dVar.f186920g = new WeakReference<>(objectAnimator4);
                    }
                }
            }
        }
    }

    /* compiled from: SwipableItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/d$b;", "Lru/rambler/libs/swipe_layout/SwipeLayout$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b implements SwipeLayout.c {
        public b() {
        }

        @Override // ru.rambler.libs.swipe_layout.SwipeLayout.c
        public final void a() {
            d dVar = d.this;
            com.jakewharton.rxrelay3.d<c.a> dVar2 = dVar.f186917d;
            if (dVar2 != null) {
                dVar2.accept(new c.a.b(((Number) dVar.f186916c.getValue()).intValue()));
            }
        }

        @Override // ru.rambler.libs.swipe_layout.SwipeLayout.c
        public final void b(boolean z12) {
            Y41.l<? super Boolean, G0> lVar = d.this.f186918e;
            if (lVar != null) {
                ((com.avito.android.messenger.channels.adapter.konveyor.common.swipable.a) lVar).invoke(Boolean.valueOf(z12));
            }
        }
    }

    public d(@k View view) {
        this.f186915b = C42727D.c(new f(view));
        this.f186919f = C42727D.c(new e(view));
    }

    public final SwipeLayout a() {
        return (SwipeLayout) this.f186915b.getValue();
    }
}
