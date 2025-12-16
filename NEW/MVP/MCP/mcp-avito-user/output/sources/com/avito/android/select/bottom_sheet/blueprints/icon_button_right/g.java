package com.avito.android.select.bottom_sheet.blueprints.icon_button_right;

import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import dq0.InterfaceC39781c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemWithIconRightPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/icon_button_right/g;", "LTV0/d;", "Lcom/avito/android/select/bottom_sheet/blueprints/icon_button_right/b;", "Lcom/avito/android/select/bottom_sheet/blueprints/icon_button_right/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements TV0.d<b, a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<InterfaceC39781c, G0> f265150b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@l Y41.l<? super InterfaceC39781c, G0> lVar) {
        this.f265150b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numM;
        Integer numA;
        Integer numM2;
        b bVar = (b) eVar;
        a aVar2 = (a) aVar;
        String str = aVar2.f265133c;
        if (str == null) {
            str = "";
        }
        TextView textView = bVar.f265140c;
        textView.setText(str);
        String str2 = aVar2.f265134d;
        if (str2 != null && (numM2 = com.avito.android.lib.util.f.m(str2)) != null) {
            int iIntValue = numM2.intValue();
            FV.a aVar3 = FV.a.f4720a;
            int iB2 = y6.b(16);
            aVar3.getClass();
            FV.a.j(textView, iIntValue, iB2);
        }
        e eVar2 = new e(aVar2, this);
        String str3 = aVar2.f265135e;
        int i13 = str3 != null ? 0 : 8;
        TextView textView2 = bVar.f265141d;
        textView2.setVisibility(i13);
        View view = bVar.f265139b;
        String str4 = aVar2.f265136f;
        if (str4 != null && (numA = com.avito.android.lib.util.e.a(str4)) != null) {
            textView2.setTextColor(ColorStateList.valueOf(C35835l0.d(numA.intValue(), view.getContext())));
        }
        if (str3 != null && (numM = com.avito.android.lib.util.f.m(str3)) != null) {
            FV.a.a(FV.a.f4720a, textView2, Integer.valueOf(numM.intValue()));
        }
        textView2.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(26, eVar2));
        view.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(25, new f(aVar2, this)));
    }
}
