package com.avito.android.search.filter.converter;

import android.content.res.Resources;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.C34160q2;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.util.InterfaceC35945t1;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.e0;

/* compiled from: CategoryParameterStringValueConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/c;", "Lcom/avito/android/search/filter/converter/b;", "a", "b", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.search.filter.converter.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final NumberFormat f262890a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f262891b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Locale f262892c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f262893d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C34160q2 f262894e;

    /* compiled from: CategoryParameterStringValueConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/search/filter/converter/c$a;", "", "<init>", "()V", "", "COMMA_SEPARATOR", "Ljava/lang/String;", "DOT_SEPARATOR", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CategoryParameterStringValueConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/c$b;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f262895a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<String> f262896b;

        /* renamed from: c, reason: collision with root package name */
        public final int f262897c;

        public b(@Y61.k String str, @Y61.k List<String> list, int i12) {
            this.f262895a = str;
            this.f262896b = list;
            this.f262897c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f262895a, bVar.f262895a) && L.f(this.f262896b, bVar.f262896b) && this.f262897c == bVar.f262897c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f262897c) + H.e(this.f262895a.hashCode() * 31, 31, this.f262896b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabValues(tabTitle=");
            sb2.append(this.f262895a);
            sb2.append(", selectedValues=");
            sb2.append(this.f262896b);
            sb2.append(", maxSize=");
            return r.t(sb2, this.f262897c, ')');
        }
    }

    /* compiled from: CategoryParameterStringValueConverter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.search.filter.converter.c$c, reason: collision with other inner class name */
    public static final class C7859c extends N implements Y41.l<SectionedMultiselectParameter.Value, List<? extends SectionedMultiselectParameter.Value>> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7859c f262898l = new C7859c();

        public C7859c() {
            super(1);
        }

        @Override // Y41.l
        public final List<? extends SectionedMultiselectParameter.Value> invoke(SectionedMultiselectParameter.Value value) {
            List<SectionedMultiselectParameter.Value> options = value.getOptions();
            return options == null ? C42784z0.f406748b : options;
        }
    }

    /* compiled from: CategoryParameterStringValueConverter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<SectionedMultiselectParameter.Value, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set<String> f262899l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Set<String> set) {
            super(1);
            this.f262899l = set;
        }

        @Override // Y41.l
        public final Boolean invoke(SectionedMultiselectParameter.Value value) {
            return Boolean.valueOf(this.f262899l.contains(value.getId()));
        }
    }

    /* compiled from: CategoryParameterStringValueConverter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/SectionedMultiselectParameter$Value;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.l<SectionedMultiselectParameter.Value, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f262900l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(SectionedMultiselectParameter.Value value) {
            String f119974b = value.getF119974b();
            if (f119974b == null) {
                return null;
            }
            if (f119974b.length() == 0) {
                f119974b = null;
            }
            return f119974b;
        }
    }

    static {
        new a(null);
    }

    public c(@Y61.k NumberFormat numberFormat, @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @Y61.k Locale locale, @Y61.k Resources resources, @Y61.k C34160q2 c34160q2) {
        this.f262890a = numberFormat;
        this.f262891b = interfaceC35945t1;
        this.f262892c = locale;
        this.f262893d = resources;
        this.f262894e = c34160q2;
    }

    public static ArrayList a(List list, List list2, Set set) {
        Object next;
        List<SectionedMultiselectParameter.Tab> list3 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        for (SectionedMultiselectParameter.Tab tab : list3) {
            List<String> groupIds = tab.getGroupIds();
            ArrayList arrayList2 = new ArrayList();
            for (String str : groupIds) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((SectionedMultiselectParameter.Value) next).getId(), str)) {
                        break;
                    }
                }
                SectionedMultiselectParameter.Value value = (SectionedMultiselectParameter.Value) next;
                if (value != null) {
                    arrayList2.add(value);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List<SectionedMultiselectParameter.Value> options = ((SectionedMultiselectParameter.Value) it2.next()).getOptions();
                if (options == null) {
                    options = C42784z0.f406748b;
                }
                C42745f0.h(options, arrayList3);
            }
            Set setP0 = C42745f0.P0(arrayList3);
            arrayList.add(new b(tab.getTabTitle(), C43033p.D(new e0(C43033p.y(C43033p.i(new C42770s0(setP0), new com.avito.android.search.filter.converter.d(set)), com.avito.android.search.filter.converter.e.f262974l))), setP0.size()));
        }
        return arrayList;
    }

    public static String b(SectionedMultiselectParameter sectionedMultiselectParameter) {
        Set<? extends String> value = sectionedMultiselectParameter.getValue();
        if (value == null || value.isEmpty()) {
            return null;
        }
        C43025h c43025hY = C43033p.y(C43033p.i(C43033p.p(new C42770s0(sectionedMultiselectParameter.getValues()), C7859c.f262898l), new d(value)), e.f262900l);
        TreeSet treeSet = new TreeSet();
        Iterator it = c43025hY.iterator();
        while (true) {
            C43025h.a aVar = (C43025h.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            treeSet.add(aVar.next());
        }
        if (treeSet.isEmpty()) {
            return null;
        }
        return C42745f0.O(treeSet, " · ", null, null, null, 62);
    }

    public static String c(EditableParameter editableParameter) {
        Object value;
        if (!editableParameter.hasValue() || (value = editableParameter.getValue()) == null) {
            return null;
        }
        return value.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x05bb, code lost:
    
        if ((r1.length() == 0) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06f9, code lost:
    
        if (r1.length() == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0147, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(@Y61.k com.avito.android.remote.model.category_parameters.base.CategoryParameter r18) {
        /*
            Method dump skipped, instructions count: 2197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.c.d(com.avito.android.remote.model.category_parameters.base.CategoryParameter):java.lang.String");
    }
}
