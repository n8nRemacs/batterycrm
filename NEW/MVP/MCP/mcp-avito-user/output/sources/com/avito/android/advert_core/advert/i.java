package com.avito.android.advert_core.advert;

import Ca1.ViewOnClickListenerC13236c;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_core.KeyValue;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42156l;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFlatView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/i;", "Lcom/avito/android/advert_core/advert/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final k f82680a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82681b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f82682c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f82683d;

    /* renamed from: e, reason: collision with root package name */
    public final int f82684e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    @InterfaceC42156l
    public Integer f82685f;

    /* compiled from: AdvertDetailsFlatView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertParameters.Button f82686l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ i f82687m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsFlatViewType f82688n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f82689o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertParameters.Button button, i iVar, AdvertDetailsFlatViewType advertDetailsFlatViewType, String str) {
            super(0);
            this.f82686l = button;
            this.f82687m = iVar;
            this.f82688n = advertDetailsFlatViewType;
            this.f82689o = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            k kVar;
            AdvertParameters.Button button = this.f82686l;
            if (button != null && (kVar = this.f82687m.f82680a) != null) {
                kVar.E(button, this.f82688n, this.f82689o);
            }
            return G0.f406611a;
        }
    }

    public i(View view, int i12, k kVar, boolean z12, boolean z13, int i13, C42822w c42822w) {
        ViewGroup viewGroup;
        i12 = (i13 & 2) != 0 ? R.id.flat_container : i12;
        kVar = (i13 & 4) != 0 ? null : kVar;
        z12 = (i13 & 8) != 0 ? false : z12;
        z13 = (i13 & 16) != 0 ? false : z13;
        this.f82680a = kVar;
        this.f82681b = z13;
        this.f82682c = LayoutInflater.from(view.getContext());
        this.f82684e = z12 ? R.layout.rds_key_value : R.layout.key_value;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.flat_stub);
        if (viewStub != null) {
            viewStub.setInflatedId(i12);
            viewGroup = (ViewGroup) viewStub.inflate();
        } else {
            viewGroup = (ViewGroup) view.findViewById(i12);
        }
        this.f82683d = viewGroup;
    }

    @Override // com.avito.android.advert_core.advert.j
    public final void a(@Y61.l List<AdvertParameters.Parameter> list, @Y61.k AdvertDetailsFlatViewType advertDetailsFlatViewType, boolean z12) {
        ViewGroup viewGroup = this.f82683d;
        if (list == null || list.isEmpty()) {
            if (viewGroup != null) {
                D6.w(viewGroup);
                return;
            }
            return;
        }
        if (viewGroup == null) {
            return;
        }
        D6.H(viewGroup);
        int i12 = 0;
        for (AdvertParameters.Parameter parameter : list) {
            String description = parameter.getDescription();
            if (description != null) {
                View childAt = viewGroup.getChildAt(i12);
                KeyValue keyValue = childAt instanceof KeyValue ? (KeyValue) childAt : null;
                if (keyValue != null) {
                    c(keyValue, parameter.getTitle(), description, parameter.getDeepLink(), parameter.getButton(), advertDetailsFlatViewType, parameter.getAttributeId());
                } else {
                    String title = parameter.getTitle();
                    DeepLink deepLink = parameter.getDeepLink();
                    AdvertParameters.Button button = parameter.getButton();
                    String attributeId = parameter.getAttributeId();
                    KeyValue keyValue2 = (KeyValue) this.f82682c.inflate(this.f82684e, viewGroup, false);
                    if (this.f82681b) {
                        TextView textView = keyValue2.f82418r;
                        if (textView == null) {
                            textView = null;
                        }
                        textView.setMaxLines(Integer.MAX_VALUE);
                    }
                    c(keyValue2, title, description, deepLink, button, advertDetailsFlatViewType, attributeId);
                    Integer num = this.f82685f;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        TextView textView2 = keyValue2.f82417q;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        textView2.setTextColor(iIntValue);
                        TextView textView3 = keyValue2.f82418r;
                        (textView3 != null ? textView3 : null).setTextColor(iIntValue);
                    }
                    viewGroup.addView(keyValue2);
                }
                i12++;
            }
        }
        if (i12 < viewGroup.getChildCount()) {
            viewGroup.removeViews(i12, viewGroup.getChildCount() - i12);
        }
    }

    @Override // com.avito.android.advert_core.advert.j
    public final void b(@InterfaceC42156l int i12) {
        int childCount;
        this.f82685f = Integer.valueOf(i12);
        ViewGroup viewGroup = this.f82683d;
        if (viewGroup == null || viewGroup.getChildCount() - 1 < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt instanceof KeyValue) {
                KeyValue keyValue = (KeyValue) childAt;
                Integer num = this.f82685f;
                if (num != null) {
                    int iIntValue = num.intValue();
                    TextView textView = keyValue.f82417q;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setTextColor(iIntValue);
                    TextView textView2 = keyValue.f82418r;
                    (textView2 != null ? textView2 : null).setTextColor(iIntValue);
                }
            }
            if (i13 == childCount) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void c(KeyValue keyValue, String str, String str2, DeepLink deepLink, AdvertParameters.Button button, AdvertDetailsFlatViewType advertDetailsFlatViewType, String str3) {
        Drawable drawableM;
        String color;
        Integer numA;
        String name;
        Integer numA2;
        if (deepLink != null) {
            keyValue.setTextAsLink(str2);
        } else {
            TextView textView = keyValue.f82418r;
            if (textView == null) {
                textView = null;
            }
            textView.setText(str2);
            TextView textView2 = keyValue.f82418r;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setTextColor(C35835l0.d(R.attr.black, keyValue.getContext()));
        }
        keyValue.setTitle(str);
        keyValue.setOnClickListener(new ViewOnClickListenerC13236c(this, str, str2, deepLink, 11));
        if (button != null) {
            AdvertParameters.Button.ButtonIcon icon = button.getIcon();
            int iIntValue = (icon == null || (name = icon.getName()) == null || (numA2 = com.avito.android.lib.util.q.a(name)) == null) ? R.attr.ic_help24 : numA2.intValue();
            AdvertParameters.Button.ButtonIcon icon2 = button.getIcon();
            drawableM = C35835l0.m(keyValue.getContext(), iIntValue, (icon2 == null || (color = icon2.getColor()) == null || (numA = com.avito.android.lib.util.e.a(color)) == null) ? R.attr.warmGray28 : numA.intValue());
        } else {
            drawableM = null;
        }
        a aVar = new a(button, this, advertDetailsFlatViewType, str3);
        TextView textView3 = keyValue.f82418r;
        if (textView3 == null) {
            textView3 = null;
        }
        I5.d(textView3, null, drawableM, 11);
        TextView textView4 = keyValue.f82418r;
        I5.b(textView4 != null ? textView4 : null, aVar);
    }
}
