package D00;

import G00.b;
import G00.d;
import G00.e;
import JZ.i;
import JZ.t;
import JZ.u;
import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.person_form.list.items.PersonFormCompactItem;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.action_banner.ActionBannerItem;
import com.avito.android.mortgage.person_form.list.items.nav_button.NavButtonItem;
import com.avito.android.mortgage.person_form.list.items.step_title.StepTitleItem;
import com.avito.android.mortgage.person_form.list.items.verification_banner.VerificationBannerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PersonFormViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD00/b;", "LD00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.person_form.mvi.mapper.a f2841a;

    @Inject
    public b(@k com.avito.android.mortgage.person_form.mvi.mapper.a aVar) {
        this.f2841a = aVar;
    }

    @Override // D00.a
    @k
    public final G00.c a(@k G00.c cVar) {
        e cVar2;
        e eVarB;
        int i12 = cVar.f6150h;
        d dVar = new d(i12 + 1, cVar.f6149g.size(), cVar.f6148f, i12 == 0);
        boolean zIsEmpty = cVar.f6153k.isEmpty();
        G00.b bVar = cVar.f6158p;
        if (bVar instanceof b.c) {
            cVar2 = new e.c(dVar);
        } else if (bVar instanceof b.C0323b) {
            cVar2 = new e.b(dVar, ((b.C0323b) bVar).f6138a);
        } else {
            if (bVar instanceof b.e ? true : bVar instanceof b.d) {
                e.a aVarB = b(cVar, dVar, true);
                List<PersonFormItem> list = aVarB.f6165b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersonFormItem) it.next()).N());
                }
                cVar2 = new e.a(aVarB.f6164a, arrayList, aVarB.f6166c, aVarB.f6167d);
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!zIsEmpty) {
                    eVarB = b(cVar, dVar, false);
                    return G00.c.a(cVar, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, eVarB, 32767);
                }
                cVar2 = new e.c(dVar);
            }
        }
        eVarB = cVar2;
        return G00.c.a(cVar, null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, eVarB, 32767);
    }

    public final e.a b(G00.c cVar, d dVar, boolean z12) {
        int i12;
        ArrayList arrayList = new ArrayList(this.f2841a.a(cVar.f6153k));
        i iVar = cVar.f6155m;
        if (iVar != null) {
            String title = iVar.getTitle();
            String description = iVar.getDescription();
            ActionButton action = iVar.getAction();
            String title2 = action != null ? action.getTitle() : null;
            ActionButton action2 = iVar.getAction();
            arrayList.add(0, new ActionBannerItem("actionBanner", title, description, title2, action2 != null ? action2.getLink() : null, false, 32, null));
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i13 = i12 + 1;
        arrayList.add(i12, new StepTitleItem("stepTitle", cVar.f6152j, false, 4, null));
        u uVar = cVar.f6154l;
        if (uVar != null) {
            String title3 = uVar.getTitle();
            String description2 = uVar.getDescription();
            String imageUrl = uVar.getImageUrl();
            t action3 = uVar.getAction();
            String title4 = action3 != null ? action3.getTitle() : null;
            t action4 = uVar.getAction();
            boolean isLoading = action4 != null ? action4.getIsLoading() : false;
            t action5 = uVar.getAction();
            arrayList.add(i13, new VerificationBannerItem("verificationBanner", title3, description2, imageUrl, title4, isLoading, !(action5 != null && action5.f9040a), false, 128, null));
        }
        arrayList.add(new NavButtonItem("navigationButton", cVar.f6151i ? R.string.confirm : R.string.next, z12, false, 8, null));
        int size = arrayList.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Object obj = arrayList.get(i15);
            PersonFormCompactItem personFormCompactItem = obj instanceof PersonFormCompactItem ? (PersonFormCompactItem) obj : null;
            if (personFormCompactItem != null && personFormCompactItem.getF200752k()) {
                i14++;
            } else if (i14 % 2 != 0) {
                int i16 = i15 - 1;
                Object obj2 = arrayList.get(i16);
                PersonFormCompactItem personFormCompactItem2 = obj2 instanceof PersonFormCompactItem ? (PersonFormCompactItem) obj2 : null;
                if (personFormCompactItem2 != null) {
                    arrayList.set(i16, personFormCompactItem2.k5());
                    i14 = 0;
                }
            } else {
                i14 = 0;
            }
        }
        if (i14 % 2 != 0) {
            Object objJ = r.j(2, arrayList);
            PersonFormCompactItem personFormCompactItem3 = objJ instanceof PersonFormCompactItem ? (PersonFormCompactItem) objJ : null;
            if (personFormCompactItem3 != null) {
                arrayList.set(arrayList.size() - 2, personFormCompactItem3.k5());
            }
        }
        return new e.a(dVar, arrayList, cVar.f6157o, cVar.f6156n);
    }
}
