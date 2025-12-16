package com.avito.android.arch.mvi.utils;

import com.avito.android.arch.mvi.utils.o;
import kotlin.Metadata;

/* compiled from: PrivateStateHolder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/utils/n;", "ValueT", "ReadAccessContextT", "ReadWriteAccessContextT", "", "a", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface n<ValueT, ReadAccessContextT, ReadWriteAccessContextT> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f92111a = a.f92112a;

    /* compiled from: PrivateStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/utils/n$a;", "", "<init>", "()V", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f92112a = new a();
    }

    @Y61.k
    o.a a(Object obj);

    @Y61.k
    <T extends ReadAccessContextT> x<ValueT> b(T t12);
}
