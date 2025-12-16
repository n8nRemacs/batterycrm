package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class Phone implements Serializable {
    private String country;
    private String ext;
    private String formattedNumber;
    private String info;
    private String number;
    private String prefix;
    private PhoneType type;

    public Phone(@N PhoneType phoneType, @N String str, @P String str2, @P String str3, @P String str4, @P String str5, @P String str6) {
        if (phoneType == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Required field \"formattedNumber\" cannot be null");
        }
        this.type = phoneType;
        this.formattedNumber = str;
        this.info = str2;
        this.country = str3;
        this.prefix = str4;
        this.ext = str5;
        this.number = str6;
    }

    @P
    public String getCountry() {
        return this.country;
    }

    @P
    public String getExt() {
        return this.ext;
    }

    @N
    public String getFormattedNumber() {
        return this.formattedNumber;
    }

    @P
    public String getInfo() {
        return this.info;
    }

    @P
    public String getNumber() {
        return this.number;
    }

    @P
    public String getPrefix() {
        return this.prefix;
    }

    @N
    public PhoneType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (PhoneType) archive.add((Archive) this.type, false, (Class<Archive>) PhoneType.class);
        this.formattedNumber = archive.add(this.formattedNumber, false);
        this.info = archive.add(this.info, true);
        this.country = archive.add(this.country, true);
        this.prefix = archive.add(this.prefix, true);
        this.ext = archive.add(this.ext, true);
        this.number = archive.add(this.number, true);
    }

    public Phone() {
    }
}
