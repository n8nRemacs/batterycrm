package com.avito.android.advertising.loaders.beduin.container;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.theme.r;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommercialBoxState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/container/e;", "Lcom/avito/beduin/v2/component/box/state/a;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class e implements com.avito.beduin.v2.component.box.state.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.component.box.state.b f88122a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f88123b;

    /* compiled from: CommercialBoxState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/container/e$a;", "Lcom/avito/beduin/v2/engine/component/j;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC36250j {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f88124c = new a();

        public a() {
            super("AdvBox", false, 2, null);
        }

        @Override // com.avito.beduin.v2.engine.component.AbstractC36250j
        public final Object a(AbstractC36250j.b bVar, String str) {
            return (e) E.b(bVar, bVar.f336563b, d.f88121l);
        }
    }

    public e(@k com.avito.beduin.v2.component.box.state.b bVar, @l String str) {
        this.f88122a = bVar;
        this.f88123b = str;
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @l
    /* renamed from: a */
    public final ET0.b getF335571d() {
        return this.f88122a.f335571d;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f88122a.f335573f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f88122a.f335574g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        this.f88122a.getClass();
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f88122a, eVar.f88122a) && L.f(this.f88123b, eVar.f88123b);
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @k
    /* renamed from: getBackgroundColor */
    public final r getF335569b() {
        return this.f88122a.f335569b;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36245e
    @k
    /* renamed from: getChildren */
    public final ET0.a getF335568a() {
        return this.f88122a.f335568a;
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag */
    public final String getF334415f() {
        return this.f88122a.f335575h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible */
    public final boolean getF334412c() {
        return this.f88122a.f335570c;
    }

    public final int hashCode() {
        int iHashCode = this.f88122a.hashCode() * 31;
        String str = this.f88123b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommercialBoxState(boxState=");
        sb2.append(this.f88122a);
        sb2.append(", elementId=");
        return C22026a.c(sb2, this.f88123b, ')');
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @l
    public final Y41.a<G0> u() {
        return this.f88122a.f335572e;
    }
}
