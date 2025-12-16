package com.avito.android.short_term_rent.view.components.retro_badges;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.glide.utils.b;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c;

/* compiled from: RetroBadgesView.kt */
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\b¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/retro_badges/RetroBadgesView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItem;", "badges", "Lkotlin/G0;", "setupBadges", "(Ljava/util/List;)V", "setup", "Lkotlin/Function1;", "Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItemHint;", "action", "setOnMoreClickListener", "(LY41/l;)V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RetroBadgesView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ShapeDrawable f283040b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ShapeDrawable f283041c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout.LayoutParams f283042d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout.LayoutParams f283043e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.l<? super RetroBadgeItemHint, G0> f283044f;

    public /* synthetic */ RetroBadgesView(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    private final void setupBadges(List<? extends List<RetroBadgeItem>> badges) {
        View view;
        removeAllViews();
        Iterator<T> it = badges.iterator();
        while (it.hasNext()) {
            List<RetroBadgeItem> list = (List) it.next();
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(this.f283042d);
            linearLayout.setDividerDrawable(this.f283041c);
            linearLayout.setShowDividers(2);
            for (RetroBadgeItem retroBadgeItem : list) {
                LinearLayout.LayoutParams layoutParams = this.f283043e;
                if (retroBadgeItem == null) {
                    view = new View(getContext());
                    view.setLayoutParams(layoutParams);
                } else {
                    View viewInflate = View.inflate(getContext(), R.layout.badge_item, null);
                    viewInflate.setLayoutParams(layoutParams);
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.title);
                    b.c(imageView, Uri.parse(retroBadgeItem.f283046c));
                    String str = retroBadgeItem.f283047d;
                    textView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
                    textView.setText(str);
                    viewInflate.setOnClickListener(new c(3, this, retroBadgeItem));
                    view = viewInflate;
                }
                linearLayout.addView(view);
            }
            addView(linearLayout);
        }
    }

    public final void setOnMoreClickListener(@k Y41.l<? super RetroBadgeItemHint, G0> action) {
        this.f283044f = action;
    }

    public final void setup(@k List<? extends List<RetroBadgeItem>> badges) {
        setOrientation(1);
        setDividerDrawable(this.f283040b);
        setShowDividers(2);
        setupBadges(badges);
    }

    public RetroBadgesView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setIntrinsicHeight(y6.b(8));
        shapeDrawable.setAlpha(0);
        this.f283040b = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setIntrinsicWidth(y6.b(8));
        shapeDrawable2.setAlpha(0);
        this.f283041c = shapeDrawable2;
        this.f283042d = new LinearLayout.LayoutParams(-1, y6.b(100));
        this.f283043e = new LinearLayout.LayoutParams(y6.b(0), y6.b(100), 1.0f);
    }
}
