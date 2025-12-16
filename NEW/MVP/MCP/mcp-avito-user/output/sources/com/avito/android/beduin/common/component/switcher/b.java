package com.avito.android.beduin.common.component.switcher;

import Y41.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.avito.android.R;
import com.avito.android.beduin.common.component.switcher.BeduinSwitcherModel;
import com.avito.android.beduin.common.component.switcher.a;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: BeduinSwitcherComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemSwitcher;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/list_item/ListItemSwitcher;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<ListItemSwitcher, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f102743l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(1);
        this.f102743l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(ListItemSwitcher listItemSwitcher) {
        UniversalColor tintColor;
        Integer imageAttr;
        ListItemSwitcher listItemSwitcher2 = listItemSwitcher;
        Context context = listItemSwitcher2.getContext();
        a aVar = this.f102743l;
        BeduinSwitcherModel beduinSwitcherModel = aVar.f102738g;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.avito.android.beduin.common.component.a.a(beduinSwitcherModel.getTheme()));
        BeduinSwitcherModel.Style style = beduinSwitcherModel.getStyle();
        int i12 = style == null ? -1 : a.b.f102742a[style.ordinal()];
        if (i12 != -1 && i12 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        listItemSwitcher2.setAppearance(C35835l0.j(R.attr.listItemSwitcher, contextThemeWrapper));
        listItemSwitcher2.setTag(beduinSwitcherModel.getId());
        listItemSwitcher2.setClickable(true);
        if (aVar.f395326d) {
            D6.b(listItemSwitcher2, Integer.valueOf(aVar.f395324b), 0, Integer.valueOf(aVar.f395325c), 0);
        } else {
            D6.b(listItemSwitcher2, 0, 0, 0, 0);
        }
        listItemSwitcher2.setTitle(beduinSwitcherModel.getTitle());
        listItemSwitcher2.setSubtitle(beduinSwitcherModel.getSubtitle());
        listItemSwitcher2.setMessage(beduinSwitcherModel.getDetails());
        Link link = beduinSwitcherModel.getLink();
        Drawable drawableH = null;
        listItemSwitcher2.setLink(link != null ? link.getText() : null);
        listItemSwitcher2.setLinkClickedListener(new com.avito.android.autoteka.presentation.reportGeneration.a(aVar, 12));
        Icon icon = beduinSwitcherModel.getIcon();
        if (icon != null && (imageAttr = icon.getImageAttr()) != null) {
            drawableH = C35835l0.h(imageAttr.intValue(), listItemSwitcher2.getContext());
        }
        listItemSwitcher2.setImageDrawable(drawableH);
        Icon icon2 = beduinSwitcherModel.getIcon();
        if (icon2 != null && (tintColor = icon2.getTintColor()) != null) {
            listItemSwitcher2.setImageColor(C48063a.f437606a.a(listItemSwitcher2.getContext(), tintColor));
        }
        Boolean boolIsEnabled = beduinSwitcherModel.isEnabled();
        listItemSwitcher2.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        listItemSwitcher2.setChecked(beduinSwitcherModel.isSwitchOn());
        return G0.f406611a;
    }
}
