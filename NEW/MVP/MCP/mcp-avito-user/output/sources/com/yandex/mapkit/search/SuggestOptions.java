package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public final class SuggestOptions implements Serializable {
    private boolean strictBounds;
    private int suggestTypes;
    private boolean suggestWords;
    private Point userPosition;

    public SuggestOptions(int i12, @P Point point, boolean z12, boolean z13) {
        int i13 = SuggestType.UNSPECIFIED.value;
        this.suggestTypes = i12;
        this.userPosition = point;
        this.suggestWords = z12;
        this.strictBounds = z13;
    }

    public boolean getStrictBounds() {
        return this.strictBounds;
    }

    public int getSuggestTypes() {
        return this.suggestTypes;
    }

    public boolean getSuggestWords() {
        return this.suggestWords;
    }

    @P
    public Point getUserPosition() {
        return this.userPosition;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.suggestTypes = archive.add(Integer.valueOf(this.suggestTypes), false).intValue();
        this.userPosition = (Point) archive.add((Archive) this.userPosition, true, (Class<Archive>) Point.class);
        this.suggestWords = archive.add(this.suggestWords);
        this.strictBounds = archive.add(this.strictBounds);
    }

    public SuggestOptions setStrictBounds(boolean z12) {
        this.strictBounds = z12;
        return this;
    }

    public SuggestOptions setSuggestTypes(int i12) {
        this.suggestTypes = i12;
        return this;
    }

    public SuggestOptions setSuggestWords(boolean z12) {
        this.suggestWords = z12;
        return this;
    }

    public SuggestOptions setUserPosition(@P Point point) {
        this.userPosition = point;
        return this;
    }

    public SuggestOptions() {
        this.suggestTypes = SuggestType.UNSPECIFIED.value;
        this.suggestWords = false;
        this.strictBounds = false;
    }
}
