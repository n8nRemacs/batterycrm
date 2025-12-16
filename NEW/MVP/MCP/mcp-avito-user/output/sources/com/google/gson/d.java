package com.google.gson;

import com.google.gson.internal.C37623a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

/* compiled from: GsonBuilder.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Excluder f361986a = Excluder.f362008d;

    /* renamed from: b, reason: collision with root package name */
    public final LongSerializationPolicy f361987b = LongSerializationPolicy.f361973b;

    /* renamed from: c, reason: collision with root package name */
    public final FieldNamingPolicy f361988c = FieldNamingPolicy.f361952b;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f361989d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f361990e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f361991f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final int f361992g;

    /* renamed from: h, reason: collision with root package name */
    public final int f361993h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f361994i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f361995j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f361996k;

    /* renamed from: l, reason: collision with root package name */
    public ToNumberPolicy f361997l;

    /* renamed from: m, reason: collision with root package name */
    public final ToNumberPolicy f361998m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedList<ReflectionAccessFilter> f361999n;

    public d() {
        FieldNamingPolicy fieldNamingPolicy = Gson.f361954m;
        this.f361992g = 2;
        this.f361993h = 2;
        this.f361994i = true;
        this.f361995j = false;
        this.f361996k = true;
        this.f361997l = Gson.f361955n;
        this.f361998m = Gson.f361956o;
        this.f361999n = new LinkedList<>();
    }

    public final Gson a() {
        int i12;
        r rVarA;
        r rVarA2;
        ArrayList arrayList = this.f361990e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f361991f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z12 = com.google.gson.internal.sql.a.f362162a;
        DefaultDateTypeAdapter.b<Date> bVar = DefaultDateTypeAdapter.b.f362035b;
        int i13 = this.f361992g;
        if (i13 != 2 && (i12 = this.f361993h) != 2) {
            r rVarA3 = bVar.a(i13, i12);
            if (z12) {
                rVarA = com.google.gson.internal.sql.a.f362164c.a(i13, i12);
                rVarA2 = com.google.gson.internal.sql.a.f362163b.a(i13, i12);
            } else {
                rVarA = null;
                rVarA2 = null;
            }
            arrayList3.add(rVarA3);
            if (z12) {
                arrayList3.add(rVarA);
                arrayList3.add(rVarA2);
            }
        }
        return new Gson(this.f361986a, this.f361988c, new HashMap(this.f361989d), this.f361994i, this.f361995j, this.f361996k, this.f361987b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f361997l, this.f361998m, new ArrayList(this.f361999n));
    }

    public final void b(Class cls, Object obj) {
        boolean z12 = obj instanceof o;
        C37623a.a(z12 || (obj instanceof h) || (obj instanceof e) || (obj instanceof TypeAdapter));
        if (obj instanceof e) {
            this.f361989d.put(cls, (e) obj);
        }
        ArrayList arrayList = this.f361990e;
        if (z12 || (obj instanceof h)) {
            arrayList.add(TreeTypeAdapter.a(com.google.gson.reflect.a.get((Type) cls), obj));
        }
        if (obj instanceof TypeAdapter) {
            arrayList.add(TypeAdapters.a(com.google.gson.reflect.a.get((Type) cls), (TypeAdapter) obj));
        }
    }

    public final void c(r rVar) {
        this.f361990e.add(rVar);
    }
}
