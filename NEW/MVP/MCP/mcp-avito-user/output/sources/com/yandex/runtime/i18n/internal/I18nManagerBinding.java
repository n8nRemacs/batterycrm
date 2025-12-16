package com.yandex.runtime.i18n.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.i18n.CanonicalUnit;
import com.yandex.runtime.i18n.I18nManager;
import com.yandex.runtime.i18n.I18nPrefs;
import com.yandex.runtime.i18n.SystemOfMeasurement;
import com.yandex.runtime.i18n.TimeFormat;
import j.N;

/* loaded from: classes8.dex */
public class I18nManagerBinding implements I18nManager {
    private final NativeObject nativeObject;

    public I18nManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native CanonicalUnit canonicalSpeed(double d12);

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native I18nPrefs getPrefs();

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native SystemOfMeasurement getSom();

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native TimeFormat getTimeFormat();

    @Override // com.yandex.runtime.i18n.I18nManager
    public native boolean isValid();

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native String localizeCanonicalUnit(@N CanonicalUnit canonicalUnit);

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native String localizeDataSize(long j12);

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native String localizeDistance(int i12);

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native String localizeDuration(int i12);

    @Override // com.yandex.runtime.i18n.I18nManager
    @N
    public native String localizeSpeed(double d12);

    @Override // com.yandex.runtime.i18n.I18nManager
    public native void setPrefs(@N I18nPrefs i18nPrefs);

    @Override // com.yandex.runtime.i18n.I18nManager
    public native void setSom(@N SystemOfMeasurement systemOfMeasurement);

    @Override // com.yandex.runtime.i18n.I18nManager
    public native void setTimeFormat(@N TimeFormat timeFormat);
}
