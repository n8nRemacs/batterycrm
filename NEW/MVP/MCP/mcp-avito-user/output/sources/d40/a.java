package D40;

import Au.ViewOnClickListenerC13080b;
import C40.a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.onboarding.dialog.view.OnboardingDialogItem;
import com.avito.android.onboarding.dialog.view.carousel.AdditionalActionItem;
import com.avito.android.onboarding.dialog.view.carousel.OnboardingCarouselItem;
import com.avito.android.onboarding.dialog.view.carousel.c;
import com.avito.android.onboarding.dialog.view.preview.OnboardingPreviewItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.onboarding.AdditionalAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: OnboardingBottomSheetAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"LD40/a;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/android/onboarding/dialog/view/OnboardingDialogItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "b", "c", "d", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends B<OnboardingDialogItem, RecyclerView.C> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C0148a f2885h;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f2886e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<C40.a, G0> f2887f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f2888g;

    /* compiled from: OnboardingBottomSheetAdapter.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"D40/a$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/avito/android/onboarding/dialog/view/OnboardingDialogItem;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D40.a$a, reason: collision with other inner class name */
    public static final class C0148a extends C23424o.f<OnboardingDialogItem> {
        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean a(OnboardingDialogItem onboardingDialogItem, OnboardingDialogItem onboardingDialogItem2) {
            return onboardingDialogItem.equals(onboardingDialogItem2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean b(OnboardingDialogItem onboardingDialogItem, OnboardingDialogItem onboardingDialogItem2) {
            OnboardingDialogItem onboardingDialogItem3 = onboardingDialogItem;
            OnboardingDialogItem onboardingDialogItem4 = onboardingDialogItem2;
            return onboardingDialogItem3.getF209031b() == onboardingDialogItem4.getF209031b() && onboardingDialogItem3.getClass().equals(onboardingDialogItem4.getClass());
        }
    }

    /* compiled from: OnboardingBottomSheetAdapter.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LD40/a$b;", "", "<init>", "()V", "D40/a$a", "CALLBACK", "LD40/a$a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: OnboardingBottomSheetAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD40/a$c;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f2889b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.avito.android.onboarding.dialog.view.carousel.c f2890c;

        public c(@k l lVar, @k View view, @k com.avito.android.util.text.a aVar) {
            super(view);
            this.f2889b = view;
            this.f2890c = new com.avito.android.onboarding.dialog.view.carousel.c(lVar, view, aVar);
        }
    }

    /* compiled from: OnboardingBottomSheetAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD40/a$d;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f2891b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final E40.b f2892c;

        public d(@k l lVar, @k View view, @k com.avito.android.util.text.a aVar) {
            super(view);
            this.f2891b = view;
            this.f2892c = new E40.b(lVar, view, aVar);
        }
    }

    static {
        new b(null);
        f2885h = new C0148a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public a(@k com.avito.android.util.text.a aVar, @k l<? super C40.a, G0> lVar) {
        super(f2885h);
        this.f2886e = aVar;
        this.f2887f = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        OnboardingDialogItem item = getItem(i12);
        return (!(item instanceof OnboardingCarouselItem) && (item instanceof OnboardingPreviewItem)) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@k RecyclerView.C c12, int i12) {
        G0 g02;
        OnboardingDialogItem item = getItem(i12);
        if (item instanceof OnboardingPreviewItem) {
            d dVar = c12 instanceof d ? (d) c12 : null;
            if (dVar != null) {
                OnboardingPreviewItem onboardingPreviewItem = (OnboardingPreviewItem) item;
                E40.b bVar = dVar.f2892c;
                bVar.getClass();
                ViewOnClickListenerC13080b viewOnClickListenerC13080b = new ViewOnClickListenerC13080b(3, onboardingPreviewItem, bVar);
                View view = bVar.f3742a;
                view.setOnClickListener(viewOnClickListenerC13080b);
                bVar.f3746e.setText(bVar.f3743b.c(view.getContext(), onboardingPreviewItem.f209025d));
                UniversalImage universalImage = onboardingPreviewItem.f209024c;
                C35949t5.c(bVar.f3745d, com.avito.android.image_loader.b.b(universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(view, universalImage) : null), null, null, null, 14);
                return;
            }
            return;
        }
        if (item instanceof OnboardingCarouselItem) {
            c cVar = c12 instanceof c ? (c) c12 : null;
            if (cVar != null) {
                OnboardingCarouselItem onboardingCarouselItem = (OnboardingCarouselItem) item;
                final com.avito.android.onboarding.dialog.view.carousel.c cVar2 = cVar.f2890c;
                if (cVar2.f208989h) {
                    cVar2.a(null, null);
                } else {
                    cVar2.a(onboardingCarouselItem.f208970c, onboardingCarouselItem.f208977j);
                }
                AttributedText attributedText = onboardingCarouselItem.f208971d;
                com.avito.android.util.text.a aVar = cVar2.f208983b;
                Context context = cVar2.f208985d;
                cVar2.f208987f.setText(aVar.c(context, attributedText));
                cVar2.f208988g.setText(aVar.c(context, onboardingCarouselItem.f208972e));
                View viewFindViewById = cVar2.f208982a.findViewById(R.id.additional_buttons);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                }
                LinearLayout linearLayout = (LinearLayout) viewFindViewById;
                List<AdditionalActionItem> list = onboardingCarouselItem.f208976i;
                List<AdditionalActionItem> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    D6.w(linearLayout);
                    return;
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                linearLayout.removeAllViews();
                linearLayout.setGravity(list.size() > 1 ? 8388611 : 8388613);
                for (final AdditionalActionItem additionalActionItem : C43033p.C(new C42770s0(list), 2)) {
                    boolean z12 = list.size() > 1;
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.additional_button, (ViewGroup) linearLayout, false);
                    View viewFindViewById2 = viewInflate.findViewById(R.id.additional_button);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                    }
                    Button button = (Button) viewFindViewById2;
                    String str = additionalActionItem.f208962c;
                    if (str != null) {
                        button.setText(str);
                        if (z12) {
                            D6.c(button, null, null, Integer.valueOf(y6.b(6)), null, 11);
                        }
                        AdditionalAction.Style style = additionalActionItem.f208967h;
                        int i13 = style == null ? -1 : c.a.f208990a[style.ordinal()];
                        int i14 = R.attr.buttonPrimaryLarge;
                        if (i13 != 1 && i13 == 2) {
                            i14 = R.attr.buttonSecondaryLarge;
                        }
                        button.setAppearanceFromAttr(i14);
                        button.setLoading(additionalActionItem.f208968i);
                        final long j12 = onboardingCarouselItem.f208969b;
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.onboarding.dialog.view.carousel.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                cVar2.f208984c.invoke(new a.b(j12, additionalActionItem));
                            }
                        });
                        D6.H(button);
                        g02 = G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 == null) {
                        D6.w(button);
                    }
                    linearLayout.addView(viewInflate);
                }
                D6.H(linearLayout);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    public final RecyclerView.C onCreateViewHolder(@k ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = this.f2888g;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            this.f2888g = layoutInflaterFrom;
        }
        l<C40.a, G0> lVar = this.f2887f;
        com.avito.android.util.text.a aVar = this.f2886e;
        return i12 == 1 ? new c(lVar, layoutInflaterFrom.inflate(R.layout.onboarding_carousel_item, viewGroup, false), aVar) : new d(lVar, layoutInflaterFrom.inflate(R.layout.onboarding_preview_item, viewGroup, false), aVar);
    }
}
