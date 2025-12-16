package ru.cyberity.cbr.core.presentation.base.adapter.holders;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentItem;
import ru.cyberity.cbr.core.widget.CBRStepState;

/* compiled from: CBRModeratorCommentViewHolder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRModeratorCommentViewHolder;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerViewHolder;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "", "Lkotlin/G0;", "onLinkClicked", "<init>", "(Landroid/view/View;LY41/l;)V", "item", "", "itemCount", "bind", "(Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;I)V", "Landroid/widget/ImageView;", "ivResult", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tvModerationComment", "Landroid/widget/TextView;", "tvModerationTitle", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRModeratorCommentViewHolder extends CBRBaseRecyclerViewHolder<CBRDocumentItem> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final ImageView ivResult;

    @l
    private final TextView tvModerationComment;

    @l
    private final TextView tvModerationTitle;

    /* compiled from: CBRModeratorCommentViewHolder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRModeratorCommentViewHolder$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "root", "Lkotlin/Function1;", "", "Lkotlin/G0;", "onLinkClicked", "Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRModeratorCommentViewHolder;", "create", "(Landroid/view/ViewGroup;LY41/l;)Lru/cyberity/cbr/core/presentation/base/adapter/holders/CBRModeratorCommentViewHolder;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final CBRModeratorCommentViewHolder create(@k ViewGroup root, @l Y41.l<? super String, G0> onLinkClicked) {
            return new CBRModeratorCommentViewHolder(LayoutInflater.from(root.getContext()).inflate(R.layout.cbr_layout_moderator_comment_item, root, false), onLinkClicked);
        }

        private Companion() {
        }
    }

    /* compiled from: CBRModeratorCommentViewHolder.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CBRStepState.values().length];
            iArr[CBRStepState.APPROVED.ordinal()] = 1;
            iArr[CBRStepState.REJECTED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CBRModeratorCommentViewHolder(View view, Y41.l lVar, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : lVar);
    }

    public CBRModeratorCommentViewHolder(@k View view, @l Y41.l<? super String, G0> lVar) {
        super(view);
        this.ivResult = (ImageView) view.findViewById(R.id.cbr_status_icon);
        TextView textView = (TextView) view.findViewById(R.id.cbr_status_comment);
        this.tvModerationComment = textView;
        this.tvModerationTitle = (TextView) view.findViewById(R.id.cbr_status_title);
        if (textView != null) {
            ExtensionsKt.handleUrlClicks(textView, lVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    @Override // ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(@Y61.k ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentItem r4, int r5) {
        /*
            r3 = this;
            boolean r5 = r4 instanceof ru.cyberity.cbr.core.presentation.base.adapter.CBRModeratorCommentViewItem
            if (r5 != 0) goto L5
            return
        L5:
            ru.cyberity.cbr.core.presentation.base.adapter.CBRModeratorCommentViewItem r4 = (ru.cyberity.cbr.core.presentation.base.adapter.CBRModeratorCommentViewItem) r4
            ru.cyberity.cbr.core.widget.CBRStepState r5 = r4.getState()
            android.widget.ImageView r0 = r3.ivResult
            if (r0 == 0) goto L61
            r1 = 1
            if (r5 != 0) goto L14
            r2 = r1
            goto L15
        L14:
            r2 = 0
        L15:
            ru.cyberity.cbr.core.common.s.a(r0, r2)
            if (r5 == 0) goto L52
            int[] r2 = ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRModeratorCommentViewHolder.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r2[r5]
            if (r5 == r1) goto L3d
            r1 = 2
            if (r5 == r1) goto L28
            goto L52
        L28:
            ru.cyberity.cbr.core.common.n0 r5 = ru.cyberity.cbr.core.common.n0.f432787a
            ru.cyberity.cbr.core.data.listener.CBRIconHandler r5 = r5.getIconHandler()
            android.content.Context r1 = r0.getContext()
            ru.cyberity.cbr.core.data.listener.CBRIconHandler$CBRResultIcons r2 = ru.cyberity.cbr.core.data.listener.CBRIconHandler.CBRResultIcons.FAILURE
            java.lang.String r2 = r2.getImageName()
            android.graphics.drawable.Drawable r5 = r5.onResolveIcon(r1, r2)
            goto L53
        L3d:
            ru.cyberity.cbr.core.common.n0 r5 = ru.cyberity.cbr.core.common.n0.f432787a
            ru.cyberity.cbr.core.data.listener.CBRIconHandler r5 = r5.getIconHandler()
            android.content.Context r1 = r0.getContext()
            ru.cyberity.cbr.core.data.listener.CBRIconHandler$CBRResultIcons r2 = ru.cyberity.cbr.core.data.listener.CBRIconHandler.CBRResultIcons.SUCCESS
            java.lang.String r2 = r2.getImageName()
            android.graphics.drawable.Drawable r5 = r5.onResolveIcon(r1, r2)
            goto L53
        L52:
            r5 = 0
        L53:
            r0.setImageDrawable(r5)
            ru.cyberity.cbr.core.widget.CBRStepState r5 = r4.getState()
            if (r5 != 0) goto L5e
            ru.cyberity.cbr.core.widget.CBRStepState r5 = ru.cyberity.cbr.core.widget.CBRStepState.INIT
        L5e:
            ru.cyberity.cbr.core.widget.CBRStepStateKt.setStepState(r0, r5)
        L61:
            android.widget.TextView r5 = r3.tvModerationTitle
            if (r5 == 0) goto L6c
            java.lang.CharSequence r0 = r4.getModerationTitle()
            ru.cyberity.cbr.core.common.s.a(r5, r0)
        L6c:
            android.widget.TextView r5 = r3.tvModerationComment
            if (r5 == 0) goto L77
            java.lang.CharSequence r4 = r4.getModerationComment()
            ru.cyberity.cbr.core.common.s.a(r5, r4)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.base.adapter.holders.CBRModeratorCommentViewHolder.bind(ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentItem, int):void");
    }
}
