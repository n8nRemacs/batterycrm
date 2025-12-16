package com.avito.android.str_calendar.seller.calandar_parameters.domain.children;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.ChildrenAgesParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: AvailableChildrenAgesBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/children/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/children/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a {

    /* compiled from: AvailableChildrenAgesBuilder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ChildrenAgesParameter;", "childrenAgesParameter", "Lkotlin/Q;", "", "invoke", "(Lcom/avito/android/remote/model/category_parameters/ChildrenAgesParameter;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<ChildrenAgesParameter, Q<? extends Integer, ? extends Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f286927l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Q<? extends Integer, ? extends Integer> invoke(ChildrenAgesParameter childrenAgesParameter) {
            Long value;
            Long value2;
            ChildrenAgesParameter childrenAgesParameter2 = childrenAgesParameter;
            IntParameter fromAgeParameter = childrenAgesParameter2.getFromAgeParameter();
            Integer numValueOf = null;
            Integer numValueOf2 = (fromAgeParameter == null || (value2 = fromAgeParameter.getValue()) == null) ? null : Integer.valueOf((int) value2.longValue());
            IntParameter toAgeParameter = childrenAgesParameter2.getToAgeParameter();
            if (toAgeParameter != null && (value = toAgeParameter.getValue()) != null) {
                numValueOf = Integer.valueOf((int) value.longValue());
            }
            return new Q<>(numValueOf2, numValueOf);
        }
    }

    /* compiled from: AvailableChildrenAgesBuilder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "it", "Lkotlin/ranges/l;", "invoke", "(Lkotlin/Q;)Lkotlin/ranges/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.domain.children.b$b, reason: collision with other inner class name */
    public static final class C8606b extends N implements Y41.l<Q<? extends Integer, ? extends Integer>, kotlin.ranges.l> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8606b f286928l = new C8606b();

        public C8606b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final kotlin.ranges.l invoke(Q<? extends Integer, ? extends Integer> q12) {
            Q<? extends Integer, ? extends Integer> q13 = q12;
            Integer num = (Integer) q13.f406619b;
            Integer num2 = (Integer) q13.f406620c;
            if (num == null || num2 == null) {
                return null;
            }
            return new kotlin.ranges.l(num.intValue(), num2.intValue(), 1);
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a
    @Y61.l
    public final Q<Integer, Integer> a(@Y61.l Integer num, @Y61.k Collection<Integer> collection, @Y61.k Collection<Integer> collection2, @Y61.k Set<Integer> set) {
        int iIntValue;
        Integer num2 = (Integer) C42745f0.W(collection);
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            if (num == null || num.intValue() >= iIntValue2 || set.contains(Integer.valueOf(num.intValue() + 1))) {
                Integer num3 = (Integer) C42745f0.F(c(collection, set));
                if (num3 != null) {
                    iIntValue = num3.intValue();
                }
            } else {
                iIntValue = num.intValue() + 1;
            }
            Integer num4 = (Integer) C42745f0.W(b(Integer.valueOf(iIntValue), collection2, set));
            if (num4 != null) {
                return new Q<>(Integer.valueOf(iIntValue), num4);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Integer] */
    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a
    @Y61.k
    public final LinkedHashSet b(@Y61.l Integer num, @Y61.k Collection collection, @Y61.k Set set) {
        int iIntValue;
        int iIntValue2;
        Collection collection2 = collection;
        Integer num2 = (Integer) C42745f0.W(collection2);
        l0.h hVar = new l0.h();
        if (num != null && num2 != null && (iIntValue = num.intValue()) <= (iIntValue2 = num2.intValue())) {
            while (true) {
                if (!set.contains(Integer.valueOf(iIntValue))) {
                    if (iIntValue == iIntValue2) {
                        break;
                    }
                    iIntValue++;
                } else {
                    hVar.f406842b = Integer.valueOf(iIntValue);
                    break;
                }
            }
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(C43033p.F(C43033p.i(C43033p.i(new C42770s0(collection2), new d(num)), new e(hVar))));
        linkedHashSetO0.removeAll(C42745f0.s(set));
        return linkedHashSetO0;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a
    @Y61.k
    public final LinkedHashSet c(@Y61.k Collection collection, @Y61.k Set set) {
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(C43033p.F(C43033p.i(new C42770s0(collection), new c(set))));
        linkedHashSetO0.removeAll(C42745f0.s(set));
        return linkedHashSetO0;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a
    @Y61.k
    public final Set<Integer> d(@Y61.k Collection<ChildrenAgesParameter> collection) {
        List listD = C43033p.D(C43033p.y(new o0(new C42770s0(collection), a.f286927l), C8606b.f286928l));
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            C42745f0.h(C42745f0.M0((kotlin.ranges.l) it.next()), arrayList);
        }
        return C42745f0.P0(arrayList);
    }
}
