package com.yandex.mapkit.logo;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes7.dex */
public class Padding implements Serializable {
    private int horizontalPadding;
    private int verticalPadding;

    public Padding(int i12, int i13) {
        this.horizontalPadding = i12;
        this.verticalPadding = i13;
    }

    public int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public int getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.horizontalPadding = archive.add(this.horizontalPadding);
        this.verticalPadding = archive.add(this.verticalPadding);
    }

    public Padding() {
    }
}
