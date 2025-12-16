package com.huawei.hms.common.data;

/* loaded from: classes7.dex */
public interface DataBufferObserver {
    void onDataChanged();

    void onDataRangeChanged(int i12, int i13);

    void onDataRangeInserted(int i12, int i13);

    void onDataRangeMoved(int i12, int i13, int i14);

    void onDataRangeRemoved(int i12, int i13);
}
