package com.yandex.runtime.i18n;

import j.N;

/* loaded from: classes8.dex */
public interface I18nManager {
    @N
    CanonicalUnit canonicalSpeed(double d12);

    @N
    I18nPrefs getPrefs();

    @N
    SystemOfMeasurement getSom();

    @N
    TimeFormat getTimeFormat();

    boolean isValid();

    @N
    String localizeCanonicalUnit(@N CanonicalUnit canonicalUnit);

    @N
    String localizeDataSize(long j12);

    @N
    String localizeDistance(int i12);

    @N
    String localizeDuration(int i12);

    @N
    String localizeSpeed(double d12);

    void setPrefs(@N I18nPrefs i18nPrefs);

    void setSom(@N SystemOfMeasurement systemOfMeasurement);

    void setTimeFormat(@N TimeFormat timeFormat);
}
