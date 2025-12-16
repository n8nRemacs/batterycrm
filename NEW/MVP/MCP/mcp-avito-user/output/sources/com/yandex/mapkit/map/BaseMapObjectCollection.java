package com.yandex.mapkit.map;

import j.N;

/* loaded from: classes7.dex */
public interface BaseMapObjectCollection extends MapObject {
    void addListener(@N MapObjectCollectionListener mapObjectCollectionListener);

    void clear();

    void remove(@N MapObject mapObject);

    void removeListener(@N MapObjectCollectionListener mapObjectCollectionListener);

    void traverse(@N MapObjectVisitor mapObjectVisitor);
}
