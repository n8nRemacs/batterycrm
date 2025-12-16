package com.avito.android.sx_address.new_address.view;

import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.sx_address.new_address.domain.HideAddress;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AddressItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/c;", "Lcom/avito/android/sx_address/new_address/view/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.new_address.view.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35196c implements InterfaceC35194a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f293877a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f293878b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f293879c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f293880d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f293881e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Switcher f293882f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f293883g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public N f293884h;

    /* compiled from: AddressItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.view.c$a */
    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            boolean z12;
            C35196c c35196c = C35196c.this;
            Editable editableM53getText = c35196c.f293879c.m53getText();
            Input input = c35196c.f293879c;
            if (editableM53getText == null || C43066x.K(editableM53getText)) {
                Input.f179303W.getClass();
                input.setState(Input.f179305b0);
                z12 = true;
            } else {
                Input.f179303W.getClass();
                input.setState(Input.f179304a0);
                z12 = false;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: AddressItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.new_address.view.c$b */
    public static final class b extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f293886l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public C35196c(@Y61.k View view) {
        this.f293877a = view;
        View viewFindViewById = view.findViewById(R.id.header_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293878b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.address_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f293879c = (Input) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293880d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.hide_address_toggle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f293881e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.hide_switcher);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f293882f = (Switcher) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.hide_text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293883g = (TextView) viewFindViewById6;
        this.f293884h = b.f293886l;
    }

    public final void a(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, boolean z12, @Y61.l HideAddress hideAddress, @Y61.k Y41.l<? super String, G0> lVar) throws Resources.NotFoundException {
        String str4;
        this.f293881e.setVisibility(hideAddress != null ? 0 : 8);
        Switcher switcher = this.f293882f;
        if (hideAddress != null) {
            switcher.setChecked(hideAddress.f293616d);
            I5.a(this.f293883g, hideAddress.f293615c, false);
        }
        this.f293878b.setText(str);
        Input input = this.f293879c;
        Input.t(input, str2, false, 6);
        input.setEnabled(z12);
        input.setClearButton(z12);
        input.setClearButtonVisibleUnfocused(z12);
        I5.a(this.f293880d, str3, false);
        this.f293884h = new a();
        if (hideAddress == null || (str4 = hideAddress.f293614b) == null) {
            return;
        }
        switcher.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(str4, lVar));
    }
}
