package com.avito.android.advert_core.advert;

import Ca1.ViewOnClickListenerC13236c;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.util.C35835l0;
import j.D;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFlatOneColumnView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/advert/g;", "Lcom/avito/android/advert_core/advert/j;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class g implements j {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f82670g = {m0.f406844a.f(new a0("keyValueViewHolder", "getKeyValueViewHolder(Landroid/view/View;)Lcom/avito/android/advert_core/advert/AdvertDetailsFlatOneColumnView$KeyValueViewHolder;", g.class))};

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final k f82671a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82672b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f82673c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f82674d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    @InterfaceC42156l
    public Integer f82675e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final c f82676f;

    /* compiled from: AdvertDetailsFlatOneColumnView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/g$a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final TextView f82677a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ImageView f82678b;

        public a(@Y61.k TextView textView, @Y61.k ImageView imageView) {
            this.f82677a = textView;
            this.f82678b = imageView;
        }
    }

    /* compiled from: AdvertDetailsFlatOneColumnView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82679a;

        static {
            int[] iArr = new int[AdvertParameters.Button.IconPosition.values().length];
            try {
                iArr[AdvertParameters.Button.IconPosition.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertParameters.Button.IconPosition.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82679a = iArr;
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"com/avito/android/util/J6", "Lkotlin/properties/h;", "Landroid/view/View;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements kotlin.properties.h<View, a> {
        @Override // kotlin.properties.g
        public final Object getValue(Object obj, kotlin.reflect.n nVar) {
            Object tag = ((View) obj).getTag(R.id.key_value_view_holder);
            if (!(tag instanceof a)) {
                tag = null;
            }
            return (a) tag;
        }

        @Override // kotlin.properties.h
        public final void setValue(View view, kotlin.reflect.n nVar, a aVar) {
            view.setTag(R.id.key_value_view_holder, aVar);
        }
    }

    public g(@Y61.k View view, @D int i12, @Y61.l k kVar, boolean z12) {
        ViewGroup viewGroup;
        this.f82671a = kVar;
        this.f82672b = z12;
        this.f82673c = LayoutInflater.from(view.getContext());
        this.f82676f = new c();
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.flat_stub);
        if (viewStub != null) {
            viewStub.setInflatedId(i12);
            viewGroup = (ViewGroup) viewStub.inflate();
        } else {
            viewGroup = (ViewGroup) view.findViewById(i12);
        }
        this.f82674d = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    @Override // com.avito.android.advert_core.advert.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.l java.util.List<com.avito.android.remote.model.AdvertParameters.Parameter> r19, @Y61.k com.avito.android.advert_core.advert.AdvertDetailsFlatViewType r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.advert.g.a(java.util.List, com.avito.android.advert_core.advert.AdvertDetailsFlatViewType, boolean):void");
    }

    @Override // com.avito.android.advert_core.advert.j
    public final void b(@InterfaceC42156l int i12) {
        int childCount;
        this.f82675e = Integer.valueOf(i12);
        ViewGroup viewGroup = this.f82674d;
        if (viewGroup == null || viewGroup.getChildCount() - 1 < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            View childAt = viewGroup.getChildAt(i13);
            TextView textView = null;
            TextView textView2 = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView2 == null) {
                a aVar = (a) this.f82676f.getValue(childAt, f82670g[0]);
                if (aVar != null) {
                    textView = aVar.f82677a;
                }
            } else {
                textView = textView2;
            }
            if (textView != null) {
                textView.setTextColor(i12);
            }
            if (i13 == childCount) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void c(a aVar, String str, String str2, DeepLink deepLink, AdvertParameters.Button button, AdvertDetailsFlatViewType advertDetailsFlatViewType, String str3, boolean z12, boolean z13) {
        String color;
        Integer numA;
        String name;
        Integer numA2;
        AdvertParameters.Button.ButtonIcon icon;
        int length = str.length();
        TextView textView = aVar.f82677a;
        SpannableStringBuilder spannableStringBuilder = length == 0 ? new SpannableStringBuilder(str2) : new SpannableStringBuilder(textView.getContext().getString(R.string.advert_core_advert_details_flat_text, str, str2));
        int length2 = (str.length() == 0 ? -1 : str.length()) + 1;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(f(), textView.getContext())), 0, length2, 33);
        if (deepLink != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.blue, textView.getContext())), length2, spannableStringBuilder.toString().length(), 33);
        }
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new ViewOnClickListenerC13236c(this, str, str2, deepLink, 10));
        if (textView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            AdvertParameters.Button.IconPosition position = (button == null || (icon = button.getIcon()) == null) ? null : icon.getPosition();
            int i12 = position == null ? -1 : b.f82679a[position.ordinal()];
            float f12 = 1.0f;
            if (i12 != -1) {
                if (i12 == 1) {
                    f12 = 0.0f;
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            layoutParams2.weight = f12;
            textView.setLayoutParams(layoutParams2);
        }
        int i13 = button == null ? 8 : 0;
        ImageView imageView = aVar.f82678b;
        imageView.setVisibility(i13);
        AdvertParameters.Button.OwnershipDiscrepancy ownershipDiscrepancy = button != null ? button.getOwnershipDiscrepancy() : null;
        k kVar = this.f82671a;
        if (ownershipDiscrepancy != null) {
            if (!z12) {
                return;
            }
            if (kVar != null) {
                kVar.g0();
            }
        }
        if (z13 && kVar != null) {
            kVar.h2();
        }
        if (button != null) {
            AdvertParameters.Button.ButtonIcon icon2 = button.getIcon();
            int iD2 = (icon2 == null || (name = icon2.getName()) == null || (numA2 = com.avito.android.lib.util.q.a(name)) == null) ? d() : numA2.intValue();
            AdvertParameters.Button.ButtonIcon icon3 = button.getIcon();
            Drawable drawableM = C35835l0.m(imageView.getContext(), iD2, (icon3 == null || (color = icon3.getColor()) == null || (numA = com.avito.android.lib.util.e.a(color)) == null) ? e() : numA.intValue());
            imageView.setImageDrawable(drawableM);
            if (drawableM != null) {
                imageView.setBaseline((int) ((textView.getTextSize() + drawableM.getIntrinsicHeight()) / 2.0f));
            }
            imageView.setOnClickListener(new f(this, button, advertDetailsFlatViewType, str3, 0));
        }
    }

    public int d() {
        return R.attr.ic_help24;
    }

    public int e() {
        return R.attr.warmGray28;
    }

    @InterfaceC42150f
    public int f() {
        return R.attr.gray48;
    }

    public int g() {
        return R.layout.new_key_value;
    }

    public /* synthetic */ g(View view, int i12, k kVar, boolean z12, int i13, C42822w c42822w) {
        this(view, (i13 & 2) != 0 ? R.id.flat_container : i12, (i13 & 4) != 0 ? null : kVar, (i13 & 8) != 0 ? false : z12);
    }
}
