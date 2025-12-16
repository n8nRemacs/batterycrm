package ru.cyberity.cbr.core.presentation.base.adapter.holders;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentItem;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRTextViewItem;

/* compiled from: CBRTextViewHolder.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRTextViewHolder;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "item", "", "itemCount", "Lkotlin/G0;", "bind", "(Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;I)V", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRTextViewHolder extends CBRBaseRecyclerViewHolder<CBRDocumentItem> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final TextView textView;

    /* compiled from: CBRTextViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRTextViewHolder$Companion;", "", "()V", "create", "Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRTextViewHolder;", "root", "Landroid/view/ViewGroup;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final CBRTextViewHolder create(@k ViewGroup root) {
            return new CBRTextViewHolder(LayoutInflater.from(root.getContext()).inflate(R.layout.cbr_layout_status_text_item, root, false));
        }

        private Companion() {
        }
    }

    public CBRTextViewHolder(@k View view) {
        super(view);
        this.textView = (TextView) view;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder
    public void bind(@k CBRDocumentItem item, int itemCount) {
        if (item instanceof CBRTextViewItem) {
            this.textView.setText(((CBRTextViewItem) item).getText());
        }
    }
}
