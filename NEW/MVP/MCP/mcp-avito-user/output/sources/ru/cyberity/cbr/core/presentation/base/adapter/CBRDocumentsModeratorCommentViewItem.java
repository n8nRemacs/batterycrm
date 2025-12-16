package ru.cyberity.cbr.core.presentation.base.adapter;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CBRDocumentItems.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentsModeratorCommentViewItem;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "", "moderatorComment", "<init>", "(Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getModeratorComment", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRDocumentsModeratorCommentViewItem extends CBRDocumentItem {

    @l
    private final CharSequence moderatorComment;

    /* JADX WARN: Multi-variable type inference failed */
    public CBRDocumentsModeratorCommentViewItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CBRDocumentsModeratorCommentViewItem) && L.f(this.moderatorComment, ((CBRDocumentsModeratorCommentViewItem) other).moderatorComment);
    }

    @l
    public final CharSequence getModeratorComment() {
        return this.moderatorComment;
    }

    public int hashCode() {
        CharSequence charSequence = this.moderatorComment;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    @k
    public String toString() {
        return c.r(new StringBuilder("CBRDocumentsModeratorCommentViewItem(moderatorComment="), this.moderatorComment, ')');
    }

    public /* synthetic */ CBRDocumentsModeratorCommentViewItem(CharSequence charSequence, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : charSequence);
    }

    public CBRDocumentsModeratorCommentViewItem(@l CharSequence charSequence) {
        super(6);
        this.moderatorComment = charSequence;
    }
}
