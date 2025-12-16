package Tf;

import Y41.l;
import android.view.View;
import com.avito.android.advert.item.comfortable_deal.k;
import com.avito.android.publish.slots.delivery_all_toggles.item.o;
import com.avito.android.tariff.cpx.configure.landing.items.accordions_card.i;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15786d;

    public /* synthetic */ b(int i12, l lVar, String str) {
        this.f15784b = i12;
        this.f15785c = lVar;
        this.f15786d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.f15786d;
        l lVar = this.f15785c;
        switch (this.f15784b) {
            case 0:
                int i12 = c.f15787i;
                lVar.invoke(str);
                break;
            case 1:
                int i13 = d.f15796k;
                lVar.invoke(str);
                break;
            case 2:
                int i14 = k.f74307m;
                lVar.invoke(str);
                break;
            case 3:
                Set<String> set = o.f243506u;
                if (str != null) {
                    lVar.invoke(str);
                    break;
                }
                break;
            default:
                int i15 = i.f295959h;
                lVar.invoke(str);
                break;
        }
    }

    public /* synthetic */ b(String str, l lVar) {
        this.f15784b = 3;
        this.f15786d = str;
        this.f15785c = lVar;
    }
}
