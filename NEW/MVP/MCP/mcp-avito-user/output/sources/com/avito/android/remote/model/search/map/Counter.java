package com.avito.android.remote.model.search.map;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Counter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/search/map/Counter;", "", "totalCount", "", "visibleObjectsCount", "", "noVisibleObjectsCurtain", "Lcom/avito/android/remote/model/search/map/NoVisibleObjectsCurtain;", "enabled", "", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/search/map/NoVisibleObjectsCurtain;Ljava/lang/Boolean;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNoVisibleObjectsCurtain", "()Lcom/avito/android/remote/model/search/map/NoVisibleObjectsCurtain;", "getTotalCount", "()Ljava/lang/String;", "getVisibleObjectsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Counter {

    @c("enabled")
    @l
    private final Boolean enabled;

    @c("noVisibleObjectsCurtain")
    @l
    private final NoVisibleObjectsCurtain noVisibleObjectsCurtain;

    @c("totalCount")
    @l
    private final String totalCount;

    @c("visibleObjectsCount")
    @l
    private final Integer visibleObjectsCount;

    public Counter() {
        this(null, null, null, null, 15, null);
    }

    @l
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @l
    public final NoVisibleObjectsCurtain getNoVisibleObjectsCurtain() {
        return this.noVisibleObjectsCurtain;
    }

    @l
    public final String getTotalCount() {
        return this.totalCount;
    }

    @l
    public final Integer getVisibleObjectsCount() {
        return this.visibleObjectsCount;
    }

    public Counter(@l String str, @l Integer num, @l NoVisibleObjectsCurtain noVisibleObjectsCurtain, @l Boolean bool) {
        this.totalCount = str;
        this.visibleObjectsCount = num;
        this.noVisibleObjectsCurtain = noVisibleObjectsCurtain;
        this.enabled = bool;
    }

    public /* synthetic */ Counter(String str, Integer num, NoVisibleObjectsCurtain noVisibleObjectsCurtain, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : noVisibleObjectsCurtain, (i12 & 8) != 0 ? null : bool);
    }
}
