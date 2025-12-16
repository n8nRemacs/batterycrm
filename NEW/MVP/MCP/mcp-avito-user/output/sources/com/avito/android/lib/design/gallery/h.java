package com.avito.android.lib.design.gallery;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.graphics.C22767g;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cV.C27109a;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import j.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import tV.C48606a;

/* compiled from: GalleryRecyclerView.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010#\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001a\u0010&\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R.\u0010/\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/avito/android/lib/design/gallery/h;", "LLV/b;", "LcV/a;", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "Lkotlin/G0;", "setState", "(LcV/a;)V", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "", "F0", "F", "getEdgeCornerRadius$_design_modules_components", "()F", "edgeCornerRadius", "G0", "getCornerRadius$_design_modules_components", "cornerRadius", "", "H0", "I", "getPaddingHorizontal$_design_modules_components", "()I", "paddingHorizontal", "I0", "getSpacing$_design_modules_components", "spacing", "J0", "getBackgroundColor$_design_modules_components", "backgroundColor", "K0", "getOverlayColor$_design_modules_components", "overlayColor", "L0", "getGalleryHeight$_design_modules_components", "galleryHeight", "Lcom/avito/android/lib/design/gallery/b;", "value", "R0", "Lcom/avito/android/lib/design/gallery/b;", "getGalleryAdapter", "()Lcom/avito/android/lib/design/gallery/b;", "setGalleryAdapter", "(Lcom/avito/android/lib/design/gallery/b;)V", "galleryAdapter", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends RecyclerView implements LV.b<C27109a> {

    /* renamed from: T0, reason: collision with root package name */
    @k
    public static final a f179215T0 = new a(null);

    /* renamed from: F0, reason: collision with root package name and from kotlin metadata */
    @U
    public final float edgeCornerRadius;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    @U
    public final float cornerRadius;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    @U
    public final int paddingHorizontal;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    @U
    public final int spacing;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public final int backgroundColor;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    @InterfaceC42156l
    public final int overlayColor;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    @U
    public final int galleryHeight;

    /* renamed from: M0, reason: collision with root package name */
    public int f179223M0;

    /* renamed from: N0, reason: collision with root package name */
    @l
    public C27109a f179224N0;

    /* renamed from: O0, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f179225O0;

    /* renamed from: P0, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f179226P0;

    /* renamed from: Q0, reason: collision with root package name */
    @k
    public final b f179227Q0;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    @l
    public com.avito.android.lib.design.gallery.b galleryAdapter;

    /* renamed from: S0, reason: collision with root package name */
    public final int f179229S0;

    /* compiled from: GalleryRecyclerView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/design/gallery/h$a;", "", "<init>", "()V", "", "LANDSCAPE_HEIGHT_MULTIPLIER", "F", "RATIO_3_4", "RATIO_4_3", "VISIBLE_IMAGE_PERCENT_CROP_THRESHOLD", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GalleryRecyclerView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/gallery/h$b", "Landroidx/recyclerview/widget/RecyclerView$r;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@k RecyclerView recyclerView, int i12, int i13) {
            Y41.l<? super Integer, G0> lVar;
            h hVar = h.this;
            int iA2 = C48606a.a(hVar.f179229S0, hVar);
            if (iA2 >= 0) {
                RecyclerView.Adapter adapter = hVar.getAdapter();
                if (iA2 >= (adapter != null ? adapter.getItemCount() : 0) || (lVar = hVar.f179226P0) == null) {
                    return;
                }
                lVar.invoke(Integer.valueOf(iA2));
            }
        }
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$10(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void M0() {
        com.avito.android.lib.design.gallery.b bVar = this.galleryAdapter;
        if (bVar == null || bVar.getItemCount() != 1) {
            post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 6));
            return;
        }
        Y41.l<? super Boolean, G0> lVar = this.f179225O0;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: getBackgroundColor$_design_modules_components, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getCornerRadius$_design_modules_components, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getEdgeCornerRadius$_design_modules_components, reason: from getter */
    public final float getEdgeCornerRadius() {
        return this.edgeCornerRadius;
    }

    @l
    public final com.avito.android.lib.design.gallery.b getGalleryAdapter() {
        return this.galleryAdapter;
    }

    /* renamed from: getGalleryHeight$_design_modules_components, reason: from getter */
    public final int getGalleryHeight() {
        return this.galleryHeight;
    }

    /* renamed from: getOverlayColor$_design_modules_components, reason: from getter */
    public final int getOverlayColor() {
        return this.overlayColor;
    }

    /* renamed from: getPaddingHorizontal$_design_modules_components, reason: from getter */
    public final int getPaddingHorizontal() {
        return this.paddingHorizontal;
    }

    /* renamed from: getSpacing$_design_modules_components, reason: from getter */
    public final int getSpacing() {
        return this.spacing;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(this.galleryHeight, 1073741824));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@l RecyclerView.Adapter<?> adapter) {
        throw new IllegalStateException("Adapter should be set via galleryAdapter property");
    }

    public final void setGalleryAdapter(@l com.avito.android.lib.design.gallery.b bVar) {
        this.galleryAdapter = bVar;
        super.setAdapter(bVar);
    }

    @X41.j
    public h(@k Context context, @l AttributeSet attributeSet) {
        float f12;
        float f13;
        super(context, attributeSet);
        int iB2 = y6.b(480);
        int iB3 = y6.b(8);
        this.edgeCornerRadius = y6.b(16);
        this.cornerRadius = y6.b(6);
        int iB4 = y6.b(16);
        this.paddingHorizontal = iB4;
        this.spacing = y6.b(6);
        this.backgroundColor = C35835l0.d(R.attr.warmGray8, context);
        this.overlayColor = C22767g.i(C35835l0.d(R.attr.constantBlack, context), 10);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (C35835l0.p(context)) {
            f12 = displayMetrics.heightPixels;
            f13 = 0.6f;
        } else {
            f12 = (displayMetrics.widthPixels - (iB4 * 2)) - iB3;
            f13 = 0.75f;
        }
        int i12 = (int) (f12 * f13);
        this.galleryHeight = i12 <= iB2 ? i12 : iB2;
        this.f179227Q0 = new b();
        setItemAnimator(null);
        setLayoutManager(new LinearLayoutManager(0, false));
        setClipToPadding(false);
        setPadding(iB4, getPaddingTop(), iB4, getPaddingBottom());
        new A().b(this);
        this.f179229S0 = Resources.getSystem().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k cV.C27109a r10) {
        /*
            r9 = this;
            cV.a r0 = r9.f179224N0
            com.avito.android.lib.util.c r1 = new com.avito.android.lib.util.c
            r1.<init>(r10, r0)
            boolean r1 = r1.f181333c
            if (r1 != 0) goto L8d
            r9.f179224N0 = r10
            r1 = 0
            if (r0 == 0) goto L13
            Y41.l<java.lang.Boolean, kotlin.G0> r2 = r0.f57912e
            goto L14
        L13:
            r2 = r1
        L14:
            com.avito.android.lib.util.c r3 = new com.avito.android.lib.util.c
            Y41.l<java.lang.Boolean, kotlin.G0> r4 = r10.f57912e
            r3.<init>(r4, r2)
            boolean r2 = r3.f181333c
            if (r2 != 0) goto L23
            Y41.l r4 = (Y41.l) r4
            r9.f179225O0 = r4
        L23:
            if (r0 == 0) goto L28
            Y41.l<java.lang.Integer, kotlin.G0> r2 = r0.f57911d
            goto L29
        L28:
            r2 = r1
        L29:
            com.avito.android.lib.util.c r3 = new com.avito.android.lib.util.c
            Y41.l<java.lang.Integer, kotlin.G0> r4 = r10.f57911d
            r3.<init>(r4, r2)
            boolean r2 = r3.f181333c
            if (r2 != 0) goto L38
            Y41.l r4 = (Y41.l) r4
            r9.f179226P0 = r4
        L38:
            if (r0 == 0) goto L3d
            java.util.List<com.avito.android.lib.design.gallery.c> r2 = r0.f57908a
            goto L3e
        L3d:
            r2 = r1
        L3e:
            java.util.List<com.avito.android.lib.design.gallery.c> r3 = r10.f57908a
            boolean r2 = kotlin.jvm.internal.L.f(r3, r2)
            r4 = 0
            java.lang.Runnable r5 = r10.f57910c
            if (r2 == 0) goto L55
            if (r0 == 0) goto L4e
            java.lang.Runnable r2 = r0.f57910c
            goto L4f
        L4e:
            r2 = r1
        L4f:
            boolean r2 = kotlin.jvm.internal.L.f(r5, r2)
            if (r2 != 0) goto L75
        L55:
            com.avito.android.lib.design.gallery.h$b r2 = r9.f179227Q0
            r9.v0(r2)
            r9.f179223M0 = r4
            Y41.l<? super java.lang.Boolean, kotlin.G0> r6 = r9.f179225O0
            if (r6 == 0) goto L65
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.invoke(r7)
        L65:
            com.avito.android.lib.design.gallery.b r6 = r9.galleryAdapter
            if (r6 == 0) goto L72
            androidx.camera.core.impl.utils.executor.a r7 = new androidx.camera.core.impl.utils.executor.a
            r8 = 1
            r7.<init>(r8, r5)
            r6.l(r3, r7)
        L72:
            r9.o(r2)
        L75:
            if (r0 == 0) goto L79
            java.lang.Integer r1 = r0.f57909b
        L79:
            com.avito.android.lib.util.c r0 = new com.avito.android.lib.util.c
            java.lang.Integer r10 = r10.f57909b
            r0.<init>(r10, r1)
            boolean r0 = r0.f181333c
            if (r0 != 0) goto L8d
            if (r10 == 0) goto L8a
            int r4 = r10.intValue()
        L8a:
            r9.setBackgroundColor(r4)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.gallery.h.setState(cV.a):void");
    }
}
