package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.FilterCollection;
import com.yandex.mapkit.search.FilterCollectionBuilder;
import com.yandex.runtime.NativeObject;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class FilterCollectionBuilderBinding implements FilterCollectionBuilder {
    private final NativeObject nativeObject;

    public FilterCollectionBuilderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    public native void addBooleanFilter(@N String str);

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    public native void addDateFilter(@N String str, @N String str2, @N String str3);

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    public native void addEnumFilter(@N String str, @N List<String> list);

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    public native void addRangeFilter(@N String str, double d12, double d13);

    @Override // com.yandex.mapkit.search.FilterCollectionBuilder
    @N
    public native FilterCollection build();
}
