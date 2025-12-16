package com.avito.android.tariff.cpx.info.items;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff.cpx.info.items.filters_tabs.c;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffCpxInfoItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f296419b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f296420c = y6.b(10);

    /* renamed from: d, reason: collision with root package name */
    public final int f296421d = y6.b(5);

    /* renamed from: e, reason: collision with root package name */
    public final int f296422e = y6.b(24);

    /* renamed from: f, reason: collision with root package name */
    public final int f296423f = y6.b(20);

    /* renamed from: g, reason: collision with root package name */
    public final int f296424g = y6.b(20);

    /* renamed from: h, reason: collision with root package name */
    public final int f296425h = y6.b(32);

    /* renamed from: i, reason: collision with root package name */
    public final int f296426i = y6.b(16);

    /* renamed from: j, reason: collision with root package name */
    public final int f296427j = y6.b(40);

    /* renamed from: k, reason: collision with root package name */
    public final int f296428k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f296429l;

    /* compiled from: TariffCpxInfoItemDecoration.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/a$a;", "", "<init>", "()V", "", "HALF_SIZE_SPAN_COUNT", "I", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff.cpx.info.items.a$a, reason: collision with other inner class name */
    public static final class C9026a {
        public /* synthetic */ C9026a(C42822w c42822w) {
            this();
        }

        public C9026a() {
        }
    }

    static {
        new C9026a(null);
    }

    public a(@k com.avito.konveyor.a aVar) {
        this.f296428k = aVar.Y(c.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r8, @Y61.k android.view.View r9, @Y61.k androidx.recyclerview.widget.RecyclerView r10, @Y61.k androidx.recyclerview.widget.RecyclerView.z r11) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r10.getLayoutManager()
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            int r1 = androidx.recyclerview.widget.RecyclerView.U(r9)
            androidx.recyclerview.widget.GridLayoutManager$c r0 = r0.f53667M
            int r0 = r0.f(r1)
            androidx.recyclerview.widget.RecyclerView$C r1 = r10.W(r9)
            boolean r2 = r1 instanceof com.avito.android.tariff.cpx.info.items.filters_tabs.i
            r3 = 0
            if (r2 == 0) goto L1c
            int r1 = r7.f296423f
            goto L3e
        L1c:
            boolean r2 = r1 instanceof com.avito.android.tariff.cpx.info.items.features_header.g
            int r4 = r7.f296424g
            int r5 = r7.f296428k
            if (r2 == 0) goto L2f
            int r1 = com.avito.android.mnz_common.extensions.f.a(r9, r10)
            if (r5 != r1) goto L2c
        L2a:
            r1 = r4
            goto L3e
        L2c:
            int r1 = r7.f296425h
            goto L3e
        L2f:
            boolean r1 = r1 instanceof com.avito.android.tariff.cpx.info.items.feature.h
            if (r1 == 0) goto L3d
            int r1 = com.avito.android.mnz_common.extensions.f.a(r9, r10)
            if (r5 != r1) goto L3a
            goto L2a
        L3a:
            int r1 = r7.f296426i
            goto L3e
        L3d:
            r1 = r3
        L3e:
            r8.top = r1
            int r1 = androidx.recyclerview.widget.RecyclerView.U(r9)
            int r11 = r11.b()
            r2 = 1
            int r11 = r11 - r2
            if (r1 != r11) goto L4e
            r11 = r2
            goto L4f
        L4e:
            r11 = r3
        L4f:
            androidx.recyclerview.widget.RecyclerView$C r1 = r10.W(r9)
            if (r11 == 0) goto L58
            int r11 = r7.f296427j
            goto L60
        L58:
            boolean r11 = r1 instanceof com.avito.android.tariff.cpx.info.items.header.k
            if (r11 == 0) goto L5f
            int r11 = r7.f296422e
            goto L60
        L5f:
            r11 = r3
        L60:
            r8.bottom = r11
            androidx.recyclerview.widget.RecyclerView$C r11 = r10.W(r9)
            boolean r1 = r11 instanceof com.avito.android.tariff.cpx.info.items.card.g
            int r4 = r7.f296419b
            int r5 = r7.f296421d
            int r6 = r7.f296420c
            if (r1 == 0) goto L7a
            boolean r11 = r7.f296429l
            if (r11 == 0) goto L78
            if (r0 != r2) goto L78
            r11 = r5
            goto L86
        L78:
            r11 = r6
            goto L86
        L7a:
            boolean r1 = r11 instanceof com.avito.android.tariff.cpx.info.items.filters_tabs.i
            if (r1 == 0) goto L80
            r11 = r3
            goto L86
        L80:
            boolean r11 = r11 instanceof com.avito.android.tariff.cpx.info.items.level_header.l
            if (r11 == 0) goto L85
            goto L78
        L85:
            r11 = r4
        L86:
            r8.left = r11
            androidx.recyclerview.widget.RecyclerView$C r9 = r10.W(r9)
            boolean r10 = r9 instanceof com.avito.android.tariff.cpx.info.items.card.g
            if (r10 == 0) goto L9a
            boolean r9 = r7.f296429l
            if (r9 != 0) goto L98
            if (r0 != r2) goto L98
            r4 = r5
            goto La5
        L98:
            r4 = r6
            goto La5
        L9a:
            boolean r10 = r9 instanceof com.avito.android.tariff.cpx.info.items.filters_tabs.i
            if (r10 == 0) goto La0
            r4 = r3
            goto La5
        La0:
            boolean r9 = r9 instanceof com.avito.android.tariff.cpx.info.items.level_header.l
            if (r9 == 0) goto La5
            goto L98
        La5:
            r8.right = r4
            if (r0 != r2) goto Lae
            boolean r8 = r7.f296429l
            if (r8 != 0) goto Lae
            r3 = r2
        Lae:
            r7.f296429l = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpx.info.items.a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
