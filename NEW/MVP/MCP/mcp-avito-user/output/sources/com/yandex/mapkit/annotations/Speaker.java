package com.yandex.mapkit.annotations;

import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface Speaker {
    @j0
    double duration(@N LocalizedPhrase localizedPhrase);

    @j0
    void reset();

    @j0
    void say(@N LocalizedPhrase localizedPhrase);
}
