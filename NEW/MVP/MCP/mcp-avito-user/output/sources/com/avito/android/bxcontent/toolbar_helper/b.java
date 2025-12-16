package com.avito.android.bxcontent.toolbar_helper;

import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.ToolbarShareButton;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.search_view.k;
import com.avito.android.ui.status_bar.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import nl.C44441d;
import nl.InterfaceC44440c;

/* compiled from: ColoredToolbarPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/toolbar_helper/b;", "Lcom/avito/android/bxcontent/toolbar_helper/a;", "<init>", "()V", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.bxcontent.toolbar_helper.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public ToolbarConfig f113001b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public ToolbarShareButton f113002c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public InterfaceC44440c f113003d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f113005f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f113007h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f113008i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Z1<d> f113009j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final n2<d> f113010k;

    /* renamed from: e, reason: collision with root package name */
    public float f113004e = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113006g = true;

    /* compiled from: ColoredToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/toolbar_helper/b$a;", "", "<init>", "()V", "", "MIDDLE_SCROLL_WIDGET_VALUE", "D", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b() {
        Z1<d> z1A = p2.a(null);
        this.f113009j = z1A;
        this.f113010k = z1A;
    }

    @Override // com.avito.android.bxcontent.toolbar_helper.a
    public final void D(@l Float f12, @l Boolean bool) {
        if (bool != null) {
            this.f113007h = bool.booleanValue();
        }
        c(f12 != null ? f12.floatValue() : this.f113004e);
    }

    @Override // com.avito.android.bxcontent.toolbar_helper.a
    public final void G(@l ToolbarConfig toolbarConfig, @l ToolbarShareButton toolbarShareButton, boolean z12) {
        if (toolbarConfig != null) {
            this.f113001b = toolbarConfig;
            this.f113002c = toolbarShareButton;
            this.f113008i = z12;
            c(this.f113004e);
            return;
        }
        this.f113001b = null;
        this.f113002c = null;
        this.f113008i = false;
        a();
    }

    public final void a() {
        this.f113009j.setValue(null);
        InterfaceC44440c interfaceC44440c = this.f113003d;
        if (interfaceC44440c != null) {
            interfaceC44440c.b();
        }
    }

    @Override // com.avito.android.bxcontent.toolbar_helper.a
    public final void b(@k InterfaceC44440c interfaceC44440c) {
        this.f113003d = interfaceC44440c;
    }

    public final void c(float f12) {
        d.a bVar;
        UniversalColor pressedSearchColor;
        ToolbarConfig toolbarConfig = this.f113001b;
        com.avito.android.search_view.k kVar = null;
        if (toolbarConfig != null) {
            boolean z12 = this.f113007h;
            ToolbarShareButton toolbarShareButton = this.f113002c;
            boolean z13 = this.f113008i;
            UniversalColor toolbarColor = toolbarConfig.getToolbarColor();
            if (toolbarColor != null) {
                UniversalColor elementsColor = toolbarConfig.getElementsColor();
                if (elementsColor == null) {
                    elementsColor = new UniversalColor(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, null, null);
                }
                UniversalColor universalColor = elementsColor;
                NavigationBarStyle.ThemeAppearance themeAppearance = toolbarConfig.getThemeAppearance();
                ThemeAppearance themeAppearanceB = themeAppearance != null ? C44441d.b(themeAppearance) : ThemeAppearance.f181334b;
                UniversalColor searchColor = toolbarConfig.getSearchColor();
                if (searchColor != null && ((pressedSearchColor = toolbarConfig.getPressedSearchColor()) != null || (pressedSearchColor = toolbarConfig.getSearchColor()) != null)) {
                    UniversalColor hintColor = toolbarConfig.getHintColor();
                    if (hintColor == null && (hintColor = toolbarConfig.getElementsColor()) == null) {
                        hintColor = new UniversalColor(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, null, null);
                    }
                    k.a aVar = new k.a(searchColor, pressedSearchColor, hintColor);
                    ToolbarConfig.ToolbarText toolbarText = toolbarConfig.getToolbarText();
                    NavigationBarStyle.DisplayType.OnlyTitle onlyTitle = toolbarText != null ? new NavigationBarStyle.DisplayType.OnlyTitle(toolbarText.getText(), toolbarText.getDisplayMode()) : null;
                    UniversalColor cartPointColor = toolbarConfig.getCartPointColor();
                    if (cartPointColor == null) {
                        cartPointColor = new UniversalColor("red", null, null);
                    }
                    kVar = new com.avito.android.search_view.k(toolbarColor, universalColor, cartPointColor, themeAppearanceB, aVar, null, z12, onlyTitle, z13, toolbarShareButton);
                }
            }
        }
        if (!this.f113005f || this.f113008i) {
            this.f113004e = f12;
            if (kVar != null) {
                InterfaceC44440c interfaceC44440c = this.f113003d;
                if (interfaceC44440c != null) {
                    interfaceC44440c.a(kVar, f12);
                }
                this.f113006g = ((double) f12) > 0.5d;
                Z1<d> z14 = this.f113009j;
                UniversalColor universalColor2 = kVar.f264557a;
                if (f12 == 1.0f) {
                    z14.setValue(new d(kVar.f264560d, this.f113008i ? new d.a.C9356a(R.attr.transparentWhite) : new d.a.e(universalColor2)));
                    return;
                }
                ThemeAppearance themeAppearance2 = ThemeAppearance.f181334b;
                if (!this.f113008i || f12 == 0.0f) {
                    if (!this.f113007h) {
                        f12 = 1.0f;
                    }
                    bVar = new d.a.b(universalColor2, f12);
                } else {
                    bVar = new d.a.C9356a(R.attr.transparentWhite);
                }
                z14.setValue(new d(themeAppearance2, bVar));
            }
        }
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<d> e2() {
        return this.f113010k;
    }

    @Override // com.avito.android.bxcontent.toolbar_helper.a
    public final void f0() {
        this.f113001b = null;
        this.f113002c = null;
        this.f113003d = null;
        this.f113005f = false;
        this.f113008i = false;
        this.f113009j.setValue(null);
    }

    @Override // com.avito.android.bxcontent.toolbar_helper.a
    public final void i(boolean z12) {
        if (this.f113001b == null) {
            return;
        }
        if (z12) {
            a();
            this.f113005f = true;
        } else {
            this.f113005f = false;
            if (this.f113008i) {
                return;
            }
            c(this.f113006g ? 1.0f : 0.0f);
        }
    }
}
