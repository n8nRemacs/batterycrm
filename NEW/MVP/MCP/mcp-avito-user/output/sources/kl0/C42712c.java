package kl0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: ApiPublishSellerAddressListResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lkl0/c;", "", "", AddressParameter.Value.JSON_WEB_TOKEN, "", "lat", AddressParameter.Value.LNG, "text", "<init>", "(Ljava/lang/String;DDLjava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "D", "b", "()D", "c", "d", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kl0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42712c {

    @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
    @l
    private final String jwt;

    @com.google.gson.annotations.c("lat")
    private final double lat;

    @com.google.gson.annotations.c(AddressParameter.Value.LNG)
    private final double lng;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public C42712c(@l String str, double d12, double d13, @k String str2) {
        this.jwt = str;
        this.lat = d12;
        this.lng = d13;
        this.text = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    /* renamed from: b, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: c, reason: from getter */
    public final double getLng() {
        return this.lng;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
