package com.yandex.mapkit.search;

import AK.c;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class CurrencyExchangeMetadata implements BaseMetadata, Serializable {
    private List<CurrencyExchangeType> currencies;
    private boolean currencies__is_initialized;
    private NativeObject nativeObject;

    public CurrencyExchangeMetadata() {
        this.currencies__is_initialized = false;
    }

    private native List<CurrencyExchangeType> getCurrencies__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CurrencyExchangeMetadata";
    }

    private native NativeObject init(List<CurrencyExchangeType> list);

    @N
    public synchronized List<CurrencyExchangeType> getCurrencies() {
        try {
            if (!this.currencies__is_initialized) {
                this.currencies = getCurrencies__Native();
                this.currencies__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.currencies;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            c.z(CurrencyExchangeType.class, archive, getCurrencies(), false);
            return;
        }
        List<CurrencyExchangeType> listX = c.x(CurrencyExchangeType.class, archive, this.currencies, false);
        this.currencies = listX;
        this.currencies__is_initialized = true;
        this.nativeObject = init(listX);
    }

    public CurrencyExchangeMetadata(@N List<CurrencyExchangeType> list) {
        this.currencies__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.currencies = list;
            this.currencies__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"currencies\" cannot be null");
    }

    private CurrencyExchangeMetadata(NativeObject nativeObject) {
        this.currencies__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
