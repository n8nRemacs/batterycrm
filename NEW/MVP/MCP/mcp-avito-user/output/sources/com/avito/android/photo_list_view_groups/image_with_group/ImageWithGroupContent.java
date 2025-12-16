package com.avito.android.photo_list_view_groups.image_with_group;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
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
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.util.c;
import com.avito.android.lib.util.f;
import com.avito.android.photo_list_view_groups.image_with_group.a;
import com.avito.android.photo_list_view_groups.p;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import e11.ViewOnClickListenerC39879j1;
import i80.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49526a;

/* compiled from: ImageWithGroupContent.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group/ImageWithGroupContent;", "Landroidx/cardview/widget/CardView;", "LLV/a;", "Lcom/avito/android/photo_list_view_groups/image_with_group/a;", "Li80/b;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/photo_list_view_groups/image_with_group/a;)V", "newStyle", "setStyle", "(Li80/b;)V", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageWithGroupContent extends CardView implements LV.a<a, b> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f218548m = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f218549b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f218550c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FrameLayout f218551d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ShimmerLayout f218552e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f218553f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public a f218554g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public b f218555h;

    /* renamed from: i, reason: collision with root package name */
    public final float f218556i;

    /* renamed from: j, reason: collision with root package name */
    public final int f218557j;

    /* renamed from: k, reason: collision with root package name */
    public final int f218558k;

    /* renamed from: l, reason: collision with root package name */
    public final int f218559l;

    @j
    public ImageWithGroupContent(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageWithGroupContent(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.ImageWithGroupContent : i13;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.h.f218636a, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.image_with_group_content, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.picture);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f218549b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.label_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f218550c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.label_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f218551d = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.label_skeleton);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f218552e = (ShimmerLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.actions);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f218553f = (LinearLayout) viewFindViewById5;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f218556i = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f218557j = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f218557j);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f218558k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f218558k);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f218559l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f218559l);
        }
        setCardElevation(0.0f);
        setClipChildren(false);
        setClipToPadding(false);
        setRadius(this.f218556i);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k a newState) throws Resources.NotFoundException {
        a aVar = this.f218554g;
        if (new c(newState, aVar).f181333c) {
            return;
        }
        this.f218554g = newState;
        a.c cVar = aVar != null ? aVar.f218560a : null;
        a.c cVar2 = newState.f218560a;
        if (!new c(cVar2, cVar).f181333c) {
            C35949t5.c(this.f218549b, n.a(ImageKt.toSingleImage(cVar2.f218565a)), null, null, D6.u(this, R.drawable.image_with_group_image_foreground), 6);
            setOnClickListener(new ViewOnClickListenerC39879j1(cVar2, 8));
        }
        a.d dVar = aVar != null ? aVar.f218561b : null;
        a.d dVar2 = newState.f218561b;
        if (!new c(dVar2, dVar).f181333c && dVar2 != null) {
            boolean z12 = dVar2 instanceof a.d.c;
            ShimmerLayout shimmerLayout = this.f218552e;
            FrameLayout frameLayout = this.f218551d;
            TextView textView = this.f218550c;
            if (z12) {
                textView.setText((CharSequence) null);
                D6.w(textView);
                frameLayout.setOnClickListener(null);
                D6.w(frameLayout);
                D6.H(shimmerLayout);
                shimmerLayout.c();
            } else if (dVar2 instanceof a.d.C6561a) {
                textView.setText(((a.d.C6561a) dVar2).f218567a);
                D6.H(textView);
                frameLayout.setOnClickListener(new ViewOnClickListenerC39879j1(dVar2, 9));
                D6.H(frameLayout);
                D6.w(shimmerLayout);
                shimmerLayout.d();
            } else if (dVar2 instanceof a.d.b) {
                textView.setText((CharSequence) null);
                D6.w(textView);
                frameLayout.setOnClickListener(null);
                D6.w(frameLayout);
                D6.w(shimmerLayout);
                shimmerLayout.d();
            }
        }
        a.b bVar = aVar != null ? aVar.f218562c : null;
        a.b bVar2 = newState.f218562c;
        if (new c(bVar2, bVar).f181333c) {
            return;
        }
        LinearLayout linearLayout = this.f218553f;
        linearLayout.removeAllViews();
        List<a.C6560a> list = bVar2.f218564a;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a.C6560a c6560a = (a.C6560a) obj;
            c6560a.getClass();
            boolean z13 = i12 == list.size() - 1;
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
            frameLayout2.setOnClickListener(new i(25, c6560a.f218563a));
            Button button = new Button(getContext(), null, 0, 0, 14, null);
            button.setLayoutParams(new FrameLayout.LayoutParams(this.f218558k, this.f218559l));
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
            button.setOnClickListener(new ViewOnClickListenerC25426a(frameLayout2, 3));
            frameLayout2.addView(button);
            linearLayout.addView(frameLayout2);
            i12 = i13;
        }
        D6.H(linearLayout);
    }

    @Override // LV.d
    public void setStyle(@k b newStyle) {
        int i12;
        b bVar = this.f218555h;
        if (new c(newStyle, bVar).f181333c) {
            return;
        }
        this.f218555h = newStyle;
        String str = bVar != null ? bVar.f398364a : null;
        String str2 = newStyle.f398364a;
        if (new c(str2, str).f181333c || str2 == null) {
            return;
        }
        Context context = getContext();
        boolean zEquals = str2.equals(AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        int i13 = R.attr.black;
        if (zEquals) {
            i12 = R.attr.white;
        } else {
            str2.equals("white");
            i12 = R.attr.black;
        }
        this.f218550c.setTextColor(C35835l0.d(i12, context));
        AbstractC49526a.C12816a c12816a = AbstractC49526a.f441376b;
        Context context2 = getContext();
        if (!str2.equals(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)) {
            str2.equals("white");
            i13 = R.attr.white;
        }
        this.f218551d.setBackground(AbstractC49526a.C12816a.a(c12816a, ColorStateList.valueOf(C35835l0.d(i13, context2)), null, this.f218557j, null, 0, 122));
    }
}
