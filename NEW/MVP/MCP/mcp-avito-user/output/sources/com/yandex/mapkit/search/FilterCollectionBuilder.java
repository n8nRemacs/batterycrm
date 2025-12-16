package com.yandex.mapkit.search;

import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface FilterCollectionBuilder {
    void addBooleanFilter(@N String str);

    void addDateFilter(@N String str, @N String str2, @N String str3);

    void addEnumFilter(@N String str, @N List<String> list);

    void addRangeFilter(@N String str, double d12, double d13);

    @N
    FilterCollection build();
}
