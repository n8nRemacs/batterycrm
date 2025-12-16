package com.avito.android.lib.beduin_v2.component.input.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputState;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.C36351h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InputComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/input/compose/s;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/avito/component/input/state/AvitoInputState;", MessageBody.SystemMessageBody.Platform.INPUT_STATE, "_design-modules_beduin-v2_renderer-compose_component_input"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class s extends AbstractC36347d<AvitoInputState> {

    /* compiled from: InputComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> f175702m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f175703n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f175704o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f175702m = lVar;
            this.f175703n = interfaceC36249i;
            this.f175704o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f175704o | 1);
            Y41.l<com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> lVar = this.f175702m;
            InterfaceC36249i interfaceC36249i = this.f175703n;
            s.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.k Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> lVar, @Y61.k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1920165120);
        InterfaceC22204y1 interfaceC22204y1A = C36351h.a(interfaceC36249i, bE2, 8);
        q.a((AvitoInputState) interfaceC22204y1A.getF42167b(), com.avito.beduin.v2.render.compose.o.b(lVar, bE2, i12 & 14), bE2, 8);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(lVar, interfaceC36249i, i12);
        }
    }
}
