package com.avito.beduin.v2.interaction.detached.flow.modal;

import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.engine.component.E;
import com.avito.beduin.v2.engine.core.z;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShowModalInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/modal/r;", "Lcom/avito/beduin/v2/handler/flow/actions/b;", "a", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class r implements com.avito.beduin.v2.handler.flow.actions.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f337368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f337369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C36216a[] f337370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ModalButtonsOrientation f337371d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f337372e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f337373f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.interaction.detached.flow.modal.a f337374g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f337375h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337376i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337377j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Y41.a<dU0.f> f337378k;

    /* compiled from: ShowModalInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/detached/flow/modal/r$a;", "LdU0/c;", "<init>", "()V", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f337379b = new a();

        public a() {
            super("ShowModal");
        }

        @Override // dU0.c
        public final dU0.b b(z zVar, com.avito.beduin.v2.engine.field.m mVar) {
            return (r) E.b(zVar, mVar, new q(zVar, mVar));
        }
    }

    public r(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<dU0.f> aVar3, @Y61.k Y41.a<dU0.f> aVar4) {
        this.f337368a = str;
        this.f337369b = str2;
        this.f337370c = c36216aArr;
        this.f337371d = modalButtonsOrientation;
        this.f337372e = z12;
        this.f337373f = aVar;
        this.f337374g = aVar2;
        this.f337375h = z13;
        this.f337376i = aVar3;
        this.f337377j = aVar4;
        this.f337378k = aVar4;
    }

    @Override // com.avito.beduin.v2.handler.flow.actions.b
    @Y61.k
    public final Y41.a<dU0.f> c() {
        return this.f337378k;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f337368a, rVar.f337368a) && L.f(this.f337369b, rVar.f337369b) && L.f(this.f337370c, rVar.f337370c) && this.f337371d == rVar.f337371d && this.f337372e == rVar.f337372e && L.f(this.f337373f, rVar.f337373f) && L.f(this.f337374g, rVar.f337374g) && this.f337375h == rVar.f337375h && L.f(this.f337376i, rVar.f337376i) && L.f(this.f337377j, rVar.f337377j);
    }

    public final int hashCode() {
        String str = this.f337368a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f337369b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C36216a[] c36216aArr = this.f337370c;
        int iHashCode3 = (iHashCode2 + (c36216aArr == null ? 0 : Arrays.hashCode(c36216aArr))) * 31;
        ModalButtonsOrientation modalButtonsOrientation = this.f337371d;
        int i12 = androidx.appcompat.app.r.i((iHashCode3 + (modalButtonsOrientation == null ? 0 : modalButtonsOrientation.hashCode())) * 31, 31, this.f337372e);
        Y41.a<G0> aVar = this.f337373f;
        int iHashCode4 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2 = this.f337374g;
        return this.f337377j.hashCode() + androidx.appcompat.app.r.h(androidx.appcompat.app.r.i((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31, this.f337375h), 31, this.f337376i);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowModalInteraction(title=");
        sb2.append(this.f337368a);
        sb2.append(", subtitle=");
        sb2.append(this.f337369b);
        sb2.append(", buttons=");
        sb2.append(Arrays.toString(this.f337370c));
        sb2.append(", buttonsOrientation=");
        sb2.append(this.f337371d);
        sb2.append(", closeButtonVisible=");
        sb2.append(this.f337372e);
        sb2.append(", onCloseClick=");
        sb2.append(this.f337373f);
        sb2.append(", image=");
        sb2.append(this.f337374g);
        sb2.append(", cancelable=");
        sb2.append(this.f337375h);
        sb2.append(", onShow=");
        sb2.append(this.f337376i);
        sb2.append(", onDismiss=");
        return androidx.appcompat.app.r.v(sb2, this.f337377j, ')');
    }

    public /* synthetic */ r(String str, String str2, C36216a[] c36216aArr, ModalButtonsOrientation modalButtonsOrientation, boolean z12, Y41.a aVar, com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, Y41.a aVar3, Y41.a aVar4, int i12, C42822w c42822w) {
        this(str, str2, c36216aArr, modalButtonsOrientation, (i12 & 16) != 0 ? true : z12, aVar, (i12 & 64) != 0 ? null : aVar2, (i12 & 128) != 0 ? false : z13, aVar3, aVar4);
    }
}
