package com.avito.android.di.module;

import com.avito.android.remote.parse.adapter.TypedResultDeserializer;
import com.avito.android.util.C35866p0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreJsonModule_ProvideTypedResultDeserializerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/i3;", "Ldagger/internal/h;", "Lcom/avito/android/remote/parse/adapter/TypedResultDeserializer;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.i3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30069i3 implements dagger.internal.h<TypedResultDeserializer> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144345b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f144346a;

    /* compiled from: CoreJsonModule_ProvideTypedResultDeserializerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/i3$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.i3$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30069i3(@Y61.k dagger.internal.A a12) {
        this.f144346a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set<C35866p0> set = (Set) this.f144346a.get();
        f144345b.getClass();
        int i12 = C30025e3.f144277a;
        TypedResultDeserializer typedResultDeserializer = new TypedResultDeserializer();
        for (C35866p0 c35866p0 : set) {
            typedResultDeserializer.f254254a.put(c35866p0.f318944a, c35866p0.f318945b);
        }
        return typedResultDeserializer;
    }
}
