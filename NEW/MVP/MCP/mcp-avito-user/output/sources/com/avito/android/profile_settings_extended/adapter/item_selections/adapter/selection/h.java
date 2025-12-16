package com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection;

import Y61.k;
import Y61.l;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/selection/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/selection/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f229578q = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f229579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f229580c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f229581d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f229582e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f229583f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f229584g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f229585h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f229586i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f229587j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SimpleDraweeView f229588k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final View f229589l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public Y41.a<G0> f229590m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final List<ObjectAnimator> f229591n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final List<ObjectAnimator> f229592o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final com.avito.android.extended_profile_ui_components.f f229593p;

    /* compiled from: SelectionItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = h.this.f229590m;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_selection_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229579b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_selection_image_2);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f229580c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_selection_image_2_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229581d = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_profile_selection_image_3);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f229582e = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.extended_profile_selection_image_3_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229583f = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.extended_profile_selection_moderation_overlay);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229584g = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.extended_profile_selection_moderation_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById7;
        this.f229585h = imageView;
        View viewFindViewById8 = view.findViewById(R.id.extended_profile_selection_item_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229586i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.extended_profile_selection_item_description);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229587j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.extended_profile_selection_image);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById10;
        simpleDraweeView.setPivotX(0.0f);
        simpleDraweeView.setPivotY(y6.b(132) / 2.0f);
        this.f229588k = simpleDraweeView;
        View viewFindViewById11 = view.findViewById(R.id.extended_profile_selection_clickable_overlay);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229589l = viewFindViewById11;
        Property property = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(simpleDraweeView, (Property<SimpleDraweeView, Float>) property, 0.94f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(simpleDraweeView, (Property<SimpleDraweeView, Float>) property2, 0.94f);
        Property property3 = View.TRANSLATION_X;
        List<ObjectAnimator> listU = C42745f0.U(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(viewFindViewById3, (Property<View, Float>) property3, i.f229595a), ObjectAnimator.ofFloat(viewFindViewById5, (Property<View, Float>) property3, i.f229596b), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 0.94f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.94f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i.f229597c));
        this.f229591n = listU;
        List<ObjectAnimator> listU2 = C42745f0.U(ObjectAnimator.ofFloat(simpleDraweeView, (Property<SimpleDraweeView, Float>) property, 1.0f), ObjectAnimator.ofFloat(simpleDraweeView, (Property<SimpleDraweeView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(viewFindViewById3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(viewFindViewById5, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
        this.f229592o = listU2;
        this.f229593p = new com.avito.android.extended_profile_ui_components.f(listU, listU2, new a());
    }

    @Override // com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.g
    public final void VZ(@k SelectionItem selectionItem, @k Y41.a<G0> aVar) {
        this.f229590m = aVar;
        this.f229589l.setOnTouchListener(this.f229593p);
        I5.a(this.f229586i, selectionItem.f229557c, false);
        I5.a(this.f229587j, selectionItem.f229559e, false);
        List<Image> list = selectionItem.f229558d;
        C35949t5.c(this.f229588k, com.avito.android.image_loader.b.b((Image) C42745f0.G(list)), null, null, null, 14);
        C35949t5.c(this.f229580c, com.avito.android.image_loader.b.b((Image) C42745f0.K(1, list)), null, null, null, 14);
        C35949t5.c(this.f229582e, com.avito.android.image_loader.b.b((Image) C42745f0.K(2, list)), null, null, null, 14);
        ModerationStatus moderationStatus = selectionItem.f229566l;
        boolean z12 = moderationStatus instanceof ModerationStatus.ModerationFailed;
        View view = this.f229584g;
        ImageView imageView = this.f229585h;
        if (z12) {
            view.setVisibility(0);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_selection_moderation_fail);
        } else if (moderationStatus instanceof ModerationStatus.ModerationPending) {
            view.setVisibility(0);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_selection_moderation_pending);
        } else if ((moderationStatus instanceof ModerationStatus.ModerationPassed) || moderationStatus == null) {
            imageView.setVisibility(8);
            view.setVisibility(8);
        }
        this.f229579b.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(14, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229590m = null;
        this.f229579b.setOnClickListener(null);
        this.f229589l.setOnTouchListener(null);
    }
}
