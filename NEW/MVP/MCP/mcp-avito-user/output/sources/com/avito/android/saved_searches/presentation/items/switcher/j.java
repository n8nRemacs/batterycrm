package com.avito.android.saved_searches.presentation.items.switcher;

import Eo0.InterfaceC13515a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SavedSearchSwitcherView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/switcher/j;", "Lcom/avito/android/saved_searches/presentation/items/switcher/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13515a, G0> f258568b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SwitcherListItem f258569c;

    /* compiled from: SavedSearchSwitcherView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f258568b.invoke(InterfaceC13515a.C0255a.f4241a);
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchSwitcherView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            j.this.f258568b.invoke(new InterfaceC13515a.c(bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchSwitcherView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f258568b.invoke(InterfaceC13515a.i.f4249a);
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchSwitcherView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Boolean, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            j.this.f258568b.invoke(new InterfaceC13515a.k(bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k View view, @Y61.k Y41.l<? super InterfaceC13515a, G0> lVar) {
        super(view);
        this.f258568b = lVar;
        this.f258569c = (SwitcherListItem) view.findViewById(R.id.switcher_root);
    }

    @Override // com.avito.android.saved_searches.presentation.items.switcher.i
    public final void ZE(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12, boolean z13) throws Resources.NotFoundException {
        Integer numA;
        SwitcherListItem switcherListItem = this.f258569c;
        if (str != null && (numA = q.a(str)) != null) {
            Drawable drawableH = C35835l0.h(numA.intValue(), switcherListItem.getContext());
            if (drawableH != null) {
                switcherListItem.setLeftIconDrawable(drawableH);
            }
        }
        switcherListItem.setTitle(str2);
        String strQ0 = str3 != null ? C43066x.q0(str3, "@") : null;
        if (strQ0 == null) {
            strQ0 = "";
        }
        String strConcat = str3 != null ? "@".concat(C43066x.m0(str3, "@", str3)) : null;
        String str5 = strConcat != null ? strConcat : "";
        TextView textView = switcherListItem.f258554e;
        if (textView != null) {
            D6.H(textView);
        }
        TextView textView2 = switcherListItem.f258554e;
        if (textView2 != null) {
            textView2.post(new Me.m(str5, textView2, strQ0, 29));
        }
        switcherListItem.setEmailColor(ColorStateList.valueOf(C35835l0.d(R.attr.blue600, switcherListItem.getContext())));
        switcherListItem.setSubtitle(str4);
        switcherListItem.setSubtitleColor(ColorStateList.valueOf(C35835l0.d(R.attr.blue600, switcherListItem.getContext())));
        switcherListItem.setChecked(z12);
        switcherListItem.setLeftContainerListener(new a());
        switcherListItem.setRightContainerListener(new b());
        switcherListItem.setRightIconDrawable(z13 ? C35835l0.h(R.attr.ic_attentionRound24, switcherListItem.getContext()) : null);
    }

    @Override // com.avito.android.saved_searches.presentation.items.switcher.i
    public final void e50(@Y61.l String str, @Y61.l String str2, boolean z12, @Y61.l String str3, boolean z13) throws Resources.NotFoundException {
        Integer numA;
        SwitcherListItem switcherListItem = this.f258569c;
        if (str != null && (numA = q.a(str)) != null) {
            Drawable drawableH = C35835l0.h(numA.intValue(), switcherListItem.getContext());
            if (drawableH != null) {
                switcherListItem.setLeftIconDrawable(drawableH);
            }
        }
        switcherListItem.setTitle(str2);
        switcherListItem.setSubtitle(str3);
        switcherListItem.setSubtitleColor(ColorStateList.valueOf(C35835l0.d(R.attr.blue600, switcherListItem.getContext())));
        switcherListItem.setChecked(z12);
        switcherListItem.setLeftContainerListener(new c());
        switcherListItem.setRightContainerListener(new d());
        switcherListItem.setRightIconDrawable(z13 ? C35835l0.h(R.attr.ic_attentionRound24, switcherListItem.getContext()) : null);
    }
}
