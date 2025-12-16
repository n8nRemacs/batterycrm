package com.avito.android.publish.slots.images_groups_recommendations.item.photo_list_view_groups;

import FV.a;
import LV.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.c;
import com.avito.android.publish.P0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import e11.ViewOnClickListenerC39879j1;
import gw.InterfaceC40743a;
import java.util.Arrays;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import of0.C44769a;
import of0.C44770b;
import of0.C44771c;
import wK0.AbstractC49526a;

/* compiled from: ImageWithLabel.kt */
@P
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0019\u001a\u00020\u00118\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0007\u0010\u0016R(\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/photo_list_view_groups/ImageWithLabel;", "Landroidx/cardview/widget/CardView;", "Lgw/a;", "LLV/b;", "Lof0/b;", "newState", "Lkotlin/G0;", "setState", "(Lof0/b;)V", "Landroid/view/View;", "g", "Landroid/view/View;", "getImageContainerView", "()Landroid/view/View;", "setImageContainerView", "(Landroid/view/View;)V", "imageContainerView", "Lcom/avito/android/design/State;", "h", "Lcom/avito/android/design/State;", "getState", "()Lcom/avito/android/design/State;", "(Lcom/avito/android/design/State;)V", "getState$annotations", "()V", VoiceInfo.STATE, "Landroid/graphics/drawable/Drawable;", "value", "getImage", "()Landroid/graphics/drawable/Drawable;", "setImage", "(Landroid/graphics/drawable/Drawable;)V", "image", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ImageWithLabel extends CardView implements InterfaceC40743a, b<C44770b> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f244234i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f244235b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecommendationLabel f244236c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public C44770b f244237d;

    /* renamed from: e, reason: collision with root package name */
    public final float f244238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f244239f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public View imageContainerView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    public State state;

    @j
    public ImageWithLabel(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // gw.InterfaceC40743a
    @l
    /* renamed from: getImage */
    public Drawable getF179015b() {
        return this.f244235b.getDrawable();
    }

    @Override // gw.InterfaceC40743a
    @l
    public View getImageContainerView() {
        return this.imageContainerView;
    }

    @k
    public State getState() {
        return this.state;
    }

    @Override // gw.InterfaceC40743a
    public void setImage(@l Drawable drawable) {
        this.f244235b.setImageDrawable(drawable);
    }

    public void setImageContainerView(@l View view) {
        this.imageContainerView = view;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageWithLabel(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.ImageWithGroup : i13;
        super(context, attributeSet, i12);
        this.imageContainerView = this;
        this.state = State.f135880d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P0.m.f231956b, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.image_group_recommendation, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.picture);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f244235b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.label);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.slots.images_groups_recommendations.item.photo_list_view_groups.RecommendationLabel");
        }
        RecommendationLabel recommendationLabel = (RecommendationLabel) viewFindViewById2;
        this.f244236c = recommendationLabel;
        View viewFindViewById3 = findViewById(R.id.label_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        View viewFindViewById4 = findViewById(R.id.add_action);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f244238e = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f244239f = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f244239f);
        }
        setCardElevation(0.0f);
        setClipChildren(false);
        setClipToPadding(false);
        setCardBackgroundColor(C35835l0.d(R.attr.warmGray4, getContext()));
        setRadius(this.f244238e);
        recommendationLabel.setImageGroupColor(R.attr.black);
        recommendationLabel.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, ColorStateList.valueOf(C35835l0.d(R.attr.white, getContext())), null, this.f244239f, null, 0, 122));
        a aVar = a.f4720a;
        View viewFindViewById5 = button.findViewById(R.id.text_view);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        a.a(aVar, (TextView) viewFindViewById5, Integer.valueOf(R.attr.textIconAdd));
        button.setOnClickListener(new ViewOnClickListenerC39879j1(this, 17));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // gw.InterfaceC40743a
    public void setState(@k State state) {
        this.state = state;
    }

    @Override // LV.b
    public void setState(@k C44770b newState) {
        Integer num;
        C44770b c44770b = this.f244237d;
        if (new c(newState, c44770b).f181333c) {
            return;
        }
        this.f244237d = newState;
        C44769a c44769a = c44770b != null ? c44770b.f419982a : null;
        C44769a c44769a2 = newState.f419982a;
        if (!new c(c44769a2, c44769a).f181333c) {
            C35949t5.c(this.f244235b, c44769a2.f419981a, null, null, null, 14);
        }
        C44771c c44771c = c44770b != null ? c44770b.f419983b : null;
        C44771c c44771c2 = newState.f419983b;
        if (new c(c44771c2, c44771c).f181333c) {
            return;
        }
        RecommendationLabel recommendationLabel = this.f244236c;
        I5.a(recommendationLabel.f244243c, c44771c2.f419984a, false);
        String str = c44771c2.f419985b;
        TextView textView = recommendationLabel.f244244d;
        if (str != null && (num = c44771c2.f419986c) != null) {
            u0 u0Var = u0.f406856a;
            I5.a(textView, String.format(str, Arrays.copyOf(new Object[]{num}, 1)), false);
        } else {
            I5.a(textView, null, false);
        }
    }

    @InterfaceC42830m
    public static /* synthetic */ void getState$annotations() {
    }
}
