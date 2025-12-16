package cg;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: GetDetailedSpecsGroupsResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcg/c;", "", "", "key", "value", "Lcg/e;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcg/e;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcg/e;", "getValues", "()Lcg/e;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cg.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C27189c {

    @com.google.gson.annotations.c("key")
    @k
    private final String key;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    @com.google.gson.annotations.c("values")
    @l
    private final C27191e values;

    public C27189c(@k String str, @k String str2, @l C27191e c27191e) {
        this.key = str;
        this.value = str2;
        this.values = c27191e;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
