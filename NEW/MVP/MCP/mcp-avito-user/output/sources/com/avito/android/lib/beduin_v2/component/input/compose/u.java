package com.avito.android.lib.beduin_v2.component.input.compose;

import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.P;
import bU.AbstractC25557a;
import bU.C25558b;
import bU.InterfaceC25559c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InputComposeStyle.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/input/compose/u;", "LbU/a;", "Lcom/akita/compose/component/input/v;", "Lcom/avito/beduin/v2/avito/component/input/state/c;", "a", "_design-modules_beduin-v2_renderer-compose_component_input"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u extends AbstractC25557a<com.akita.compose.component.input.v, com.avito.beduin.v2.avito.component.input.state.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f175705b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v f175706a;

    /* compiled from: InputComposeStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/input/compose/u$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_component_input"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        @InterfaceC22137p
        public static u a(@Y61.k Y41.p pVar) {
            InterfaceC25559c.f57078a.getClass();
            return new u(new v(new C25558b(pVar), null));
        }

        public a() {
        }
    }

    public u(@Y61.k v vVar) {
        this.f175706a = vVar;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175706a;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object f(Object obj, com.avito.beduin.v2.theme.m mVar) {
        return new v((InterfaceC25559c) obj, (com.avito.beduin.v2.avito.component.input.state.c) mVar);
    }
}
