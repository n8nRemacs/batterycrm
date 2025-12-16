package com.avito.android.phone_protection_info.item;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j;
import com.avito.android.phone_protection_info.item.b;
import com.avito.android.util.D6;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneProtectionDisclaimerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/phone_protection_info/item/d;", "Lcom/avito/android/phone_protection_info/item/c;", "Lcom/avito/android/serp/c;", "_avito_phone-protection-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends com.avito.android.serp.c implements com.avito.android.phone_protection_info.item.c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f216021g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f216022b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f216023c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f216024d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f216025e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f216026f;

    /* compiled from: PhoneProtectionDisclaimerItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<TextView> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) d.this.f216023c.findViewById(R.id.phone_protection_banner_link);
        }
    }

    /* compiled from: PhoneProtectionDisclaimerItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<TextView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) d.this.f216023c.findViewById(R.id.phone_protection_banner_text);
        }
    }

    /* compiled from: PhoneProtectionDisclaimerItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<TextView> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) d.this.f216023c.findViewById(R.id.phone_protection_banner_title);
        }
    }

    public d(@k View view) {
        super(view);
        this.f216022b = view;
        View viewFindViewById = view.findViewById(R.id.phone_protection_info_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f216023c = (Banner) viewFindViewById;
        this.f216024d = C42727D.c(new c());
        this.f216025e = C42727D.c(new b());
        this.f216026f = C42727D.c(new a());
    }

    @Override // com.avito.android.phone_protection_info.item.c
    public final void Hk(@k b.a aVar, @k l<? super DeepLink, G0> lVar) {
        TextView textView = (TextView) this.f216024d.getValue();
        View view = this.f216022b;
        if (textView != null) {
            textView.setText(aVar.f216015a.k0(view.getContext()));
        }
        TextView textView2 = (TextView) this.f216025e.getValue();
        if (textView2 != null) {
            textView2.setText(aVar.f216016b.k0(view.getContext()));
        }
        TextView textView3 = (TextView) this.f216026f.getValue();
        if (textView3 != null) {
            textView3.setText(aVar.f216017c.k0(view.getContext()));
        }
        this.f216023c.setOnClickListener(new j(5, lVar, aVar));
    }

    @Override // com.avito.android.phone_protection_info.item.c
    public final void ur(@k b.C6479b c6479b) {
        Banner banner = this.f216023c;
        Resources resources = banner.getResources();
        int i12 = c6479b.f216019a;
        D6.c(banner, Integer.valueOf(kotlin.math.b.b(resources.getDimension(i12))), null, Integer.valueOf(kotlin.math.b.b(banner.getResources().getDimension(i12))), null, 10);
        Integer num = c6479b.f216020b;
        if (num != null) {
            D6.c(this.f216023c, null, Integer.valueOf(D6.t(this.f216022b, num.intValue())), null, null, 13);
        }
    }
}
