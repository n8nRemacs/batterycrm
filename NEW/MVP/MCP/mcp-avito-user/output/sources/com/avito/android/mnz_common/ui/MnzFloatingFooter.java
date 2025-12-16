package com.avito.android.mnz_common.ui;

import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.circular_counter.CircularCounter;
import com.avito.android.lib.util.q;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.mnz_common.data.MnzFloatingFooterContacts;
import com.avito.android.mnz_common.extensions.i;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import wZ.C49578b;
import wZ.g;
import wZ.h;

/* compiled from: MnzFloatingFooter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mnz_common/ui/MnzFloatingFooter;", "Landroid/widget/LinearLayout;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MnzFloatingFooter extends LinearLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f197977j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f197978b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f197979c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CircularCounter f197980d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f197981e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f197982f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f197983g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f197984h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f197985i;

    @j
    public MnzFloatingFooter(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(g gVar) {
        i.b(this.f197981e, gVar != null ? gVar.f441562c : null);
        C49578b c49578b = gVar != null ? gVar.f441563d : null;
        Button button = this.f197983g;
        i.b(button, c49578b);
        this.f197982f.setVisibility(D6.y(button) ? 0 : 8);
        i.b(this.f197984h, gVar != null ? gVar.f441564e : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.l final wZ.g r5, @Y61.l wZ.C49582f r6, @Y61.k com.avito.android.util.text.a r7, @Y61.k Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r8, @Y61.k final Y41.p<? super com.avito.android.deep_linking.links.DeepLink, ? super java.lang.Integer, kotlin.G0> r9) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mnz_common.ui.MnzFloatingFooter.b(wZ.g, wZ.f, com.avito.android.util.text.a, Y41.l, Y41.p):void");
    }

    public final void c(@l com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter, @l MnzFloatingFooterContact mnzFloatingFooterContact, @k a aVar, @k Y41.l<? super DeepLink, G0> lVar, @k p<? super DeepLink, ? super Integer, G0> pVar) {
        b(mnzFloatingFooter != null ? h.b(mnzFloatingFooter) : null, mnzFloatingFooterContact != null ? h.a(mnzFloatingFooterContact) : null, aVar, lVar, pVar);
    }

    public final void d(@l final com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter, @k a aVar, @k final Y41.l<? super DeepLink, G0> lVar, @k final Y41.l<? super Integer, G0> lVar2) {
        G0 g02;
        MnzFloatingFooterContacts contacts;
        MnzFloatingFooterContacts contacts2;
        MnzFloatingFooterContact current;
        AttributedText text;
        MnzFloatingFooterContacts contacts3;
        MnzFloatingFooterContacts contacts4;
        MnzFloatingFooterContact current2;
        UniversalColor progressColor;
        MnzFloatingFooterContacts contacts5;
        MnzFloatingFooterContact current3;
        String iconName;
        MnzFloatingFooterContacts contacts6;
        MnzFloatingFooterContact current4;
        MnzFloatingFooterContacts contacts7;
        MnzFloatingFooterContact current5;
        MnzFloatingFooterContacts contacts8;
        MnzFloatingFooterContact current6;
        this.f197978b.setVisibility(((mnzFloatingFooter == null || (contacts8 = mnzFloatingFooter.getContacts()) == null || (current6 = contacts8.getCurrent()) == null) ? null : Float.valueOf(current6.getProgress())) != null ? 0 : 8);
        Float fValueOf = (mnzFloatingFooter == null || (contacts7 = mnzFloatingFooter.getContacts()) == null || (current5 = contacts7.getCurrent()) == null) ? null : Float.valueOf(current5.getProgress());
        CircularCounter circularCounter = this.f197980d;
        circularCounter.setProgress(fValueOf);
        circularCounter.setCounter((mnzFloatingFooter == null || (contacts6 = mnzFloatingFooter.getContacts()) == null || (current4 = contacts6.getCurrent()) == null) ? null : Integer.valueOf(current4.getCount()));
        if (mnzFloatingFooter != null && (contacts5 = mnzFloatingFooter.getContacts()) != null && (current3 = contacts5.getCurrent()) != null && (iconName = current3.getIconName()) != null) {
            Integer numA = q.a(iconName);
            Drawable drawableH = numA != null ? C35835l0.h(numA.intValue(), getContext()) : null;
            if (drawableH != null) {
                drawableH.setTint(C35835l0.d(R.attr.black, getContext()));
            }
            circularCounter.setIcon(drawableH);
        }
        if (mnzFloatingFooter == null || (contacts4 = mnzFloatingFooter.getContacts()) == null || (current2 = contacts4.getCurrent()) == null || (progressColor = current2.getProgressColor()) == null) {
            g02 = null;
        } else {
            circularCounter.setTrackColor(C48063a.f437606a.a(getContext(), progressColor));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            circularCounter.setTrackColor(C35835l0.d(R.attr.green600, getContext()));
        }
        AttributedText text2 = (mnzFloatingFooter == null || (contacts3 = mnzFloatingFooter.getContacts()) == null) ? null : contacts3.getText();
        TextView textView = this.f197979c;
        com.avito.android.util.text.j.a(textView, text2, aVar);
        if (mnzFloatingFooter != null && (contacts2 = mnzFloatingFooter.getContacts()) != null && (current = contacts2.getCurrent()) != null && (text = current.getText()) != null) {
            com.avito.android.util.text.j.a(textView, text, aVar);
        }
        com.avito.android.util.text.j.a(this.f197985i, mnzFloatingFooter != null ? mnzFloatingFooter.getTerms() : null, aVar);
        a(mnzFloatingFooter != null ? h.b(mnzFloatingFooter) : null);
        AttributedText text3 = (mnzFloatingFooter == null || (contacts = mnzFloatingFooter.getContacts()) == null) ? null : contacts.getText();
        if (text3 != null) {
            text3.setOnDeepLinkClickListener(new com.avito.android.advert.item.delivery_suggests.k(3, lVar));
        }
        AttributedText terms = mnzFloatingFooter != null ? mnzFloatingFooter.getTerms() : null;
        if (terms != null) {
            terms.setOnDeepLinkClickListener(new com.avito.android.advert.item.delivery_suggests.k(4, lVar));
        }
        final int i12 = 0;
        this.f197981e.setOnClickListener(new View.OnClickListener(mnzFloatingFooter, lVar2, lVar, i12) { // from class: xZ.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f442537b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MnzFloatingFooter f442538c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ N f442539d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N f442540e;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f442537b = i12;
                this.f442539d = (N) lVar2;
                this.f442540e = (N) lVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ButtonAction button;
                DeepLink deeplink;
                ButtonAction secondButton;
                DeepLink deeplink2;
                ?? r02 = this.f442539d;
                G0 g03 = null;
                ?? r22 = this.f442540e;
                MnzFloatingFooter mnzFloatingFooter2 = this.f442538c;
                switch (this.f442537b) {
                    case 0:
                        int i13 = com.avito.android.mnz_common.ui.MnzFloatingFooter.f197977j;
                        if (mnzFloatingFooter2 != null && (button = mnzFloatingFooter2.getButton()) != null && (deeplink = button.getDeeplink()) != null) {
                            r22.invoke(deeplink);
                            g03 = G0.f406611a;
                        }
                        if (g03 == null) {
                            r02.invoke(Integer.valueOf(view.getId()));
                            break;
                        }
                        break;
                    default:
                        int i14 = com.avito.android.mnz_common.ui.MnzFloatingFooter.f197977j;
                        if (mnzFloatingFooter2 != null && (secondButton = mnzFloatingFooter2.getSecondButton()) != null && (deeplink2 = secondButton.getDeeplink()) != null) {
                            r22.invoke(deeplink2);
                            g03 = G0.f406611a;
                        }
                        if (g03 == null) {
                            r02.invoke(Integer.valueOf(view.getId()));
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        this.f197983g.setOnClickListener(new View.OnClickListener(mnzFloatingFooter, lVar2, lVar, i13) { // from class: xZ.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f442537b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MnzFloatingFooter f442538c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ N f442539d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N f442540e;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f442537b = i13;
                this.f442539d = (N) lVar2;
                this.f442540e = (N) lVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ButtonAction button;
                DeepLink deeplink;
                ButtonAction secondButton;
                DeepLink deeplink2;
                ?? r02 = this.f442539d;
                G0 g03 = null;
                ?? r22 = this.f442540e;
                MnzFloatingFooter mnzFloatingFooter2 = this.f442538c;
                switch (this.f442537b) {
                    case 0:
                        int i132 = com.avito.android.mnz_common.ui.MnzFloatingFooter.f197977j;
                        if (mnzFloatingFooter2 != null && (button = mnzFloatingFooter2.getButton()) != null && (deeplink = button.getDeeplink()) != null) {
                            r22.invoke(deeplink);
                            g03 = G0.f406611a;
                        }
                        if (g03 == null) {
                            r02.invoke(Integer.valueOf(view.getId()));
                            break;
                        }
                        break;
                    default:
                        int i14 = com.avito.android.mnz_common.ui.MnzFloatingFooter.f197977j;
                        if (mnzFloatingFooter2 != null && (secondButton = mnzFloatingFooter2.getSecondButton()) != null && (deeplink2 = secondButton.getDeeplink()) != null) {
                            r22.invoke(deeplink2);
                            g03 = G0.f406611a;
                        }
                        if (g03 == null) {
                            r02.invoke(Integer.valueOf(view.getId()));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public MnzFloatingFooter(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(new d(context, R.style.Theme_DesignSystem_Re23)).inflate(R.layout.mnz_floating_footer_container, (ViewGroup) this, true);
        setOrientation(1);
        this.f197978b = (LinearLayout) findViewById(R.id.mnz_floating_footer_contacts_container);
        this.f197980d = (CircularCounter) findViewById(R.id.mnz_floating_footer_progress);
        this.f197981e = (Button) findViewById(R.id.mnz_floating_footer_button);
        this.f197982f = findViewById(R.id.mnz_floating_footer_button_spacer);
        this.f197983g = (Button) findViewById(R.id.mnz_floating_footer_button2);
        this.f197984h = (Button) findViewById(R.id.mnz_floating_footer_additional_button);
        TextView textView = (TextView) findViewById(R.id.mnz_floating_footer_description);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f197979c = textView;
        TextView textView2 = (TextView) findViewById(R.id.mnz_floating_footer_extra);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        this.f197985i = textView2;
    }
}
