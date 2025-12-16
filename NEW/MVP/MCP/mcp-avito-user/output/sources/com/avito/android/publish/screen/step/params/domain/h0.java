package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.details.w2;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: PublishDetailsObserverInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/domain/h0;", "Lcom/avito/android/publish/screen/step/params/domain/g0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<w2> f241275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<PublishDetailsInternalAction> f241276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Je0.d f241277c;

    /* compiled from: PublishDetailsObserverInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements Y41.l<PublishDetailsInternalAction, G0> {
        @Override // Y41.l
        public final G0 invoke(PublishDetailsInternalAction publishDetailsInternalAction) {
            ((Y1) this.receiver).K5(publishDetailsInternalAction);
            return G0.f406611a;
        }
    }

    @Inject
    public h0(@Y61.k Set<w2> set) {
        this.f241275a = set;
        e2 e2VarB = f2.b(0, 32, null, 5);
        this.f241276b = C43175k.a(e2VarB);
        this.f241277c = new Je0.d(new a(1, e2VarB, Y1.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8));
    }

    @Override // com.avito.android.publish.screen.step.params.domain.g0
    public final void a() {
        Iterator<T> it = this.f241275a.iterator();
        while (it.hasNext()) {
            ((w2) it.next()).e0();
        }
    }

    @Override // com.avito.android.publish.screen.step.params.domain.g0
    @Y61.k
    public final InterfaceC43160i<PublishDetailsInternalAction> getEvents() {
        return this.f241276b;
    }

    @Override // com.avito.android.publish.screen.step.params.domain.g0
    public final void q() {
        Iterator<T> it = this.f241275a.iterator();
        while (it.hasNext()) {
            ((w2) it.next()).p2(this.f241277c);
        }
    }
}
