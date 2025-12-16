package com.avito.android.publish.items.iac_for_pro;

import Au.C13079a;
import Y41.l;
import Y61.k;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacForProItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/iac_for_pro/i;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f236924h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemSwitcher f236925b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f236926c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f236927d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f236928e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f236929f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public N f236930g;

    /* compiled from: IacForProItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro/j$a;", "", "<init>", "()V", "", "TOP_PADDING", "I", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacForProItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f236931l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: IacForProItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f236932l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.iac_for_pro_banner_current_device_switcher);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewFindViewById;
        this.f236925b = listItemSwitcher;
        View viewFindViewById2 = view.findViewById(R.id.iac_for_pro_banner);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        Banner banner = (Banner) viewFindViewById2;
        this.f236926c = banner;
        View viewFindViewById3 = view.findViewById(R.id.iac_for_pro_banner_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f236927d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iac_for_pro_banner_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f236928e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.iac_for_pro_banner_info_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById5;
        this.f236929f = textView;
        this.f236930g = b.f236931l;
        listItemSwitcher.e(new C13079a(this, 9));
        banner.getThemedContext();
        String string = view.getContext().getString(R.string.iac_for_pro_link_underlined);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new UnderlineSpan(), 0, string.length(), 0);
        textView.setText(spannableString);
    }

    @Override // com.avito.android.publish.items.iac_for_pro.i
    public final void C7(boolean z12) {
        N n12 = this.f236930g;
        this.f236930g = c.f236932l;
        this.f236925b.setChecked(z12);
        this.f236930g = n12;
    }

    @Override // com.avito.android.publish.items.iac_for_pro.i
    public final void Ck() {
        Banner banner = this.f236926c;
        D6.b(banner, 0, Integer.valueOf(D6.i(6, banner.getContext())), 0, 0);
    }

    @Override // com.avito.android.publish.items.iac_for_pro.i
    public final void et(@k Y41.a<G0> aVar) {
        TextView textView = this.f236929f;
        D6.H(textView);
        textView.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(14, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.items.iac_for_pro.i
    public final void mH(@k l<? super Boolean, G0> lVar) {
        this.f236930g = (N) lVar;
    }

    @Override // com.avito.android.publish.items.iac_for_pro.i
    public final void me(@k String str) {
        this.f236925b.setTitle(str);
    }

    @Override // com.avito.android.publish.items.iac_for_pro.i
    public final void setText(@k String str) {
        this.f236928e.setText(str);
    }

    @Override // com.avito.android.publish.items.iac_for_pro.i
    public final void setTitle(@k String str) {
        this.f236927d.setText(str);
    }
}
