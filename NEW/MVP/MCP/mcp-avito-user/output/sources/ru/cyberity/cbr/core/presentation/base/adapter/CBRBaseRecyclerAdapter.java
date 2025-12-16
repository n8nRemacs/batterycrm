package ru.cyberity.cbr.core.presentation.base.adapter;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder;

/* compiled from: CBRBaseRecyclerAdapter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerAdapter;", "T", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "<init>", "()V", "", "getItemCount", "()I", "", "old", "new", "Landroidx/recyclerview/widget/o$b;", "provideDiffCallback", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/o$b;", "items", "Lkotlin/G0;", "setResources", "(Ljava/util/List;)V", "position", "getItem", "(I)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "resources", "Ljava/util/ArrayList;", "DiffCallBack", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CBRBaseRecyclerAdapter<T, VH extends CBRBaseRecyclerViewHolder<T>> extends RecyclerView.Adapter<VH> {

    @k
    private final ArrayList<T> resources = new ArrayList<>();

    /* compiled from: CBRBaseRecyclerAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerAdapter$DiffCallBack;", "T", "Landroidx/recyclerview/widget/o$b;", "", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DiffCallBack<T> extends C23424o.b {

        @k
        private final List<T> newList;

        @k
        private final List<T> oldList;

        /* JADX WARN: Multi-variable type inference failed */
        public DiffCallBack(@k List<? extends T> list, @k List<? extends T> list2) {
            this.oldList = list;
            this.newList = list2;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return L.f(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return L.f(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public int getNewListSize() {
            return this.newList.size();
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public int getOldListSize() {
            return this.oldList.size();
        }
    }

    @l
    public final T getItem(int position) {
        return this.resources.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.resources.size();
    }

    @k
    public C23424o.b provideDiffCallback(@k List<? extends T> old, @k List<? extends T> list) {
        return new DiffCallBack(old, list);
    }

    public void setResources(@k List<? extends T> items) {
        C23424o.e eVarA = C23424o.a(provideDiffCallback(this.resources, items), true);
        this.resources.clear();
        this.resources.addAll(items);
        eVarA.b(this);
    }
}
