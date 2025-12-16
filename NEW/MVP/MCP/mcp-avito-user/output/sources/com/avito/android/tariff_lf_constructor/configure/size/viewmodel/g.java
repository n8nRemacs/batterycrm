package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import pD0.InterfaceC46937a;
import yD0.C50102a;

/* compiled from: ConstructorConfigureSizeRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/viewmodel/g;", "Lcom/avito/android/tariff_lf_constructor/configure/size/viewmodel/e;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements InterfaceC35228e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46937a f300377a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f300378b;

    /* compiled from: ConstructorConfigureSizeRepository.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LyD0/a;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f300379b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public g(@Y61.k InterfaceC46937a interfaceC46937a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f300377a = interfaceC46937a;
        this.f300378b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.InterfaceC35228e
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<C50102a>> c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return this.f300377a.c(str, str2, str3).x0(this.f300378b.a()).d0(a.f300379b).r0(P2.c.f318721a);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.InterfaceC35228e
    @Y61.k
    public final B0 d(@Y61.k String str, @Y61.k String str2) {
        return this.f300377a.g(str, str2).x0(this.f300378b.a()).d0(f.f300376b);
    }
}
