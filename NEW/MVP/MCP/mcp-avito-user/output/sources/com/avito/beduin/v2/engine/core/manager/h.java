package com.avito.beduin.v2.engine.core.manager;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.engine.core.M;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReadersManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/manager/h;", "Lcom/avito/beduin/v2/engine/core/M;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements M {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashSet f336671a = new LinkedHashSet();

    /* compiled from: ReadersManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/M;", "value", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/engine/core/M;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<M, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f336672l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(M m12) {
            throw new DeferredInvalidationForbiddenException(m12);
        }
    }

    public final void a() {
        while (true) {
            LinkedHashSet linkedHashSet = this.f336671a;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            for (M m12 : C42745f0.P0(linkedHashSet)) {
                m12.e(a.f336672l);
                linkedHashSet.remove(m12);
            }
        }
    }

    @Override // com.avito.beduin.v2.engine.core.M
    public final void e(@k l<? super M, G0> lVar) {
        a();
    }
}
