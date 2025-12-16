package ru.cyberity.cbr.core.presentation.base.adapter.holders;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentItem;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewItem;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;
import ru.cyberity.cbr.core.widget.CBRStepView;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c;

/* compiled from: CBRDocumentViewHolder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B6\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R1\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRDocumentViewHolder;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "Lru/cyberity/cbr/core/data/model/Document;", "Lkotlin/S;", "name", "document", "Lkotlin/G0;", "callback", "<init>", "(Landroid/view/View;LY41/l;)V", "item", "", "itemCount", "bind", "(Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;I)V", "LY41/l;", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRDocumentViewHolder extends CBRBaseRecyclerViewHolder<CBRDocumentItem> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final Y41.l<Document, G0> callback;

    /* compiled from: CBRDocumentViewHolder.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042%\b\u0002\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRDocumentViewHolder$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "root", "Lkotlin/Function1;", "Lru/cyberity/cbr/core/data/model/Document;", "Lkotlin/S;", "name", "document", "Lkotlin/G0;", "callback", "Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRDocumentViewHolder;", "create", "(Landroid/view/ViewGroup;LY41/l;)Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRDocumentViewHolder;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final CBRDocumentViewHolder create(@k ViewGroup root, @l Y41.l<? super Document, G0> callback) {
            return new CBRDocumentViewHolder(LayoutInflater.from(root.getContext()).inflate(R.layout.cbr_layout_status_document_item, root, false), callback);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CBRDocumentViewHolder(View view, Y41.l lVar, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bind$lambda-2$lambda-0, reason: not valid java name */
    public static final void m280bind$lambda2$lambda0(CBRDocumentViewHolder cBRDocumentViewHolder, CBRDocumentItem cBRDocumentItem, View view) {
        Y41.l<Document, G0> lVar = cBRDocumentViewHolder.callback;
        if (lVar != null) {
            lVar.invoke(((CBRDocumentViewItem) cBRDocumentItem).getTypeInfo().getDocument());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CBRDocumentViewHolder(@k View view, @l Y41.l<? super Document, G0> lVar) {
        super(view);
        this.callback = lVar;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder
    public void bind(@k CBRDocumentItem item, int itemCount) {
        if (item instanceof CBRDocumentViewItem) {
            View view = this.itemView;
            CBRStepView cBRStepView = view instanceof CBRStepView ? (CBRStepView) view : null;
            if (cBRStepView != null) {
                CBRDocumentViewItem cBRDocumentViewItem = (CBRDocumentViewItem) item;
                Spanned spannedA = s.a(cBRDocumentViewItem.getTitle(), cBRStepView.getContext());
                cBRStepView.setTitle(spannedA);
                if (spannedA.length() == 0) {
                    cBRStepView.setTitle("   ");
                }
                CharSequence subtitle = cBRDocumentViewItem.getSubtitle();
                cBRStepView.setSubtitle(subtitle != null ? s.a(subtitle, cBRStepView.getContext()) : null);
                cBRStepView.setIconStart(cBRDocumentViewItem.resolveIcon(cBRStepView.getContext()));
                CBRStepStateKt.setStepState(cBRStepView, cBRDocumentViewItem.getState());
                cBRStepView.setIconEnd(null);
                if (cBRDocumentViewItem.getIsClickable()) {
                    this.itemView.setOnClickListener(new c(4, this, item));
                    Context context = cBRStepView.getContext();
                    ThemeHelper themeHelper = ThemeHelper.INSTANCE;
                    Drawable drawableResolveIcon = themeHelper.resolveIcon(context, CBRIconHandler.CBRCommonIcons.MORE.getImageName());
                    if (drawableResolveIcon == null) {
                        drawableResolveIcon = themeHelper.resolveIcon(context, CBRIconHandler.CBRCommonIcons.DISCLOSURE.getImageName());
                    }
                    cBRStepView.setIconEnd(drawableResolveIcon);
                }
            }
        }
    }
}
