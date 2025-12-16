package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Field;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes6.dex */
class c extends ReflectiveTypeAdapterFactory.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f362132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Field f362133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f362134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TypeAdapter f362135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Gson f362136h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.reflect.a f362137i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f362138j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z12, boolean z13, boolean z14, Field field, boolean z15, TypeAdapter typeAdapter, Gson gson, com.google.gson.reflect.a aVar, boolean z16) {
        super(str, z12, z13);
        this.f362132d = z14;
        this.f362133e = field;
        this.f362134f = z15;
        this.f362135g = typeAdapter;
        this.f362136h = gson;
        this.f362137i = aVar;
        this.f362138j = z16;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void a(com.google.gson.stream.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
        Object obj2 = this.f362135g.read(aVar);
        if (obj2 == null && this.f362138j) {
            return;
        }
        Field field = this.f362133e;
        if (this.f362132d) {
            ReflectiveTypeAdapterFactory.b(field, obj);
        }
        field.set(obj, obj2);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void b(com.google.gson.stream.c cVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (this.f362058b) {
            Field field = this.f362133e;
            if (this.f362132d) {
                ReflectiveTypeAdapterFactory.b(field, obj);
            }
            Object obj2 = field.get(obj);
            if (obj2 == obj) {
                return;
            }
            cVar.h(this.f362057a);
            TypeAdapter typeAdapterRuntimeTypeWrapper = this.f362135g;
            if (!this.f362134f) {
                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(this.f362136h, typeAdapterRuntimeTypeWrapper, this.f362137i.getType());
            }
            typeAdapterRuntimeTypeWrapper.write(cVar, obj2);
        }
    }
}
