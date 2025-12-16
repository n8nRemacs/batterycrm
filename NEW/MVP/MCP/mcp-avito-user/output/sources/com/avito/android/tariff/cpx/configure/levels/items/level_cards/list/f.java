package com.avito.android.tariff.cpx.configure.levels.items.level_cards.list;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.m;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LevelCardItemViewImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/list/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/configure/levels/items/level_cards/list/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f296166i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f296167b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f296168c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f296169d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f296170e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f296171f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f296172g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f296173h;

    public f(@Y61.k View view) {
        super(view);
        this.f296167b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f296168c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.action_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f296169d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advantages_list_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f296170e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.other_advantage_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f296171f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.other_advantage_icon);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f296172g = (SimpleDraweeView) viewFindViewById5;
        this.f296173h = view.getContext();
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.e
    public final void Ad(@Y61.l Boolean bool) throws Resources.NotFoundException {
        boolean z12 = bool == null || bool.equals(Boolean.TRUE);
        int i12 = z12 ? R.style.Re23_Button_PrimaryLarge : R.style.Re23_Button_OverlaySecondaryLarge;
        Button button = this.f296169d;
        button.setAppearance(i12);
        button.setEnabled(z12);
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.e
    public final void Y(@Y61.k Y41.a<G0> aVar) {
        this.f296169d.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(9, aVar));
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.e
    public final void mb(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f296169d, str, false);
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.e
    public final void n1(@Y61.l List<a> list) {
        LinearLayout linearLayout = this.f296170e;
        linearLayout.removeAllViews();
        Context context = this.f296173h;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (list != null) {
            for (a aVar : list) {
                ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflaterFrom.inflate(R.layout.level_advantage_layout, (ViewGroup) linearLayout, false);
                View viewFindViewById = constraintLayout.findViewById(R.id.advantage_text);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                View viewFindViewById2 = constraintLayout.findViewById(R.id.advantage_icon);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
                }
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById2;
                UniversalImage universalImage = aVar.f296155a;
                m mVarA = n.a(universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null);
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.d(mVarA);
                aVarA.c();
                com.avito.android.util.text.j.a(textView, aVar.f296156b, null);
                linearLayout.addView(constraintLayout);
            }
        }
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.e
    public final void nK(@Y61.l l lVar) {
        TextView textView = this.f296171f;
        SimpleDraweeView simpleDraweeView = this.f296172g;
        G0 g02 = null;
        if (lVar != null) {
            UniversalImage universalImage = lVar.f296181a;
            m mVarA = n.a(universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f296173h)) : null);
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(mVarA);
            aVarA.c();
            com.avito.android.util.text.j.a(textView, lVar.f296182b, null);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(textView);
            D6.w(simpleDraweeView);
        }
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.e
    public final void r(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f296168c, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.e
    public final void rd(@Y61.k Y41.a<G0> aVar) {
        this.f296171f.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(8, aVar));
    }

    @Override // com.avito.android.tariff.cpx.configure.levels.items.level_cards.list.e
    public final void setLoading(boolean z12) {
        this.f296169d.setLoading(z12);
    }
}
