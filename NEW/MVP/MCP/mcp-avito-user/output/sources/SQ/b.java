package Sq;

import Y61.k;
import com.avito.android.comparison.remote.model.ComparisonItem;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.comparison.remote.model.ComparisonValue;
import com.avito.android.comparison.remote.model.JobRknDisclaimer;
import com.avito.android.comparison.remote.model.OptionItem;
import com.avito.android.comparison.remote.model.SpecificationItem;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonBodyItemFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSq/b;", "LSq/a;", "a", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements InterfaceC15213a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comparison.e f15154a;

    /* renamed from: b, reason: collision with root package name */
    public long f15155b;

    /* compiled from: ComparisonBodyItemFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LSq/b$a;", "", "<init>", "()V", "", "ICON_TYPE", "Ljava/lang/String;", "TEXT_TYPE", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k com.avito.android.comparison.e eVar) {
        this.f15154a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.avito.android.comparison.items.option_icon_value_item.a] */
    @Override // Sq.InterfaceC15213a
    @k
    public final List<TV0.a> a(@k ComparisonResponse comparisonResponse, boolean z12) {
        Iterator it;
        Iterator it2;
        com.avito.android.comparison.items.option_text_value_item.a aVar;
        com.avito.android.comparison.items.option_text_value_item.a aVar2;
        if (comparisonResponse.getItems().isEmpty()) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        JobRknDisclaimer jobRknDisclaimer = comparisonResponse.getJobRknDisclaimer();
        com.avito.android.comparison.items.disclaimer.a aVar3 = jobRknDisclaimer != null ? new com.avito.android.comparison.items.disclaimer.a(b(), jobRknDisclaimer.getText()) : null;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        com.avito.android.comparison.items.diff_switch_item.a aVar4 = comparisonResponse.getItems().size() > 1 ? new com.avito.android.comparison.items.diff_switch_item.a(b(), z12) : null;
        if (aVar4 != null) {
            arrayList.add(aVar4);
        }
        ArrayList arrayList2 = new ArrayList();
        List<SpecificationItem> listF = comparisonResponse.f();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listF) {
            if (!((SpecificationItem) obj).c().isEmpty()) {
                arrayList3.add(obj);
            }
        }
        Iterator it3 = arrayList3.iterator();
        int i12 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            SpecificationItem specificationItem = (SpecificationItem) next;
            com.avito.android.comparison.e eVar = this.f15154a;
            arrayList2.add(new com.avito.android.comparison.items.specification_header_item.c(specificationItem.getTitle(), i12 == 0 ? eVar.getF123908f() : eVar.getF123909g(), b()));
            Iterator it4 = specificationItem.c().iterator();
            while (it4.hasNext()) {
                OptionItem optionItem = (OptionItem) it4.next();
                arrayList2.add(new com.avito.android.comparison.items.option_header_item.c(b(), optionItem.getTitle()));
                long jB2 = b();
                List<ComparisonItem> items = comparisonResponse.getItems();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(items, 10));
                Iterator it5 = items.iterator();
                while (it5.hasNext()) {
                    ComparisonValue comparisonValue = ((ComparisonItem) it5.next()).d().get(optionItem.getOptionId());
                    if (comparisonValue == null) {
                        it = it3;
                        aVar = new com.avito.android.comparison.items.option_text_value_item.a(b(), eVar.getF123903a());
                        it2 = it4;
                    } else {
                        it = it3;
                        String type = comparisonValue.getType();
                        if (L.f(type, "icon")) {
                            it2 = it4;
                            aVar2 = new com.avito.android.comparison.items.option_icon_value_item.a(b(), comparisonValue.getValue());
                        } else {
                            it2 = it4;
                            if (L.f(type, "text")) {
                                long jB3 = b();
                                String value = comparisonValue.getValue();
                                if (value.length() == 0) {
                                    value = eVar.getF123903a();
                                }
                                aVar = new com.avito.android.comparison.items.option_text_value_item.a(jB3, value);
                            } else {
                                aVar2 = new com.avito.android.comparison.items.option_text_value_item.a(b(), eVar.getF123903a());
                            }
                        }
                        aVar = aVar2;
                    }
                    arrayList4.add(aVar);
                    it3 = it;
                    it4 = it2;
                }
                ArrayList arrayList5 = new ArrayList(arrayList4);
                arrayList5.add(new com.avito.android.comparison.items.option_text_value_item.a(b(), new String()));
                arrayList2.add(new com.avito.android.comparison.items.nested_scrolling_item.e(jB2, arrayList5));
                it3 = it3;
                it4 = it4;
            }
            i12 = i13;
        }
        if (arrayList2.isEmpty()) {
            arrayList.add(new com.avito.android.comparison.items.no_diff_stub_item.a(b()));
        }
        return O2.b(arrayList, arrayList2);
    }

    public final long b() {
        long j12 = this.f15155b;
        this.f15155b = 1 + j12;
        return j12;
    }
}
