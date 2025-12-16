package com.avito.android.advert.item.icebreakers_redesign;

import Y41.q;
import com.avito.android.advert.item.Z0;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.IceBreaker;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IceBreakersRedesignPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/advert/item/icebreakers_redesign/IcebreakerRedesignChips;", "chip", "", "isSelected", "isActionChip", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert/item/icebreakers_redesign/IcebreakerRedesignChips;ZZ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements q<IcebreakerRedesignChips, Boolean, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f76526l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IcebreakersRedesignItem f76527m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f76528n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, IcebreakersRedesignItem icebreakersRedesignItem, l lVar) {
        super(3);
        this.f76526l = iVar;
        this.f76527m = icebreakersRedesignItem;
        this.f76528n = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(IcebreakerRedesignChips icebreakerRedesignChips, Boolean bool, Boolean bool2) {
        SerpResultCategoryDetails categoryDetails;
        SerpResultCategoryDetails categoryDetails2;
        IcebreakerRedesignChips icebreakerRedesignChips2 = icebreakerRedesignChips;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        i iVar = this.f76526l;
        com.avito.android.advert_core.analytics.a aVar = iVar.f76534b;
        if (zBooleanValue2) {
            aVar.b7();
            Z0 z02 = iVar.f76538f;
            if (z02 != null) {
                List<IceBreaker> list = iVar.f76543k;
                Integer limit = this.f76527m.f76518d.getLimit();
                int iIntValue = limit != null ? limit.intValue() : 5;
                AdvertDetails advertDetails = z02.f72294C;
                String categoryId = (advertDetails == null || (categoryDetails2 = advertDetails.getCategoryDetails()) == null) ? null : categoryDetails2.getCategoryId();
                AdvertDetails advertDetails2 = z02.f72294C;
                z02.f72298c.startActivityForResult(z02.f72301f.b(list, iIntValue, z02.f72297b, categoryId, (advertDetails2 == null || (categoryDetails = advertDetails2.getCategoryDetails()) == null) ? null : categoryDetails.getMicroCategoryId()), 23);
            }
        } else {
            String str = icebreakerRedesignChips2.f76513c;
            ArrayList arrayList = iVar.f76540h;
            int i12 = -1;
            int i13 = 0;
            int i14 = icebreakerRedesignChips2.f76512b;
            if (zBooleanValue) {
                arrayList.add(Integer.valueOf(i14));
                Iterator<IceBreaker> it = iVar.f76543k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().getId() == i14) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
                aVar.L1(i12, i14, str);
            } else {
                Iterator<IceBreaker> it2 = iVar.f76543k.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().getId() == i14) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
                aVar.y3(i12, i14, str);
                arrayList.remove(Integer.valueOf(i14));
            }
            if (!iVar.f76541i) {
                String strK = iVar.k();
                iVar.f76542j = strK;
                this.f76528n.y0(strK);
            }
        }
        return G0.f406611a;
    }
}
