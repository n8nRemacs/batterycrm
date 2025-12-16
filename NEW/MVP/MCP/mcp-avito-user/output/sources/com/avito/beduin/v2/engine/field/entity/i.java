package com.avito.beduin.v2.engine.field.entity;

import com.avito.beduin.v2.engine.field.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ErrorData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/i;", "Lcom/avito/beduin/v2/engine/field/d;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i implements com.avito.beduin.v2.engine.field.d {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f336803c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Exception f336804b;

    /* compiled from: ErrorData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/i$a;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k Exception exc) {
        this.f336804b = exc;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final A a(com.avito.beduin.v2.engine.core.z zVar) throws Exception {
        throw this.f336804b;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final boolean b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        return false;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final l e(com.avito.beduin.v2.engine.core.z zVar) throws Exception {
        throw this.f336804b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f336804b.equals(((i) obj).f336804b);
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final x g(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        d.b.f(zVar, this);
        throw null;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final com.avito.beduin.v2.engine.field.d h(com.avito.beduin.v2.engine.core.z zVar) throws Exception {
        throw this.f336804b;
    }

    public final int hashCode() {
        return this.f336804b.hashCode();
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final p k(com.avito.beduin.v2.engine.core.z zVar) throws Exception {
        throw this.f336804b;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final C36268a l(com.avito.beduin.v2.engine.core.z zVar) throws Exception {
        throw this.f336804b;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final com.avito.beduin.v2.engine.field.f m(com.avito.beduin.v2.engine.core.z zVar) throws Exception {
        throw this.f336804b;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final v q(com.avito.beduin.v2.engine.core.z zVar) throws Exception {
        throw this.f336804b;
    }

    @Override // com.avito.beduin.v2.engine.field.d
    public final c r(com.avito.beduin.v2.engine.core.z zVar) throws Exception {
        throw this.f336804b;
    }

    @Y61.k
    public final String toString() {
        return "ErrorData(throwable=" + this.f336804b + ')';
    }

    @Override // com.avito.beduin.v2.engine.field.d
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar) {
        return this;
    }
}
