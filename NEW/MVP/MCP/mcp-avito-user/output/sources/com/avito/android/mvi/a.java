package com.avito.android.mvi;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Differ.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mvi/a;", "State", "Item", "", "<init>", "()V", "a", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class a<State, Item> {

    /* compiled from: Differ.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mvi/a$a;", "Landroidx/recyclerview/widget/o$b;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mvi.a$a, reason: collision with other inner class name */
    public final class C6173a extends C23424o.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Item> f207030a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Item> f207031b;

        /* JADX WARN: Multi-variable type inference failed */
        public C6173a(@k List<? extends Item> list, @k List<? extends Item> list2) {
            this.f207030a = list;
            this.f207031b = list2;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areContentsTheSame(int i12, int i13) {
            return a.this.a(this.f207030a.get(i12), this.f207031b.get(i13));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areItemsTheSame(int i12, int i13) {
            return a.this.b(this.f207030a.get(i12), this.f207031b.get(i13));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getNewListSize() {
            return this.f207031b.size();
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getOldListSize() {
            return this.f207030a.size();
        }
    }

    public static C23424o.e c(a aVar, Object obj, Object obj2) {
        List<Item> listD = aVar.d(obj);
        List<Item> listD2 = aVar.d(obj2);
        if (listD == null || listD2 == null) {
            return null;
        }
        return C23424o.a(new C6173a(listD, listD2), true);
    }

    public boolean a(Item item, Item item2) {
        return false;
    }

    public boolean b(Item item, Item item2) {
        return item == item2;
    }

    @l
    public abstract List<Item> d(@l State state);
}
