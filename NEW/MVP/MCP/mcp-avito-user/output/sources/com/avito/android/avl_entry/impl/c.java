package com.avito.android.avl_entry.impl;

import Ig.f;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.L;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: ShortVideosPositionStorageImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/c;", "LIg/f;", "<init>", "()V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f98447a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f98448b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f98449c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f98450d = new LinkedHashMap();

    @Inject
    public c() {
    }

    @Override // Ig.f
    @k
    public final L a() {
        LinkedHashMap linkedHashMap = this.f98449c;
        if (linkedHashMap.get("AVL_ENTRY") == null) {
            linkedHashMap.put("AVL_ENTRY", new com.jakewharton.rxrelay3.b());
        }
        return ((com.jakewharton.rxrelay3.d) linkedHashMap.get("AVL_ENTRY")).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // Ig.f
    public final void b(boolean z12) {
        LinkedHashMap linkedHashMap = this.f98449c;
        if (linkedHashMap.get("AVL_ENTRY") == null) {
            linkedHashMap.put("AVL_ENTRY", new com.jakewharton.rxrelay3.b());
        }
        com.jakewharton.rxrelay3.d dVar = (com.jakewharton.rxrelay3.d) linkedHashMap.get("AVL_ENTRY");
        if (dVar != null) {
            dVar.accept(Boolean.valueOf(z12));
        }
    }

    @Override // Ig.f
    public final void c(int i12) {
        LinkedHashMap linkedHashMap = this.f98447a;
        if (linkedHashMap.get("AVL_ENTRY") == null) {
            linkedHashMap.put("AVL_ENTRY", new com.jakewharton.rxrelay3.b());
        }
        com.jakewharton.rxrelay3.d dVar = (com.jakewharton.rxrelay3.d) linkedHashMap.get("AVL_ENTRY");
        if (dVar != null) {
            dVar.accept(Integer.valueOf(i12));
        }
    }

    @Override // Ig.f
    public final void clear() {
        this.f98447a.remove("AVL_ENTRY");
        this.f98448b.remove("AVL_ENTRY");
        this.f98449c.remove("AVL_ENTRY");
        this.f98450d.remove("AVL_ENTRY");
    }

    @Override // Ig.f
    public final void d(int i12) {
        LinkedHashMap linkedHashMap = this.f98448b;
        if (linkedHashMap.get("AVL_ENTRY") == null) {
            linkedHashMap.put("AVL_ENTRY", new com.jakewharton.rxrelay3.c());
        }
        com.jakewharton.rxrelay3.d dVar = (com.jakewharton.rxrelay3.d) linkedHashMap.get("AVL_ENTRY");
        if (dVar != null) {
            dVar.accept(Integer.valueOf(i12));
        }
    }

    @Override // Ig.f
    @k
    public final z e() {
        LinkedHashMap linkedHashMap = this.f98448b;
        if (linkedHashMap.get("AVL_ENTRY") == null) {
            linkedHashMap.put("AVL_ENTRY", new com.jakewharton.rxrelay3.c());
        }
        return (z) linkedHashMap.get("AVL_ENTRY");
    }

    @Override // Ig.f
    @k
    public final O getPosition() {
        LinkedHashMap linkedHashMap = this.f98447a;
        if (linkedHashMap.get("AVL_ENTRY") == null) {
            linkedHashMap.put("AVL_ENTRY", new com.jakewharton.rxrelay3.b());
        }
        return ((com.jakewharton.rxrelay3.d) linkedHashMap.get("AVL_ENTRY")).K(new b(this));
    }
}
