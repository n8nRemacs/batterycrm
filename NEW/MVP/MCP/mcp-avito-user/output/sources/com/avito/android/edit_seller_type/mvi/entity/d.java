package com.avito.android.edit_seller_type.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.edit_seller_type.mvi.entity.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EditSellerTypesListState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/d;", "", "a", "b", "Lcom/avito/android/edit_seller_type/mvi/entity/d$a;", "Lcom/avito/android/edit_seller_type/mvi/entity/d$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface d {

    /* compiled from: EditSellerTypesListState.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/d$a;", "Lcom/avito/android/edit_seller_type/mvi/entity/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f146832a;

        public a(@k ArrayList arrayList) {
            this.f146832a = arrayList;
        }

        @Override // com.avito.android.edit_seller_type.mvi.entity.d
        @k
        public final d a(@k c.f fVar) {
            ArrayList<c.d> arrayList = this.f146832a;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (c.d dVar : arrayList) {
                List<c.e> list = dVar.f146814d;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
                for (c.e eVar : list) {
                    arrayList3.add(c.e.a(eVar, L.f(eVar.f146819e, fVar)));
                }
                arrayList2.add(new c.d(dVar.f146811a, dVar.f146812b, dVar.f146813c, arrayList3));
            }
            return new a(arrayList2);
        }

        @Override // com.avito.android.edit_seller_type.mvi.entity.d
        @l
        public final c.e b() {
            Iterator it = this.f146832a.iterator();
            while (it.hasNext()) {
                for (c.e eVar : ((c.d) it.next()).f146814d) {
                    if (eVar.f146818d) {
                        return eVar;
                    }
                }
            }
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f146832a.equals(((a) obj).f146832a);
        }

        public final int hashCode() {
            return this.f146832a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("Groups(groups="), this.f146832a, ')');
        }
    }

    /* compiled from: EditSellerTypesListState.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/d$b;", "Lcom/avito/android/edit_seller_type/mvi/entity/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f146833a;

        public b(@k ArrayList arrayList) {
            this.f146833a = arrayList;
        }

        @Override // com.avito.android.edit_seller_type.mvi.entity.d
        @k
        public final d a(@k c.f fVar) {
            ArrayList<c.e> arrayList = this.f146833a;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (c.e eVar : arrayList) {
                arrayList2.add(c.e.a(eVar, L.f(eVar.f146819e, fVar)));
            }
            return new b(arrayList2);
        }

        @Override // com.avito.android.edit_seller_type.mvi.entity.d
        @l
        public final c.e b() {
            Object next;
            Iterator it = this.f146833a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((c.e) next).f146818d) {
                    break;
                }
            }
            return (c.e) next;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f146833a.equals(((b) obj).f146833a);
        }

        public final int hashCode() {
            return this.f146833a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("Options(options="), this.f146833a, ')');
        }
    }

    @k
    d a(@k c.f fVar);

    @l
    c.e b();
}
