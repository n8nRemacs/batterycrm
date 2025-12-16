package com.avito.android.loyalty.ui.criteria;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deep_linking.links.x;
import com.avito.android.loyalty.remote.model.quality_service.GradeColor;
import com.avito.android.loyalty.ui.criteria.items.card.a;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CriteriaTabsInfoConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/e;", "", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f183449d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f183450a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f183451b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CriteriaArgs f183452c;

    /* compiled from: CriteriaTabsInfoConverter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/e$a;", "", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CriteriaTabsInfoConverter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.loyalty.ui.criteria.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C5382a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f183453a;

            static {
                int[] iArr = new int[GradeColor.values().length];
                try {
                    iArr[GradeColor.RED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GradeColor.YELLOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GradeColor.GREEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f183453a = iArr;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static ArrayList a(List list, w wVar, x xVar, a.b bVar, String str) {
            List<dX.e> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (dX.e eVar : list2) {
                String id2 = eVar.getId();
                String title = eVar.getTitle();
                String id3 = eVar.getId();
                AttributedText description = eVar.getDescription();
                description.setOnDeepLinkClickListener(wVar);
                description.setOnUrlClickListener(xVar);
                G0 g02 = G0.f406611a;
                a aVar = e.f183449d;
                GradeColor color = eVar.getColor();
                aVar.getClass();
                int i12 = color == null ? -1 : C5382a.f183453a[color.ordinal()];
                arrayList.add(new com.avito.android.loyalty.ui.criteria.items.card.a(id2, title, id3, description, i12 != 1 ? i12 != 2 ? i12 != 3 ? null : new a.AbstractC5383a.C5384a() : new a.AbstractC5383a.c() : new a.AbstractC5383a.b(), eVar.getScore(), null, bVar, (bVar instanceof a.b.C5385a) || L.f(eVar.getId(), str)));
            }
            return arrayList;
        }

        @Y61.k
        public static ArrayList b(@Y61.k List list, @Y61.k w wVar, @Y61.k x xVar, @Y61.l a.b.C5386b c5386b, @Y61.l String str) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dX.d dVar = (dX.d) it.next();
                ArrayList arrayList2 = new ArrayList();
                if (!C43066x.K(dVar.getTitle())) {
                    arrayList2.add(new com.avito.android.loyalty.ui.criteria.items.header.c(dVar.getId(), dVar.getTitle()));
                }
                a aVar = e.f183449d;
                List<dX.e> listB = dVar.b();
                aVar.getClass();
                arrayList2.addAll(a(listB, wVar, xVar, c5386b, str));
                C42745f0.h(arrayList2, arrayList);
            }
            return arrayList;
        }

        public a() {
        }
    }

    @Inject
    public e(@Y61.k w wVar, @Y61.k x xVar, @Y61.k CriteriaArgs criteriaArgs) {
        this.f183450a = wVar;
        this.f183451b = xVar;
        this.f183452c = criteriaArgs;
    }
}
