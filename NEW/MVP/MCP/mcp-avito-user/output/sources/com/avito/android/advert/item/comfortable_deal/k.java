package com.avito.android.advert.item.comfortable_deal;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.Achievement;
import com.avito.android.remote.model.Benefit;
import com.avito.android.remote.model.ButtonInfo;
import com.avito.android.remote.model.ExpertBlock;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ExpertBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/comfortable_deal/k;", "Lcom/avito/android/advert/item/comfortable_deal/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f74307m = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f74308b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f74309c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f74310d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f74311e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f74312f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f74313g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f74314h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f74315i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f74316j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f74317k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f74318l;

    /* compiled from: ExpertBlockItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f74319l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Benefit f74320m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar, Benefit benefit) {
            super(1);
            this.f74319l = lVar;
            this.f74320m = benefit;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f74319l.invoke(this.f74320m.getIconName());
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74308b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.expert_block_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f74309c = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.avatar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f74310d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.avatar_placeholder);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74311e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.name);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74312f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.cd_title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74313g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.left_image);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f74314h = (SimpleDraweeView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.right_image);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f74315i = (SimpleDraweeView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.achievements_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f74316j = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.benefits_container);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f74317k = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.contact_expert);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f74318l = (Button) viewFindViewById11;
    }

    @Override // com.avito.android.advert.item.comfortable_deal.j
    public final void MW(@Y61.k Y41.l lVar, @Y61.k List list) {
        LinearLayout linearLayout = this.f74317k;
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Benefit benefit = (Benefit) it.next();
            String text = benefit.getText();
            String iconName = benefit.getIconName();
            boolean needRightIcon = benefit.getNeedRightIcon();
            a aVar = new a(lVar, benefit);
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.benefit_layout, (ViewGroup) linearLayout, false);
            linearLayout.addView(viewInflate);
            D6.c(viewInflate, null, Integer.valueOf(y6.b(12)), null, null, 13);
            View viewFindViewById = viewInflate.findViewById(R.id.text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.end_text_icon);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.start_text_icon);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView3 = (TextView) viewFindViewById3;
            viewInflate.setOnClickListener(new Tf.b(2, aVar, text));
            textView.setText(text);
            Integer numM = com.avito.android.lib.util.f.m(iconName);
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a.f4720a.getClass();
                FV.a.c(textView3, iIntValue);
            }
            if (needRightIcon) {
                FV.a.f4720a.getClass();
                FV.a.c(textView2, R.attr.textIconChevronRight);
                textView2.setTextColor(C35835l0.d(R.attr.gray54, linearLayout.getContext()));
            } else {
                D6.w(textView2);
            }
        }
    }

    @Override // com.avito.android.advert.item.comfortable_deal.j
    public final void Ry(@Y61.k ButtonInfo buttonInfo, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        DeepLink deepLink = buttonInfo.getDeepLink();
        Button button = this.f74318l;
        if (deepLink == null || (deepLink instanceof NoMatchLink)) {
            D6.w(button);
            return;
        }
        D6.H(button);
        button.setText(buttonInfo.getText());
        button.setOnClickListener(new XA0.c(lVar, deepLink, 1));
    }

    @Override // com.avito.android.advert.item.comfortable_deal.j
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f74308b, str, false);
    }

    @Override // com.avito.android.advert.item.comfortable_deal.j
    public final void zK(@Y61.k ExpertBlock expertBlock, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        Uri avatar = expertBlock.getAvatar();
        String name = expertBlock.getName();
        SimpleDraweeView simpleDraweeView = this.f74310d;
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        TextView textView = this.f74311e;
        if (avatar == null || avatar.equals(Uri.EMPTY)) {
            aVarA.b();
            D6.H(textView);
            textView.setText(String.valueOf(C43066x.D(name)));
        } else {
            D6.w(textView);
            aVarA.f(avatar);
            aVarA.c();
        }
        I5.a(this.f74312f, expertBlock.getName(), false);
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(expertBlock.getLeftImage(), com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        ImageRequest.a aVarA2 = C35949t5.a(this.f74314h);
        aVarA2.d(com.avito.android.image_loader.b.b(imageDependsOnTheme));
        aVarA2.c();
        Image imageDependsOnTheme2 = UniversalImageKt.getImageDependsOnTheme(expertBlock.getRightImage(), com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        ImageRequest.a aVarA3 = C35949t5.a(this.f74315i);
        aVarA3.d(com.avito.android.image_loader.b.b(imageDependsOnTheme2));
        aVarA3.c();
        I5.a(this.f74313g, expertBlock.getText(), false);
        List<Achievement> achievements = expertBlock.getAchievements();
        LinearLayout linearLayout = this.f74316j;
        linearLayout.removeAllViews();
        for (Achievement achievement : achievements) {
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.achievement_layout, (ViewGroup) linearLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.icon);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView = (ImageView) viewFindViewById;
            ((TextView) viewInflate.findViewById(R.id.text)).setText(achievement.getText());
            Integer numA = q.a(achievement.getIcon());
            imageView.setImageDrawable(numA != null ? C35835l0.m(imageView.getContext(), numA.intValue(), R.attr.black) : null);
            linearLayout.addView(viewInflate);
            D6.c(viewInflate, Integer.valueOf(y6.b(10)), null, Integer.valueOf(y6.b(10)), null, 10);
        }
        this.f74309c.setOnClickListener(new com.avito.android.advert.closed.b(10, expertBlock, lVar));
    }
}
