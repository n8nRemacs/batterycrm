package com.avito.android.gig_apply.ui;

import Cd.C13243a;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.view.C22981N;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.gig_apply.models.GigSlotTimer;
import com.avito.android.gig_apply.models.PaymentState;
import com.avito.android.gig_apply.ui.common.GigSlotBanner;
import com.avito.android.gig_apply.ui.common.ListItemsWithShowMoreView;
import com.avito.android.gig_apply.ui.common.SlotPaymentInfoWidgetView;
import com.avito.android.gig_apply.ui.common.SlotProgressWidgetView;
import com.avito.android.gig_apply.ui.common.TextWithShowMoreView;
import com.avito.android.gig_apply.ui.common.TutorialsWidget;
import com.avito.android.gig_apply.ui.dialogs.item_dialog.GigSlotItemsDialogFragment;
import com.avito.android.gig_apply.ui.dialogs.item_dialog.GigSlotItemsOpenParams;
import com.avito.android.gig_timer_widget.GigSlotTimerWidget;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35961v3;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.w6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import pH.C46952B;
import pH.C46957e;
import pH.C46958f;
import pH.C46959g;
import pH.C46960h;
import pH.i;
import pH.q;
import z1.AbstractC50339a;

/* compiled from: GigSlotActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gig_apply/ui/GigSlotActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/dialog/A;", "<init>", "()V", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSlotActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, com.avito.android.dialog.A {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f159871q = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f159872m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.gig_apply.mvi.B f159873n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final O0 f159874o = new O0(m0.f406844a.b(com.avito.android.gig_apply.mvi.A.class), new e(), new d(new g()), new f());

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Object f159875p = C35961v3.a(this);

    /* compiled from: GigSlotActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<pH.q, G0> {
        @Override // Y41.l
        public final G0 invoke(pH.q qVar) {
            pH.q qVar2 = qVar;
            GigSlotActivity gigSlotActivity = (GigSlotActivity) this.receiver;
            int i12 = GigSlotActivity.f159871q;
            gigSlotActivity.getClass();
            if (qVar2 instanceof q.b) {
                String string = ((q.b) qVar2).f428421a;
                if (string == null) {
                    string = gigSlotActivity.getString(R.string.gig_slot_error_toast_title);
                }
                a.i.C4057a.d(gigSlotActivity.P1(), com.avito.android.printable_text.b.f(string), null, null, new f.c(new IllegalStateException("Gig slot request error")), 0, null, null, null, 2030);
            } else if (qVar2 instanceof q.c) {
                a.i.C4057a.d(gigSlotActivity.P1(), com.avito.android.printable_text.b.f(((q.c) qVar2).f428422a), null, null, f.a.f125253a, 0, null, null, null, 2030);
            } else if (qVar2 instanceof q.a) {
                GigSlotItemsDialogFragment.a aVar = GigSlotItemsDialogFragment.f159999j0;
                q.a aVar2 = (q.a) qVar2;
                GigSlotItemsOpenParams gigSlotItemsOpenParams = new GigSlotItemsOpenParams(aVar2.f428419a.k0(gigSlotActivity), aVar2.f428420b);
                aVar.getClass();
                GigSlotItemsDialogFragment gigSlotItemsDialogFragment = new GigSlotItemsDialogFragment();
                gigSlotItemsDialogFragment.f160001h0.setValue(gigSlotItemsDialogFragment, GigSlotItemsDialogFragment.f160000k0[0], gigSlotItemsOpenParams);
                gigSlotItemsDialogFragment.show(gigSlotActivity.getSupportFragmentManager(), (String) null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpH/w;", "it", "Lkotlin/G0;", "invoke", "(LpH/w;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<pH.w, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f159876l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar) {
            super(1);
            this.f159876l = sVar;
        }

        @Override // Y41.l
        public final G0 invoke(pH.w wVar) {
            boolean z12;
            String str;
            pH.v vVar;
            G0 g02;
            G0 g03;
            G0 g04;
            String str2;
            UniversalImage universalImage;
            pH.w wVar2 = wVar;
            s sVar = this.f159876l;
            boolean z13 = wVar2.f428451a;
            boolean z14 = wVar2.f428452b;
            if (!z14 && !z13) {
                sVar.f160047b.accept(i.c.f428354a);
            }
            D6.G(sVar.f160033N, z14 || z13);
            D6.G(sVar.f160030K, z14);
            D6.G(sVar.f160031L, (z14 || z13) ? false : true);
            sVar.f160036Q.setRefreshing(z14);
            D6.G(sVar.f160032M, z13);
            C46959g c46959g = wVar2.f428454d;
            I5.a(sVar.f160050e, c46959g != null ? c46959g.f428342a : null, false);
            I5.a(sVar.f160051f, c46959g != null ? c46959g.f428343b : null, false);
            String str3 = c46959g != null ? c46959g.f428344c : null;
            TextView textView = sVar.f160052g;
            I5.a(textView, str3, false);
            if (L.f(c46959g != null ? c46959g.f428346e : null, Boolean.TRUE)) {
                FV.a aVar = FV.a.f4720a;
                int iB2 = y6.b(3);
                aVar.getClass();
                FV.a.j(textView, R.attr.textIconFlashFilled, iB2);
                s.a(textView);
                textView.setTextAppearance(R.style.Re23_Text_H70);
            } else {
                FV.a.f4720a.getClass();
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                textView.setTextAppearance(R.style.Re23_Text_S10);
            }
            pH.u uVar = wVar2.f428459i;
            D6.G(sVar.f160060o, uVar != null);
            TextView textView2 = sVar.f160069x;
            boolean z15 = wVar2.f428448N;
            D6.G(textView2, z15);
            DescriptionParameterItem descriptionParameterItem = sVar.f160020A;
            D6.G(descriptionParameterItem, z15);
            DescriptionParameterItem descriptionParameterItem2 = sVar.f160023D;
            D6.G(descriptionParameterItem2, z15);
            boolean z16 = wVar2.f428450P;
            DescriptionParameterItem descriptionParameterItem3 = sVar.f160022C;
            D6.G(descriptionParameterItem3, z16);
            boolean z17 = wVar2.f428449O;
            DescriptionParameterItem descriptionParameterItem4 = sVar.f160024E;
            D6.G(descriptionParameterItem4, z17);
            I5.a(sVar.f160044Y, wVar2.f428446L, false);
            I5.a(sVar.f160071z, wVar2.f428435A, false);
            I5.a(sVar.f160070y, wVar2.f428436B, false);
            pH.z zVar = wVar2.f428438D;
            boolean z18 = zVar != null;
            View view = sVar.f160034O;
            D6.G(view, z18);
            C46958f c46958f = wVar2.f428455e;
            I5.a(sVar.f160053h, c46958f != null ? c46958f.f428339a : null, false);
            I5.a(sVar.f160054i, c46958f != null ? c46958f.f428340b : null, false);
            pH.j jVar = wVar2.f428456f;
            com.avito.android.lib.design.button.b.a(sVar.f160056k, jVar != null ? jVar.f428374a : null, false);
            pH.j jVar2 = wVar2.f428457g;
            com.avito.android.lib.design.button.b.a(sVar.f160057l, jVar2 != null ? jVar2.f428374a : null, false);
            pH.j jVar3 = wVar2.f428458h;
            com.avito.android.lib.design.button.b.a(sVar.f160058m, jVar3 != null ? jVar3.f428374a : null, false);
            I5.a(sVar.f160063r, uVar != null ? uVar.f428431a : null, false);
            C46952B c46952b = wVar2.f428460j;
            if (c46952b != null) {
                str = c46952b.f428299a;
                z12 = z14;
            } else {
                z12 = z14;
                str = null;
            }
            TextView textView3 = sVar.f160064s;
            I5.a(textView3, str, false);
            if (c46952b != null) {
                D6.a(new w(sVar, c46952b), textView3);
            }
            I5.a(sVar.f160061p, uVar != null ? uVar.f428432b : null, false);
            sVar.f160062q.setVisibility(wVar2.f428461k != null ? 0 : 8);
            String str4 = wVar2.f428467q;
            DescriptionParameterItem descriptionParameterItem5 = sVar.f160021B;
            if (str4 == null) {
                D6.w(descriptionParameterItem5);
            } else {
                D6.G(descriptionParameterItem5, z15);
            }
            com.avito.android.lib.design.text_view.a leftTextView = descriptionParameterItem5.getLeftTextView();
            GigSlotActivity gigSlotActivity = sVar.f160046a;
            String string = wVar2.f428469s;
            if (string == null) {
                string = gigSlotActivity.getString(R.string.gig_slot_price_per_hour);
            }
            I5.a(leftTextView, string, false);
            I5.a(descriptionParameterItem5.getRightTextView(), str4, false);
            I5.a(descriptionParameterItem.getRightTextView(), wVar2.f428465o, false);
            com.avito.android.lib.design.text_view.a leftTextView2 = descriptionParameterItem2.getLeftTextView();
            String string2 = wVar2.f428470t;
            if (string2 == null) {
                string2 = gigSlotActivity.getString(R.string.gig_slot_total_price);
            }
            I5.a(leftTextView2, string2, false);
            I5.a(descriptionParameterItem2.getRightTextView(), wVar2.f428468r, false);
            com.avito.android.lib.design.text_view.a rightTextView = descriptionParameterItem3.getRightTextView();
            I5.a(rightTextView, wVar2.f428473w, false);
            FV.a aVar2 = FV.a.f4720a;
            int iB3 = y6.b(4);
            aVar2.getClass();
            FV.a.j(rightTextView, R.attr.textIconFlashFilled, iB3);
            s.a(rightTextView);
            I5.a(descriptionParameterItem4.getRightTextView(), wVar2.f428475y, false);
            pH.v vVar2 = wVar2.f428437C;
            I5.a(sVar.f160025F, vVar2 != null ? vVar2.f428433a : null, false);
            String str5 = wVar2.f428462l;
            TextWithShowMoreView textWithShowMoreView = sVar.f160065t;
            if (str5 != null) {
                D6.G(textWithShowMoreView, true);
                textWithShowMoreView.j(gigSlotActivity.getString(R.string.gig_slot_requirement_title), str5);
            } else {
                D6.w(textWithShowMoreView);
            }
            pH.y yVar = wVar2.f428442H;
            TutorialsWidget tutorialsWidget = sVar.f160066u;
            if (yVar != null) {
                D6.G(tutorialsWidget, true);
                vVar = vVar2;
                tutorialsWidget.k(new com.avito.android.gig_apply.ui.common.C(yVar.f428481c, yVar.f428479a, yVar.f428480b), new u(sVar));
            } else {
                vVar = vVar2;
                D6.w(tutorialsWidget);
            }
            List<AttributedText> list = zVar != null ? zVar.f428483a : null;
            ViewGroup viewGroup = sVar.f160035P;
            viewGroup.removeAllViews();
            if (list != null) {
                for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                    AttributedText attributedText = (AttributedText) it.next();
                    TextView textView4 = new TextView(gigSlotActivity);
                    com.avito.android.util.text.j.a(textView4, attributedText, null);
                    C43175k.K(new C43197r1(new v(sVar, null), attributedText.linkClicks()), sVar.f160048c);
                    viewGroup.addView(textView4);
                }
            }
            List<String> list2 = wVar2.f428463m;
            ListItemsWithShowMoreView listItemsWithShowMoreView = sVar.f160067v;
            if (list2 == null || !(!list2.isEmpty())) {
                D6.w(listItemsWithShowMoreView);
            } else {
                D6.G(listItemsWithShowMoreView, true);
                listItemsWithShowMoreView.j(gigSlotActivity.getResources().getString(R.string.gig_slot_documents_title), list2);
            }
            List<String> list3 = wVar2.f428464n;
            ListItemsWithShowMoreView listItemsWithShowMoreView2 = sVar.f160068w;
            if (list3 == null || !(!list3.isEmpty())) {
                D6.w(listItemsWithShowMoreView2);
            } else {
                D6.G(listItemsWithShowMoreView2, true);
                listItemsWithShowMoreView2.k(gigSlotActivity.getResources().getString(R.string.gig_slot_duties_title), list3, new t(sVar));
            }
            sVar.b(descriptionParameterItem3, wVar2.f428474x);
            sVar.b(descriptionParameterItem2, wVar2.f428472v);
            sVar.b(descriptionParameterItem5, wVar2.f428471u);
            LinearLayout linearLayout = sVar.f160045Z;
            linearLayout.removeAllViews();
            List<PaymentState> list4 = wVar2.f428447M;
            if (list4 != null) {
                for (PaymentState paymentState : list4) {
                    E e12 = new E(gigSlotActivity, null, 0, 6, null);
                    e12.a(paymentState, new x(paymentState, sVar));
                    linearLayout.addView(e12);
                }
            }
            com.avito.android.lib.design.text_view.a leftTextView3 = descriptionParameterItem.getLeftTextView();
            Integer num = wVar2.f428466p;
            I5.a(leftTextView3, num != null ? gigSlotActivity.getString(num.intValue()) : null, false);
            Image imageDependsOnThemeOrDefault = (c46958f == null || (universalImage = c46958f.f428341c) == null) ? null : UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(gigSlotActivity));
            Map<Size, Uri> variants = imageDependsOnThemeOrDefault != null ? imageDependsOnThemeOrDefault.getVariants() : null;
            SimpleDraweeView simpleDraweeView = sVar.f160055j;
            if (variants == null || variants.isEmpty()) {
                D6.w(simpleDraweeView);
            } else {
                D6.G(simpleDraweeView, true);
                C35949t5.c(sVar.f160055j, com.avito.android.image_loader.n.a(imageDependsOnThemeOrDefault), null, null, null, 14);
            }
            Integer num2 = wVar2.f428476z;
            if (num2 != null) {
                I5.a(textView2, gigSlotActivity.getString(num2.intValue()), false);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                D6.w(textView2);
            }
            if (zVar != null) {
                view.getBackground().setTint(C35835l0.d(zVar.f428484b, gigSlotActivity));
            }
            GigSlotTimerWidget gigSlotTimerWidget = sVar.f160027H;
            GigSlotTimer gigSlotTimer = wVar2.f428453c;
            if (gigSlotTimer != null) {
                D6.G(gigSlotTimerWidget, true);
                gigSlotTimerWidget.c(gigSlotTimer.f159686a, gigSlotTimer.f159687b);
                gigSlotTimerWidget.setColor(gigSlotTimer.f159688c);
                if (gigSlotTimer.f159690e == GigSlotTimer.Direction.f159693c) {
                    gigSlotTimerWidget.setDate(gigSlotTimer.f159691f);
                }
                g03 = G0.f406611a;
            } else {
                g03 = null;
            }
            if (g03 == null) {
                D6.w(gigSlotTimerWidget);
            }
            C46960h c46960h = wVar2.f428443I;
            long j12 = c46960h.f428349c;
            SlotProgressWidgetView slotProgressWidgetView = sVar.f160028I;
            if (j12 <= 0 || c46960h.f428350d <= 0) {
                D6.w(slotProgressWidgetView);
            } else {
                D6.G(slotProgressWidgetView, true);
                slotProgressWidgetView.j(c46960h);
            }
            pH.r rVar = wVar2.f428445K;
            pH.j jVar4 = rVar.f428425c;
            SlotPaymentInfoWidgetView slotPaymentInfoWidgetView = sVar.f160029J;
            if (jVar4 != null) {
                D6.G(slotPaymentInfoWidgetView, true);
                y yVar2 = new y(sVar);
                z zVar2 = new z(sVar);
                InterfaceC22204y1<com.avito.android.gig_apply.ui.common.t> interfaceC22204y1 = slotPaymentInfoWidgetView.f159901j;
                pH.s sVar2 = rVar.f428423a;
                com.avito.android.gig_apply.ui.common.h hVar = sVar2 != null ? new com.avito.android.gig_apply.ui.common.h(sVar2.f428427b, null, sVar2.f428426a, sVar2.f428428c, 2, null) : null;
                pH.j jVar5 = rVar.f428425c;
                String str6 = jVar5 != null ? jVar5.f428374a : null;
                if (str6 == null) {
                    str6 = "";
                }
                ((C22082i3) interfaceC22204y1).setValue(new com.avito.android.gig_apply.ui.common.t(hVar, str6, jVar5 != null ? jVar5.f428375b : null, rVar.f428424b));
                slotPaymentInfoWidgetView.f159902k = yVar2;
                slotPaymentInfoWidgetView.f159903l = zVar2;
            } else {
                D6.w(slotPaymentInfoWidgetView);
            }
            I5.a(sVar.f160059n, gigSlotTimer != null ? gigSlotActivity.getString(gigSlotTimer.f159689d) : null, false);
            ImageLoadableView imageLoadableView = sVar.f160026G;
            if (vVar == null || (str2 = vVar.f428434b) == null) {
                g04 = null;
            } else {
                Uri uri = Uri.parse(str2);
                D6.H(imageLoadableView);
                com.avito.android.image_loader.fresco.s.c(imageLoadableView, uri, true, null, null);
                g04 = G0.f406611a;
            }
            if (g04 == null) {
                D6.w(imageLoadableView);
            }
            ViewGroup viewGroup2 = sVar.f160038S;
            if (z12 || z13) {
                D6.w(viewGroup2);
            } else {
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = viewGroup2.animate().translationY(viewGroup2.getHeight());
                w6.a(viewPropertyAnimatorTranslationY, new D(sVar));
                ScrollView scrollView = sVar.f160037R;
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(scrollView.getPaddingBottom(), 0);
                valueAnimatorOfInt.addUpdateListener(new AV.a(sVar, 7));
                C46957e c46957e = wVar2.f428440F;
                if (c46957e != null) {
                    viewPropertyAnimatorTranslationY.cancel();
                    valueAnimatorOfInt.cancel();
                    viewGroup2.setTranslationY(y6.b(20));
                    if (!viewGroup2.isLaidOut() || viewGroup2.isLayoutRequested()) {
                        viewGroup2.addOnLayoutChangeListener(new C(sVar));
                    } else {
                        scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), viewGroup2.getHeight());
                    }
                    D6.H(viewGroup2);
                    I5.a(sVar.f160039T, c46957e.f428334a, false);
                    I5.a(sVar.f160040U, c46957e.f428335b, false);
                    pH.j jVar6 = c46957e.f428336c;
                    String str7 = jVar6 != null ? jVar6.f428374a : null;
                    Button button = sVar.f160041V;
                    com.avito.android.lib.design.button.b.a(button, str7, false);
                    button.setLoading(c46957e.f428338e);
                    pH.j jVar7 = c46957e.f428337d;
                    com.avito.android.lib.design.button.b.a(sVar.f160042W, jVar7 != null ? jVar7.f428374a : null, false);
                } else if (viewGroup2.getVisibility() == 0) {
                    viewPropertyAnimatorTranslationY.start();
                    valueAnimatorOfInt.start();
                }
            }
            pH.l lVar = wVar2.f428441G;
            GigSlotBanner gigSlotBanner = sVar.f160043X;
            if (lVar != null) {
                D6.G(gigSlotBanner, true);
                gigSlotBanner.setTitle(lVar.f428407a);
                gigSlotBanner.setDescription(lVar.f428408b);
                gigSlotBanner.setImageUrl(lVar.f428409c);
                gigSlotBanner.setOnClickListener(new r(sVar, 2));
            } else {
                D6.w(gigSlotBanner);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            GigSlotActivity.this.onBackPressed();
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f159878l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f159878l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f159878l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return GigSlotActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return GigSlotActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: GigSlotActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/gig_apply/mvi/A;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/gig_apply/mvi/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.gig_apply.mvi.A> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.gig_apply.mvi.A invoke() {
            com.avito.android.gig_apply.mvi.B b12 = GigSlotActivity.this.f159873n;
            if (b12 == null) {
                b12 = null;
            }
            return (com.avito.android.gig_apply.mvi.A) b12.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.gig_slot_activity;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.gig_apply.di.b.a().a((GigSlotOpenParams) this.f159875p.getValue(), (com.avito.android.gig_apply.di.f) C29972i.a(C29972i.b(this), Object.class), cv.c.a(this)).a(this);
    }

    @Override // com.avito.android.dialog.A
    public final void a(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f159872m;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (!isTaskRoot()) {
            super.onBackPressed();
            return;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f159872m;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new MainScreenLink(null, null, false, 7, null), null, null, 6);
        finish();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewK1 = K1();
        O0 o02 = this.f159874o;
        com.avito.android.arch.mvi.android.f.a((com.avito.android.gig_apply.mvi.A) o02.getValue(), this, Lifecycle.State.f46681d, new a(1, this, GigSlotActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/gig_apply/models/GigSlotOneTimeEvent;)V", 0), new b(new s(viewK1, this, (com.avito.android.gig_apply.mvi.A) o02.getValue(), (GigSlotOpenParams) this.f159875p.getValue(), C22981N.a(getLifecycle()), new c())));
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        ((com.avito.android.gig_apply.mvi.A) this.f159874o.getValue()).accept(i.o.f428366a);
    }
}
