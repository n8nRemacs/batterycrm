package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomButtonState;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPositionBottomBar.kt */
@P
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/SearchPositionBottomBar;", "Landroid/widget/FrameLayout;", "LLV/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/widget/bottom_bar/e;)V", "LVU/b;", "l", "Lkotlin/C;", "getPrimaryButtonStyle", "()LVU/b;", "primaryButtonStyle", "m", "getSecondaryButtonStyle", "secondaryButtonStyle", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchPositionBottomBar extends FrameLayout implements LV.b<e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f221268b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewGroup f221269c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f221270d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f221271e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f221272f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f221273g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f221274h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public e f221275i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final UU.a f221276j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final UU.a f221277k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Object f221278l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f221279m;

    /* compiled from: SearchPositionBottomBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SearchPositionBottomButtonState.ButtonStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SearchPositionBottomButtonState.ButtonStyle buttonStyle = SearchPositionBottomButtonState.ButtonStyle.f221284b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @j
    public SearchPositionBottomBar(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final VU.b getPrimaryButtonStyle() {
        return (VU.b) this.f221278l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final VU.b getSecondaryButtonStyle() {
        return (VU.b) this.f221279m.getValue();
    }

    public final void a(Button button, SearchPositionBottomButtonState searchPositionBottomButtonState, SearchPositionBottomButtonState searchPositionBottomButtonState2, UU.a aVar) {
        VU.b primaryButtonStyle;
        if (searchPositionBottomButtonState2 == null) {
            button.setVisibility(8);
            return;
        }
        button.setVisibility(0);
        button.setState(UU.a.a(aVar, searchPositionBottomButtonState2.f221281b, false, false, false, null, 1022));
        SearchPositionBottomButtonState.ButtonStyle buttonStyle = searchPositionBottomButtonState != null ? searchPositionBottomButtonState.f221282c : null;
        SearchPositionBottomButtonState.ButtonStyle buttonStyle2 = searchPositionBottomButtonState2.f221282c;
        if (buttonStyle != buttonStyle2) {
            int iOrdinal = buttonStyle2.ordinal();
            if (iOrdinal == 0) {
                primaryButtonStyle = getPrimaryButtonStyle();
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                primaryButtonStyle = getSecondaryButtonStyle();
            }
            button.setStyle(primaryButtonStyle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPositionBottomBar(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) == 0 ? i13 : 0);
        Drawable drawable = null;
        this.f221276j = new UU.a(null, null, false, false, false, new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.a(this), null, null, null, false, 991, null);
        this.f221277k = new UU.a(null, null, false, false, false, new b(this), null, null, null, false, 991, null);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f221278l = C42727D.b(lazyThreadSafetyMode, new c(this));
        this.f221279m = C42727D.b(lazyThreadSafetyMode, new d(this));
        View.inflate(getContext(), R.layout.position_in_search_stats_bottom_bar, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.bottom_bar_content);
        this.f221268b = viewGroup;
        this.f221269c = (ViewGroup) findViewById(R.id.bottom_bar_loading);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewGroup.findViewById(R.id.bottom_bar_advert_image);
        this.f221270d = simpleDraweeView;
        this.f221271e = (TextView) viewGroup.findViewById(R.id.bottom_bar_advert_title);
        this.f221272f = (TextView) viewGroup.findViewById(R.id.bottom_bar_advert_price);
        this.f221273g = (Button) viewGroup.findViewById(R.id.bottom_bar_left_button);
        this.f221274h = (Button) viewGroup.findViewById(R.id.bottom_bar_right_button);
        simpleDraweeView.getHierarchy().p(null);
        GW0.a hierarchy = simpleDraweeView.getHierarchy();
        Drawable drawableH = C35835l0.h(R.attr.ic_logo24, context);
        if (drawableH != null) {
            V0.a(drawableH, C35835l0.d(R.attr.white, context));
            drawable = drawableH;
        }
        hierarchy.o(drawable, 5);
        setState((e) e.b.f221297a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e r9) {
        /*
            r8 = this;
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e r0 = r8.f221275i
            boolean r0 = kotlin.jvm.internal.L.f(r0, r9)
            if (r0 != 0) goto Lc1
            boolean r0 = r9 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e.b
            r1 = 8
            android.view.ViewGroup r2 = r8.f221268b
            android.view.ViewGroup r3 = r8.f221269c
            r4 = 0
            if (r0 == 0) goto L1b
            r3.setVisibility(r4)
            r2.setVisibility(r1)
            goto Lc1
        L1b:
            boolean r0 = r9 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e.a
            if (r0 == 0) goto Lc1
            r3.setVisibility(r1)
            r2.setVisibility(r4)
            r0 = r9
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e$a r0 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e.a) r0
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e r1 = r8.f221275i
            boolean r2 = r1 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e.a
            r3 = 0
            if (r2 == 0) goto L32
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e$a r1 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e.a) r1
            goto L33
        L32:
            r1 = r3
        L33:
            if (r1 != 0) goto L36
            r4 = 1
        L36:
            com.avito.android.remote.model.Image r2 = r0.f221294c
            if (r4 != 0) goto L46
            if (r1 == 0) goto L3f
            com.avito.android.remote.model.Image r5 = r1.f221294c
            goto L40
        L3f:
            r5 = r3
        L40:
            boolean r5 = kotlin.jvm.internal.L.f(r5, r2)
            if (r5 != 0) goto L4f
        L46:
            com.facebook.drawee.view.SimpleDraweeView r5 = r8.f221270d
            com.avito.android.image_loader.ImageRequest$a r5 = com.avito.android.util.C35949t5.a(r5)
            com.avito.android.advert.item.delivery_suggests.l.w(r2, r5)
        L4f:
            com.avito.android.printable_text.PrintableText r2 = r0.f221292a
            if (r4 != 0) goto L5f
            if (r1 == 0) goto L58
            com.avito.android.printable_text.PrintableText r5 = r1.f221292a
            goto L59
        L58:
            r5 = r3
        L59:
            boolean r5 = kotlin.jvm.internal.L.f(r5, r2)
            if (r5 != 0) goto L6c
        L5f:
            android.content.Context r5 = r8.getContext()
            java.lang.String r2 = r2.k0(r5)
            android.widget.TextView r5 = r8.f221272f
            r5.setText(r2)
        L6c:
            com.avito.android.printable_text.PrintableText r2 = r0.f221293b
            if (r4 != 0) goto L7c
            if (r1 == 0) goto L75
            com.avito.android.printable_text.PrintableText r5 = r1.f221293b
            goto L76
        L75:
            r5 = r3
        L76:
            boolean r5 = kotlin.jvm.internal.L.f(r5, r2)
            if (r5 != 0) goto L89
        L7c:
            android.content.Context r5 = r8.getContext()
            java.lang.String r2 = r2.k0(r5)
            android.widget.TextView r5 = r8.f221271e
            r5.setText(r2)
        L89:
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomButtonState r2 = r0.f221295d
            if (r4 != 0) goto L99
            if (r1 == 0) goto L92
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomButtonState r5 = r1.f221295d
            goto L93
        L92:
            r5 = r3
        L93:
            boolean r5 = kotlin.jvm.internal.L.f(r5, r2)
            if (r5 != 0) goto La6
        L99:
            if (r1 == 0) goto L9e
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomButtonState r5 = r1.f221295d
            goto L9f
        L9e:
            r5 = r3
        L9f:
            UU.a r6 = r8.f221276j
            com.avito.android.lib.design.button.Button r7 = r8.f221273g
            r8.a(r7, r5, r2, r6)
        La6:
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomButtonState r0 = r0.f221296e
            if (r4 != 0) goto Lb6
            if (r1 == 0) goto Laf
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomButtonState r2 = r1.f221296e
            goto Lb0
        Laf:
            r2 = r3
        Lb0:
            boolean r2 = kotlin.jvm.internal.L.f(r2, r0)
            if (r2 != 0) goto Lc1
        Lb6:
            if (r1 == 0) goto Lba
            com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomButtonState r3 = r1.f221296e
        Lba:
            UU.a r1 = r8.f221277k
            com.avito.android.lib.design.button.Button r2 = r8.f221274h
            r8.a(r2, r3, r0, r1)
        Lc1:
            r8.f221275i = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.SearchPositionBottomBar.setState(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.bottom_bar.e):void");
    }
}
