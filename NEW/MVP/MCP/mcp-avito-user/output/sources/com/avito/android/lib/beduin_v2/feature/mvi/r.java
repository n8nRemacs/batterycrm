package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.lib.beduin_v2.feature.mvi.y;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinFeatureImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/r;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/n;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r implements n, x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> {

    /* compiled from: BeduinFeatureImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/r$a;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/n$a;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/x$a;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements n.a, x.a<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y.a<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> f176350a;

        @Inject
        public a(@Y61.k p pVar) {
            this.f176350a = new y.a<>(pVar);
        }

        @Override // com.avito.android.lib.beduin_v2.feature.mvi.x.a
        public final y a(T t12) {
            return this.f176350a.a(t12);
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super AbstractC40048c> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // com.avito.android.lib.beduin_v2.feature.mvi.x
    @Y61.k
    public final InterfaceC43160i<BeduinOneTimeEvent> getEvents() {
        throw null;
    }

    @Override // com.avito.android.lib.beduin_v2.feature.mvi.x
    public final AbstractC40048c getState() {
        throw null;
    }

    @Override // com.avito.android.lib.beduin_v2.feature.mvi.x
    public final Object ya(InterfaceC40047a interfaceC40047a, Continuation continuation) {
        throw null;
    }
}
