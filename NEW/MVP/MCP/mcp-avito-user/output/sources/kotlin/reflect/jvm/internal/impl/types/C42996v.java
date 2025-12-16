package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.n0;

/* compiled from: TypeAttributeTranslator.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42996v implements m0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42996v f410262a = new C42996v();

    @Override // kotlin.reflect.jvm.internal.impl.types.m0
    @Y61.k
    public final n0 a(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (gVar.isEmpty()) {
            n0.f410236c.getClass();
            return n0.f410237d;
        }
        n0.a aVar = n0.f410236c;
        List listSingletonList = Collections.singletonList(new C42992q(gVar));
        aVar.getClass();
        return n0.a.c(listSingletonList);
    }
}
