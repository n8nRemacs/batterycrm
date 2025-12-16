package com.avito.android.details_sheet;

import PK0.n;
import PK0.o;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.Footer;
import com.avito.android.deep_linking.links.ItemList;
import com.avito.android.deep_linking.links.Theme;
import com.avito.android.deep_linking.links.x;
import com.avito.android.details_sheet.di.b;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.android.util.N0;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import j.D;
import j.f0;
import java.util.ArrayList;
import javax.inject.Inject;
import jw.C42433a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DetailsSheetActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/details_sheet/DetailsSheetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/deep_linking/links/x;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_details-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DetailsSheetActivity extends com.avito.android.ui.activity.a implements x, InterfaceC28477j.b, com.avito.android.ui.status_bar.a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f135920s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f135921m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f135922n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f135923o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f135924p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f135925q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f135926r;

    /* compiled from: DetailsSheetActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/details_sheet/DetailsSheetActivity$a;", "", "<init>", "()V", "", "EXTRA_BODY", "Ljava/lang/String;", "EXTRA_BUTTON_CLICK_EVENT", "EXTRA_DISPLAY_EVENT", "_avito_details-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DetailsSheetActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135927a;

        static {
            int[] iArr = new int[ItemList.Style.values().length];
            try {
                iArr[ItemList.Style.DASHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemList.Style.POINTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemList.Style.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f135927a = iArr;
        }
    }

    static {
        new a(null);
    }

    public static void b2(com.avito.android.lib.design.bottom_sheet.d dVar, String str, @f0 Integer num) {
        TextView textView = (TextView) dVar.findViewById(R.id.advert_details_bottom_sheet_title_tv);
        if (textView != null) {
            c2(textView, str);
            if (num != null) {
                textView.setTextAppearance(num.intValue());
            }
        }
    }

    public static void c2(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.deep_linking.links.x
    public final boolean X(@Y61.k String str) {
        Uri uri = Uri.parse(str);
        InterfaceC35845m2 interfaceC35845m2 = this.f135922n;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        ArrayList arrayListN = interfaceC35845m2.n(uri);
        int size = arrayListN.size();
        if (size == 0) {
            L5.a(this, R.string.no_application_installed_to_perform_this_action, 0);
            return false;
        }
        if (size != 1) {
            ArrayList arrayList = new ArrayList(arrayListN);
            Intent intent = (Intent) arrayList.remove(0);
            InterfaceC35845m2 interfaceC35845m22 = this.f135922n;
            startActivity((interfaceC35845m22 != null ? interfaceC35845m22 : null).x(getString(R.string.details_sheet_open_with), intent, arrayList));
        } else {
            startActivity((Intent) arrayListN.get(0));
        }
        setResult(2);
        finish();
        return true;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.details_sheet.di.a.a();
        aVarA.b((com.avito.android.details_sheet.di.c) C29972i.a(C29972i.b(this), com.avito.android.details_sheet.di.c.class));
        aVarA.a(cv.c.a(this));
        aVarA.build().a(this);
    }

    public final void a2(com.avito.android.lib.design.bottom_sheet.d dVar, DetailsSheetButton detailsSheetButton, @D int i12, ParametrizedClickStreamEvent parametrizedClickStreamEvent, Intent intent) {
        Button button = (Button) dVar.findViewById(i12);
        if ((detailsSheetButton != null ? detailsSheetButton.getTitle() : null) == null) {
            D6.w(button);
            return;
        }
        D6.H(button);
        button.setText(detailsSheetButton.getTitle());
        Drawable drawableH = L.f(detailsSheetButton.getIcon(), "call") ? C35835l0.h(R.attr.ic_call20, button.getContext()) : null;
        if (drawableH != null) {
            Button.g(button, drawableH, null, false, null, 14);
        }
        String style = detailsSheetButton.getStyle();
        button.setAppearanceFromAttr((style == null || style.length() == 0) ? R.attr.buttonPrimaryLarge : com.avito.android.lib.util.f.d(style));
        button.setOnClickListener(new com.avito.android.advert.item.beduin.v2.favorite.a(detailsSheetButton, parametrizedClickStreamEvent, intent, this, dVar, 2));
        Integer topMargin = detailsSheetButton.getTopMargin();
        if (topMargin != null) {
            D6.c(button, null, Integer.valueOf(D6.j(button, topMargin.intValue())), null, null, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        CharSequence charSequenceC;
        CharSequence charSequenceC2;
        AttributedText attributedText;
        Context contextA;
        final com.avito.android.lib.design.bottom_sheet.d dVar;
        InterfaceC28373a interfaceC28373a;
        boolean z12;
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.advert_details_details_sheet_activity);
        a.b.a(this, true);
        com.avito.android.ui.status_bar.e eVar = this.f135926r;
        if (eVar == null) {
            eVar = null;
        }
        eVar.b(this);
        DetailsSheetLinkBody detailsSheetLinkBody = (DetailsSheetLinkBody) getIntent().getParcelableExtra("DETAILS_SHEET_ACTIVITY_EXTRA_BODY");
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = (ParametrizedClickStreamEvent) getIntent().getParcelableExtra("DETAILS_SHEET_ACTIVITY_EXTRA_CLICK_EVENT");
        if (bundle != null && !detailsSheetLinkBody.getShouldShowAfterRotateScreen()) {
            setResult(0);
            finish();
            return;
        }
        Theme theme = detailsSheetLinkBody.getTheme();
        Context contextA2 = theme != null ? com.avito.android.lib.deprecated_design.f.a(this, theme.f133713b) : this;
        AttributedText descriptionHeader = detailsSheetLinkBody.getDescriptionHeader();
        if (descriptionHeader == null) {
            charSequenceC = null;
        } else {
            descriptionHeader.setOnUrlClickListener(this);
            descriptionHeader.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 2));
            com.avito.android.util.text.a aVar = this.f135923o;
            if (aVar == null) {
                aVar = null;
            }
            charSequenceC = aVar.c(contextA2, descriptionHeader);
        }
        AttributedText description = detailsSheetLinkBody.getDescription();
        if (description == null) {
            charSequenceC2 = null;
        } else {
            description.setOnUrlClickListener(this);
            description.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 2));
            com.avito.android.util.text.a aVar2 = this.f135923o;
            if (aVar2 == null) {
                aVar2 = null;
            }
            charSequenceC2 = aVar2.c(contextA2, description);
        }
        Footer footer = detailsSheetLinkBody.getFooter();
        AttributedText attributedTextC = footer != null ? footer.getText() : null;
        String title = detailsSheetLinkBody.getTitle();
        String titleStyle = detailsSheetLinkBody.getTitleStyle();
        ItemList descriptionItems = detailsSheetLinkBody.getDescriptionItems();
        String warning = detailsSheetLinkBody.getWarning();
        DetailsSheetButton button = detailsSheetLinkBody.getButton();
        DetailsSheetButton secondaryButton = detailsSheetLinkBody.getSecondaryButton();
        Boolean closeButton = detailsSheetLinkBody.getCloseButton();
        boolean zBooleanValue = closeButton != null ? closeButton.booleanValue() : false;
        Image image = detailsSheetLinkBody.getImage();
        Boolean supportTablets = detailsSheetLinkBody.getSupportTablets();
        boolean zBooleanValue2 = supportTablets != null ? supportTablets.booleanValue() : false;
        UniversalImage universalImage = detailsSheetLinkBody.getUniversalImage();
        boolean z13 = zBooleanValue;
        com.avito.android.details_sheet.a aVar3 = L.f(detailsSheetLinkBody.getIsRightCloseButton(), Boolean.TRUE) ? com.avito.android.details_sheet.a.f135929c : com.avito.android.details_sheet.a.f135928b;
        float fH2 = detailsSheetLinkBody.h();
        com.avito.android.details_sheet.a aVar4 = aVar3;
        Theme theme2 = Theme.AVITO_RE_23;
        Boolean overlayHeader = detailsSheetLinkBody.getOverlayHeader();
        boolean zBooleanValue3 = overlayHeader != null ? overlayHeader.booleanValue() : false;
        final DeepLink onDismissDeeplink = detailsSheetLinkBody.getOnDismissDeeplink();
        int i12 = (getResources().getBoolean(R.bool.is_tablet) && zBooleanValue2) ? R.style.DetailsSheetSupportTabletRe23Style : R.style.DetailsSheetRe23Style;
        if (theme2 != null) {
            attributedText = attributedTextC;
            contextA = com.avito.android.lib.deprecated_design.f.a(this, theme2.f133713b);
        } else {
            attributedText = attributedTextC;
            contextA = this;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(contextA, i12);
        dVar2.D(R.layout.advert_details_bottom_sheet_fragment, zBooleanValue2);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) dVar2.findViewById(R.id.advert_details_bottom_sheet_image);
        if (simpleDraweeView != null) {
            if (universalImage != null) {
                D6.H(simpleDraweeView);
                ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.f44172S = fH2;
                simpleDraweeView.setLayoutParams(bVar);
                Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(dVar2.getContext()));
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.f169490h = new c(simpleDraweeView);
                com.avito.android.advert.item.delivery_suggests.l.w(imageDependsOnTheme, aVarA);
            } else if (image != null) {
                D6.H(simpleDraweeView);
                ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                bVar2.f44172S = fH2;
                simpleDraweeView.setLayoutParams(bVar2);
                ImageRequest.a aVarA2 = C35949t5.a(simpleDraweeView);
                aVarA2.f169490h = new c(simpleDraweeView);
                com.avito.android.advert.item.delivery_suggests.l.w(image, aVarA2);
            }
        }
        TextView textView = (TextView) dVar2.findViewById(R.id.advert_details_bottom_sheet_description_tv);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            c2(textView, charSequenceC);
        }
        TextView textView2 = (TextView) dVar2.findViewById(R.id.advert_details_bottom_sheet_text_tv);
        if (textView2 != null) {
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            c2(textView2, charSequenceC2);
        }
        TextView textView3 = (TextView) dVar2.findViewById(R.id.advert_details_bottom_sheet_warning_tv);
        if (textView3 != null) {
            c2(textView3, warning);
        }
        if (descriptionItems != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(dVar2.getContext());
            LinearLayout linearLayout = (LinearLayout) dVar2.findViewById(R.id.advert_details_bottom_sheet_description_items);
            D6.G(linearLayout, true);
            int size = descriptionItems.getItems().size();
            int i13 = 0;
            for (Object obj : descriptionItems.getItems()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                ItemList.Item item = (ItemList.Item) obj;
                ItemList.Style styleC = descriptionItems.c();
                ItemList itemList = descriptionItems;
                TextView textView4 = (TextView) layoutInflaterFrom.inflate(R.layout.advert_details_description_list_item, (ViewGroup) null, false);
                o oVar = textView4 instanceof o ? (o) textView4 : null;
                n textStyleData = oVar != null ? oVar.getTextStyleData() : null;
                com.avito.android.util.text.a aVar5 = this.f135923o;
                LayoutInflater layoutInflater = layoutInflaterFrom;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                CharSequence charSequenceA = aVar5.a(textView4.getContext(), textStyleData, item.getText());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(charSequenceA);
                int i15 = b.f135927a[styleC.ordinal()];
                if (i15 == 1) {
                    string = "—";
                } else if (i15 == 2) {
                    string = "•";
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i14);
                    sb2.append('.');
                    string = sb2.toString();
                }
                spannableStringBuilder.setSpan(new C42433a((styleC != ItemList.Style.NUMERIC || size < 10) ? y6.f(18) : y6.f(28), string), 0, spannableStringBuilder.length(), 33);
                I5.a(textView4, spannableStringBuilder, false);
                linearLayout.addView(textView4);
                i13 = i14;
                descriptionItems = itemList;
                layoutInflaterFrom = layoutInflater;
            }
        }
        final Intent intent = new Intent();
        a2(dVar2, button, R.id.advert_details_bottom_sheet_button, parametrizedClickStreamEvent, intent);
        a2(dVar2, secondaryButton, R.id.advert_details_bottom_sheet_secondary_button, parametrizedClickStreamEvent, intent);
        TextView textView5 = (TextView) dVar2.findViewById(R.id.advert_details_bottom_sheet_footer_tv);
        if (textView5 != null) {
            textView5.setMovementMethod(LinkMovementMethod.getInstance());
            com.avito.android.util.text.j.a(textView5, attributedText, null);
        }
        Context context = dVar2.getContext();
        Integer numQ = titleStyle != null ? com.avito.android.lib.util.f.q(titleStyle) : null;
        int iJ2 = C35835l0.j(numQ != null ? numQ.intValue() : theme2 == Theme.AVITO_RE_23 ? R.attr.textH10 : R.attr.textHeadingLarge, context);
        dVar2.setCancelable(true);
        if (zBooleanValue3) {
            b2(dVar2, title, Integer.valueOf(iJ2));
            com.avito.android.lib.design.bottom_sheet.j.b(dVar2, z13, 4);
            z12 = true;
            dVar = dVar2;
            interfaceC28373a = null;
        } else if (z13) {
            if (aVar4 == com.avito.android.details_sheet.a.f135929c) {
                b2(dVar2, null, null);
                dVar = dVar2;
                com.avito.android.lib.design.bottom_sheet.j.c(dVar2, title, true, C35835l0.f(R.attr.details_sheet_padding, dVar2.getContext()), 0, 0, 112);
                View viewFindViewById = dVar.findViewById(R.id.bottom_sheet_right_cross_header).findViewById(R.id.bottom_sheet_title);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) viewFindViewById).setTextAppearance(iJ2);
            } else {
                dVar = dVar2;
                if (aVar4 == com.avito.android.details_sheet.a.f135928b) {
                    b2(dVar, title, Integer.valueOf(iJ2));
                    interfaceC28373a = null;
                    z12 = true;
                    dVar.L(null, null, true, true);
                }
            }
            interfaceC28373a = null;
            z12 = true;
        } else {
            b2(dVar2, title, Integer.valueOf(iJ2));
            dVar2.L(null, null, false, true);
            z12 = true;
            interfaceC28373a = null;
            dVar = dVar2;
        }
        dVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.details_sheet.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                int i16 = DetailsSheetActivity.f135920s;
                DeepLink deepLink = onDismissDeeplink;
                DetailsSheetActivity detailsSheetActivity = this;
                if (deepLink != null) {
                    Intent intent2 = intent;
                    if (!intent2.hasExtra("extra_details_sheet_deeplink")) {
                        intent2.putExtra("extra_details_sheet_deeplink", deepLink);
                        detailsSheetActivity.setResult(1, intent2);
                        dVar.r();
                    }
                }
                detailsSheetActivity.finish();
            }
        });
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, z12);
        com.avito.android.lib.util.g.a(dVar);
        this.f135921m = dVar;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent2 = (ParametrizedClickStreamEvent) getIntent().getParcelableExtra("DETAILS_SHEET_ACTIVITY_EXTRA_DISPLAY_EVENT");
        if (parametrizedClickStreamEvent2 != null) {
            InterfaceC28373a interfaceC28373a2 = this.f135924p;
            (interfaceC28373a2 != null ? interfaceC28373a2 : interfaceC28373a).c(parametrizedClickStreamEvent2);
        }
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f135921m;
        if (dVar != null) {
            dVar.setOnDismissListener(null);
            N0.a(dVar);
        }
    }
}
