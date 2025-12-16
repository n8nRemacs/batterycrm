package com.avito.android.lib.beduin_v2.component.spinner.compose;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.P;
import bU.AbstractC25557a;
import bU.C25558b;
import bU.InterfaceC25559c;
import com.akita.compose.component.spinner.h;
import com.avito.beduin.v2.theme.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SpinnerComposeStyle.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/spinner/compose/b;", "LbU/a;", "Lcom/akita/compose/component/spinner/h;", "Lcom/avito/beduin/v2/avito/component/spinner/state/h;", "a", "_design-modules_beduin-v2_renderer-compose_component_spinner"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC25557a<h, com.avito.beduin.v2.avito.component.spinner.state.h> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f175923b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f175924a;

    /* compiled from: SpinnerComposeStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/spinner/compose/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_component_spinner"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        @InterfaceC22137p
        public static b a(@k p pVar) {
            InterfaceC25559c.f57078a.getClass();
            return new b(new c(new C25558b(pVar), null));
        }

        public a() {
        }
    }

    public b(@k c cVar) {
        this.f175924a = cVar;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175924a;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object f(Object obj, m mVar) {
        return new c((InterfaceC25559c) obj, (com.avito.beduin.v2.avito.component.spinner.state.h) mVar);
    }
}
