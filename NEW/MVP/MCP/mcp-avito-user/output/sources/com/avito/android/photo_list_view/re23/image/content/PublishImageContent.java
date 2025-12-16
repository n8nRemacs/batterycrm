package com.avito.android.photo_list_view.re23.image.content;

import A91.p;
import Ae0.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
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
import b80.c;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.util.f;
import com.avito.android.photo_list_view.M;
import com.avito.android.photo_list_view.re23.image.content.a;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49526a;

/* compiled from: PublishImageContent.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/photo_list_view/re23/image/content/PublishImageContent;", "Landroidx/cardview/widget/CardView;", "LLV/a;", "Lcom/avito/android/photo_list_view/re23/image/content/a;", "Lb80/c;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/photo_list_view/re23/image/content/a;)V", "newStyle", "setStyle", "(Lb80/c;)V", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PublishImageContent extends CardView implements LV.a<a, c> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f218213m = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f218214b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f218215c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FrameLayout f218216d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ShimmerLayout f218217e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f218218f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public a f218219g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public c f218220h;

    /* renamed from: i, reason: collision with root package name */
    public final float f218221i;

    /* renamed from: j, reason: collision with root package name */
    public final int f218222j;

    /* renamed from: k, reason: collision with root package name */
    public final int f218223k;

    /* renamed from: l, reason: collision with root package name */
    public final int f218224l;

    @j
    public PublishImageContent(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PublishImageContent(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.PublishImageContent : i13;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M.h.f218099a, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.image_photo_content, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.picture);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f218214b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.label_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f218215c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.label_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f218216d = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.label_skeleton);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f218217e = (ShimmerLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.actions);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f218218f = (LinearLayout) viewFindViewById5;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f218221i = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f218222j = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f218222j);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f218223k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f218223k);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f218224l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f218224l);
        }
        setCardElevation(0.0f);
        setClipChildren(false);
        setClipToPadding(false);
        setRadius(this.f218221i);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k a newState) {
        a aVar = this.f218219g;
        if (new com.avito.android.lib.util.c(newState, aVar).f181333c) {
            return;
        }
        this.f218219g = newState;
        a.c cVar = aVar != null ? aVar.f218225a : null;
        a.c cVar2 = newState.f218225a;
        if (!new com.avito.android.lib.util.c(cVar2, cVar).f181333c) {
            C35949t5.c(this.f218214b, n.a(ImageKt.toSingleImage(cVar2.f218230a)), null, null, D6.u(this, R.drawable.publish_image_foreground), 6);
            setOnClickListener(new p(cVar2, 22));
        }
        a.d dVar = aVar != null ? aVar.f218226b : null;
        a.d dVar2 = newState.f218226b;
        if (!new com.avito.android.lib.util.c(dVar2, dVar).f181333c && dVar2 != null) {
            boolean z12 = dVar2 instanceof a.d.c;
            ShimmerLayout shimmerLayout = this.f218217e;
            FrameLayout frameLayout = this.f218216d;
            TextView textView = this.f218215c;
            if (z12) {
                textView.setText((CharSequence) null);
                D6.w(textView);
                frameLayout.setOnClickListener(null);
                D6.w(frameLayout);
                D6.H(shimmerLayout);
                shimmerLayout.c();
            } else if (dVar2 instanceof a.d.C6547a) {
                textView.setText(((a.d.C6547a) dVar2).f218232a);
                D6.H(textView);
                frameLayout.setOnClickListener(new p(dVar2, 23));
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
        a.b bVar = aVar != null ? aVar.f218227c : null;
        a.b bVar2 = newState.f218227c;
        if (new com.avito.android.lib.util.c(bVar2, bVar).f181333c) {
            return;
        }
        LinearLayout linearLayout = this.f218218f;
        linearLayout.removeAllViews();
        List<a.C6546a> list = bVar2.f218229a;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a.C6546a c6546a = (a.C6546a) obj;
            c6546a.getClass();
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
            frameLayout2.setOnClickListener(new b(24, c6546a.f218228a));
            Button button = new Button(getContext(), null, 0, 0, 14, null);
            button.setLayoutParams(new FrameLayout.LayoutParams(this.f218223k, this.f218224l));
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
            button.setOnClickListener(new ViewOnClickListenerC25426a(frameLayout2, 0));
            frameLayout2.addView(button);
            linearLayout.addView(frameLayout2);
            i12 = i13;
        }
        D6.H(linearLayout);
    }

    @Override // LV.d
    public void setStyle(@k c newStyle) {
        int i12;
        c cVar = this.f218220h;
        if (new com.avito.android.lib.util.c(newStyle, cVar).f181333c) {
            return;
        }
        this.f218220h = newStyle;
        String str = cVar != null ? cVar.f56943a : null;
        String str2 = newStyle.f56943a;
        if (new com.avito.android.lib.util.c(str2, str).f181333c || str2 == null) {
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
        this.f218215c.setTextColor(C35835l0.d(i12, context));
        AbstractC49526a.C12816a c12816a = AbstractC49526a.f441376b;
        Context context2 = getContext();
        if (!str2.equals(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)) {
            str2.equals("white");
            i13 = R.attr.white;
        }
        this.f218216d.setBackground(AbstractC49526a.C12816a.a(c12816a, ColorStateList.valueOf(C35835l0.d(i13, context2)), null, this.f218222j, null, 0, 122));
    }
}
