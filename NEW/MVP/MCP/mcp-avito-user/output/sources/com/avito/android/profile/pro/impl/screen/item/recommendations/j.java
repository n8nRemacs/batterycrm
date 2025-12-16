package com.avito.android.profile.pro.impl.screen.item.recommendations;

import Y61.k;
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
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.profile.pro.impl.screen.item.recommendations.ProfileProRecommendationsItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProRecommendationsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/recommendations/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/recommendations/g;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f223434b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f223435c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HeaderButton f223436d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f223437e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.l<? super D90.a, G0> f223438f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public Object f223439g;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f223434b = aVar;
        View viewFindViewById = view.findViewById(R.id.recommendations_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f223435c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recommendations_header_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.header_button.HeaderButton");
        }
        this.f223436d = (HeaderButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.recommendations_items);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f223437e = (LinearLayout) viewFindViewById3;
        this.f223439g = C42784z0.f406748b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.profile.pro.impl.screen.item.recommendations.g
    public final void R40(@k ProfileProRecommendationsItem profileProRecommendationsItem, @k Y41.l<? super D90.a, G0> lVar) throws Resources.NotFoundException {
        int i12 = 1;
        boolean z12 = 0;
        Object[] objArr = 0;
        String str = profileProRecommendationsItem.f223404c;
        TextView textView = this.f223435c;
        textView.setText(str);
        if (profileProRecommendationsItem.f223405d != null) {
            this.f223436d.setOnClickListener(new h(objArr == true ? 1 : 0, this, profileProRecommendationsItem));
        }
        Object obj = this.f223439g;
        ArrayList arrayList = profileProRecommendationsItem.f223406e;
        if (arrayList.equals(obj)) {
            return;
        }
        this.f223439g = arrayList;
        ViewGroup viewGroup = this.f223437e;
        viewGroup.removeAllViews();
        int i13 = 0;
        for (Object obj2 : (Iterable) this.f223439g) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            ProfileProRecommendationsItem.Item item = (ProfileProRecommendationsItem.Item) obj2;
            View viewInflate = LayoutInflater.from(textView.getContext()).inflate(R.layout.item_profile_pro_recommendations_item, viewGroup, z12);
            com.avito.android.util.text.a aVar = this.f223434b;
            f fVar = new f(viewInflate, aVar);
            int i15 = i13 == this.f223439g.size() - i12 ? i12 : z12;
            ImageView imageView = fVar.f223423c;
            imageView.setImageDrawable(null);
            Image image = item.f223408c;
            if (image != null) {
                Resources resources = viewInflate.getResources();
                Resources.Theme theme = viewInflate.getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
                Drawable drawable = resources.getDrawable(R.drawable.bg_profile_pro_recommendations, theme);
                ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(imageView));
                aVar2.d(com.avito.android.image_loader.b.b(image));
                aVar2.f169492j = drawable;
                aVar2.f169493k = null;
                aVar2.f169485c = Integer.valueOf(R.drawable.bg_profile_pro_recommendations);
                aVar2.e(D6.j(viewInflate, 12));
                aVar2.c();
            }
            TextView textView2 = fVar.f223424d;
            textView2.setText(aVar.c(textView2.getContext(), item.f223407b));
            fVar.f223425e.setText(item.f223409d);
            String str2 = item.f223410e;
            StrikethroughTextView strikethroughTextView = fVar.f223426f;
            if (str2 == null || str2.length() == 0) {
                D6.w(strikethroughTextView);
            } else {
                D6.H(strikethroughTextView);
                strikethroughTextView.setText(str2);
            }
            AttributedText attributedText = item.f223411f;
            TextView textView3 = fVar.f223427g;
            if (attributedText != null) {
                D6.H(textView3);
                textView3.setText(aVar.c(textView3.getContext(), attributedText));
            } else {
                D6.w(textView3);
            }
            viewInflate.setOnClickListener(new com.avito.android.profile.edit.adapter.c(5, new i(item, this)));
            i12 = 1;
            D6.G(fVar.f223428h, i15 ^ 1);
            viewGroup.addView(viewInflate);
            i13 = i14;
            z12 = 0;
        }
        this.f223438f = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223438f = null;
    }
}
