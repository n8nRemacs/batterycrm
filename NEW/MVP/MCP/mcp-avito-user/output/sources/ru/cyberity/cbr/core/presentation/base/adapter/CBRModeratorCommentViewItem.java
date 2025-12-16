package ru.cyberity.cbr.core.presentation.base.adapter;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.widget.CBRStepState;

/* compiled from: CBRDocumentItems.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRModeratorCommentViewItem;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "", "moderationTitle", "moderationComment", "Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/core/widget/CBRStepState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getModerationTitle", "()Ljava/lang/CharSequence;", "getModerationComment", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRModeratorCommentViewItem extends CBRDocumentItem {

    @l
    private final CharSequence moderationComment;

    @l
    private final CharSequence moderationTitle;

    @l
    private final CBRStepState state;

    public CBRModeratorCommentViewItem() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRModeratorCommentViewItem)) {
            return false;
        }
        CBRModeratorCommentViewItem cBRModeratorCommentViewItem = (CBRModeratorCommentViewItem) other;
        return L.f(this.moderationTitle, cBRModeratorCommentViewItem.moderationTitle) && L.f(this.moderationComment, cBRModeratorCommentViewItem.moderationComment) && this.state == cBRModeratorCommentViewItem.state;
    }

    @l
    public final CharSequence getModerationComment() {
        return this.moderationComment;
    }

    @l
    public final CharSequence getModerationTitle() {
        return this.moderationTitle;
    }

    @l
    public final CBRStepState getState() {
        return this.state;
    }

    public int hashCode() {
        CharSequence charSequence = this.moderationTitle;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.moderationComment;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CBRStepState cBRStepState = this.state;
        return iHashCode2 + (cBRStepState != null ? cBRStepState.hashCode() : 0);
    }

    @k
    public String toString() {
        return "CBRModeratorCommentViewItem(moderationTitle=" + ((Object) this.moderationTitle) + ", moderationComment=" + ((Object) this.moderationComment) + ", state=" + this.state + ')';
    }

    public /* synthetic */ CBRModeratorCommentViewItem(CharSequence charSequence, CharSequence charSequence2, CBRStepState cBRStepState, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : cBRStepState);
    }

    public CBRModeratorCommentViewItem(@l CharSequence charSequence, @l CharSequence charSequence2, @l CBRStepState cBRStepState) {
        super(2);
        this.moderationTitle = charSequence;
        this.moderationComment = charSequence2;
        this.state = cBRStepState;
    }
}
