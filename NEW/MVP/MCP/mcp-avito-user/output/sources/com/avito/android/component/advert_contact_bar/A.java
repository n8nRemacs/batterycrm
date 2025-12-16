package com.avito.android.component.advert_contact_bar;

import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.dynamicanimation.animation.c;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.credit_broker.InstallmentsImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.internal.operators.observable.U;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFloatingRedesignContactBar.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/A;", "Lcom/avito/android/component/advert_contact_bar/ContactBar;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A implements ContactBar {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f125018a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125019b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125020c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125021d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125022e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125023f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f125024g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f125025h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f125026i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f125027j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f125028k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.delivery_combined_buttons_util.c f125029l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Boolean f125030m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f125031n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Switcher f125032o;

    /* compiled from: AdvertDetailsFloatingRedesignContactBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125033a;

        static {
            int[] iArr = new int[ContactBar.Alignment.values().length];
            try {
                iArr[ContactBar.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactBar.Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f125033a = iArr;
        }
    }

    /* compiled from: AdvertDetailsFloatingRedesignContactBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/b;", "invoke", "()Lcom/avito/android/component/advert_contact_bar/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<C29555b> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f125034l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C29555b invoke() {
            return new C29555b(true);
        }
    }

    public A(@Y61.k View view, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f125018a = view;
        this.f125019b = z12;
        this.f125020c = z13;
        this.f125021d = z14;
        this.f125022e = z15;
        this.f125023f = z16;
        this.f125024g = view.getContext();
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.contact_bar_buttons_container);
        if (linearLayout != null) {
            arrayList.add(linearLayout);
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.contact_bar_buttons_container2);
        if (linearLayout2 != null) {
            arrayList.add(linearLayout2);
        }
        this.f125025h = arrayList;
        this.f125026i = (LinearLayout) view.findViewById(R.id.contact_bar_installments_button_container);
        this.f125027j = (LinearLayout) view.findViewById(R.id.floating_delivery_info_container);
        this.f125028k = (LinearLayout) view.findViewById(R.id.contact_bar_bottom_container);
        this.f125031n = C42727D.c(b.f125034l);
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 5));
    }

    public static com.avito.android.lib.design.text_view.a a(AttributedText attributedText, androidx.appcompat.view.d dVar, LinearLayout.LayoutParams layoutParams) {
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(dVar, null, 0, 0, 14, null);
        aVar.setLayoutParams(layoutParams);
        aVar.setEllipsize(TextUtils.TruncateAt.END);
        aVar.setMaxLines(1);
        D6.c(aVar, Integer.valueOf(y6.b(4)), null, null, null, 14);
        com.avito.android.util.text.j.a(aVar, attributedText, null);
        return aVar;
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
    public final void W6(final boolean z12, boolean z13, boolean z14) {
        if (kotlin.jvm.internal.L.f(this.f125030m, Boolean.valueOf(z12))) {
            return;
        }
        View view = this.f125018a;
        if (view.getHeight() == 0 || !D6.y(view)) {
            return;
        }
        this.f125030m = Boolean.valueOf(z12);
        if (!z14) {
            ViewPropertyAnimator duration = view.animate().translationY(z12 ? 0.0f : view.getHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin).setDuration(z13 ? 0L : 100L);
            duration.setInterpolator(new LinearInterpolator());
            duration.start();
            return;
        }
        float height = z12 ? 0.0f : view.getHeight();
        if (z12) {
            view.setTranslationY(view.getHeight());
        }
        androidx.dynamicanimation.animation.i iVar = new androidx.dynamicanimation.animation.i(view, androidx.dynamicanimation.animation.c.f46024m, height);
        androidx.dynamicanimation.animation.j jVar = new androidx.dynamicanimation.animation.j(height);
        jVar.a(0.6f);
        jVar.b(300.0f);
        iVar.f46047t = jVar;
        if (z13) {
            iVar.i();
        } else {
            iVar.b(new c.q() { // from class: com.avito.android.component.advert_contact_bar.y
                @Override // androidx.dynamicanimation.animation.c.q
                public final void a(androidx.dynamicanimation.animation.c cVar, boolean z15, float f12, float f13) {
                    if (z12) {
                        return;
                    }
                    this.f125018a.setVisibility(8);
                }
            });
            iVar.j();
        }
    }

    public final LinearLayout b() {
        LinearLayout linearLayout = new LinearLayout(this.f125024g);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        D6.c(linearLayout, null, null, null, Integer.valueOf(y6.b(10)), 7);
        return linearLayout;
    }

    public final SimpleDraweeView c(InstallmentsImage installmentsImage) {
        if (installmentsImage == null) {
            return null;
        }
        Size size = installmentsImage.getSize();
        int width = size != null ? size.getWidth() : 20;
        Size size2 = installmentsImage.getSize();
        int height = size2 != null ? size2.getHeight() : 20;
        UniversalImage image = installmentsImage.getImage();
        Context context = this.f125024g;
        Image imageDependsOnTheme = image != null ? UniversalImageKt.getImageDependsOnTheme(image, com.avito.android.lib.util.darkTheme.c.b(context)) : null;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setLayoutParams(new LinearLayout.LayoutParams(y6.b(width), y6.b(height)));
        D6.c(simpleDraweeView, Integer.valueOf(y6.b(5)), null, null, null, 14);
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnTheme), null, null, null, 14);
        return simpleDraweeView;
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void hide() {
        D6.w(this.f125018a);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> ib(@Y61.k List<? extends ContactBar.ContainerClickType> list) {
        return U.f403867b;
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void mb(@Y61.k List list, @Y61.k ContactBar.a aVar, @Y61.k C28266e.h hVar) {
        D6.w(this.f125027j);
        ((C29555b) this.f125031n.getValue()).b(list, hVar, this.f125025h, this.f125024g, null);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    @Y61.l
    public final io.reactivex.rxjava3.core.z<G0> nb(boolean z12) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0634 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x064a  */
    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qb(@Y61.k java.util.List r35, @Y61.k com.avito.android.component.advert_contact_bar.ContactBar.a r36, @Y61.k com.avito.android.advert_core.contactbar.C28266e.h r37, @Y61.k java.util.List r38, @Y61.l com.avito.android.component.advert_contact_bar.ContactBar.b r39) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.component.advert_contact_bar.A.qb(java.util.List, com.avito.android.component.advert_contact_bar.ContactBar$a, com.avito.android.advert_core.contactbar.e$h, java.util.List, com.avito.android.component.advert_contact_bar.ContactBar$b):void");
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void show() {
        D6.H(this.f125018a);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final int va() {
        return 0;
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void jb() {
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void pb() {
    }

    public /* synthetic */ A(View view, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i12, C42822w c42822w) {
        this(view, z12, z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15, (i12 & 32) != 0 ? true : z16);
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
    public final void sb(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, boolean z13, boolean z14) {
    }
}
