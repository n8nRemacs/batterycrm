package com.avito.android.bbl.screens.limit_increase.mvi;

import Eh.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.bbl.generated.api.api_1_get_available_contacts.ProgressBar;
import com.avito.android.bbl.screens.limit_increase.mvi.entity.LimitIncreaseInternalAction;
import com.avito.android.error.z;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import qh.C47397a;
import qh.C47398b;
import wZ.C49578b;
import wZ.l;

/* compiled from: LimitIncreaseReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bbl/screens/limit_increase/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/bbl/screens/limit_increase/mvi/entity/LimitIncreaseInternalAction;", "LEh/c;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements u<LimitIncreaseInternalAction, Eh.c> {

    /* compiled from: LimitIncreaseReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99812a;

        static {
            int[] iArr = new int[ProgressBar.Color.values().length];
            try {
                iArr[ProgressBar.Color.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressBar.Color.Orange.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f99812a = iArr;
        }
    }

    @Inject
    public j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // com.avito.android.arch.mvi.u
    public final Eh.c a(LimitIncreaseInternalAction limitIncreaseInternalAction, Eh.c cVar) {
        Long lValueOf;
        ArrayList arrayList;
        ?? r92;
        c.a aVar;
        qh.d dVar;
        Image value;
        c.d.a aVar2;
        c.e eVar;
        LimitIncreaseInternalAction limitIncreaseInternalAction2 = limitIncreaseInternalAction;
        Eh.c cVar2 = cVar;
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.Error) {
            return Eh.c.a(cVar2, false, false, z.l(((LimitIncreaseInternalAction.Error) limitIncreaseInternalAction2).f99798b), null, null, null, null, null, null, null, null, false, 4089);
        }
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.Loading) {
            return Eh.c.a(cVar2, false, true, null, null, null, null, null, null, null, null, null, false, 4089);
        }
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.PostSaveError) {
            return Eh.c.a(cVar2, false, false, null, null, null, null, null, null, null, null, null, false, 2047);
        }
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.PostSaveLoading) {
            return Eh.c.a(cVar2, false, false, null, null, null, null, null, null, null, null, null, true, 2047);
        }
        if (limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.HandleDeeplink) {
            return Eh.c.a(cVar2, false, false, null, null, null, null, null, null, null, null, null, false, 2047);
        }
        int i12 = 1;
        if (!(limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.Content)) {
            if (!(limitIncreaseInternalAction2 instanceof LimitIncreaseInternalAction.ChangeChip)) {
                return cVar2;
            }
            List<c.d> list = cVar2.f4183i;
            c.d dVar2 = list != null ? (c.d) C42745f0.K(((LimitIncreaseInternalAction.ChangeChip) limitIncreaseInternalAction2).f99796b, list) : null;
            List<c.b> list2 = cVar2.f4182h;
            if (list2 != null) {
                List<c.b> list3 = list2;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                int i13 = 0;
                for (Object obj : list3) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    c.b bVar = (c.b) obj;
                    arrayList2.add(new c.b(bVar.f4192b, bVar.f4193c, i13 == ((LimitIncreaseInternalAction.ChangeChip) limitIncreaseInternalAction2).f99796b, bVar.f4195e));
                    i13 = i14;
                }
                lValueOf = null;
                arrayList = arrayList2;
            } else {
                lValueOf = null;
                arrayList = null;
            }
            if (list != null) {
                List<c.d> list4 = list;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
                for (c.d dVar3 : list4) {
                    arrayList3.add((dVar2 == null || dVar3.f4196a != dVar2.f4196a) ? c.d.a(dVar3, false) : c.d.a(dVar3, true));
                }
                r92 = arrayList3;
            } else {
                r92 = lValueOf;
            }
            if (dVar2 != null) {
                lValueOf = Long.valueOf(dVar2.f4196a);
            }
            return Eh.c.a(cVar2, false, false, null, null, null, null, arrayList, r92, lValueOf, null, null, false, 3647);
        }
        C47397a c47397a = ((LimitIncreaseInternalAction.Content) limitIncreaseInternalAction2).f99797b;
        List<qh.d> listD = c47397a.d();
        ArrayList arrayList4 = new ArrayList(C42745f0.q(listD, 10));
        for (qh.d dVar4 : listD) {
            long limit = dVar4.getLimit();
            boolean isSelected = dVar4.getIsSelected();
            String price = dVar4.getPrice();
            ProgressBar progress = dVar4.getProgress();
            if (progress != null) {
                String description = progress.getDescription();
                int i15 = a.f99812a[progress.getColor().ordinal()];
                if (i15 == i12) {
                    eVar = c.e.a.f4204a;
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = c.e.b.f4205a;
                }
                aVar2 = new c.d.a(description, eVar, (float) progress.getValue());
            } else {
                aVar2 = null;
            }
            arrayList4.add(new c.d(limit, isSelected, false, price, aVar2, 4, null));
            i12 = 1;
        }
        List<qh.d> listD2 = c47397a.d();
        ArrayList arrayList5 = new ArrayList(C42745f0.q(listD2, 10));
        for (qh.d dVar5 : listD2) {
            arrayList5.add(new c.b(dVar5.getLimit(), String.valueOf(dVar5.getLimit()), dVar5.getIsSelected(), false, 8, null));
        }
        C47398b banner = c47397a.getBanner();
        if (banner != null) {
            qh.f image = banner.getImage();
            aVar = new c.a((image == null || (value = image.getValue()) == null) ? null : new l(value, image.getValueDark()), banner.getTitle(), banner.getDescription(), banner.getUri());
        } else {
            aVar = null;
        }
        qh.c helpButton = c47397a.getNavbar().getHelpButton();
        wZ.j jVar = new wZ.j(null, helpButton != null ? new C49578b(helpButton.getTitle(), helpButton.getUri(), null, null, 12, null) : null);
        Iterator it = c47397a.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            ?? next = it.next();
            if (((qh.d) next).getIsSelected()) {
                dVar = next;
                break;
            }
        }
        qh.d dVar6 = dVar;
        return Eh.c.a(cVar2, false, false, null, jVar, c47397a.getTitle(), c47397a.getDescription(), arrayList5, arrayList4, dVar6 != null ? Long.valueOf(dVar6.getLimit()) : null, aVar, c47397a.getButtonTitle(), false, 2049);
    }
}
