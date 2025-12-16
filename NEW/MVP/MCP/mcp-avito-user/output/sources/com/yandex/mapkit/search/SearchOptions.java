package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public final class SearchOptions implements Serializable {
    private boolean disableSpellingCorrection;
    private FilterCollection filters;
    private boolean geometry;
    private String origin;
    private Integer resultPageSize;
    private int searchTypes;
    private int snippets;
    private Point userPosition;

    public SearchOptions(int i12, @P Integer num, int i13, @P Point point, @P String str, boolean z12, boolean z13, @P FilterCollection filterCollection) {
        this.searchTypes = SearchType.NONE.value;
        int i14 = Snippet.NONE.value;
        this.searchTypes = i12;
        this.resultPageSize = num;
        this.snippets = i13;
        this.userPosition = point;
        this.origin = str;
        this.geometry = z12;
        this.disableSpellingCorrection = z13;
        this.filters = filterCollection;
    }

    public boolean getDisableSpellingCorrection() {
        return this.disableSpellingCorrection;
    }

    @P
    public FilterCollection getFilters() {
        return this.filters;
    }

    public boolean getGeometry() {
        return this.geometry;
    }

    @P
    public String getOrigin() {
        return this.origin;
    }

    @P
    public Integer getResultPageSize() {
        return this.resultPageSize;
    }

    public int getSearchTypes() {
        return this.searchTypes;
    }

    public int getSnippets() {
        return this.snippets;
    }

    @P
    public Point getUserPosition() {
        return this.userPosition;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.searchTypes = archive.add(Integer.valueOf(this.searchTypes), false).intValue();
        this.resultPageSize = archive.add(this.resultPageSize, true);
        this.snippets = archive.add(Integer.valueOf(this.snippets), false).intValue();
        this.userPosition = (Point) archive.add((Archive) this.userPosition, true, (Class<Archive>) Point.class);
        this.origin = archive.add(this.origin, true);
        this.geometry = archive.add(this.geometry);
        this.disableSpellingCorrection = archive.add(this.disableSpellingCorrection);
        this.filters = (FilterCollection) archive.add((Archive) this.filters, true, (Class<Archive>) FilterCollection.class);
    }

    public SearchOptions setDisableSpellingCorrection(boolean z12) {
        this.disableSpellingCorrection = z12;
        return this;
    }

    public SearchOptions setFilters(@P FilterCollection filterCollection) {
        this.filters = filterCollection;
        return this;
    }

    public SearchOptions setGeometry(boolean z12) {
        this.geometry = z12;
        return this;
    }

    public SearchOptions setOrigin(@P String str) {
        this.origin = str;
        return this;
    }

    public SearchOptions setResultPageSize(@P Integer num) {
        this.resultPageSize = num;
        return this;
    }

    public SearchOptions setSearchTypes(int i12) {
        this.searchTypes = i12;
        return this;
    }

    public SearchOptions setSnippets(int i12) {
        this.snippets = i12;
        return this;
    }

    public SearchOptions setUserPosition(@P Point point) {
        this.userPosition = point;
        return this;
    }

    public SearchOptions() {
        this.searchTypes = SearchType.NONE.value;
        this.snippets = Snippet.NONE.value;
        this.geometry = false;
        this.disableSpellingCorrection = false;
    }
}
