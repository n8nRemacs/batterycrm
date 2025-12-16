package com.avito.android.publish.slots.delivery_summary.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Barrier;
import com.akita.view.foundation.util.e;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.b;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.util.c;
import com.avito.android.lib.util.v;
import com.avito.android.publish.P0;
import com.avito.android.publish.slots.delivery_summary.view.a;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySummarySnippet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/view/DeliverySummarySnippet;", "Landroid/widget/FrameLayout;", "LLV/a;", "Lcom/avito/android/publish/slots/delivery_summary/view/a;", "Lkotlin/G0;", "newStyle", "setStyle", "(Lkotlin/G0;)V", "newState", "setState", "(Lcom/avito/android/publish/slots/delivery_summary/view/a;)V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DeliverySummarySnippet extends FrameLayout implements LV.a<a, G0> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f243734b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f243735c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f243736d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f243737e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f243738f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public a f243739g;

    @j
    public DeliverySummarySnippet(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // LV.d
    public void setStyle(@k G0 newStyle) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeliverySummarySnippet(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? R.style.DeliverySummarySnippet : i13;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P0.m.f231955a, i12, i13);
        LayoutInflater.from(context).inflate(R.layout.delivery_summary_snippet_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.snippet_card);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        Banner banner = (Banner) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.snippet_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        View viewFindViewById3 = findViewById(R.id.summary_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById3;
        this.f243734b = simpleDraweeView;
        View viewFindViewById4 = findViewById(R.id.text_start_barrier);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Barrier");
        }
        Barrier barrier = (Barrier) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.summary_advert_price);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243735c = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.summary_advert_name);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243736d = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.summary_advert_description);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243737e = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.summary_advert_seller);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243738f = (TextView) viewFindViewById8;
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            v.a(simpleDraweeView, typedArrayObtainStyledAttributes.getDimension(1, 0.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            barrier.setMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            e.a(banner, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0)), null, null, null, 14);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            e.a(banner, null, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0)), null, 11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            e.a(banner, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0)), null, null, 13);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            e.a(banner, null, null, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0)), 7);
        }
        setClipChildren(false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // LV.b
    public void setState(@k a newState) {
        a aVar = this.f243739g;
        if (new c(newState, aVar).f181333c) {
            return;
        }
        this.f243739g = newState;
        a.C7303a c7303a = aVar != null ? aVar.f243740a : null;
        a.C7303a c7303a2 = newState.f243740a;
        if (!new c(c7303a2, c7303a).f181333c && c7303a2 != null) {
            C35949t5.c(this.f243734b, b.b(c7303a2.f243742a), null, null, D6.u(this, R.drawable.publish_delivery_summary_snippet_image_foreground), 6);
        }
        a.b bVar = aVar != null ? aVar.f243741b : null;
        a.b bVar2 = newState.f243741b;
        if (new c(bVar2, bVar).f181333c || bVar2 == null) {
            return;
        }
        I5.a(this.f243735c, bVar2.f243743a, false);
        I5.a(this.f243736d, bVar2.f243744b, false);
        I5.a(this.f243737e, bVar2.f243745c, false);
        I5.a(this.f243738f, bVar2.f243746d, false);
    }
}
