package com.avito.android.early_access.adapter.bundle;

import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EarlyAccessBundleItem.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/early_access/adapter/bundle/EarlyAccessBundleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "()V", "Lcom/avito/android/early_access/adapter/bundle/EarlyAccessBundleDividerItem;", "Lcom/avito/android/early_access/adapter/bundle/EarlyAccessSelectableBundleItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class EarlyAccessBundleItem implements ParcelableItem {
    public /* synthetic */ EarlyAccessBundleItem(C42822w c42822w) {
        this();
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF94474b() {
        return a.C10492a.a(this);
    }

    public EarlyAccessBundleItem() {
    }
}
