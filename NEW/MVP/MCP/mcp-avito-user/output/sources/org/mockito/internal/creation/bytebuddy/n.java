package org.mockito.internal.creation.bytebuddy;

import java.util.Collections;
import java.util.Set;
import org.mockito.mock.SerializableMode;

/* compiled from: MockFeatures.java */
/* loaded from: classes7.dex */
class n<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f421554a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Class<?>> f421555b;

    /* renamed from: c, reason: collision with root package name */
    public final SerializableMode f421556c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f421557d;

    /* renamed from: e, reason: collision with root package name */
    public final l81.g f421558e;

    public n(Class<T> cls, Set<Class<?>> set, SerializableMode serializableMode, boolean z12, l81.g gVar) {
        this.f421554a = cls;
        this.f421555b = Collections.unmodifiableSet(set);
        this.f421556c = serializableMode;
        this.f421557d = z12;
        this.f421558e = gVar;
    }
}
