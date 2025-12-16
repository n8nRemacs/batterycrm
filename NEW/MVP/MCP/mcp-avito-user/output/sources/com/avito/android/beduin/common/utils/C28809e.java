package com.avito.android.beduin.common.utils;

import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinModels.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.utils.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28809e {

    /* compiled from: BeduinModels.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.utils.e$a */
    public static final class a extends N implements Y41.l<BeduinModel, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f103516l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super BeduinModel, G0> lVar) {
            super(1);
            this.f103516l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final Boolean invoke(BeduinModel beduinModel) {
            this.f103516l.invoke(beduinModel);
            return Boolean.FALSE;
        }
    }

    @Y61.k
    public static final ArrayList a(@Y61.k Y41.l lVar, @Y61.k List list) {
        return c(new C28807c(lVar), list);
    }

    @Y61.k
    public static final ArrayList b(@Y61.k Y41.l lVar, @Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        d(new C28808d(lVar, arrayList), list);
        return arrayList;
    }

    @Y61.k
    public static final ArrayList c(@Y61.k Y41.l lVar, @Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42745f0.h(((BeduinModel) it.next()).flatMap(lVar), arrayList);
        }
        return arrayList;
    }

    public static final void d(@Y61.k Y41.l lVar, @Y61.k List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BeduinModel) it.next()).forEach(new a(lVar));
        }
    }

    public static final void e(@Y61.k Y41.l lVar, @Y61.k List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BeduinModel) it.next()).forEach(lVar);
        }
    }

    public static final boolean f(@Y61.k List<? extends BeduinModel> list) {
        List<? extends BeduinModel> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!((BeduinModel) it.next()).isValid()) {
                return false;
            }
        }
        return true;
    }
}
