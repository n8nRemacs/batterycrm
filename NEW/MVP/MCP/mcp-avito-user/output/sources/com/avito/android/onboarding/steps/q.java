package com.avito.android.onboarding.steps;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.OnboardingStep;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingStepsPagerAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/steps/q;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/onboarding/steps/q$a;", "a", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f209370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<H40.b, G0> f209371d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public List<OnboardingStep> f209372e = C42784z0.f406748b;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f209373f;

    /* compiled from: OnboardingStepsPagerAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/steps/q$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f209374j = 0;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.util.text.a f209375b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<H40.b, G0> f209376c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final TextView f209377d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final TextView f209378e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final TextView f209379f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final SimpleDraweeView f209380g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Button f209381h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public y f209382i;

        public a(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
            super(view);
            this.f209375b = aVar;
            this.f209376c = lVar;
            View viewFindViewById = view.findViewById(R.id.title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f209377d = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.subtitle);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f209378e = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.show_more);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById3;
            this.f209379f = textView;
            View viewFindViewById4 = view.findViewById(R.id.image);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            }
            this.f209380g = (SimpleDraweeView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.button);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById5;
            this.f209381h = button;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            button.setOnClickListener(new ViewOnClickListenerC31873b(this, 29));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public q(@Y61.k com.avito.android.util.text.a aVar, @Y61.k Y41.l<? super H40.b, G0> lVar) {
        this.f209370c = aVar;
        this.f209371d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f209372e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        String style;
        z<DeepLink> zVarLinkClicksV3;
        a aVar = (a) c12;
        OnboardingStep onboardingStep = this.f209372e.get(i12);
        AttributedText title = onboardingStep.getTitle();
        TextView textView = aVar.f209377d;
        com.avito.android.util.text.a aVar2 = aVar.f209375b;
        com.avito.android.util.text.j.a(textView, title, aVar2);
        com.avito.android.util.text.j.a(aVar.f209378e, onboardingStep.getSubtitle(), aVar2);
        AttributedText showMore = onboardingStep.getShowMore();
        com.avito.android.util.text.j.a(aVar.f209379f, showMore, aVar2);
        y yVar = aVar.f209382i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        G0 g02 = null;
        aVar.f209382i = (y) ((showMore == null || (zVarLinkClicksV3 = showMore.linkClicksV3()) == null) ? null : zVarLinkClicksV3.v0(new o(aVar), p.f209369b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        OnboardingStep.Button button = onboardingStep.getButton();
        String title2 = button != null ? button.getTitle() : null;
        Button button2 = aVar.f209381h;
        com.avito.android.lib.design.button.b.a(button2, title2, false);
        OnboardingStep.Button button3 = onboardingStep.getButton();
        button2.setAppearanceFromAttr((button3 == null || (style = button3.getStyle()) == null) ? R.attr.buttonPrimaryLarge : com.avito.android.lib.util.f.d(style));
        Image image = onboardingStep.getImage();
        SimpleDraweeView simpleDraweeView = aVar.f209380g;
        if (image != null) {
            C35949t5.c(aVar.f209380g, com.avito.android.image_loader.b.b(image), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = this.f209373f;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            this.f209373f = layoutInflaterFrom;
        }
        return new a(this.f209371d, layoutInflaterFrom.inflate(R.layout.onboarding_step_item, viewGroup, false), this.f209370c);
    }
}
