package com.avito.android.arch.mvi.utils;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: PrivateStateHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/arch/mvi/utils/o;", "ValueT", "ReadAccessContextT", "ReadWriteAccessContextT", "Lcom/avito/android/arch/mvi/utils/n;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o<ValueT, ReadAccessContextT, ReadWriteAccessContextT> implements n<ValueT, ReadAccessContextT, ReadWriteAccessContextT> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<ValueT> f92113b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f92114c = new a(this);

    /* compiled from: PrivateStateHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/arch/mvi/utils/o$a", "Lcom/avito/android/arch/mvi/utils/l;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements l<ValueT> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o<ValueT, ReadAccessContextT, ReadWriteAccessContextT> f92115a;

        public a(o<ValueT, ReadAccessContextT, ReadWriteAccessContextT> oVar) {
            this.f92115a = oVar;
        }

        @Override // com.avito.android.arch.mvi.utils.x
        public final ValueT getValue() {
            return this.f92115a.f92113b.getValue();
        }

        @Override // com.avito.android.arch.mvi.utils.l
        public final void setValue(ValueT valuet) {
            this.f92115a.f92113b.setValue(valuet);
        }
    }

    public o(ValueT valuet) {
        this.f92113b = p2.a(valuet);
    }

    @Override // com.avito.android.arch.mvi.utils.n
    @Y61.k
    public final a a(Object obj) {
        return this.f92114c;
    }

    @Override // com.avito.android.arch.mvi.utils.n
    @Y61.k
    public final <T extends ReadAccessContextT> x<ValueT> b(T t12) {
        return this.f92114c;
    }
}
