package ru.cyberity.cbr.core.presentation.base.adapter;

import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: CBRBaseRecyclerViewHolder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "item", "", "itemCount", "Lkotlin/G0;", "bind", "(Ljava/lang/Object;I)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class CBRBaseRecyclerViewHolder<T> extends RecyclerView.C {
    public CBRBaseRecyclerViewHolder(@k View view) {
        super(view);
    }

    public abstract void bind(T item, int itemCount);

    @k
    public final Context getContext() {
        return this.itemView.getContext();
    }
}
