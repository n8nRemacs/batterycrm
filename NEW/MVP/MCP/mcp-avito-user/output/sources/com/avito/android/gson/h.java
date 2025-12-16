package com.avito.android.gson;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.A;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.r;
import kotlin.reflect.n;

/* compiled from: NullSafeGson.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KParameter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class h extends N implements Y41.a<List<? extends KParameter>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class<?> f161336l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Class<?> cls) {
        super(0);
        this.f161336l = cls;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final List<? extends KParameter> invoke() {
        Object next;
        r.a aVar = (r.a) ((r) m0.f406844a.b(this.f161336l)).f410414f.getValue();
        aVar.getClass();
        n<Object> nVar = r.a.f410415q[4];
        Iterator it = ((Collection) aVar.f410419f.invoke()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC42881j) ((A) ((kotlin.reflect.i) next)).n()).J()) {
                break;
            }
        }
        kotlin.reflect.i iVar = (kotlin.reflect.i) next;
        List<KParameter> parameters = iVar != null ? iVar.getParameters() : null;
        return parameters == null ? C42784z0.f406748b : parameters;
    }
}
