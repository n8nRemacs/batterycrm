package com.avito.android.serp.adapter.promo;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.promo.PromoHeaderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.promo.PromoHeaderItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: PromoHeaderView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/promo/n;", "Lcom/avito/android/serp/adapter/promo/m;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f270499l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f270500b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f270501c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f270502d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f270503e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f270504f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f270505g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f270506h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f270507i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f270508j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final DockingBadgeContainer f270509k;

    /* compiled from: PromoHeaderView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/serp/adapter/promo/n$a;", "", "<init>", "()V", "", "DEFAULT_IMAGE_HEIGHT", "I", "DEFAULT_IMAGE_WIDTH", "MAX_IMAGE_HEIGHT", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public n(@Y61.k View view) {
        super(view);
        this.f270500b = view;
        View viewFindViewById = view.findViewById(R.id.promo);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f270501c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.promo_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270502d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.promo_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270503e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.promo_left_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f270504f = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.promo_right_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f270505g = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.promo_full_image);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f270506h = (SimpleDraweeView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.promo_center_image);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f270507i = (SimpleDraweeView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.promo_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f270508j = (Button) viewFindViewById8;
        this.f270509k = (DockingBadgeContainer) view.findViewById(R.id.promo_docking_badge_bar);
    }

    public static void B80(SimpleDraweeView simpleDraweeView, UniversalImage universalImage, Integer num, int i12, Integer num2) {
        if (universalImage == null) {
            simpleDraweeView.setVisibility(8);
            return;
        }
        simpleDraweeView.setVisibility(0);
        if (num2 != null) {
            int iIntValue = num2.intValue();
            simpleDraweeView.getLayoutParams().height = y6.b(Math.min(iIntValue, 300));
        }
        if (num != null) {
            int iIntValue2 = num.intValue();
            simpleDraweeView.getLayoutParams().width = y6.b(Math.min(iIntValue2, i12));
        }
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
    }

    @Override // com.avito.android.serp.adapter.promo.m
    public final void G0(@Y61.l List<PromoHeaderWidget.Image> list) {
        PromoHeaderWidget.Image image;
        PromoHeaderWidget.Image image2;
        PromoHeaderWidget.Image image3;
        PromoHeaderWidget.Image image4;
        PromoHeaderWidget.Size size;
        PromoHeaderWidget.Size size2;
        PromoHeaderWidget.Size size3;
        PromoHeaderWidget.Size size4;
        PromoHeaderWidget.Size size5;
        PromoHeaderWidget.Size size6;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it.next();
                    if (((PromoHeaderWidget.Image) next4).getPosition() == PromoHeaderWidget.Position.LEFT) {
                        break;
                    }
                }
            }
            image = (PromoHeaderWidget.Image) next4;
        } else {
            image = null;
        }
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it2.next();
                    if (((PromoHeaderWidget.Image) next3).getPosition() == PromoHeaderWidget.Position.RIGHT) {
                        break;
                    }
                }
            }
            image2 = (PromoHeaderWidget.Image) next3;
        } else {
            image2 = null;
        }
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    if (((PromoHeaderWidget.Image) next2).getPosition() == PromoHeaderWidget.Position.CENTER) {
                        break;
                    }
                }
            }
            image3 = (PromoHeaderWidget.Image) next2;
        } else {
            image3 = null;
        }
        if (list != null) {
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it4.next();
                    if (((PromoHeaderWidget.Image) next).getPosition() == PromoHeaderWidget.Position.FULL) {
                        break;
                    }
                }
            }
            image4 = (PromoHeaderWidget.Image) next;
        } else {
            image4 = null;
        }
        int iE2 = y6.e(C35835l0.i(this.f270500b.getContext()).widthPixels);
        int width = 190;
        int i12 = iE2 / 2;
        int height = 248;
        B80(this.f270504f, image != null ? image.getImage() : null, Integer.valueOf((image == null || (size6 = image.getSize()) == null) ? 190 : size6.getWidth()), i12, Integer.valueOf((image == null || (size5 = image.getSize()) == null) ? 248 : size5.getHeight()));
        B80(this.f270505g, image2 != null ? image2.getImage() : null, Integer.valueOf((image2 == null || (size4 = image2.getSize()) == null) ? 190 : size4.getWidth()), i12, Integer.valueOf((image2 == null || (size3 = image2.getSize()) == null) ? 248 : size3.getHeight()));
        UniversalImage image5 = image3 != null ? image3.getImage() : null;
        if (image3 != null && (size2 = image3.getSize()) != null) {
            width = size2.getWidth();
        }
        Integer numValueOf = Integer.valueOf(width);
        if (image3 != null && (size = image3.getSize()) != null) {
            height = size.getHeight();
        }
        B80(this.f270507i, image5, numValueOf, iE2, Integer.valueOf(height));
        B80(this.f270506h, image4 != null ? image4.getImage() : null, null, iE2, null);
    }

    @Override // com.avito.android.serp.adapter.promo.m
    public final void Mw(@Y61.l PromoHeaderWidget.Button button, @Y61.k Y41.l<? super DeepLink, G0> lVar) throws Resources.NotFoundException {
        Button button2 = this.f270508j;
        if (button == null) {
            button2.setVisibility(8);
            return;
        }
        button2.setVisibility(0);
        button2.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(14, lVar, button));
        button2.setText(button.getText());
        String style = button.getStyle();
        if (style != null) {
            button2.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(style), button2.getContext()));
        }
    }

    @Override // com.avito.android.serp.adapter.promo.m
    public final void Pc(@Y61.l List<PromoHeaderItem.BadgeData> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (PromoHeaderItem.BadgeData badgeData : list) {
                Context context = this.itemView.getContext();
                String str = badgeData.f270469b;
                C48063a c48063a = C48063a.f437606a;
                arrayList.add(new DockingBadgeItem(str, new DockingBadgeType.CustomColors(R.style.Re23_DockingBadge_GrayMedium, Integer.valueOf(c48063a.a(context, badgeData.f270470c)), Integer.valueOf(c48063a.a(context, badgeData.f270471d)), null, null, 24, null), badgeData.f270472e, badgeData.f270473f, null, 16, null));
            }
        } else {
            arrayList = null;
        }
        DockingBadgeContainer dockingBadgeContainer = this.f270509k;
        if (arrayList != null) {
            dockingBadgeContainer.setBadgeItems(arrayList);
        }
        D6.G(dockingBadgeContainer, !(arrayList == null || arrayList.isEmpty()));
    }

    @Override // com.avito.android.serp.adapter.promo.m
    @Y61.l
    public final String e(@Y61.l AttributedText attributedText) {
        TextView textView = this.f270502d;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        CharSequence text = textView.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.avito.android.serp.adapter.promo.m
    public final void iM(float f12) {
        this.f270501c.setAlpha(f12);
    }

    @Override // com.avito.android.serp.adapter.promo.m
    public final void k(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f270503e, attributedText, null);
    }

    @Override // com.avito.android.serp.adapter.promo.m
    public final void v(@Y61.l UniversalColor universalColor) {
        int iD2;
        ConstraintLayout constraintLayout = this.f270501c;
        if (universalColor != null) {
            iD2 = C48063a.f437606a.a(constraintLayout.getContext(), universalColor);
        } else {
            iD2 = C35835l0.d(R.attr.white, constraintLayout.getContext());
        }
        constraintLayout.setBackgroundColor(iD2);
    }
}
