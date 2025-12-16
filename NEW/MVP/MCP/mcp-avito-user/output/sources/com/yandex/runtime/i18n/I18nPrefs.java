package com.yandex.runtime.i18n;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes8.dex */
public class I18nPrefs implements Serializable {
    private SystemOfMeasurement som;
    private TimeFormat timeFormat;

    public I18nPrefs(@N SystemOfMeasurement systemOfMeasurement, @N TimeFormat timeFormat) {
        if (systemOfMeasurement == null) {
            throw new IllegalArgumentException("Required field \"som\" cannot be null");
        }
        if (timeFormat == null) {
            throw new IllegalArgumentException("Required field \"timeFormat\" cannot be null");
        }
        this.som = systemOfMeasurement;
        this.timeFormat = timeFormat;
    }

    @N
    public SystemOfMeasurement getSom() {
        return this.som;
    }

    @N
    public TimeFormat getTimeFormat() {
        return this.timeFormat;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.som = (SystemOfMeasurement) archive.add((Archive) this.som, false, (Class<Archive>) SystemOfMeasurement.class);
        this.timeFormat = (TimeFormat) archive.add((Archive) this.timeFormat, false, (Class<Archive>) TimeFormat.class);
    }

    public I18nPrefs() {
    }
}
