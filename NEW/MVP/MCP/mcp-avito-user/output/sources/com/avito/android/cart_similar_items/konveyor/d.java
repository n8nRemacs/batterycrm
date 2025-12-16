package com.avito.android.cart_similar_items.konveyor;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GridItemDecoration.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f115825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f115826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f115827d;

    /* renamed from: e, reason: collision with root package name */
    public final int f115828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f115829f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.cart_similar_items.konveyor.a f115830g = new com.avito.android.cart_similar_items.konveyor.a();

    /* compiled from: GridItemDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TV0.a f115831l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.cart_similar_items.konveyor.b f115832m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ d f115833n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TV0.a aVar, com.avito.android.cart_similar_items.konveyor.b bVar, d dVar) {
            super(0);
            this.f115831l = aVar;
            this.f115832m = bVar;
            this.f115833n = dVar;
        }

        @Override // Y41.a
        public final Integer invoke() {
            int i12;
            if (this.f115831l instanceof com.avito.android.cart_similar_items.konveyor.beduin.c) {
                i12 = 0;
            } else {
                boolean z12 = this.f115832m.f115813d;
                d dVar = this.f115833n;
                i12 = z12 ? dVar.f115829f : dVar.f115827d / 2;
            }
            return Integer.valueOf(i12);
        }
    }

    /* compiled from: GridItemDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.cart_similar_items.konveyor.b f115834l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f115835m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.cart_similar_items.konveyor.b bVar, d dVar) {
            super(0);
            this.f115834l = bVar;
            this.f115835m = dVar;
        }

        @Override // Y41.a
        public final Integer invoke() {
            boolean z12 = this.f115834l.f115810a;
            d dVar = this.f115835m;
            return Integer.valueOf(z12 ? dVar.f115825b : dVar.f115826c / 2);
        }
    }

    /* compiled from: GridItemDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.cart_similar_items.konveyor.b f115836l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f115837m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.cart_similar_items.konveyor.b bVar, d dVar) {
            super(0);
            this.f115836l = bVar;
            this.f115837m = dVar;
        }

        @Override // Y41.a
        public final Integer invoke() {
            boolean z12 = this.f115836l.f115812c;
            d dVar = this.f115837m;
            return Integer.valueOf(z12 ? dVar.f115825b : dVar.f115826c / 2);
        }
    }

    /* compiled from: GridItemDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cart_similar_items.konveyor.d$d, reason: collision with other inner class name */
    public static final class C3377d extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TV0.a f115838l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.cart_similar_items.konveyor.b f115839m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ d f115840n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3377d(TV0.a aVar, com.avito.android.cart_similar_items.konveyor.b bVar, d dVar) {
            super(0);
            this.f115838l = aVar;
            this.f115839m = bVar;
            this.f115840n = dVar;
        }

        @Override // Y41.a
        public final Integer invoke() {
            int i12;
            if (this.f115838l instanceof com.avito.android.cart_similar_items.konveyor.beduin.c) {
                i12 = 0;
            } else {
                boolean z12 = this.f115839m.f115811b;
                d dVar = this.f115840n;
                i12 = z12 ? dVar.f115828e : dVar.f115827d / 2;
            }
            return Integer.valueOf(i12);
        }
    }

    public d(@U int i12, @U int i13, @U int i14, @U int i15, @U int i16) {
        this.f115825b = i12;
        this.f115826c = i13;
        this.f115827d = i14;
        this.f115828e = i15;
        this.f115829f = i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8 A[EDGE_INSN: B:87:0x00b8->B:60:0x00b8 BREAK  A[LOOP:0: B:58:0x00b4->B:65:0x00c9], EDGE_INSN: B:88:0x00b8->B:60:0x00b8 BREAK  A[LOOP:0: B:58:0x00b4->B:65:0x00c9]] */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r17, @Y61.k android.view.View r18, @Y61.k androidx.recyclerview.widget.RecyclerView r19, @Y61.k androidx.recyclerview.widget.RecyclerView.z r20) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_similar_items.konveyor.d.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
