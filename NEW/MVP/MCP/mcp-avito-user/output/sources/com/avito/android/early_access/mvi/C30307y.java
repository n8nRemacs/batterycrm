package com.avito.android.early_access.mvi;

import Nx.InterfaceC14620a;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.C22605a0;
import com.avito.android.early_access.adapter.banner.EarlyAccessBannerItem;
import com.avito.android.early_access.adapter.description.EarlyAccessDescriptionItem;
import com.avito.android.early_access.adapter.parameter.element.EarlyAccessParameterItem;
import com.avito.android.early_access.adapter.parameter.list.EarlyAccessParametersItem;
import com.avito.android.early_access.adapter.space.EarlyAccessSpaceItem;
import com.avito.android.early_access.adapter.title.EarlyAccessTitleItem;
import com.avito.android.early_access.adapter.title.HeaderType;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessReducer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/early_access/mvi/y;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessState;", "a", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.early_access.mvi.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30307y implements com.avito.android.arch.mvi.u<EarlyAccessInternalAction, EarlyAccessState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14620a f145563b;

    /* compiled from: EarlyAccessReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/early_access/mvi/y$a;", "", "<init>", "()V", "", "ROUBLE_SYMBOL", "Ljava/lang/String;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.early_access.mvi.y$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EarlyAccessReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.early_access.mvi.y$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145564a;

        static {
            int[] iArr = new int[ReEarlyAccessData.PopupType.values().length];
            try {
                ReEarlyAccessData.PopupType popupType = ReEarlyAccessData.PopupType.f145373c;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ReEarlyAccessData.PopupType popupType2 = ReEarlyAccessData.PopupType.f145373c;
                iArr[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ReEarlyAccessData.PopupType popupType3 = ReEarlyAccessData.PopupType.f145373c;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ReEarlyAccessData.PopupType popupType4 = ReEarlyAccessData.PopupType.f145373c;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ReEarlyAccessData.PopupType popupType5 = ReEarlyAccessData.PopupType.f145373c;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f145564a = iArr;
        }
    }

    /* compiled from: EarlyAccessReducer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/text/e$b;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/e$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.early_access.mvi.y$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<C22602e.b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ReEarlyAccessData.Link f145565l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReEarlyAccessData.Link link) {
            super(1);
            this.f145565l = link;
        }

        @Override // Y41.l
        public final G0 invoke(C22602e.b bVar) {
            bVar.f(this.f145565l.f145344b);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C30307y(@Y61.k InterfaceC14620a interfaceC14620a) {
        this.f145563b = interfaceC14620a;
    }

    public static void b(C22602e.b bVar, ReEarlyAccessData.Link link) {
        String str = link.f145345c;
        if (str != null) {
            com.avito.android.early_access.s.a(bVar, "URL", str, new c(link));
        } else {
            bVar.f(link.f145344b);
        }
    }

    public static EarlyAccessDescriptionItem c(String str) {
        if (str != null) {
            return new EarlyAccessDescriptionItem(null, new C22602e(str, null, 2, null), 1, null);
        }
        return null;
    }

    public static EarlyAccessDescriptionItem d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        C22602e.b bVar = new C22602e.b(0, 1, null);
        bVar.f(str);
        bVar.c((char) 160);
        androidx.compose.ui.text.font.e0.f42240c.getClass();
        int iL2 = bVar.l(new androidx.compose.ui.text.e0(0L, 0L, androidx.compose.ui.text.font.e0.f42250m, (androidx.compose.ui.text.font.Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.text.X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65531, (C42822w) null));
        try {
            bVar.f(str2);
            G0 g02 = G0.f406611a;
            bVar.h(iL2);
            return new EarlyAccessDescriptionItem(null, bVar.m(), 1, null);
        } catch (Throwable th2) {
            bVar.h(iL2);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EarlyAccessParametersItem f(List list) {
        String str = null;
        Object[] objArr = 0;
        if (list == null) {
            return null;
        }
        List<ReEarlyAccessData.Parameter> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (ReEarlyAccessData.Parameter parameter : list2) {
            String str2 = parameter.f145371c;
            String str3 = parameter.f145372d;
            arrayList.add(new EarlyAccessParameterItem(null, str2, parameter.f145370b, (str3 == null || str3.length() <= 0) ? null : str3, 1, null));
        }
        return new EarlyAccessParametersItem(str, arrayList, 1, objArr == true ? 1 : 0);
    }

    public static EarlyAccessTitleItem g(C30307y c30307y, String str) {
        HeaderType headerType = HeaderType.f145253b;
        c30307y.getClass();
        if (str != null) {
            return new EarlyAccessTitleItem(null, str, headerType, 1, null);
        }
        return null;
    }

    public static C22602e h(ReEarlyAccessData.Legal legal) {
        C22602e.b bVar = new C22602e.b(0, 1, null);
        bVar.f(legal.f145341b.f145346b);
        b(bVar, legal.f145341b.f145347c);
        ReEarlyAccessData.LinkedText linkedText = legal.f145342c;
        bVar.f(linkedText.f145346b);
        b(bVar, linkedText.f145347c);
        ReEarlyAccessData.LinkedText linkedText2 = legal.f145343d;
        if (linkedText2 != null) {
            bVar.f(linkedText2.f145346b);
            b(bVar, linkedText2.f145347c);
        }
        return bVar.m();
    }

    public static C22602e i(List list) {
        C22602e.b bVar = new C22602e.b(0, 1, null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(bVar, (ReEarlyAccessData.Link) it.next());
        }
        return bVar.m();
    }

    public final ArrayList e(ReEarlyAccessData reEarlyAccessData, boolean z12) {
        EarlyAccessBannerItem earlyAccessBannerItem;
        kotlin.collections.builders.b bVarT = C42745f0.t();
        bVarT.add(g(this, reEarlyAccessData.f145324d));
        bVarT.add(d(reEarlyAccessData.f145330j, reEarlyAccessData.f145329i));
        ReEarlyAccessData.BannerData bannerData = reEarlyAccessData.f145332l;
        if (bannerData != null) {
            earlyAccessBannerItem = new EarlyAccessBannerItem(null, bannerData.f145336b, bannerData.f145337c, null, 9, null);
        } else {
            earlyAccessBannerItem = null;
        }
        bVarT.add(earlyAccessBannerItem);
        bVarT.add(f(reEarlyAccessData.f145333m));
        if (z12) {
            bVarT.add(new EarlyAccessSpaceItem(null, 64, 1, null));
        }
        return C42745f0.C(C42745f0.p(bVarT));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x081d A[PHI: r6
  0x081d: PHI (r6v51 java.lang.String) = (r6v32 java.lang.String), (r6v52 java.lang.String) binds: [B:403:0x0825, B:397:0x081a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0970 A[PHI: r6
  0x0970: PHI (r6v28 java.lang.String) = (r6v4 java.lang.String), (r6v29 java.lang.String) binds: [B:492:0x0978, B:486:0x096d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a73  */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.String, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.String, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64, types: [java.lang.String, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.avito.android.arch.mvi.u
    @Y61.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.early_access.mvi.entity.EarlyAccessState a(@Y61.k com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction r31, @Y61.k com.avito.android.early_access.mvi.entity.EarlyAccessState r32) {
        /*
            Method dump skipped, instructions count: 2702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.early_access.mvi.C30307y.a(com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction, com.avito.android.early_access.mvi.entity.EarlyAccessState):com.avito.android.early_access.mvi.entity.EarlyAccessState");
    }
}
