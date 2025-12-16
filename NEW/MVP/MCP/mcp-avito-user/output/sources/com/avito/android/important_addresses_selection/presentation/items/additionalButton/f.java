package com.avito.android.important_addresses_selection.presentation.items.additionalButton;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesSelectionAdditionalActionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/items/additionalButton/f;", "Lcom/avito/android/important_addresses_selection/presentation/items/additionalButton/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f169833g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f169834b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SM.a, G0> f169835c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f169836d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f169837e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ListItem f169838f;

    public f(@k l lVar, @k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f169834b = aVar;
        this.f169835c = lVar;
        this.f169836d = view.getContext();
        this.f169837e = (TextView) view.findViewById(R.id.info);
        this.f169838f = (ListItem) view.findViewById(R.id.button);
    }

    @Override // com.avito.android.important_addresses_selection.presentation.items.additionalButton.e
    public final void BU(@k ImportantAddressesSelectionAdditionalActionItem importantAddressesSelectionAdditionalActionItem) {
        Drawable drawableH;
        Drawable drawableH2;
        j.a(this.f169837e, importantAddressesSelectionAdditionalActionItem.f169819c, this.f169834b);
        String str = importantAddressesSelectionAdditionalActionItem.f169820d;
        ListItem listItem = this.f169838f;
        listItem.setTitle(str);
        Context context = this.f169836d;
        ColorStateList colorStateListE = com.avito.android.lib.util.darkTheme.c.a(context) ? C35835l0.e(R.attr.constantWhite, context) : C35835l0.e(R.attr.constantBlack, context);
        Drawable drawable = null;
        Integer num = importantAddressesSelectionAdditionalActionItem.f169821e;
        if (num == null || (drawableH = C35835l0.h(num.intValue(), listItem.getContext())) == null) {
            drawableH = null;
        } else {
            drawableH.setTintList(colorStateListE);
        }
        Integer num2 = importantAddressesSelectionAdditionalActionItem.f169822f;
        if (num2 != null && (drawableH2 = C35835l0.h(num2.intValue(), listItem.getContext())) != null) {
            drawableH2.setTintList(colorStateListE);
            drawable = drawableH2;
        }
        listItem.g(drawableH, drawable);
        listItem.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(24, this, importantAddressesSelectionAdditionalActionItem));
    }
}
