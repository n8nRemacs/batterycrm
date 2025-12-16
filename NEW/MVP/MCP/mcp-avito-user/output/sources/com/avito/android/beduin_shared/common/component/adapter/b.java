package com.avito.android.beduin_shared.common.component.adapter;

import Y61.k;
import androidx.collection.C20199a;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSyncAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin_shared/common/component/adapter/b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/beduin_shared/common/component/adapter/b$a;", "<init>", "()V", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class b extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C20199a<kotlin.reflect.d<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, Integer> f105270c = new C20199a<>();

    /* renamed from: d, reason: collision with root package name */
    public int f105271d = -1;

    /* compiled from: BeduinSyncAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/common/component/adapter/b$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC40116e f105272b;

        public a(@k InterfaceC40116e interfaceC40116e) {
            super(interfaceC40116e.getF103243b());
            this.f105272b = interfaceC40116e;
        }
    }

    public final int j(@k AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a) {
        kotlin.reflect.d<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> dVarB = m0.f406844a.b(abstractC40112a.getClass());
        C20199a<kotlin.reflect.d<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, Integer> c20199a = this.f105270c;
        Integer numValueOf = c20199a.get(dVarB);
        if (numValueOf == null) {
            int i12 = this.f105271d + 1;
            this.f105271d = i12;
            numValueOf = Integer.valueOf(i12);
            c20199a.put(dVarB, numValueOf);
        }
        return numValueOf.intValue();
    }

    public abstract void k(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list);
}
