package com.avito.android.profile.user_profile.cards.wallet.finance_common;

import Y41.l;
import android.view.View;
import com.avito.android.remote.model.AvitoFinanceAction;
import com.avito.android.remote.model.AvitoFinanceButton;
import com.avito.android.remote.model.AvitoFinanceDynamicCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f225677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f225678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f225679d;

    public /* synthetic */ d(int i12, Object obj, Object obj2) {
        this.f225677b = i12;
        this.f225678c = obj;
        this.f225679d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List<AvitoFinanceAction> onSelect;
        Object obj = this.f225679d;
        Object obj2 = this.f225678c;
        switch (this.f225677b) {
            case 0:
                int i12 = e.f225680g;
                AvitoFinanceButton button = ((AvitoFinanceDynamicCard) obj2).getButton();
                if (button != null && (onSelect = button.getOnSelect()) != null) {
                    for (AvitoFinanceAction avitoFinanceAction : onSelect) {
                        l<? super AvitoFinanceAction, G0> lVar = ((e) obj).f225685f;
                        if (lVar != null) {
                            ((f) lVar).invoke(avitoFinanceAction);
                        }
                    }
                    break;
                }
                break;
            case 1:
                int i13 = e.f225680g;
                List<AvitoFinanceAction> onSelect2 = ((AvitoFinanceDynamicCard) obj2).getOnSelect();
                if (onSelect2 != null) {
                    for (AvitoFinanceAction avitoFinanceAction2 : onSelect2) {
                        l<? super AvitoFinanceAction, G0> lVar2 = ((e) obj).f225684e;
                        if (lVar2 != null) {
                            ((g) lVar2).invoke(avitoFinanceAction2);
                        }
                    }
                    break;
                }
                break;
            default:
                int i14 = e.f225680g;
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    ((l) obj).invoke((AvitoFinanceAction) it.next());
                }
                break;
        }
    }
}
