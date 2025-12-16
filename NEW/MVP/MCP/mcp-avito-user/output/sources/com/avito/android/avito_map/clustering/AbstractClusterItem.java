package com.avito.android.avito_map.clustering;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AbstractClusterItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/avito/android/avito_map/clustering/AbstractClusterItem;", "Lcom/avito/android/avito_map/clustering/ClusterItem;", "position", "Lcom/avito/android/avito_map/AvitoMapPoint;", "title", "", "snippet", "(Lcom/avito/android/avito_map/AvitoMapPoint;Ljava/lang/String;Ljava/lang/String;)V", "equals", "", PluralsKeys.OTHER, "", "getPosition", "getSnippet", "getTitle", "hashCode", "", "toString", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AbstractClusterItem implements ClusterItem {

    @k
    private final AvitoMapPoint position;

    @k
    private final String snippet;

    @k
    private final String title;

    public AbstractClusterItem(@k AvitoMapPoint avitoMapPoint, @k String str, @k String str2) {
        this.position = avitoMapPoint;
        this.title = str;
        this.snippet = str2;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbstractClusterItem)) {
            return false;
        }
        AbstractClusterItem abstractClusterItem = (AbstractClusterItem) other;
        return L.f(this.position, abstractClusterItem.position) && L.f(this.title, abstractClusterItem.title) && L.f(this.snippet, abstractClusterItem.snippet);
    }

    @Override // com.avito.android.avito_map.clustering.ClusterItem
    @k
    public AvitoMapPoint getPosition() {
        return this.position;
    }

    @Override // com.avito.android.avito_map.clustering.ClusterItem
    @k
    public String getSnippet() {
        return this.snippet;
    }

    @Override // com.avito.android.avito_map.clustering.ClusterItem
    @k
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.snippet.hashCode() + H.d(this.position.hashCode() * 31, 31, this.title);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AbstractClusterItem(position=");
        sb2.append(this.position);
        sb2.append(", title='");
        sb2.append(this.title);
        sb2.append("', snippet='");
        return c.s(sb2, this.snippet, "')");
    }
}
