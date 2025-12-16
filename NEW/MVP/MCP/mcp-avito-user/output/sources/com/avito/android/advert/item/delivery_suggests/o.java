package com.avito.android.advert.item.delivery_suggests;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDeliverySuggestsView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/delivery_suggests/o;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f75135a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f75136b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f75137c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f75138d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f75139e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AnimationView f75140f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f75141g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f75142h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f75143i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Space f75144j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Space f75145k;

    /* compiled from: AdvertDetailsDeliverySuggestsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/advert/item/delivery_suggests/o$a;", "", "<init>", "()V", "", "BACKGROUND_RADIUS", "I", "BOTTOM_PADDING", "ITEM_WITH_BADGE_TOP_MARGIN", "LEFT_PADDING", "RIGHT_WITHOUT_ICON_PADDING", "RIGHT_WITH_ICON_PADDING", "SELECTED_STROKE_WIDTH", "TOP_PADDING", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public o(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        this.f75135a = view;
        this.f75136b = aVar;
        View viewFindViewById = view.findViewById(R.id.delivery_suggests_slider_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f75137c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.delivery_suggests_slider_item_top_right_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f75138d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.delivery_suggests_slider_item_badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f75139e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.delivery_suggests_slider_item_animation_badge);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.animation.AnimationView");
        }
        this.f75140f = (AnimationView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.delivery_suggests_slider_item_top_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75141g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.delivery_suggests_slider_item_middle_text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75142h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.delivery_suggests_slider_item_bottom_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75143i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.delivery_suggests_slider_item_middle_and_bottom_spacing);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Space");
        }
        this.f75144j = (Space) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.delivery_suggests_slider_item_top_and_middle_spacing);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Space");
        }
        this.f75145k = (Space) viewFindViewById9;
    }
}
