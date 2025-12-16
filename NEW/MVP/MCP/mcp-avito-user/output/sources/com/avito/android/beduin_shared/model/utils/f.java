package com.avito.android.beduin_shared.model.utils;

import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: BeduinModels.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* compiled from: BeduinModels.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin_models/BeduinModel;", "model", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<BeduinModel, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f105331l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.h<BeduinModel> f105332m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super BeduinModel, Boolean> lVar, l0.h<BeduinModel> hVar) {
            super(1);
            this.f105331l = (N) lVar;
            this.f105332m = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, com.avito.android.beduin_models.BeduinModel, java.lang.Object] */
        @Override // Y41.l
        public final G0 invoke(BeduinModel beduinModel) {
            BeduinModel beduinModel2 = beduinModel;
            if (((Boolean) this.f105331l.invoke(beduinModel2)).booleanValue()) {
                this.f105332m.f406842b = beduinModel2;
            }
            return G0.f406611a;
        }
    }

    @Y61.k
    public static final ArrayList a(@Y61.k Y41.l lVar, @Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(lVar, arrayList);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BeduinModel) it.next()).forEach(new g(eVar));
        }
        return arrayList;
    }

    @Y61.l
    public static final BeduinModel b(@Y61.k Y41.l lVar, @Y61.k List list) {
        l0.h hVar = new l0.h();
        a aVar = new a(lVar, hVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((BeduinModel) it.next()).forEach(new g(aVar));
        }
        return (BeduinModel) hVar.f406842b;
    }
}
