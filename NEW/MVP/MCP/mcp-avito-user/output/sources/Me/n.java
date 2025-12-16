package Me;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.generic.RoundingParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeBrokerImageBinder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMe/n;", "", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutInflater f10959a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10960b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10962d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public List<Image> f10963e;

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f10965c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f10966d;

        public a(FrameLayout frameLayout, List list) {
            this.f10965c = frameLayout;
            this.f10966d = list;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            n.this.a(this.f10965c, this.f10966d);
        }
    }

    public n(@Y61.k LayoutInflater layoutInflater, int i12, int i13, int i14) {
        this.f10959a = layoutInflater;
        this.f10960b = i12;
        this.f10961c = i13;
        this.f10962d = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(FrameLayout frameLayout, List<Image> list) {
        Iterator it;
        int i12;
        boolean z12;
        boolean z13;
        if (L.f(this.f10963e, list)) {
            return;
        }
        List<Image> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            D6.w(frameLayout);
            return;
        }
        if (D6.s(frameLayout) == 0) {
            frameLayout.addOnLayoutChangeListener(new a(frameLayout, list));
            return;
        }
        D6.H(frameLayout);
        int width = frameLayout.getWidth();
        int i13 = this.f10960b;
        int i14 = this.f10961c;
        int i15 = i13 - i14;
        int i16 = width - i14;
        int i17 = (i16 - (i16 % i15)) / i15;
        boolean z14 = false;
        boolean z15 = i17 < list.size() || list.size() > 3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LayoutInflater layoutInflater = this.f10959a;
        if (z15) {
            int iMax = Math.max(list.size() - i17, list.size() - 3);
            View viewInflate = layoutInflater.inflate(R.layout.advert_details_auto_loans_counter, (ViewGroup) frameLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.text_count);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            textView.setText(textView.getResources().getString(R.string.auto_loans_icon_counter, Integer.valueOf(iMax)));
            arrayList.add(viewInflate);
        }
        int iMin = Math.min(list.size(), i17);
        Iterator it2 = C42745f0.q0(list.subList(0, iMin <= 3 ? iMin : 3)).iterator();
        int i18 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                C42745f0.H0();
                throw null;
            }
            Image image = (Image) next;
            int i22 = z15 ? i15 * i19 : i18 * i15;
            int i23 = this.f10960b;
            Uri uriD = C35829k2.b(image, i23, i23, 0.0f, 1, 44).d();
            if (uriD == null) {
                it = it2;
                i12 = i15;
                z12 = z15;
            } else {
                View viewInflate2 = layoutInflater.inflate(R.layout.advert_details_auto_loans_bank_icon, frameLayout, z14);
                ViewGroup.LayoutParams layoutParams = viewInflate2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(i22);
                viewInflate2.setLayoutParams(marginLayoutParams);
                simpleDraweeView = viewInflate2 instanceof SimpleDraweeView ? (SimpleDraweeView) viewInflate2 : null;
                if (simpleDraweeView != null) {
                    GW0.b bVar = new GW0.b(simpleDraweeView.getResources());
                    RoundingParams roundingParams = new RoundingParams();
                    roundingParams.f340152b = true;
                    it = it2;
                    int iD2 = C35835l0.d(R.attr.gray4, simpleDraweeView.getContext());
                    float f12 = this.f10962d;
                    if (f12 >= 0.0f) {
                        i12 = i15;
                        z12 = z15;
                        z13 = true;
                    } else {
                        i12 = i15;
                        z12 = z15;
                        z13 = false;
                    }
                    com.facebook.common.internal.o.b("the border width cannot be < 0", z13);
                    roundingParams.f340155e = f12;
                    roundingParams.f340156f = iD2;
                    bVar.f6552q = roundingParams;
                    simpleDraweeView.setHierarchy(bVar.a());
                    ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                    aVarA.f(uriD);
                    aVarA.c();
                } else {
                    it = it2;
                    i12 = i15;
                    z12 = z15;
                }
                simpleDraweeView = viewInflate2;
            }
            if (simpleDraweeView != null) {
                arrayList2.add(simpleDraweeView);
            }
            i18 = i19;
            it2 = it;
            i15 = i12;
            z15 = z12;
            z14 = false;
        }
        frameLayout.removeAllViews();
        frameLayout.post(new m(this, arrayList, arrayList2, frameLayout));
        this.f10963e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Me.n] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<com.avito.android.remote.model.Image>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public final void b(@Y61.k FrameLayout frameLayout, @Y61.l List<UniversalImage> list, boolean z12, @Y61.l List<Image> list2) {
        if (list != null) {
            list2 = new ArrayList<>();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme((UniversalImage) it.next(), z12);
                if (imageDependsOnTheme != null) {
                    list2.add(imageDependsOnTheme);
                }
            }
        }
        a(frameLayout, list2);
    }
}
