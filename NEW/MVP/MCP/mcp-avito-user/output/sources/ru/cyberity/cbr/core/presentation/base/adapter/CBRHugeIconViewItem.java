package ru.cyberity.cbr.core.presentation.base.adapter;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CBRDocumentItems.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/CBRHugeIconViewItem;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRDocumentItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "iconKey", "Ljava/lang/String;", "getIconKey", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRHugeIconViewItem extends CBRDocumentItem {

    @k
    private final String iconKey;

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CBRHugeIconViewItem) && L.f(this.iconKey, ((CBRHugeIconViewItem) other).iconKey);
    }

    @k
    public final String getIconKey() {
        return this.iconKey;
    }

    public int hashCode() {
        return this.iconKey.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("CBRHugeIconViewItem(iconKey="), this.iconKey, ')');
    }
}
