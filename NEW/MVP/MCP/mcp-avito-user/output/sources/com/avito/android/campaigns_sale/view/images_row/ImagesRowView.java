package com.avito.android.campaigns_sale.view.images_row;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.remote.model.Image;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ImagesRowView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale/view/images_row/ImagesRowView;", "Landroidx/recyclerview/widget/RecyclerView;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImagesRowView extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    @k
    public final d f114433F0;

    /* compiled from: ImagesRowView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f114434l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f114435m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ImagesRowView f114436n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List<Image> f114437o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f114438p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, boolean z12, ImagesRowView imagesRowView, List<Image> list, int i12) {
            super(0);
            this.f114434l = view;
            this.f114435m = z12;
            this.f114436n = imagesRowView;
            this.f114437o = list;
            this.f114438p = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.view.images_row.ImagesRowView.a.invoke():java.lang.Object");
        }
    }

    @j
    public ImagesRowView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void L0(int i12, @k List list, boolean z12) {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            D6.l(true, this, new a(view, z12, this, list, i12));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@l MotionEvent motionEvent) {
        return false;
    }

    public ImagesRowView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f114433F0 = new d();
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(new com.avito.android.campaigns_sale.view.images_row.a());
        setItemAnimator(null);
        setNestedScrollingEnabled(false);
    }
}
