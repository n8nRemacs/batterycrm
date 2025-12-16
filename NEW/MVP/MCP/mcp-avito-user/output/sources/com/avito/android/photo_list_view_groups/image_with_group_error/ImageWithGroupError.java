package com.avito.android.photo_list_view_groups.image_with_group_error;

import LV.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
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
import com.avito.android.image_loader.m;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.c;
import com.avito.android.lib.util.f;
import com.avito.android.photo_list_view_groups.image_with_group_error.a;
import com.avito.android.photo_list_view_groups.p;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import e11.ViewOnClickListenerC39879j1;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageWithGroupError.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/photo_list_view_groups/image_with_group_error/ImageWithGroupError;", "Landroidx/cardview/widget/CardView;", "LLV/b;", "Lcom/avito/android/photo_list_view_groups/image_with_group_error/a;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/photo_list_view_groups/image_with_group_error/a;)V", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImageWithGroupError extends CardView implements b<a> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f218571j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f218572b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f218573c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f218574d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public a f218575e;

    /* renamed from: f, reason: collision with root package name */
    public final float f218576f;

    /* renamed from: g, reason: collision with root package name */
    public final int f218577g;

    /* renamed from: h, reason: collision with root package name */
    public final int f218578h;

    /* renamed from: i, reason: collision with root package name */
    public final int f218579i;

    @j
    public ImageWithGroupError(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageWithGroupError(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.ImageWithGroupError : i13;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.h.f218637b, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.image_with_group_error, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.picture);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f218572b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.label);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f218573c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.actions);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f218574d = (LinearLayout) viewFindViewById3;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f218576f = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f218577g = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.f218577g);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f218578h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f218578h);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f218579i = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f218579i);
        }
        setCardElevation(0.0f);
        setClipChildren(false);
        setClipToPadding(false);
        setRadius(this.f218576f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // LV.b
    public void setState(@k a newState) throws Resources.NotFoundException {
        int i12 = 12;
        a aVar = this.f218575e;
        if (new c(newState, aVar).f181333c) {
            return;
        }
        this.f218575e = newState;
        a.c cVar = aVar != null ? aVar.f218580a : null;
        a.c cVar2 = newState.f218580a;
        if (!new c(cVar2, cVar).f181333c) {
            m mVarA = n.a(ImageKt.toSingleImage(cVar2.f218586a));
            ColorDrawable colorDrawable = new ColorDrawable(C35835l0.d(R.attr.warmGray4, getContext()));
            colorDrawable.setAlpha(127);
            G0 g02 = G0.f406611a;
            C35949t5.c(this.f218572b, mVarA, null, null, colorDrawable, 6);
            this.f218572b.setOnClickListener(new ViewOnClickListenerC39879j1(cVar2, i12));
        }
        a.d dVar = aVar != null ? aVar.f218581b : null;
        a.d dVar2 = newState.f218581b;
        if (!new c(dVar2, dVar).f181333c) {
            this.f218573c.setOnClickListener(new ViewOnClickListenerC39879j1(dVar2, 13));
        }
        a.b bVar = aVar != null ? aVar.f218582c : null;
        a.b bVar2 = newState.f218582c;
        if (new c(bVar2, bVar).f181333c) {
            return;
        }
        LinearLayout linearLayout = this.f218574d;
        linearLayout.removeAllViews();
        List<a.C6562a> list = bVar2.f218585a;
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            a.C6562a c6562a = (a.C6562a) obj;
            String str = c6562a.f218583a;
            boolean z12 = i13 == C42745f0.J(list);
            boolean z13 = list.size() == 1;
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            int iB2 = y6.b(3);
            int iB3 = y6.b(12);
            if (z13) {
                frameLayout.setPadding(iB3, iB3, iB3, iB3);
            } else {
                frameLayout.setPadding(iB2, iB2, z12 ? iB3 : iB2, iB3);
            }
            frameLayout.setOnClickListener(new A(26, (Y41.a) c6562a.f218584b));
            Button button = new Button(getContext(), null, 0, 0, 14, null);
            button.setLayoutParams(new FrameLayout.LayoutParams(this.f218578h, this.f218579i));
            button.setAppearance(C35835l0.j(R.attr.buttonOverlayPrimarySmall, button.getContext()));
            Integer numM = f.m(str);
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a aVar2 = FV.a.f4720a;
                View viewFindViewById = button.findViewById(R.id.text_view);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                FV.a.a(aVar2, (TextView) viewFindViewById, Integer.valueOf(iIntValue));
            }
            button.setOnClickListener(new ViewOnClickListenerC25426a(frameLayout, 4));
            frameLayout.addView(button);
            linearLayout.addView(frameLayout);
            i13 = i14;
        }
        D6.H(linearLayout);
    }
}
