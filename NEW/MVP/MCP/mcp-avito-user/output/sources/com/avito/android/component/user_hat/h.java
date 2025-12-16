package com.avito.android.component.user_hat;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.component.user_hat.items.A;
import com.avito.android.component.user_hat.items.C29576d;
import com.avito.android.component.user_hat.items.n;
import com.avito.android.component.user_hat.items.r;
import com.avito.android.component.user_hat.items.w;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import hw.InterfaceC41177b;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PassportUserHat.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/h;", "Lcom/avito/android/component/user_hat/g;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l41.g<com.avito.android.component.user_hat.e> f125307a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f125308b = C42727D.c(new d());

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f125309c = C42727D.c(new c());

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f125310d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f125311e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f125312f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f125313g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f125314h;

    /* compiled from: PassportUserHat.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/component/user_hat/h$a", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f125315b;

        public a(int i12) {
            this.f125315b = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        @Override // androidx.recyclerview.widget.RecyclerView.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void getItemOffsets(@Y61.k android.graphics.Rect r3, @Y61.k android.view.View r4, @Y61.k androidx.recyclerview.widget.RecyclerView r5, @Y61.k androidx.recyclerview.widget.RecyclerView.z r6) {
            /*
                r2 = this;
                super.getItemOffsets(r3, r4, r5, r6)
                r5.getClass()
                int r4 = androidx.recyclerview.widget.RecyclerView.U(r4)
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.getAdapter()
                r6 = 0
                if (r5 == 0) goto L1a
                int r5 = r5.getItemCount()
                r0 = 1
                int r5 = r5 - r0
                if (r4 != r5) goto L1a
                goto L1b
            L1a:
                r0 = r6
            L1b:
                r5 = 6
                int r1 = r2.f125315b
                if (r4 != 0) goto L22
                r4 = r1
                goto L26
            L22:
                int r4 = com.avito.android.util.y6.b(r5)
            L26:
                if (r0 == 0) goto L29
                goto L2d
            L29:
                int r1 = com.avito.android.util.y6.b(r5)
            L2d:
                r3.set(r4, r6, r1, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.component.user_hat.h.a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    /* compiled from: PassportUserHat.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/j;", "invoke", "()Lcom/avito/konveyor/adapter/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.konveyor.adapter.j> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.konveyor.adapter.j invoke() {
            h hVar = h.this;
            return new com.avito.konveyor.adapter.j((com.avito.konveyor.adapter.h) hVar.f125309c.getValue(), (com.avito.konveyor.a) hVar.f125308b.getValue());
        }
    }

    /* compiled from: PassportUserHat.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/h;", "invoke", "()Lcom/avito/konveyor/adapter/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.konveyor.adapter.h> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.konveyor.adapter.h invoke() {
            h hVar = h.this;
            return new com.avito.konveyor.adapter.h((com.avito.konveyor.a) hVar.f125308b.getValue(), (com.avito.konveyor.a) hVar.f125308b.getValue(), null, 4, null);
        }
    }

    /* compiled from: PassportUserHat.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/a;", "invoke", "()Lcom/avito/konveyor/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.konveyor.a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.konveyor.a invoke() throws BlueprintCollisionException {
            a.C10493a c10493a = new a.C10493a();
            h hVar = h.this;
            C29576d c29576d = new C29576d(new com.avito.android.component.user_hat.items.h(hVar.f125307a));
            l41.g<com.avito.android.component.user_hat.e> gVar = hVar.f125307a;
            Iterator it = C42745f0.U(c29576d, new w(new A(gVar)), new n(new r(gVar))).iterator();
            while (it.hasNext()) {
                c10493a.b((TV0.b) it.next());
            }
            return c10493a.a();
        }
    }

    /* compiled from: PassportUserHat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f125319l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(0);
            this.f125319l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return l.n(this.f125319l, R.dimen.passport_user_hat_item_size);
        }
    }

    /* compiled from: PassportUserHat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<Integer> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f125321m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(0);
            this.f125321m = view;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(this.f125321m.getResources().getDimensionPixelSize(R.dimen.passport_user_hat_item_badge_padding) + ((Number) h.this.f125312f.getValue()).intValue());
        }
    }

    public h(@k View view, @k l41.g<com.avito.android.component.user_hat.e> gVar) {
        this.f125307a = gVar;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b());
        this.f125310d = interfaceC42726CC;
        View viewFindViewById = view.findViewById(R.id.profiles_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f125311e = recyclerView;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f125312f = C42727D.b(lazyThreadSafetyMode, new e(view));
        this.f125313g = C42727D.b(lazyThreadSafetyMode, new f(view));
        recyclerView.setAdapter((com.avito.konveyor.adapter.j) interfaceC42726CC.getValue());
        recyclerView.l(new a(y6.b(16)), -1);
    }
}
