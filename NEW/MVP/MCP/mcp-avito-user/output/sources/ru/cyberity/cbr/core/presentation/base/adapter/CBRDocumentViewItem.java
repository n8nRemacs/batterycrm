package ru.cyberity.cbr.core.presentation.base.adapter;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRDocumentViewTypeInfo;
import ru.cyberity.cbr.core.widget.CBRStepState;

/* compiled from: CBRDocumentItems.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewItem;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "", "title", "subtitle", "", "isClickable", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo;", "typeInfo", "<init>", "(Lru/cyberity/cbr/core/widget/CBRStepState;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "resolveIcon", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "getSubtitle", "Z", "()Z", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo;", "getTypeInfo", "()Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentViewTypeInfo;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRDocumentViewItem extends CBRDocumentItem {
    private final boolean isClickable;

    @k
    private final CBRStepState state;

    @l
    private final CharSequence subtitle;

    @k
    private final CharSequence title;

    @k
    private final CBRDocumentViewTypeInfo typeInfo;

    public /* synthetic */ CBRDocumentViewItem(CBRStepState cBRStepState, CharSequence charSequence, CharSequence charSequence2, boolean z12, CBRDocumentViewTypeInfo cBRDocumentViewTypeInfo, int i12, C42822w c42822w) {
        this(cBRStepState, charSequence, charSequence2, (i12 & 8) != 0 ? false : z12, cBRDocumentViewTypeInfo);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRDocumentViewItem)) {
            return false;
        }
        CBRDocumentViewItem cBRDocumentViewItem = (CBRDocumentViewItem) other;
        return this.state == cBRDocumentViewItem.state && L.f(this.title, cBRDocumentViewItem.title) && L.f(this.subtitle, cBRDocumentViewItem.subtitle) && this.isClickable == cBRDocumentViewItem.isClickable && L.f(this.typeInfo, cBRDocumentViewItem.typeInfo);
    }

    @k
    public final CBRStepState getState() {
        return this.state;
    }

    @l
    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    @k
    public final CharSequence getTitle() {
        return this.title;
    }

    @k
    public final CBRDocumentViewTypeInfo getTypeInfo() {
        return this.typeInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iC2 = com.avito.android.advert.item.delivery_suggests.l.c(this.state.hashCode() * 31, 31, this.title);
        CharSequence charSequence = this.subtitle;
        int iHashCode = (iC2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        boolean z12 = this.isClickable;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return this.typeInfo.hashCode() + ((iHashCode + i12) * 31);
    }

    /* renamed from: isClickable, reason: from getter */
    public final boolean getIsClickable() {
        return this.isClickable;
    }

    @l
    public final Drawable resolveIcon(@k Context context) {
        return this.typeInfo.getType() == CBRDocumentViewTypeInfo.Type.VIDEO_IDENTIFICATION ? n0.f432787a.getIconHandler().onResolveIcon(context, new DocumentType("VIDEO_IDENT").b()) : n0.f432787a.getIconHandler().onResolveIcon(context, this.typeInfo.getDocument().getType().b());
    }

    @k
    public String toString() {
        return "CBRDocumentViewItem(state=" + this.state + ", title=" + ((Object) this.title) + ", subtitle=" + ((Object) this.subtitle) + ", isClickable=" + this.isClickable + ", typeInfo=" + this.typeInfo + ')';
    }

    public CBRDocumentViewItem(@k CBRStepState cBRStepState, @k CharSequence charSequence, @l CharSequence charSequence2, boolean z12, @k CBRDocumentViewTypeInfo cBRDocumentViewTypeInfo) {
        super(1);
        this.state = cBRStepState;
        this.title = charSequence;
        this.subtitle = charSequence2;
        this.isClickable = z12;
        this.typeInfo = cBRDocumentViewTypeInfo;
    }
}
