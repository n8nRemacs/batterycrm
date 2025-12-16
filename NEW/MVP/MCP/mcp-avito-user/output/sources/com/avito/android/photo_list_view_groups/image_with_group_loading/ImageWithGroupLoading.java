package com.avito.android.photo_list_view_groups.image_with_group_loading;

import LV.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import b80.ViewOnClickListenerC25426a;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.util.c;
import com.avito.android.lib.util.f;
import com.avito.android.photo_list_view_groups.image_with_group_loading.ImageWithGroupLoading;
import com.avito.android.photo_list_view_groups.image_with_group_loading.a;
import com.avito.android.photo_list_view_groups.p;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import e11.ViewOnClickListenerC39879j1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageWithGroupLoading.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_loading/ImageWithGroupLoading;", "Landroidx/cardview/widget/CardView;", "LLV/b;", "Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/photo_list_view_groups/image_with_group_loading/a;)V", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageWithGroupLoading extends CardView implements b<a> {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f218589l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f218590b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ShimmerLayout f218591c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f218592d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FrameLayout f218593e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f218594f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public a f218595g;

    /* renamed from: h, reason: collision with root package name */
    public final float f218596h;

    /* renamed from: i, reason: collision with root package name */
    public final int f218597i;

    /* renamed from: j, reason: collision with root package name */
    public final int f218598j;

    /* renamed from: k, reason: collision with root package name */
    public final int f218599k;

    @j
    public ImageWithGroupLoading(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageWithGroupLoading(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.ImageWithGroupLoading : i13;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.h.f218638c, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.image_with_group_loading, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.picture);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f218590b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.picture_skeleton);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f218591c = (ShimmerLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.label_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f218593e = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.label_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f218592d = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.actions);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f218594f = (LinearLayout) viewFindViewById5;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f218596h = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f218597i = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f218597i);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f218598j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f218598j);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f218599k = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f218599k);
        }
        setCardElevation(0.0f);
        setClipChildren(false);
        setClipToPadding(false);
        setRadius(this.f218596h);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k a newState) throws Resources.NotFoundException {
        a aVar = this.f218595g;
        if (new c(newState, aVar).f181333c) {
            return;
        }
        this.f218595g = newState;
        a.d dVar = aVar != null ? aVar.f218600a : null;
        a.d dVar2 = newState.f218600a;
        if (!new c(dVar2, dVar).f181333c) {
            C35949t5.c(this.f218590b, n.a(ImageKt.toSingleImage(dVar2.f218606a)), null, null, D6.u(this, R.drawable.image_with_group_image_foreground), 6);
            this.f218591c.setOnClickListener(new ViewOnClickListenerC39879j1(dVar2, 16));
        }
        a.e eVar = aVar != null ? aVar.f218602c : null;
        final a.e eVar2 = newState.f218602c;
        if (!new c(eVar2, eVar).f181333c && eVar2 != null) {
            boolean z12 = eVar2 instanceof a.e.c;
            FrameLayout frameLayout = this.f218593e;
            TextView textView = this.f218592d;
            if (z12) {
                textView.setText((CharSequence) null);
                final int i12 = 0;
                textView.setOnClickListener(new View.OnClickListener() { // from class: k80.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.e eVar3 = eVar2;
                        switch (i12) {
                            case 0:
                                int i13 = ImageWithGroupLoading.f218589l;
                                ((a.e.c) eVar3).f218611a.invoke();
                                break;
                            case 1:
                                int i14 = ImageWithGroupLoading.f218589l;
                                ((a.e.c) eVar3).f218611a.invoke();
                                break;
                            case 2:
                                int i15 = ImageWithGroupLoading.f218589l;
                                ((a.e.C6564a) eVar3).f218609b.invoke();
                                break;
                            default:
                                int i16 = ImageWithGroupLoading.f218589l;
                                ((a.e.C6564a) eVar3).f218609b.invoke();
                                break;
                        }
                    }
                });
                D6.w(textView);
                frameLayout.setBackground(D6.u(frameLayout, R.drawable.image_with_group_label_loading_bg));
                final int i13 = 1;
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: k80.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.e eVar3 = eVar2;
                        switch (i13) {
                            case 0:
                                int i132 = ImageWithGroupLoading.f218589l;
                                ((a.e.c) eVar3).f218611a.invoke();
                                break;
                            case 1:
                                int i14 = ImageWithGroupLoading.f218589l;
                                ((a.e.c) eVar3).f218611a.invoke();
                                break;
                            case 2:
                                int i15 = ImageWithGroupLoading.f218589l;
                                ((a.e.C6564a) eVar3).f218609b.invoke();
                                break;
                            default:
                                int i16 = ImageWithGroupLoading.f218589l;
                                ((a.e.C6564a) eVar3).f218609b.invoke();
                                break;
                        }
                    }
                });
                D6.H(frameLayout);
            } else if (eVar2 instanceof a.e.C6564a) {
                textView.setText(((a.e.C6564a) eVar2).f218608a);
                final int i14 = 2;
                textView.setOnClickListener(new View.OnClickListener() { // from class: k80.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.e eVar3 = eVar2;
                        switch (i14) {
                            case 0:
                                int i132 = ImageWithGroupLoading.f218589l;
                                ((a.e.c) eVar3).f218611a.invoke();
                                break;
                            case 1:
                                int i142 = ImageWithGroupLoading.f218589l;
                                ((a.e.c) eVar3).f218611a.invoke();
                                break;
                            case 2:
                                int i15 = ImageWithGroupLoading.f218589l;
                                ((a.e.C6564a) eVar3).f218609b.invoke();
                                break;
                            default:
                                int i16 = ImageWithGroupLoading.f218589l;
                                ((a.e.C6564a) eVar3).f218609b.invoke();
                                break;
                        }
                    }
                });
                D6.H(textView);
                frameLayout.setBackground(D6.u(frameLayout, R.drawable.image_with_group_label_content_bg));
                final int i15 = 3;
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: k80.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.e eVar3 = eVar2;
                        switch (i15) {
                            case 0:
                                int i132 = ImageWithGroupLoading.f218589l;
                                ((a.e.c) eVar3).f218611a.invoke();
                                break;
                            case 1:
                                int i142 = ImageWithGroupLoading.f218589l;
                                ((a.e.c) eVar3).f218611a.invoke();
                                break;
                            case 2:
                                int i152 = ImageWithGroupLoading.f218589l;
                                ((a.e.C6564a) eVar3).f218609b.invoke();
                                break;
                            default:
                                int i16 = ImageWithGroupLoading.f218589l;
                                ((a.e.C6564a) eVar3).f218609b.invoke();
                                break;
                        }
                    }
                });
                D6.H(frameLayout);
            } else if (eVar2 instanceof a.e.b) {
                D6.w(textView);
                textView.setOnClickListener(null);
                D6.w(frameLayout);
            }
        }
        a.b bVar = aVar != null ? aVar.f218603d : null;
        a.b bVar2 = newState.f218603d;
        if (new c(bVar2, bVar).f181333c) {
            return;
        }
        LinearLayout linearLayout = this.f218594f;
        linearLayout.removeAllViews();
        List<a.C6563a> list = bVar2.f218605a;
        int i16 = 0;
        for (Object obj : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                C42745f0.H0();
                throw null;
            }
            a.C6563a c6563a = (a.C6563a) obj;
            c6563a.getClass();
            boolean z13 = i16 == list.size() - 1;
            boolean z14 = list.size() == 1;
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setClipChildren(false);
            frameLayout2.setClipToPadding(false);
            int iB2 = y6.b(3);
            int iB3 = y6.b(12);
            if (z14) {
                frameLayout2.setPadding(iB3, iB3, iB3, iB3);
            } else {
                frameLayout2.setPadding(iB2, iB2, z13 ? iB3 : iB2, iB3);
            }
            frameLayout2.setOnClickListener(new i(26, c6563a.f218604a));
            Button button = new Button(getContext(), null, 0, 0, 14, null);
            button.setLayoutParams(new FrameLayout.LayoutParams(this.f218598j, this.f218599k));
            button.setAppearance(C35835l0.j(R.attr.buttonOverlayPrimarySmall, button.getContext()));
            Integer numM = f.m("edit");
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a aVar2 = FV.a.f4720a;
                View viewFindViewById = button.findViewById(R.id.text_view);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                FV.a.a(aVar2, (TextView) viewFindViewById, Integer.valueOf(iIntValue));
            }
            button.setOnClickListener(new ViewOnClickListenerC25426a(frameLayout2, 5));
            frameLayout2.addView(button);
            linearLayout.addView(frameLayout2);
            i16 = i17;
        }
        D6.H(linearLayout);
    }
}
