package com.avito.android.recycler.data_aware;

import Pi0.InterfaceC14790a;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SimpleDiffCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recycler/data_aware/i;", "Lcom/avito/android/recycler/data_aware/e;", "a", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f252345a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f252346b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f252347c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final com.avito.android.recycler.data_aware.a f252348d;

    /* compiled from: SimpleDiffCalculator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recycler/data_aware/i$a;", "Landroidx/recyclerview/widget/o$b;", "_avito_recycler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23424o.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b f252349a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final f f252350b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final com.avito.android.recycler.data_aware.a f252351c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final UV0.a<? extends TV0.a> f252352d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final UV0.a<? extends TV0.a> f252353e;

        public a(@Y61.k b bVar, @Y61.k f fVar, @l com.avito.android.recycler.data_aware.a aVar, @Y61.k UV0.a<? extends TV0.a> aVar2, @Y61.k UV0.a<? extends TV0.a> aVar3) {
            this.f252349a = bVar;
            this.f252350b = fVar;
            this.f252351c = aVar;
            this.f252352d = aVar2;
            this.f252353e = aVar3;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areContentsTheSame(int i12, int i13) {
            UV0.a<? extends TV0.a> aVar = this.f252352d;
            TV0.a item = aVar.isEmpty() ? null : aVar.getItem(i12);
            UV0.a<? extends TV0.a> aVar2 = this.f252353e;
            return this.f252349a.a(item, aVar2.isEmpty() ? null : aVar2.getItem(i13));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areItemsTheSame(int i12, int i13) {
            UV0.a<? extends TV0.a> aVar = this.f252352d;
            TV0.a item = aVar.isEmpty() ? null : aVar.getItem(i12);
            UV0.a<? extends TV0.a> aVar2 = this.f252353e;
            return this.f252350b.a(item, aVar2.isEmpty() ? null : aVar2.getItem(i13));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        @l
        public final Object getChangePayload(int i12, int i13) {
            com.avito.android.recycler.data_aware.a aVar = this.f252351c;
            if (aVar == null) {
                return null;
            }
            UV0.a<? extends TV0.a> aVar2 = this.f252352d;
            TV0.a item = aVar2.isEmpty() ? null : aVar2.getItem(i12);
            UV0.a<? extends TV0.a> aVar3 = this.f252353e;
            return aVar.a(item, aVar3.isEmpty() ? null : aVar3.getItem(i13));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getNewListSize() {
            return this.f252353e.getCount();
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getOldListSize() {
            return this.f252352d.getCount();
        }
    }

    @Inject
    public i(@Y61.k b bVar, @Y61.k f fVar, @InterfaceC14790a boolean z12, @l com.avito.android.recycler.data_aware.a aVar) {
        this.f252345a = bVar;
        this.f252346b = fVar;
        this.f252347c = z12;
        this.f252348d = aVar;
    }

    @Override // com.avito.android.recycler.data_aware.e
    @Y61.k
    public final C23424o.e a(@Y61.k UV0.a<? extends TV0.a> aVar, @Y61.k UV0.a<? extends TV0.a> aVar2) {
        return C23424o.a(new a(this.f252345a, this.f252346b, this.f252348d, aVar, aVar2), this.f252347c);
    }

    public /* synthetic */ i(b bVar, f fVar, boolean z12, com.avito.android.recycler.data_aware.a aVar, int i12, C42822w c42822w) {
        this(bVar, (i12 & 2) != 0 ? new j() : fVar, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? null : aVar);
    }
}
