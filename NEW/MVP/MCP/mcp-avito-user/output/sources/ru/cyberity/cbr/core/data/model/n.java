package ru.cyberity.cbr.core.data.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.cyberity.cbr.core.data.model.g;

/* compiled from: Document.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/model/n;", "Ljava/util/Comparator;", "Lru/cyberity/cbr/core/data/model/Document;", "Lkotlin/Comparator;", "document1", "document2", "", "a", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "", "Lru/cyberity/cbr/core/data/model/DocumentType;", "b", "Ljava/util/List;", "updateDocSetOrder", "<init>", "(Lru/cyberity/cbr/core/data/model/g;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class n implements Comparator<Document> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final g applicant;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final List<DocumentType> updateDocSetOrder;

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f433156a;

        public a(List list) {
            this.f433156a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(!this.f433156a.contains(((DocumentType) t12).getValue()) ? 1 : 0), Integer.valueOf(!this.f433156a.contains(((DocumentType) t13).getValue()) ? 1 : 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    public n(@Y61.k g gVar) {
        this.applicant = gVar;
        List<g.c.a> listG = gVar.getRequiredIdDocs().g();
        ArrayList arrayList = new ArrayList(C42745f0.q(listG, 10));
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(((g.c.a) it.next()).getIdDocSetType().getValue());
        }
        ArrayList arrayListJ = this.applicant.getRequiredIdDocs().getVideoIdent() ? this.applicant.getRequiredIdDocs().j() : null;
        arrayList = arrayListJ != null ? arrayListJ : arrayList;
        List<g.c.a> listG2 = this.applicant.getRequiredIdDocs().g();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listG2, 10));
        Iterator it2 = listG2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((g.c.a) it2.next()).getIdDocSetType());
        }
        this.updateDocSetOrder = C42745f0.B0(arrayList2, new a(arrayList));
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@Y61.l Document document1, @Y61.l Document document2) {
        int i12;
        int i13 = -1;
        int i14 = 0;
        if (document1 != null) {
            Iterator<DocumentType> it = this.updateDocSetOrder.iterator();
            i12 = 0;
            while (it.hasNext()) {
                if (L.f(it.next(), document1.getType())) {
                    break;
                }
                i12++;
            }
            i12 = -1;
        } else {
            i12 = -1;
        }
        if (document2 != null) {
            Iterator<DocumentType> it2 = this.updateDocSetOrder.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (L.f(it2.next(), document2.getType())) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
        }
        return i12 - i13;
    }
}
