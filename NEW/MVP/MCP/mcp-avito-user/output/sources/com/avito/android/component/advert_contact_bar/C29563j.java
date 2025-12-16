package com.avito.android.component.advert_contact_bar;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.internal.operators.observable.U;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsContactBar.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/j;", "Lcom/avito/android/component/advert_contact_bar/ContactBar;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.component.advert_contact_bar.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29563j implements ContactBar {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f125180a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125181b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f125182c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f125183d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f125184e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TextView f125185f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f125186g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f125187h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public View f125188i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public View f125189j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f125190k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f125191l;

    /* compiled from: AdvertDetailsContactBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.component.advert_contact_bar.j$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ContactBar.Button.Action.Type.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContactBar.Button.Action.Type type = ContactBar.Button.Action.Type.f125058b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AdvertDetailsContactBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/b;", "invoke", "()Lcom/avito/android/component/advert_contact_bar/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.component.advert_contact_bar.j$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<C29555b> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C29555b invoke() {
            return new C29555b(C29563j.this.f125181b);
        }
    }

    public C29563j(@Y61.k View view, boolean z12) {
        this.f125180a = view;
        this.f125181b = z12;
        this.f125182c = view.getContext();
        this.f125183d = (ViewGroup) view.findViewById(R.id.contact_bar_status_container);
        this.f125184e = (TextView) view.findViewById(R.id.contact_bar_text);
        this.f125185f = (TextView) view.findViewById(R.id.contact_bar_hide_phone_text);
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.contact_bar_buttons_container);
        if (linearLayout != null) {
            arrayList.add(linearLayout);
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.contact_bar_buttons_container2);
        if (linearLayout2 != null) {
            arrayList.add(linearLayout2);
        }
        this.f125187h = arrayList;
        this.f125190k = C42727D.c(new b());
        this.f125191l = (TextView) view.findViewById(R.id.contact_bar_rkn_disclaimer);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void T2(boolean z12) {
        Iterator it = this.f125186g.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setClickable(!z12);
        }
        float f12 = z12 ? 0.0f : 1.0f;
        View view = this.f125180a;
        view.setAlpha(f12);
        view.setVisibility(z12 ? 8 : 0);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void W6(boolean z12, boolean z13, boolean z14) {
        Iterator it = this.f125186g.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setClickable(!z12);
        }
        this.f125180a.animate().alpha(z12 ? 0.0f : 1.0f).setDuration(z13 ? 0L : 200L).withStartAction(new com.avito.android.app.coldstart.d(this, 15)).withEndAction(new D.b(5, this, z12)).start();
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void fb(@Y61.l String str) {
        if (str == null || str.length() == 0) {
            jb();
            return;
        }
        pb();
        TextView textView = this.f125184e;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void hide() {
        D6.g(this.f125180a);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> ib(@Y61.k List<? extends ContactBar.ContainerClickType> list) {
        return U.f403867b;
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void jb() {
        D6.w(this.f125184e);
        D6.w(this.f125183d);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void mb(@Y61.k List list, @Y61.k ContactBar.a aVar, @Y61.k C28266e.h hVar) {
        ((C29555b) this.f125190k.getValue()).b(list, hVar, this.f125187h, this.f125182c, this.f125186g);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    @Y61.l
    public final io.reactivex.rxjava3.core.z<G0> nb(boolean z12) {
        return null;
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void ob(@Y61.l String str) {
        TextView textView = this.f125191l;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void pb() {
        D6.H(this.f125183d);
        D6.H(this.f125184e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ff, code lost:
    
        if (r26.size() != 1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0201, code lost:
    
        r1 = kotlin.collections.C42745f0.E(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0207, code lost:
    
        if ((r1 instanceof com.avito.android.component.advert_contact_bar.ContactBar.Button.Action) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0209, code lost:
    
        r1 = (com.avito.android.component.advert_contact_bar.ContactBar.Button.Action) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020d, code lost:
    
        if (r1 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020f, code lost:
    
        r7 = r1.f125043g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0212, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0215, code lost:
    
        if (r7 != com.avito.android.component.advert_contact_bar.ContactBar.Button.Action.Type.f125059c) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0217, code lost:
    
        r1 = r25.f125185f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0219, code lost:
    
        if (r1 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x021b, code lost:
    
        com.avito.android.util.I5.a(r1, r9.getText(com.avito.android.R.string.contact_bar_hide_phone_text), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0226, code lost:
    
        return;
     */
    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qb(@Y61.k java.util.List r26, @Y61.k com.avito.android.component.advert_contact_bar.ContactBar.a r27, @Y61.k com.avito.android.advert_core.contactbar.C28266e.h r28, @Y61.k java.util.List r29, @Y61.l com.avito.android.component.advert_contact_bar.ContactBar.b r30) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.component.advert_contact_bar.C29563j.qb(java.util.List, com.avito.android.component.advert_contact_bar.ContactBar$a, com.avito.android.advert_core.contactbar.e$h, java.util.List, com.avito.android.component.advert_contact_bar.ContactBar$b):void");
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void sb(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, boolean z13, boolean z14) {
        String str4 = z12 ? "●" : "";
        if (str4.length() == 0 && (str3 == null || str3.length() == 0)) {
            jb();
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str4.length() > 0) {
            spannableStringBuilder.append((CharSequence) str4);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.green, this.f125180a.getContext())), 0, 1, 33);
        }
        if (!C43066x.K(str)) {
            spannableStringBuilder.append((CharSequence) str);
        }
        if (str3 != null && !C43066x.K(str3)) {
            if (!C43066x.K(str)) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            spannableStringBuilder.append((CharSequence) (str3 != null ? str3.toLowerCase(Locale.ROOT) : null));
        }
        pb();
        TextView textView = this.f125184e;
        if (textView == null) {
            return;
        }
        textView.setText(spannableStringBuilder);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void show() {
        D6.H(this.f125180a);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final int va() {
        View view = (View) C42745f0.S(this.f125186g);
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return view.getHeight() + iArr[1];
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
}
