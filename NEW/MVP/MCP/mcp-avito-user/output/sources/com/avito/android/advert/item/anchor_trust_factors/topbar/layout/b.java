package com.avito.android.advert.item.anchor_trust_factors.topbar.layout;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.f;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import r4.C47486a;
import s4.C47993a;

/* compiled from: TopBarAnchorsContainer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/topbar/layout/b;", "LLV/a;", "Lr4/a;", "Ls4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements LV.a<C47486a, C47993a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f72874b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HorizontalScrollView f72875c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f72876d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f72877e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public C47486a f72878f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public C47993a f72879g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public Object f72880h;

    public b(@k com.avito.android.util.text.a aVar, @k HorizontalScrollView horizontalScrollView) {
        this.f72874b = aVar;
        this.f72875c = horizontalScrollView;
        LinearLayout linearLayout = (LinearLayout) horizontalScrollView.findViewById(R.id.advert_details_top_bar_anchor_items);
        this.f72876d = linearLayout;
        this.f72877e = linearLayout.getContext();
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f72878f = new C47486a(c42784z0);
        this.f72880h = c42784z0;
    }

    public final UU.a a(C47486a.C12352a c12352a) {
        CharSequence charSequenceC = this.f72874b.c(this.f72877e, c12352a.f429576b);
        if (charSequenceC == null) {
            charSequenceC = "";
        }
        return new UU.a(charSequenceC, null, false, false, false, new a(c12352a, c12352a.f429578d), null, null, null, false, 990, null);
    }

    public final VU.b b(String str, String str2) {
        b.a aVar = VU.b.f17147t;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f72877e, f.b(R.style.Theme_DesignSystem_Legacy, str2));
        aVar.getClass();
        return b.a.b(contextThemeWrapper, str);
    }
}
