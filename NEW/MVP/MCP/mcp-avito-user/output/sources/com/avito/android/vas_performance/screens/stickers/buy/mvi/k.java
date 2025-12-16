package com.avito.android.vas_performance.screens.stickers.buy.mvi;

import KL0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_performance.remote.model.stickers.buy.InfoIconName;
import com.avito.android.vas_performance.screens.common_item.header.VasPerformanceHeaderItem;
import com.avito.android.vas_performance.screens.stickers.buy.mvi.entity.StickersBuyInternalAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StickersBuyReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyInternalAction;", "LKL0/c;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements u<StickersBuyInternalAction, KL0.c> {

    /* compiled from: StickersBuyReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f320751a;

        static {
            int[] iArr = new int[InfoIconName.values().length];
            try {
                iArr[InfoIconName.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f320751a = iArr;
        }
    }

    @Inject
    public k() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static KL0.c b(KL0.c r14) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.stickers.buy.mvi.k.b(KL0.c):KL0.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final KL0.c a(StickersBuyInternalAction stickersBuyInternalAction, KL0.c cVar) {
        c.b bVarA;
        List<FL0.c> listI;
        Object next;
        c.C0568c c0568c;
        int i12 = 0;
        StickersBuyInternalAction stickersBuyInternalAction2 = stickersBuyInternalAction;
        KL0.c cVar2 = cVar;
        if (stickersBuyInternalAction2 instanceof StickersBuyInternalAction.Loading) {
            return KL0.c.a(cVar2, true, null, null, null, 252);
        }
        if (stickersBuyInternalAction2 instanceof StickersBuyInternalAction.Error) {
            return KL0.c.a(cVar2, false, ((StickersBuyInternalAction.Error) stickersBuyInternalAction2).f320735b, null, null, 252);
        }
        FL0.c cVar3 = null;
        Object obj = null;
        cVar3 = null;
        if (stickersBuyInternalAction2 instanceof StickersBuyInternalAction.Content) {
            FL0.d dVar = ((StickersBuyInternalAction.Content) stickersBuyInternalAction2).f320734b;
            ArrayList arrayListE0 = C42745f0.e0(new VasPerformanceHeaderItem("stickers_vas_title", dVar.getTitle(), null));
            AttributedText description = dVar.getDescription();
            if (description != null) {
                arrayListE0.add(new com.avito.android.vas_performance.screens.common_item.attributed_text.a(description));
            }
            List<EL0.a> listJ = dVar.j();
            if (!(listJ instanceof Collection) || !listJ.isEmpty()) {
                Iterator<T> it = listJ.iterator();
                while (it.hasNext()) {
                    if (L.f(((EL0.a) it.next()).getIsSelected(), Boolean.TRUE) && (i12 = i12 + 1) < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
            Iterator<T> it2 = dVar.i().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((FL0.c) next).getSelectedCount() == i12) {
                    break;
                }
            }
            FL0.c cVar4 = (FL0.c) next;
            if (cVar4 != null) {
                arrayListE0.add(new com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.a("stickers_vas_count", cVar4.getTitle(), cVar4.getDescription(), dVar.getIcon(), cVar4.getLightningIcon()));
            }
            ArrayList arrayList = new ArrayList();
            for (EL0.a aVar : dVar.j()) {
                arrayList.add(new com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a(aVar.getId(), aVar.getTitle(), aVar.getIsSelected(), aVar.getDescriptionForSeller()));
            }
            arrayListE0.add(new com.avito.android.vas_performance.screens.stickers.buy.item.stickers.b("stickers_vas", dVar.getMaxSelectedCount(), arrayList));
            Float progress = dVar.getProgress();
            c.b bVar = new c.b(null, null, false, null, 8, null);
            FL0.b infoSection = dVar.getInfoSection();
            if (infoSection != null) {
                InfoIconName iconName = infoSection.getIconName();
                c0568c = new c.C0568c(infoSection.getDescription(), (iconName == null ? -1 : a.f320751a[iconName.ordinal()]) == 1 ? Integer.valueOf(R.attr.ic_info24) : null);
            } else {
                c0568c = null;
            }
            FL0.a emptyAction = dVar.getEmptyAction();
            return b(new KL0.c(false, null, dVar, arrayListE0, progress, bVar, c0568c, emptyAction != null ? emptyAction.getDeepLink() : null));
        }
        if (!(stickersBuyInternalAction2 instanceof StickersBuyInternalAction.StickerSelected)) {
            if (!(stickersBuyInternalAction2 instanceof StickersBuyInternalAction.ChangeButtonState)) {
                return cVar2;
            }
            c.b bVar2 = cVar2.f9410g;
            if (bVar2 != null) {
                StickersBuyInternalAction.ChangeButtonState changeButtonState = (StickersBuyInternalAction.ChangeButtonState) stickersBuyInternalAction2;
                bVarA = c.b.a(bVar2, null, null, changeButtonState.f320731b, Integer.valueOf(changeButtonState.f320732c), 3);
            } else {
                bVarA = null;
            }
            return KL0.c.a(cVar2, false, null, null, bVarA, 223);
        }
        StickersBuyInternalAction.StickerSelected stickerSelected = (StickersBuyInternalAction.StickerSelected) stickersBuyInternalAction2;
        List<com.avito.conveyor_item.a> list = cVar2.f9408e;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        for (com.avito.conveyor_item.a bVar3 : list) {
            if (bVar3 instanceof com.avito.android.vas_performance.screens.stickers.buy.item.stickers.b) {
                com.avito.android.vas_performance.screens.stickers.buy.item.stickers.b bVar4 = (com.avito.android.vas_performance.screens.stickers.buy.item.stickers.b) bVar3;
                List<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a> list2 = bVar4.f320667d;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                for (com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar2 : list2) {
                    String str = aVar2.f320661b;
                    com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar3 = stickerSelected.f320739b;
                    if (L.f(str, aVar3.f320661b)) {
                        String str2 = aVar2.f320662c;
                        if (L.f(str2, aVar3.f320662c)) {
                            aVar2 = new com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a(aVar2.f320661b, str2, Boolean.valueOf(!(aVar2.f320663d != null ? r13.booleanValue() : false)), aVar2.f320664e);
                        }
                    }
                    arrayList3.add(aVar2);
                }
                bVar3 = new com.avito.android.vas_performance.screens.stickers.buy.item.stickers.b(bVar4.f320665b, bVar4.f320666c, arrayList3);
            }
            arrayList2.add(bVar3);
        }
        int size = NL0.a.a(arrayList2).size();
        FL0.d dVar2 = cVar2.f9407d;
        if (dVar2 != null && (listI = dVar2.i()) != null) {
            Iterator<T> it3 = listI.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if ((((FL0.c) next2).getSelectedCount() == size) != false) {
                    obj = next2;
                    break;
                }
            }
            cVar3 = (FL0.c) obj;
        }
        if (cVar3 != null) {
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                com.avito.conveyor_item.a aVar4 = (com.avito.conveyor_item.a) it4.next();
                if (aVar4 instanceof com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.a) {
                    com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.a aVar5 = (com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.a) aVar4;
                    aVar4 = new com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count.a(aVar5.f320681b, cVar3.getTitle(), cVar3.getDescription(), aVar5.f320684e, cVar3.getLightningIcon());
                }
                arrayList4.add(aVar4);
            }
            arrayList2 = arrayList4;
        }
        return b(KL0.c.a(cVar2, false, null, arrayList2, null, 247));
    }
}
