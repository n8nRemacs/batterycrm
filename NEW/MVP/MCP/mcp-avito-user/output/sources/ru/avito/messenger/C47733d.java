package ru.avito.messenger;

import androidx.view.M0;
import com.avito.android.C30277e1;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CloseScreenCommandViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/d;", "Landroidx/lifecycle/M0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47733d extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final F0 f430742E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<kotlin.G0> f430743J = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f430744K;

    @Inject
    public C47733d(@Y61.k F0 f02, @Y61.k C30277e1 c30277e1) {
        this.f430742E = f02;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f430744K = cVar;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[35];
        if (((Boolean) c30277e1.f144963I.a().invoke()).booleanValue()) {
            cVar.b(A1.h(f02.a().N(C47729b.f430735b).D(io.reactivex.rxjava3.internal.functions.a.f401991a).q0(1L), null, new C47731c(this), 3));
        }
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f430744K.e();
        super.onCleared();
    }
}
