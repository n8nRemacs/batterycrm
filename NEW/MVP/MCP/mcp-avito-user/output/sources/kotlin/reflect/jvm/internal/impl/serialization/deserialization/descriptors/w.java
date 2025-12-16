package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import f51.InterfaceC40236b;
import h51.C40774a;
import i51.InterfaceC41228b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42956m;

/* compiled from: DeserializedPackageMemberScope.kt */
@s0
/* loaded from: classes8.dex */
public class w extends l {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final K f409875g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f409876h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c f409877i;

    public w(@Y61.k K k12, @Y61.k ProtoBuf.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @Y61.l kotlin.reflect.jvm.internal.impl.load.kotlin.t tVar, @Y61.k C42954k c42954k, @Y61.k String str, @Y61.k Y41.a aVar2) {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(fVar.f408959h);
        h.a aVar3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f409142b;
        ProtoBuf.m mVar = fVar.f408960i;
        aVar3.getClass();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVarA = h.a.a(mVar);
        c42954k.getClass();
        super(new C42956m(c42954k, cVar, k12, gVar, hVarA, aVar, tVar, null, C42784z0.f406748b), fVar.f408956e, fVar.f408957f, fVar.f408958g, aVar2);
        this.f409875g = k12;
        this.f409876h = str;
        this.f409877i = k12.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    public final Collection e(kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, Y41.l lVar) {
        NoLookupLocation noLookupLocation = NoLookupLocation.f407884b;
        Collection collectionI = i(dVar, lVar);
        Iterable<InterfaceC40236b> iterable = this.f409848b.f409936a.f409924k;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC40236b> it = iterable.iterator();
        while (it.hasNext()) {
            C42745f0.h(it.next().b(this.f409877i), arrayList);
        }
        return C42745f0.h0(arrayList, collectionI);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        C40774a.b(this.f409848b.f409936a.f409922i, interfaceC41228b, this.f409875g, fVar);
        return super.g(fVar, interfaceC41228b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b l(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return new kotlin.reflect.jvm.internal.impl.name.b(this.f409877i, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
    @Y61.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> o() {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> p() {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
    public final boolean q(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (!super.q(fVar)) {
            Iterable<InterfaceC40236b> iterable = this.f409848b.f409936a.f409924k;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator<InterfaceC40236b> it = iterable.iterator();
                while (it.hasNext()) {
                    if (it.next().a(this.f409877i, fVar)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Y61.k
    public final String toString() {
        return this.f409876h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
    public final void h(@Y61.k ArrayList arrayList) {
    }
}
