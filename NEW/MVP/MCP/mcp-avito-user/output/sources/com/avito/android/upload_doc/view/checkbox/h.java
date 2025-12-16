package com.avito.android.upload_doc.view.checkbox;

import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.remote.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf.edit_info.item.button.i;
import com.avito.android.upload_doc.mvi.interactor.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: GigUploadDocCheckboxView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/view/checkbox/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/upload_doc/view/checkbox/g;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f306991j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f306992b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GigUploadDocDeeplink.FlowType f306993c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f306994d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f306995e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final E f306996f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final H f306997g;

    /* renamed from: h, reason: collision with root package name */
    public final ListItemCheckbox f306998h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f306999i;

    /* compiled from: GigUploadDocCheckboxView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CharSequence f307001m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharSequence charSequence) {
            super(0);
            this.f307001m = charSequence;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            h hVar = h.this;
            hVar.f306995e.c(new LG0.a(hVar.f306996f.a(), hVar.f306997g.getF253025a(), m.a(hVar.f306993c), this.f307001m.toString()));
            return Boolean.FALSE;
        }
    }

    /* compiled from: GigUploadDocCheckboxView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f307002l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public h(@k View view, @k GigUploadDocDeeplink.FlowType flowType, @k com.avito.android.util.text.a aVar, @k InterfaceC28373a interfaceC28373a, @k E e12, @k H h12) {
        super(view);
        this.f306992b = view;
        this.f306993c = flowType;
        this.f306994d = aVar;
        this.f306995e = interfaceC28373a;
        this.f306996f = e12;
        this.f306997g = h12;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.checkbox_root);
        this.f306998h = (ListItemCheckbox) view.findViewById(R.id.checkbox_item);
        this.f306999i = (TextView) view.findViewById(R.id.checkbox_text);
        linearLayout.setOnClickListener(new i(this, 20));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.avito.android.upload_doc.view.checkbox.h$b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.avito.android.upload_doc.view.checkbox.h$a] */
    @Override // com.avito.android.upload_doc.view.checkbox.g
    public final void lQ(@k GigUploadDocCheckboxItem gigUploadDocCheckboxItem, @k l<? super Boolean, G0> lVar) {
        l0.h hVar = new l0.h();
        hVar.f406842b = b.f307002l;
        com.avito.android.auction.details.i iVar = new com.avito.android.auction.details.i(hVar, 15);
        AttributedText attributedText = gigUploadDocCheckboxItem.f306971c;
        attributedText.setOnUrlClickListener(iVar);
        CharSequence charSequenceC = this.f306994d.c(this.f306992b.getContext(), attributedText);
        if (charSequenceC == null) {
            charSequenceC = "";
        }
        hVar.f406842b = new a(charSequenceC);
        TextView textView = this.f306999i;
        textView.setText(charSequenceC);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f306998h.setState((kV.b) new kV.c("", null, null, null, null, false, null, new ToggleState(lVar, false, false, false, gigUploadDocCheckboxItem.f306972d ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 14, null), false, false, null, null, 3934, null));
    }
}
