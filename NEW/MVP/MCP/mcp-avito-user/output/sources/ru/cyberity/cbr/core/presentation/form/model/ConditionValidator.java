package ru.cyberity.cbr.core.presentation.form.model;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.presentation.form.FieldId;
import ru.cyberity.cbr.core.presentation.form.ItemValueCache;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: ConditionValidator.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJB\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\u0014\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/ConditionValidator;", "", "()V", "polishNotationSolver", "Lru/cyberity/cbr/core/presentation/form/model/PolishNotationSolver;", "checkConditions", "Lru/cyberity/cbr/core/presentation/form/model/ConditionValidator$CheckResult;", "items", "", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "valueCache", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "shouldBeVisible", "", "item", "invisibleSections", "", "", "invisibleItems", "Lru/cyberity/cbr/core/presentation/form/FieldId;", "findItem", "sectionId", "itemId", "CheckResult", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ConditionValidator {

    @k
    public static final ConditionValidator INSTANCE = new ConditionValidator();

    @k
    private static final PolishNotationSolver polishNotationSolver = new PolishNotationSolver();

    /* compiled from: ConditionValidator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/ConditionValidator$CheckResult;", "", "", "", "illegalSectionIds", "Lru/cyberity/cbr/core/presentation/form/FieldId;", "illegalItemIds", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "component2", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getIllegalSectionIds", "getIllegalItemIds", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class CheckResult {

        @k
        private final Set<FieldId> illegalItemIds;

        @k
        private final Set<String> illegalSectionIds;

        public CheckResult(@k Set<String> set, @k Set<FieldId> set2) {
            this.illegalSectionIds = set;
            this.illegalItemIds = set2;
        }

        @k
        public final Set<String> component1() {
            return this.illegalSectionIds;
        }

        @k
        public final Set<FieldId> component2() {
            return this.illegalItemIds;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckResult)) {
                return false;
            }
            CheckResult checkResult = (CheckResult) other;
            return L.f(this.illegalSectionIds, checkResult.illegalSectionIds) && L.f(this.illegalItemIds, checkResult.illegalItemIds);
        }

        @k
        public final Set<FieldId> getIllegalItemIds() {
            return this.illegalItemIds;
        }

        @k
        public final Set<String> getIllegalSectionIds() {
            return this.illegalSectionIds;
        }

        public int hashCode() {
            return this.illegalItemIds.hashCode() + (this.illegalSectionIds.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CheckResult(illegalSectionIds=");
            sb2.append(this.illegalSectionIds);
            sb2.append(", illegalItemIds=");
            return c.u(sb2, this.illegalItemIds, ')');
        }
    }

    private ConditionValidator() {
    }

    private final FormItem findItem(List<? extends FormItem> list, String str, String str2) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            FormItem formItem = (FormItem) next;
            if (L.f(formItem.getSectionId(), str) && L.f(formItem.getItem().getId(), str2)) {
                break;
            }
        }
        return (FormItem) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldBeVisible(ru.cyberity.cbr.core.presentation.form.model.FormItem r17, java.util.List<? extends ru.cyberity.cbr.core.presentation.form.model.FormItem> r18, java.util.Set<java.lang.String> r19, java.util.Set<ru.cyberity.cbr.core.presentation.form.FieldId> r20, ru.cyberity.cbr.core.presentation.form.ItemValueCache r21) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.form.model.ConditionValidator.shouldBeVisible(ru.cyberity.cbr.core.presentation.form.model.FormItem, java.util.List, java.util.Set, java.util.Set, ru.cyberity.cbr.core.presentation.form.ItemValueCache):boolean");
    }

    @k
    public final CheckResult checkConditions(@k List<? extends FormItem> items, @k ItemValueCache valueCache) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof FormItem.Section) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : items) {
            if (((FormItem) obj2).getItem().getId() != null) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String sectionId = ((FormItem) next).getSectionId();
            Object objR = linkedHashMap.get(sectionId);
            if (objR == null) {
                objR = e.r(linkedHashMap, sectionId);
            }
            ((List) objR).add(next);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            FormItem.Section section = (FormItem.Section) it2.next();
            List<FormItem> list = (List) linkedHashMap.get(section.getSectionId());
            if (INSTANCE.shouldBeVisible(section, items, linkedHashSet2, linkedHashSet, valueCache)) {
                if (list != null && (r10 = list.iterator()) != null) {
                    for (FormItem formItem : list) {
                        if (!INSTANCE.shouldBeVisible(formItem, items, linkedHashSet2, linkedHashSet, valueCache) && formItem.getSectionId() != null && formItem.getItem().getId() != null) {
                            linkedHashSet.add(new FieldId(formItem.getSectionId(), formItem.getItem().getId()));
                        }
                    }
                }
            } else if (list != null && (r0 = list.iterator()) != null) {
                for (FormItem formItem2 : list) {
                    if (formItem2.getSectionId() != null && formItem2.getItem().getId() != null) {
                        linkedHashSet.add(new FieldId(formItem2.getSectionId(), formItem2.getItem().getId()));
                    }
                    String sectionId2 = formItem2.getSectionId();
                    if (sectionId2 != null) {
                        linkedHashSet2.add(sectionId2);
                    }
                }
            }
        }
        return new CheckResult(linkedHashSet2, linkedHashSet);
    }
}
