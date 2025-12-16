package com.avito.android.serp.adapter.location_notification;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;

/* compiled from: LocationNotificationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/location_notification/p;", "Lcom/avito/android/serp/adapter/location_notification/o;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f270269b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f270270c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f270271d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f270272e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final z<G0> f270273f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final B0 f270274g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f270275h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final W f270276i;

    /* compiled from: LocationNotificationItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return Integer.valueOf(p.this.getBindingAdapterPosition());
        }
    }

    /* compiled from: LocationNotificationItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lkotlin/G0;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements r {
        public c() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            p pVar = p.this;
            if (!pVar.f270275h) {
                return false;
            }
            pVar.f270275h = false;
            return true;
        }
    }

    public p(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.change);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        this.f270269b = button;
        View viewFindViewById2 = view.findViewById(R.id.confirm);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button2 = (Button) viewFindViewById2;
        this.f270270c = button2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270271d = (TextView) viewFindViewById3;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f270272e = cVar;
        view.addOnAttachStateChangeListener(new a());
        this.f270273f = C37722i.a(button);
        this.f270274g = C37722i.a(button2).d0(new b());
        this.f270275h = true;
        this.f270276i = cVar.N(new c());
    }

    @Override // com.avito.android.serp.adapter.location_notification.o
    public final void Mt(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f270270c, str, false);
    }

    @Override // com.avito.android.serp.adapter.location_notification.o
    @Y61.k
    public final z<G0> R60() {
        return this.f270273f;
    }

    @Override // com.avito.android.serp.adapter.location_notification.o
    public final void UX(@Y61.l String str) {
        I5.a(this.f270271d, str, false);
    }

    @Override // com.avito.android.serp.adapter.location_notification.o
    @Y61.k
    /* renamed from: d00, reason: from getter */
    public final W getF270276i() {
        return this.f270276i;
    }

    @Override // com.avito.android.serp.adapter.location_notification.o
    public final void wT(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f270269b, str, false);
    }

    @Override // com.avito.android.serp.adapter.location_notification.o
    @Y61.k
    /* renamed from: wu, reason: from getter */
    public final B0 getF270274g() {
        return this.f270274g;
    }

    /* compiled from: LocationNotificationItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/serp/adapter/location_notification/p$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            p.this.f270272e.accept(G0.f406611a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
        }
    }
}
