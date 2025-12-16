package com.yandex.mapkit.search;

import com.yandex.mapkit.Attribution;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class SearchLink implements Serializable {
    private String aref;
    private Attribution.Link link;
    private String tag;

    public SearchLink(@P String str, @N Attribution.Link link, @P String str2) {
        if (link == null) {
            throw new IllegalArgumentException("Required field \"link\" cannot be null");
        }
        this.aref = str;
        this.link = link;
        this.tag = str2;
    }

    @P
    public String getAref() {
        return this.aref;
    }

    @N
    public Attribution.Link getLink() {
        return this.link;
    }

    @P
    public String getTag() {
        return this.tag;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.aref = archive.add(this.aref, true);
        this.link = (Attribution.Link) archive.add((Archive) this.link, false, (Class<Archive>) Attribution.Link.class);
        this.tag = archive.add(this.tag, true);
    }

    public SearchLink() {
    }
}
