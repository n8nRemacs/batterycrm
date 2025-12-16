package com.avito.android.publish.start_publish;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.maybe.j0;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AddAdvertInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/d;", "Lcom/avito/android/publish/start_publish/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.start_publish.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34129d implements InterfaceC34126a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<H0> f245361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public volatile List<C34130e> f245363c;

    public C34129d(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f245361a = eVar;
        this.f245362b = interfaceC35745a5;
    }

    @Override // com.avito.android.publish.start_publish.InterfaceC34126a
    @Y61.k
    public final W a() {
        List<C34130e> list = this.f245363c;
        List<C34130e> list2 = list;
        io.reactivex.rxjava3.core.q qVarI = (list2 == null || list2.isEmpty()) ? C41928w.f403335b : io.reactivex.rxjava3.core.q.i(list);
        C42022u c42022uK = g1.a(this.f245361a.get().x()).r(new C34127b(this)).k(new C34128c(this));
        qVarI.getClass();
        return new j0(qVarI, c42022uK).z(this.f245362b.a());
    }
}
