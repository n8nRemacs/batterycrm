package ru.cyberity.cbr.core;

import Y61.k;
import kotlin.Metadata;

/* compiled from: CBRModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/CBRModule;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toString", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public abstract class CBRModule {

    @k
    private final String name;

    public CBRModule(@k String str) {
        this.name = str;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public String toString() {
        return this.name;
    }
}
