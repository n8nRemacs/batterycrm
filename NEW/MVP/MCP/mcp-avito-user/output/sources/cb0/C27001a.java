package cB0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpaInfoPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcB0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C27001a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f57781b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57782c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57783d = y6.b(26);

    /* renamed from: e, reason: collision with root package name */
    public final int f57784e = y6.b(24);

    /* renamed from: f, reason: collision with root package name */
    public final int f57785f = y6.b(20);

    /* renamed from: g, reason: collision with root package name */
    public final int f57786g = y6.b(14);

    /* renamed from: h, reason: collision with root package name */
    public final int f57787h = y6.b(32);

    /* renamed from: i, reason: collision with root package name */
    public final int f57788i = y6.b(2);

    /* renamed from: j, reason: collision with root package name */
    public final int f57789j = y6.b(24);

    /* renamed from: k, reason: collision with root package name */
    public final int f57790k = y6.b(40);

    /* renamed from: l, reason: collision with root package name */
    public final int f57791l = y6.b(20);

    /* renamed from: m, reason: collision with root package name */
    public final int f57792m = y6.b(20);

    /* renamed from: n, reason: collision with root package name */
    public final int f57793n = y6.b(16);

    @Inject
    public C27001a(@k com.avito.konveyor.a aVar) {
        this.f57781b = aVar.Y(com.avito.android.tariff.cpa.info.ui.items.info.b.class);
        this.f57782c = aVar.Y(com.avito.android.tariff.cpa.info.ui.items.alert.a.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r6, @Y61.k android.view.View r7, @Y61.k androidx.recyclerview.widget.RecyclerView r8, @Y61.k androidx.recyclerview.widget.RecyclerView.z r9) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$C r0 = r8.W(r7)
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.balance_info.i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
            int r0 = r5.f57783d
            goto L87
        Le:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.level_info.i
            if (r1 == 0) goto L16
            int r0 = r5.f57784e
            goto L87
        L16:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.info.h
            r4 = -1
            if (r1 == 0) goto L39
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r8.getAdapter()
            if (r0 != 0) goto L22
            goto L2f
        L22:
            int r1 = androidx.recyclerview.widget.RecyclerView.U(r7)
            if (r1 == r4) goto L2f
            if (r1 == 0) goto L2f
            int r1 = r1 - r2
            int r4 = r0.getItemViewType(r1)
        L2f:
            int r0 = r5.f57781b
            if (r4 != r0) goto L36
            int r0 = r5.f57786g
            goto L87
        L36:
            int r0 = r5.f57785f
            goto L87
        L39:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.statistics_info.g
            if (r1 == 0) goto L40
            int r0 = r5.f57787h
            goto L87
        L40:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.alert.h
            if (r1 == 0) goto L61
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r8.getAdapter()
            if (r0 != 0) goto L4b
            goto L58
        L4b:
            int r1 = androidx.recyclerview.widget.RecyclerView.U(r7)
            if (r1 == r4) goto L58
            if (r1 == 0) goto L58
            int r1 = r1 - r2
            int r4 = r0.getItemViewType(r1)
        L58:
            int r0 = r5.f57782c
            if (r4 != r0) goto L5f
            int r0 = r5.f57788i
            goto L87
        L5f:
            r0 = r3
            goto L87
        L61:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.j
            if (r1 == 0) goto L67
            r1 = r2
            goto L69
        L67:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.skeleton.c
        L69:
            if (r1 == 0) goto L6e
            int r0 = r5.f57791l
            goto L87
        L6e:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header.g
            if (r1 == 0) goto L74
            r1 = r2
            goto L76
        L74:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tools_header.skeleton.c
        L76:
            if (r1 == 0) goto L7b
            int r0 = r5.f57792m
            goto L87
        L7b:
            boolean r1 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.h
            if (r1 == 0) goto L81
            r0 = r2
            goto L83
        L81:
            boolean r0 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.skeleton.c
        L83:
            if (r0 == 0) goto L5f
            int r0 = r5.f57793n
        L87:
            r6.top = r0
            androidx.recyclerview.widget.RecyclerView$C r0 = r8.W(r7)
            boolean r0 = r0 instanceof com.avito.android.tariff.cpa.info.ui.items.alert.h
            int r1 = r5.f57789j
            if (r0 == 0) goto L95
            r0 = r3
            goto L96
        L95:
            r0 = r1
        L96:
            r6.left = r0
            androidx.recyclerview.widget.RecyclerView$C r8 = r8.W(r7)
            boolean r8 = r8 instanceof com.avito.android.tariff.cpa.info.ui.items.alert.h
            if (r8 == 0) goto La1
            r1 = r3
        La1:
            r6.right = r1
            int r7 = androidx.recyclerview.widget.RecyclerView.U(r7)
            int r8 = r9.b()
            int r8 = r8 - r2
            if (r7 != r8) goto Lb0
            int r3 = r5.f57790k
        Lb0:
            r6.bottom = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cB0.C27001a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
