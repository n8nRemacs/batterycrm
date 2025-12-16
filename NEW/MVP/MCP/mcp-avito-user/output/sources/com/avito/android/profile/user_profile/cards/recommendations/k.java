package com.avito.android.profile.user_profile.cards.recommendations;

import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.profile.user_profile.cards.recommendations.item.RecommendationSnippetItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.user_profile.items.RecommendationsItem;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import ya0.C50204b;

/* compiled from: RecommendationsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/recommendations/k;", "Lcom/avito/android/profile/user_profile/cards/recommendations/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f225295g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f225296b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ListItem f225297c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f225298d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f225299e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public Object f225300f;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f225296b = aVar;
        View viewFindViewById = view.findViewById(R.id.header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
        this.f225297c = (ListItem) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.items);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f225298d = (LinearLayout) viewFindViewById2;
        this.f225300f = C42784z0.f406748b;
    }

    @Override // com.avito.android.profile.user_profile.cards.recommendations.i
    public final void B(@Y61.k List<RecommendationSnippetItem> list) throws Resources.NotFoundException {
        if (list.equals(this.f225300f)) {
            return;
        }
        this.f225300f = list;
        LinearLayout linearLayout = this.f225298d;
        linearLayout.removeAllViews();
        for (RecommendationSnippetItem recommendationSnippetItem : list) {
            View viewInflate = LayoutInflater.from(this.f225297c.getContext()).inflate(R.layout.profile_snippet_recommendation, (ViewGroup) linearLayout, false);
            com.avito.android.util.text.a aVar = this.f225296b;
            C50204b c50204b = new C50204b(viewInflate, aVar);
            RecommendationsItem.SnippetItem snippetItem = recommendationSnippetItem.f225292c;
            ImageView imageView = c50204b.f443185c;
            imageView.setImageDrawable(null);
            Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(snippetItem.getImage(), com.avito.android.lib.util.darkTheme.c.b(imageView.getContext()));
            if (imageDependsOnTheme != null) {
                com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(imageDependsOnTheme);
                Resources resources = viewInflate.getResources();
                Resources.Theme theme = viewInflate.getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
                Drawable drawable = resources.getDrawable(R.drawable.profile_recommendation_img_placeholder, theme);
                ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(imageView));
                aVar2.d(aVarB);
                aVar2.f169492j = drawable;
                aVar2.f169493k = null;
                aVar2.f169485c = Integer.valueOf(R.drawable.profile_recommendation_img_placeholder);
                aVar2.e(y6.b(12));
                aVar2.c();
            }
            AttributedText title = snippetItem.getTitle();
            TextView textView = c50204b.f443186d;
            textView.setText(aVar.c(textView.getContext(), title));
            c50204b.f443187e.setText(snippetItem.getPrice());
            String oldPrice = snippetItem.getOldPrice();
            StrikethroughTextView strikethroughTextView = c50204b.f443188f;
            if (oldPrice == null || oldPrice.length() == 0) {
                D6.w(strikethroughTextView);
            } else {
                D6.H(strikethroughTextView);
                strikethroughTextView.setText(oldPrice);
            }
            AttributedText additionalInfo = snippetItem.getAdditionalInfo();
            TextView textView2 = c50204b.f443189g;
            if (additionalInfo != null) {
                D6.H(textView2);
                textView2.setText(aVar.c(textView2.getContext(), additionalInfo));
            } else {
                D6.w(textView2);
            }
            viewInflate.setOnClickListener(new ru.avito.component.payments.method.b(9, new j(snippetItem, this)));
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.recommendations.i
    public final void Og(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f225299e = lVar;
    }

    @Override // com.avito.android.profile.user_profile.cards.recommendations.i
    public final void U(@Y61.k Y41.a<G0> aVar) {
        this.f225297c.setOnClickListener(new com.avito.android.profile.edit.adapter.c(18, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.recommendations.i
    public final void setTitle(@Y61.k String str) {
        this.f225297c.setTitle(str);
    }
}
