package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.I;

/* compiled from: AnnotationLoader.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC42949f<A> {
    @Y61.k
    ArrayList a(@Y61.k I.a aVar);

    @Y61.k
    List<A> b(@Y61.k I i12, @Y61.k ProtoBuf.d dVar);

    @Y61.k
    List d(@Y61.k I i12, @Y61.k h.d dVar, @Y61.k AnnotatedCallableKind annotatedCallableKind);

    @Y61.k
    ArrayList e(@Y61.k ProtoBuf.Type type, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar);

    @Y61.k
    List f(@Y61.k I i12, @Y61.k h.d dVar, @Y61.k AnnotatedCallableKind annotatedCallableKind);

    @Y61.k
    List h(@Y61.k I i12, @Y61.k h.d dVar, @Y61.k AnnotatedCallableKind annotatedCallableKind, int i13, @Y61.k ProtoBuf.l lVar);

    @Y61.k
    ArrayList i(@Y61.k ProtoBuf.TypeParameter typeParameter, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar);

    @Y61.k
    List<A> j(@Y61.k I i12, @Y61.k ProtoBuf.h hVar);

    @Y61.k
    List<A> k(@Y61.k I i12, @Y61.k ProtoBuf.h hVar);
}
