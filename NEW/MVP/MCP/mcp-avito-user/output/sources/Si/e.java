package sI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;

/* compiled from: ApiLocationSuggestByQueryV3Response.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b \u0010\u0014R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b!\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"LsI/e;", "", "", AddressParameter.TYPE, "", "addressId", "LsI/b;", ServiceTransportationWidget.LocationField.COORDINATES, "icon", "", "isDefault", AddressParameter.Value.JSON_WEB_TOKEN, MessageBody.Location.KIND, "subtitle", "suggestType", "title", "<init>", "(Ljava/lang/String;Ljava/lang/Long;LsI/b;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "LsI/b;", "c", "()LsI/b;", "getIcon", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "d", "getKind", "e", "f", "g", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @l
    private final String address;

    @com.google.gson.annotations.c("addressId")
    @l
    private final Long addressId;

    @com.google.gson.annotations.c(ServiceTransportationWidget.LocationField.COORDINATES)
    @l
    private final C48053b coordinates;

    @com.google.gson.annotations.c("icon")
    @l
    private final String icon;

    @com.google.gson.annotations.c("isDefault")
    @l
    private final Boolean isDefault;

    @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
    @k
    private final String jwt;

    @com.google.gson.annotations.c(MessageBody.Location.KIND)
    @k
    private final String kind;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("suggestType")
    @l
    private final String suggestType;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public e(@l String str, @l Long l12, @l C48053b c48053b, @l String str2, @l Boolean bool, @k String str3, @k String str4, @k String str5, @l String str6, @k String str7) {
        this.address = str;
        this.addressId = l12;
        this.coordinates = c48053b;
        this.icon = str2;
        this.isDefault = bool;
        this.jwt = str3;
        this.kind = str4;
        this.subtitle = str5;
        this.suggestType = str6;
        this.title = str7;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getAddressId() {
        return this.addressId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C48053b getCoordinates() {
        return this.coordinates;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getSuggestType() {
        return this.suggestType;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }
}
