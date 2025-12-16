package sI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiLocationSuggestByQueryV3Response.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LsI/a;", "", "", "LsI/c;", "blocks", "", "userAddressesSupported", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48052a {

    @com.google.gson.annotations.c("blocks")
    @k
    private final List<C48054c> blocks;

    @com.google.gson.annotations.c("userAddressesSupported")
    @l
    private final Boolean userAddressesSupported;

    public C48052a(@k List<C48054c> list, @l Boolean bool) {
        this.blocks = list;
        this.userAddressesSupported = bool;
    }

    @k
    public final List<C48054c> a() {
        return this.blocks;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getUserAddressesSupported() {
        return this.userAddressesSupported;
    }
}
