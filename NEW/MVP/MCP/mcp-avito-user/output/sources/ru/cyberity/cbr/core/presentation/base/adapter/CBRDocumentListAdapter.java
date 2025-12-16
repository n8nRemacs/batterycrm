package ru.cyberity.cbr.core.presentation.base.adapter;

import Y41.l;
import Y61.k;
import android.view.ViewGroup;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRDocumentViewHolder;
import ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRDocumentsModeratorCommentViewHolder;
import ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRIconViewHolder;
import ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRModeratorCommentViewHolder;
import ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRTextViewHolder;
import ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRTitleViewHolder;

/* compiled from: CBRDocumentListAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00040\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u00132\u0010\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00020\u0003j\u0002`\u00042\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentListAdapter;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerAdapter;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;", "Lru/cyberity/cbr/core/presentation/base/adapter/Holder;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentListAdapter$Callback;", "callback", "<init>", "(Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentListAdapter$Callback;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;", "position", "getItemViewType", "(I)I", "holder", "Lkotlin/G0;", "onBindViewHolder", "(Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;I)V", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentListAdapter$Callback;", "Callback", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRDocumentListAdapter extends CBRBaseRecyclerAdapter<CBRDocumentItem, CBRBaseRecyclerViewHolder<CBRDocumentItem>> {

    @k
    private final Callback callback;

    /* compiled from: CBRDocumentListAdapter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentListAdapter$onCreateViewHolder$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends H implements l<Document, G0> {
        public AnonymousClass1(Object obj) {
            super(1, obj, Callback.class, "onDocumentClicked", "onDocumentClicked(Lru/cyberity/cbr/core/data/model/Document;)V", 0);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(Document document) {
            invoke2(document);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Y61.l Document document) {
            ((Callback) this.receiver).onDocumentClicked(document);
        }
    }

    /* compiled from: CBRDocumentListAdapter.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentListAdapter$onCreateViewHolder$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends H implements l<String, G0> {
        public AnonymousClass2(Object obj) {
            super(1, obj, Callback.class, "onLinkClicked", "onLinkClicked(Ljava/lang/String;)V", 0);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            invoke2(str);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Y61.l String str) {
            ((Callback) this.receiver).onLinkClicked(str);
        }
    }

    public CBRDocumentListAdapter(@k Callback callback) {
        this.callback = callback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        CBRDocumentItem item = getItem(position);
        if (item != null) {
            return item.getViewType();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@k CBRBaseRecyclerViewHolder<CBRDocumentItem> holder, int position) {
        CBRDocumentItem item = getItem(position);
        if (item != null) {
            holder.bind(item, getItemCount());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    public CBRBaseRecyclerViewHolder<CBRDocumentItem> onCreateViewHolder(@k ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                return CBRDocumentViewHolder.INSTANCE.create(parent, new AnonymousClass1(this.callback));
            case 2:
                return CBRModeratorCommentViewHolder.INSTANCE.create(parent, new AnonymousClass2(this.callback));
            case 3:
                return CBRIconViewHolder.INSTANCE.create(parent);
            case 4:
                return CBRTitleViewHolder.INSTANCE.create(parent);
            case 5:
                return CBRTextViewHolder.INSTANCE.create(parent);
            case 6:
                return CBRDocumentsModeratorCommentViewHolder.INSTANCE.create(parent);
            default:
                throw new IllegalStateException("Cannot create view holder for CBRDocumentListAdapter");
        }
    }

    /* compiled from: CBRDocumentListAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentListAdapter$Callback;", "", "", ContextActionHandler.Link.URL, "Lkotlin/G0;", "onLinkClicked", "(Ljava/lang/String;)V", "Lru/cyberity/cbr/core/data/model/Document;", "document", "onDocumentClicked", "(Lru/cyberity/cbr/core/data/model/Document;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Callback {
        default void onDocumentClicked(@Y61.l Document document) {
        }

        default void onLinkClicked(@Y61.l String url) {
        }
    }
}
