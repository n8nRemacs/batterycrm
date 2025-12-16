package com.avito.android.credits.calculator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.g;
import com.avito.android.remote.model.ColoredIcon;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.credit_broker.CreditButton;
import com.avito.android.remote.model.credit_broker.CreditProgress;
import com.avito.android.remote.model.credit_broker.Icon;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.avito.android.remote.model.credit_broker.OfferDetailsItem;
import com.avito.android.remote.model.credit_broker.Size;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import defpackage._avito_credits_public;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: InstallmentsV2CalculatorView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/calculator/A;", "Lcom/avito/android/credits/calculator/G;", "a", "b", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A extends G {

    /* renamed from: C, reason: collision with root package name */
    public static final int f128626C;

    /* renamed from: D, reason: collision with root package name */
    public static final int f128627D;

    /* renamed from: E, reason: collision with root package name */
    public static final int f128628E;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final Button f128629A;

    /* renamed from: B, reason: collision with root package name */
    public int f128630B;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f128631q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Chips f128632r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f128633s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final TextView f128634t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f128635u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f128636v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextView f128637w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final TextView f128638x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f128639y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f128640z;

    /* compiled from: InstallmentsV2CalculatorView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/credits/calculator/A$a;", "", "<init>", "()V", "", "DEFAULT_DASH_COLOR", "I", "DEFAULT_DASH_HEIGHT", "DEFAULT_DASH_SPACING", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f128626C = y6.b(4);
        f128627D = y6.b(4);
        f128628E = R.attr.gray16;
    }

    public A(@Y61.k View view, @Y61.k com.avito.android.credits.x xVar, @Y61.k com.avito.android.util.text.a aVar) {
        super(view, xVar);
        this.f128631q = aVar;
        this.f128632r = (Chips) view.findViewById(R.id.loan_terms_chips);
        this.f128633s = (TextView) view.findViewById(R.id.price_info);
        TextView textView = (TextView) view.findViewById(R.id.price_description);
        this.f128634t = textView;
        this.f128635u = (LinearLayout) view.findViewById(R.id.progress_left_block_dashes_layout);
        this.f128636v = (LinearLayout) view.findViewById(R.id.progress_right_block_dashes_layout);
        TextView textView2 = (TextView) view.findViewById(R.id.progress_left_block_text);
        this.f128637w = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.progress_right_block_text);
        this.f128638x = textView3;
        this.f128639y = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f128640z = (LinearLayout) view.findViewById(R.id.offer_details_container);
        this.f128629A = (Button) view.findViewById(R.id.additional_top_button);
        this.f128630B = f128626C;
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void E80(DeepLink deepLink) {
        com.avito.android.credits.p pVar;
        if ((deepLink instanceof NoMatchLink) || (pVar = this.f128709k) == null) {
            return;
        }
        pVar.b4(deepLink);
    }

    public final void F80(@Y61.l CreditButton creditButton) {
        DeepLink deepLink = creditButton != null ? creditButton.getDeepLink() : null;
        String title = creditButton != null ? creditButton.getTitle() : null;
        Button button = this.f128629A;
        if (title == null || deepLink == null) {
            D6.w(button);
            return;
        }
        button.setText(title);
        button.setOnClickListener(new z(this, deepLink, 1));
        String style = creditButton.getStyle();
        if (style != null) {
            button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(style));
        }
        D6.H(button);
    }

    public final void G80(AttributedText attributedText) {
        attributedText.setOnUrlClickListener(new com.avito.android.auction.details.i(this, 6));
        attributedText.setOnDeepLinkClickListener(new B(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H80(@Y61.l List<LoanTerms.Term> list, @Y61.l LoanTerms.Term term, boolean z12) {
        Chips chips = this.f128632r;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String termTitle = ((LoanTerms.Term) obj).getTermTitle();
                if (termTitle != null && termTitle.length() != 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new b((LoanTerms.Term) it.next(), chips.getContext()));
            }
            chips.setVisibility(0);
            chips.setData(arrayList2);
            chips.setChipsSelectedListener(new c(z12));
            if (arrayList2.isEmpty()) {
                D6.c(this.f128632r, null, Integer.valueOf(y6.b(16)), null, null, 13);
            } else {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((com.avito.android.lib.design.chips.h) it2.next()).Q1() != null) {
                        D6.c(this.f128632r, null, Integer.valueOf(y6.b(8)), null, null, 13);
                        break;
                    }
                }
                D6.c(this.f128632r, null, Integer.valueOf(y6.b(16)), null, null, 13);
            }
        }
        if (term != null) {
            chips.j();
            chips.q(new b(term, null, 2, 0 == true ? 1 : 0), true);
        }
    }

    public final void I80(CreditProgress.Block block, LinearLayout linearLayout, TextView textView) {
        Integer dashSpacing;
        Integer dashCount;
        linearLayout.removeAllViews();
        int iIntValue = (block == null || (dashCount = block.getDashCount()) == null) ? 0 : dashCount.intValue();
        int iB2 = (block == null || (dashSpacing = block.getDashSpacing()) == null) ? f128627D : y6.b(dashSpacing.intValue());
        if (block == null || iIntValue <= 0) {
            linearLayout.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        Integer blockWidth = block.getBlockWidth();
        if (blockWidth != null) {
            int iIntValue2 = blockWidth.intValue();
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = y6.b(iIntValue2);
            linearLayout.setLayoutParams(layoutParams);
        }
        UniversalColor dashColor = block.getDashColor();
        View view = this.f128700b;
        Drawable drawableL = C35835l0.l(C43852a.a(view.getContext(), R.drawable.installments_progress_dash), C48065c.d(view.getContext(), dashColor, f128628E));
        linearLayout.removeAllViews();
        for (int i12 = 0; i12 < iIntValue; i12++) {
            View view2 = new View(view.getContext());
            view2.setBackground(drawableL);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, this.f128630B);
            layoutParams2.weight = 1.0f;
            if (i12 > 0) {
                layoutParams2.setMarginStart(iB2);
            }
            view2.setLayoutParams(layoutParams2);
            linearLayout.addView(view2);
        }
        Integer textMarginTop = block.getTextMarginTop();
        D6.c(textView, null, textMarginTop != null ? Integer.valueOf(y6.b(textMarginTop.intValue())) : null, null, null, 13);
        AttributedText attributedText = block.getAttributedText();
        if (attributedText != null) {
            G80(attributedText);
        } else {
            attributedText = null;
        }
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    public final void J80(@Y61.l CreditProgress creditProgress) {
        Integer blockSpacing;
        Integer dashHeight;
        if (creditProgress != null && (dashHeight = creditProgress.getDashHeight()) != null) {
            this.f128630B = y6.b(dashHeight.intValue());
        }
        I80(creditProgress != null ? creditProgress.getLeftBlock() : null, this.f128635u, this.f128637w);
        I80(creditProgress != null ? creditProgress.getRightBlock() : null, this.f128636v, this.f128638x);
        if (creditProgress == null || (blockSpacing = creditProgress.getBlockSpacing()) == null) {
            return;
        }
        D6.c(this.f128636v, Integer.valueOf(y6.b(blockSpacing.intValue())), null, null, null, 14);
    }

    public final void K80(@Y61.l List<OfferDetailsItem> list) {
        Drawable drawableA;
        LinearLayout linearLayout = this.f128640z;
        linearLayout.removeAllViews();
        ArrayList<OfferDetailsItem> arrayListC = list != null ? C42745f0.C(list) : null;
        D6.G(linearLayout, O2.a(arrayListC));
        if (arrayListC != null) {
            for (OfferDetailsItem offerDetailsItem : arrayListC) {
                View view = this.f128700b;
                Context context = view.getContext();
                LinearLayout linearLayout2 = new LinearLayout(view.getContext());
                linearLayout2.setOrientation(0);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout2.setGravity(16);
                Icon icon = offerDetailsItem.getIcon();
                if (icon != null && (drawableA = com.avito.android.credits.utils.d.a(icon, context)) != null) {
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(drawableA);
                    imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                    D6.c(imageView, null, null, Integer.valueOf(y6.b(8)), null, 11);
                    linearLayout2.addView(imageView);
                }
                TextView textView = new TextView(context);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                AttributedText attributedText = offerDetailsItem.getAttributedText();
                if (attributedText != null) {
                    G80(attributedText);
                } else {
                    attributedText = null;
                }
                com.avito.android.util.text.j.a(textView, attributedText, null);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                textView.setMaxLines(3);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(C35835l0.d(R.attr.black, context));
                textView.setTextAppearance(C35835l0.j(R.attr.textM20, context));
                linearLayout2.addView(textView);
                linearLayout.addView(linearLayout2);
            }
        }
    }

    /* compiled from: InstallmentsV2CalculatorView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/calculator/A$b;", "Lcom/avito/android/lib/design/chips/h;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LoanTerms.Term f128641b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Context f128642c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f128643d;

        /* compiled from: InstallmentsV2CalculatorView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f128644a;

            static {
                int[] iArr = new int[LoanTerms.ChipBadge.Type.values().length];
                try {
                    iArr[LoanTerms.ChipBadge.Type.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoanTerms.ChipBadge.Type.ELLIPSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f128644a = iArr;
            }
        }

        public b(@Y61.k LoanTerms.Term term, @Y61.l Context context) {
            this.f128641b = term;
            this.f128642c = context;
            String termTitle = term.getTermTitle();
            this.f128643d = termTitle == null ? "" : termTitle;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            int i12;
            Badge badge;
            int i13;
            Badge badge2;
            Context context = this.f128642c;
            if (context == null) {
                return null;
            }
            LoanTerms.Term term = this.f128641b;
            LoanTerms.ChipBadge badge3 = term.getBadge();
            LoanTerms.ChipBadge.Type type = badge3 != null ? badge3.getType() : null;
            LoanTerms.ChipBadge badge4 = term.getBadge();
            String payload = badge4 != null ? badge4.getPayload() : null;
            if (type == null) {
                badge2 = null;
            } else {
                int i14 = a.f128644a[type.ordinal()];
                if (i14 == 1) {
                    i12 = R.attr.badgeTextRedS;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.attr.badgeEmptyRedS;
                }
                int iJ2 = C35835l0.j(i12, context);
                Badge badge5 = new Badge(context, null, 0, 0, 14, null);
                badge5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                if (payload != null) {
                    badge = badge5;
                    i13 = iJ2;
                    badge.setState(new com.avito.android.lib.design.badge.f(payload, null, false, 6, null));
                } else {
                    badge = badge5;
                    i13 = iJ2;
                }
                com.avito.android.lib.design.badge.g.f178395r.getClass();
                badge.setStyle(g.a.b(i13, context));
                badge2 = badge;
            }
            Integer numValueOf = Integer.valueOf(y6.b(0));
            LoanTerms.ChipBadge badge6 = term.getBadge();
            if ((badge6 != null ? badge6.getType() : null) != LoanTerms.ChipBadge.Type.ELLIPSE) {
                numValueOf = null;
            }
            if (badge2 != null) {
                return new g.a(badge2, numValueOf, numValueOf, false);
            }
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            if (!(obj instanceof com.avito.android.lib.design.chips.h)) {
                return false;
            }
            String str = this.f128643d;
            if (str.length() > 0) {
                com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
                if (hVar.getF199741b().length() > 0) {
                    return L.f(str, hVar.getF199741b());
                }
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f128643d;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF281694e() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        public /* synthetic */ b(LoanTerms.Term term, Context context, int i12, C42822w c42822w) {
            this(term, (i12 & 2) != 0 ? null : context);
        }
    }

    /* compiled from: InstallmentsV2CalculatorView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/credits/calculator/A$c", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Chips.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f128646b;

        public c(boolean z12) {
            this.f128646b = z12;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            AttributedText priceDescription;
            Drawable drawableN;
            String name;
            LoanTerms.PriceInfo.PriceBadge.Type type;
            CharSequence charSequenceB;
            b bVar = hVar instanceof b ? (b) hVar : null;
            if (bVar != null) {
                int i12 = A.f128626C;
                A a12 = A.this;
                a12.getClass();
                LoanTerms.Term term = bVar.f128641b;
                String creditInfoTitle = term.getCreditInfoTitle();
                if (creditInfoTitle != null) {
                    a12.yp(term.getCreditInfoSubtitle(), creditInfoTitle, null);
                }
                LoanTerms.PriceInfo priceInfo = term.getPriceInfo();
                String price = priceInfo != null ? priceInfo.getPrice() : null;
                TextView textView = a12.f128633s;
                I5.a(textView, price, false);
                LoanTerms.PriceInfo priceInfo2 = term.getPriceInfo();
                Context context = textView.getContext();
                if (priceInfo2 == null || (priceDescription = priceInfo2.getPriceDescription()) == null) {
                    priceDescription = null;
                } else {
                    a12.G80(priceDescription);
                    G0 g02 = G0.f406611a;
                }
                CharSequence charSequenceC = a12.f128631q.c(context, priceDescription);
                if (charSequenceC != null) {
                    LoanTerms.PriceInfo.PriceBadge badge = priceInfo2 != null ? priceInfo2.getBadge() : null;
                    C c12 = new C(1, a12, A.class, "handleDeeplink", "handleDeeplink(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0);
                    if (badge != null && (type = badge.getType()) != null) {
                        int i13 = _avito_credits_public.a.f395496a[type.ordinal()];
                        if (i13 == 1) {
                            charSequenceB = _avito_credits_public.b(charSequenceC, context, badge.getText(), badge.getDeeplink(), c12);
                        } else {
                            if (i13 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            charSequenceB = _avito_credits_public.a(charSequenceC, context, badge.getDeeplink(), c12);
                        }
                        charSequenceC = charSequenceB;
                    }
                } else {
                    charSequenceC = null;
                }
                I5.a(a12.f128634t, charSequenceC, false);
                String buttonTitle = term.getButtonTitle();
                if (buttonTitle != null) {
                    a12.gH(null, buttonTitle, null);
                }
                a12.J80(term.getProgress());
                List<OfferDetailsItem> creditOfferDetailsItems = term.getCreditOfferDetailsItems();
                if (!this.f128646b) {
                    creditOfferDetailsItems = null;
                }
                if (creditOfferDetailsItems != null) {
                    a12.K80(creditOfferDetailsItems);
                }
                a12.F80(term.getAdditionalTopButton());
                UniversalImage icon = term.getIcon();
                ColoredIcon localIcon = term.getLocalIcon();
                Size iconSize = term.getIconSize();
                DeepLink iconDeepLink = term.getIconDeepLink();
                SimpleDraweeView simpleDraweeView = a12.f128639y;
                if (iconSize != null) {
                    ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                    Integer width = iconSize.getWidth();
                    if (width != null) {
                        layoutParams.width = y6.b(width.intValue());
                    }
                    simpleDraweeView.setLayoutParams(layoutParams);
                }
                if (iconDeepLink != null) {
                    simpleDraweeView.setOnClickListener(new z(a12, iconDeepLink, 0));
                }
                Image imageG = icon != null ? com.avito.android.advert.item.delivery_suggests.l.g(a12.f128700b, icon) : null;
                if (imageG != null) {
                    Uri uriD = C35829k2.c(imageG, simpleDraweeView, 2, 22).d();
                    if (uriD != null) {
                        simpleDraweeView.setVisibility(0);
                        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                        aVarA.f(uriD);
                        aVarA.c();
                    }
                } else {
                    Integer numA = (localIcon == null || (name = localIcon.getName()) == null) ? null : com.avito.android.lib.util.q.a(name);
                    Context context2 = simpleDraweeView.getContext();
                    if (numA != null) {
                        UniversalColor color = localIcon.getColor();
                        drawableN = C35835l0.n(context2, numA.intValue(), color != null ? C48063a.f437606a.a(context2, color) : C35835l0.d(R.attr.gray54, context2));
                    } else {
                        drawableN = null;
                    }
                    C35821j2.a(simpleDraweeView, drawableN);
                }
                com.avito.android.credits.p pVar = a12.f128709k;
                if (pVar != null) {
                    pVar.s2(term);
                }
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
