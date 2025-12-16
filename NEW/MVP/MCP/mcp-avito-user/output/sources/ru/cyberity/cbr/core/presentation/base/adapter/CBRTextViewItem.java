package ru.cyberity.cbr.core.presentation.base.adapter;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CBRDocumentItems.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRTextViewItem;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "text", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRTextViewItem extends CBRDocumentItem {

    @l
    private final CharSequence text;

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CBRTextViewItem) && L.f(this.text, ((CBRTextViewItem) other).text);
    }

    @l
    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    @k
    public String toString() {
        return c.r(new StringBuilder("CBRTextViewItem(text="), this.text, ')');
    }
}
