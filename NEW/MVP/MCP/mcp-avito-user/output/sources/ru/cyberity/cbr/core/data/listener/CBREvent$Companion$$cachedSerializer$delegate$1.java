package ru.cyberity.cbr.core.data.listener;

import Y41.a;
import Y61.k;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.r;

/* compiled from: CBREventHandler.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBREvent$Companion$$cachedSerializer$delegate$1 extends N implements a<KSerializer<Object>> {
    public static final CBREvent$Companion$$cachedSerializer$delegate$1 INSTANCE = new CBREvent$Companion$$cachedSerializer$delegate$1();

    public CBREvent$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // Y41.a
    @k
    public final KSerializer<Object> invoke() {
        return new r("ru.cyberity.cbr.core.data.listener.CBREvent", m0.f406844a.b(CBREvent.class), new d[0], new KSerializer[0], new Annotation[0]);
    }
}
