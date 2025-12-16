package com.avito.android.component.advert_contact_bar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.internal.operators.observable.U;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFloatingContactBar.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/w;", "Lcom/avito/android/component/advert_contact_bar/ContactBar;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements ContactBar {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f125199a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125200b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125201c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125202d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f125203e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f125204f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.delivery_combined_buttons_util.c f125205g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f125206h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Boolean f125207i;

    public w(@Y61.k View view, boolean z12, boolean z13, boolean z14) {
        this.f125199a = view;
        this.f125200b = z12;
        this.f125201c = z13;
        this.f125202d = z14;
        this.f125203e = view.getContext();
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.contact_bar_buttons_container);
        if (linearLayout != null) {
            arrayList.add(linearLayout);
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.contact_bar_buttons_container2);
        if (linearLayout2 != null) {
            arrayList.add(linearLayout2);
        }
        this.f125204f = arrayList;
        this.f125206h = (LinearLayout) view.findViewById(R.id.contact_bar_bottom_container);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void T2(boolean z12) {
        if (z12) {
            hide();
        } else {
            show();
        }
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void W6(boolean z12, boolean z13, boolean z14) {
        if (kotlin.jvm.internal.L.f(this.f125207i, Boolean.valueOf(z12))) {
            return;
        }
        View view = this.f125199a;
        if (view.getHeight() == 0 || !D6.y(view)) {
            return;
        }
        this.f125207i = Boolean.valueOf(z12);
        ViewPropertyAnimator duration = view.animate().translationY(z12 ? 0.0f : view.getHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin).setDuration(z13 ? 0L : 100L);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void hide() {
        D6.w(this.f125199a);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> ib(@Y61.k List<? extends ContactBar.ContainerClickType> list) {
        return U.f403867b;
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    @Y61.l
    public final io.reactivex.rxjava3.core.z<G0> nb(boolean z12) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x030a, code lost:
    
        if (r4 < 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x030c, code lost:
    
        com.avito.android.component.advert_contact_bar.C29568o.f125193a.getClass();
        r3 = com.avito.android.component.advert_contact_bar.C29568o.a((com.avito.android.remote.model.insights.Insight) r3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0317, code lost:
    
        if (r3 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x031a, code lost:
    
        if (r4 <= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x031c, code lost:
    
        com.avito.android.util.D6.c(r3, null, java.lang.Integer.valueOf(com.avito.android.component.advert_contact_bar.C29568o.f125194b), null, null, 13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x032b, code lost:
    
        r8.addView(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x032e, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0330, code lost:
    
        kotlin.collections.C42745f0.H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0334, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0335, code lost:
    
        r2.addView(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0338, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x033e, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.TextView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0245, code lost:
    
        r2 = r29.f125206h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0247, code lost:
    
        if (r2 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x024b, code lost:
    
        if (r34 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024d, code lost:
    
        com.avito.android.util.D6.w(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0252, code lost:
    
        r2.removeAllViews();
        r3 = r34.a();
        r4 = android.view.LayoutInflater.from(r15).inflate(com.avito.android.R.layout.advert_details_contact_bar_text, (android.view.ViewGroup) null);
        r5 = r4.findViewById(com.avito.android.R.id.adv_det_contact_bar_text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x026c, code lost:
    
        if (r5 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026e, code lost:
    
        r5 = (android.widget.TextView) r5;
        r8 = new android.widget.LinearLayout(new androidx.appcompat.view.d(r15, com.avito.android.R.style.Theme_DesignSystem_Re23));
        r8.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        r8.setOrientation(1);
        r8.setGravity(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0290, code lost:
    
        if ((r34 instanceof com.avito.android.component.advert_contact_bar.ContactBar.b.a) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0292, code lost:
    
        r1 = (com.avito.android.component.advert_contact_bar.ContactBar.b.a) r34;
        com.avito.android.util.text.j.a(r5, r1.f125134b, null);
        r4.setAlpha(0.0f);
        r2.addView(r4, new android.widget.LinearLayout.LayoutParams(-1, -2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02a7, code lost:
    
        if (r3 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02a9, code lost:
    
        com.avito.android.util.D6.c(r4, null, null, null, java.lang.Integer.valueOf(com.avito.android.util.y6.b(6)), 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02bf, code lost:
    
        r4.animate().alpha(1.0f).setStartDelay(r1.f125135c).setDuration(400).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).start();
        com.avito.android.util.D6.H(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02e7, code lost:
    
        if ((r34 instanceof com.avito.android.component.advert_contact_bar.ContactBar.b.C3717b) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02e9, code lost:
    
        if (r3 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02eb, code lost:
    
        com.avito.android.util.D6.w(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ef, code lost:
    
        com.avito.android.util.D6.H(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f2, code lost:
    
        r8.removeAllViews();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f5, code lost:
    
        if (r3 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02f7, code lost:
    
        r1 = r3.iterator();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0302, code lost:
    
        if (r1.hasNext() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0304, code lost:
    
        r3 = r1.next();
        r5 = r4 + 1;
     */
    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qb(@Y61.k java.util.List r30, @Y61.k com.avito.android.component.advert_contact_bar.ContactBar.a r31, @Y61.k com.avito.android.advert_core.contactbar.C28266e.h r32, @Y61.k java.util.List r33, @Y61.l com.avito.android.component.advert_contact_bar.ContactBar.b r34) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.component.advert_contact_bar.w.qb(java.util.List, com.avito.android.component.advert_contact_bar.ContactBar$a, com.avito.android.advert_core.contactbar.e$h, java.util.List, com.avito.android.component.advert_contact_bar.ContactBar$b):void");
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void show() {
        D6.H(this.f125199a);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final int va() {
        return 0;
    }

    public /* synthetic */ w(View view, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(view, z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? true : z14);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void jb() {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void pb() {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void fb(@Y61.l String str) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void hb(@Y61.l Y41.l<? super Integer, G0> lVar) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void kb(@InterfaceC42150f int i12) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void lb(@Y61.l List<SellerInfoAdvantage> list) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void ob(@Y61.l String str) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void rb(@Y61.l com.avito.android.image_loader.a aVar) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void w(@Y61.l AttributedText attributedText) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void S2(@Y61.l String str, @Y61.l Float f12) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void gb(@Y61.l String str, @Y61.l String str2, @Y61.l UniversalColor universalColor) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void mb(@Y61.k List list, @Y61.k ContactBar.a aVar, @Y61.k C28266e.h hVar) {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void sb(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, boolean z13, boolean z14) {
    }
}
