package um0;

import Y61.k;
import kotlin.Metadata;

/* compiled from: Api2TogglesPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lum0/c;", "", "", "key", "", "value", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Z", "b", "()Z", "_avito_remote-toggles-fetcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: um0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49078c {

    @com.google.gson.annotations.c("key")
    @k
    private final String key;

    @com.google.gson.annotations.c("value")
    private final boolean value;

    public C49078c(@k String str, boolean z12) {
        this.key = str;
        this.value = z12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }
}
