package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: context.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42956m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C42954k f409936a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f409937b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42882k f409938c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f409939d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.h f409940e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f409941f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.t f409942g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final M f409943h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final z f409944i;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C42956m(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k r2, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r3, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k r4, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g r5, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.h r6, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.a r7, @Y61.l kotlin.reflect.jvm.internal.impl.load.kotlin.t r8, @Y61.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.M r9, @Y61.k java.util.List r10) {
        /*
            r1 = this;
            r1.<init>()
            r1.f409936a = r2
            r1.f409937b = r3
            r1.f409938c = r4
            r1.f409939d = r5
            r1.f409940e = r6
            r1.f409941f = r7
            r1.f409942g = r8
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.M r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.M
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Deserializer for \""
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.name.f r3 = r4.getName()
            r2.append(r3)
            r3 = 34
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            if (r8 == 0) goto L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Class '"
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.name.b r3 = r8.c()
            kotlin.reflect.jvm.internal.impl.name.c r3 = r3.b()
            java.lang.String r3 = r3.b()
            r2.append(r3)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L4e
            goto L50
        L4e:
            r7 = r2
            goto L53
        L50:
            java.lang.String r2 = "[container not found]"
            goto L4e
        L53:
            r2 = r0
            r3 = r1
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f409943h = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.z r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.z
            r2.<init>(r1)
            r1.f409944i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42956m.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c, kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g, kotlin.reflect.jvm.internal.impl.metadata.deserialization.h, kotlin.reflect.jvm.internal.impl.metadata.deserialization.a, kotlin.reflect.jvm.internal.impl.load.kotlin.t, kotlin.reflect.jvm.internal.impl.serialization.deserialization.M, java.util.List):void");
    }

    @Y61.k
    public final C42956m a(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k List<ProtoBuf.TypeParameter> list, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar) {
        int i12 = aVar.f409092b;
        return new C42956m(this.f409936a, cVar, interfaceC42882k, gVar, ((i12 != 1 || aVar.f409093c < 4) && i12 <= 1) ? this.f409940e : hVar, aVar, this.f409942g, this.f409943h, list);
    }
}
