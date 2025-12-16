package com.avito.konveyor;

import TV0.f;
import TV0.g;
import TV0.h;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.util.V2;
import com.avito.konveyor.exception.BlueprintCollisionException;
import com.avito.konveyor.exception.BlueprintNotSupportedException;
import com.avito.konveyor.exception.ItemNotSupportedException;
import com.avito.konveyor.exception.ViewTypeCollisionException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ItemBinder.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/konveyor/a;", "LTV0/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/h;", "LTV0/f;", "LTV0/e;", "LTV0/a;", "a", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements g<com.avito.konveyor.adapter.b>, h, f<TV0.e, TV0.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<Integer, TV0.b<?, ?>> f338492b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final XV0.a f338493c;

    /* compiled from: ItemBinder.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/konveyor/a$a;", "", "<init>", "()V", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.konveyor.a$a, reason: collision with other inner class name */
    public static final class C10493a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LinkedHashMap f338494a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final XV0.a f338495b;

        public C10493a() {
            e.f338519a.getClass();
            this.f338495b = e.f338520b;
        }

        @k
        public final a a() {
            return new a(this.f338494a, this.f338495b, null);
        }

        @k
        public final void b(@k TV0.b bVar) throws BlueprintCollisionException {
            int iA2 = TV0.c.a(bVar);
            Integer numValueOf = Integer.valueOf(iA2);
            LinkedHashMap linkedHashMap = this.f338494a;
            if (!linkedHashMap.containsKey(numValueOf)) {
                linkedHashMap.put(Integer.valueOf(iA2), bVar);
                return;
            }
            V2.f318762a.g("ItemBinder", "Registered Blueprints: " + linkedHashMap.values().size());
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                V2.f318762a.g("ItemBinder", VV0.a.a((TV0.b) it.next()));
            }
            TV0.b bVar2 = (TV0.b) linkedHashMap.get(Integer.valueOf(iA2));
            e.f338519a.getClass();
            com.avito.konveyor.viewtype.b bVar3 = e.f338521c;
            StringBuilder sb2 = new StringBuilder("Duplicate ItemBlueprint's ViewType. ItemBlueprint: ");
            sb2.append(bVar);
            sb2.append(".\nInsertable:\n");
            sb2.append(VV0.a.a(bVar));
            sb2.append("\nExist:\n");
            sb2.append(bVar2 != null ? VV0.a.a(bVar2) : null);
            sb2.append("\nCalc: ");
            sb2.append(bVar3.getClass().getCanonicalName());
            throw new BlueprintCollisionException(sb2.toString());
        }
    }

    public a() {
        throw null;
    }

    public a(Map map, XV0.a aVar, C42822w c42822w) {
        this.f338492b = map;
        this.f338493c = aVar;
    }

    @Override // TV0.h
    public final int O(@k TV0.a aVar) throws ItemNotSupportedException, ViewTypeCollisionException {
        XV0.a aVar2 = this.f338493c;
        boolean zA2 = aVar2.getF91392a();
        Map<Integer, TV0.b<?, ?>> map = this.f338492b;
        if (zA2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, TV0.b<?, ?>> entry : map.entrySet()) {
                if (entry.getValue().d(aVar)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.size() > 1) {
                throw new ViewTypeCollisionException("Item can be handled by multiple presenters in the given ItemBinder. Item: " + aVar + " \nblueprints: " + C42745f0.O(linkedHashMap.values(), null, null, null, b.f338518l, 31));
            }
        }
        for (Map.Entry<Integer, TV0.b<?, ?>> entry2 : map.entrySet()) {
            if (entry2.getValue().d(aVar)) {
                return entry2.getKey().intValue();
            }
        }
        if (aVar2.getF91392a()) {
            throw new ItemNotSupportedException(aVar);
        }
        return -1;
    }

    @Override // TV0.d
    public final void O5(@k TV0.e eVar, @k TV0.a aVar, int i12) throws ItemNotSupportedException {
        TV0.d<TV0.e, TV0.a> dVarV = V(aVar);
        if (dVarV != null) {
            dVarV.O5(eVar, aVar, i12);
        }
    }

    public final TV0.d<TV0.e, TV0.a> V(TV0.a aVar) throws ItemNotSupportedException {
        TV0.b<?, ?> bVar;
        try {
            bVar = this.f338492b.get(Integer.valueOf(O(aVar)));
        } catch (Exception unused) {
            bVar = null;
        }
        if (bVar == null && this.f338493c.getF91392a()) {
            throw new ItemNotSupportedException(aVar);
        }
        TV0.d<TV0.e, TV0.a> dVarA = bVar != null ? bVar.a() : null;
        if (dVarA != null) {
            return dVarA;
        }
        return null;
    }

    public final int Y(@k Class<? extends TV0.b<?, ?>> cls) throws BlueprintNotSupportedException {
        Object next;
        Iterator<T> it = this.f338492b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (cls.isInstance((TV0.b) next)) {
                break;
            }
        }
        TV0.b bVar = (TV0.b) next;
        if (bVar != null) {
            return TV0.c.a(bVar);
        }
        throw new BlueprintNotSupportedException(androidx.compose.ui.graphics.colorspace.e.k(cls, "Blueprint is not supported. Type: "));
    }

    @Override // TV0.f
    public final void g2(@k TV0.e eVar, @k TV0.a aVar, int i12, @k List<? extends Object> list) throws ItemNotSupportedException {
        TV0.d<TV0.e, TV0.a> dVarV = V(aVar);
        if (dVarV == null) {
            return;
        }
        if (list.isEmpty() || !(dVarV instanceof f)) {
            dVarV.O5(eVar, aVar, i12);
        } else {
            ((f) dVarV).g2(eVar, aVar, i12, list);
        }
    }

    @Override // TV0.g
    @l
    public final com.avito.konveyor.adapter.b k(@k ViewGroup viewGroup, int i12, @k Y41.l<? super Integer, ? extends View> lVar) {
        TV0.b<?, ?> bVar;
        try {
            bVar = this.f338492b.get(Integer.valueOf(i12));
        } catch (Exception unused) {
            bVar = null;
        }
        if (bVar != null) {
            return (com.avito.konveyor.adapter.b) bVar.b().f15693b.invoke(viewGroup, lVar.invoke(Integer.valueOf(bVar.b().f15692a)));
        }
        if (this.f338493c.getF91392a()) {
            throw new IllegalArgumentException("View type is not supported");
        }
        return new com.avito.konveyor.adapter.c(viewGroup);
    }
}
