package cw;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: Api2LogisticsSellerTariffGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcw/e;", "", "", "areDaysEditable", "", "desciption", "description", "isCustom", "isPriceEditable", "isTariffSelectable", "name", "termsType", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "Z", "a", "()Z", "Ljava/lang/String;", "getDesciption", "()Ljava/lang/String;", "b", "e", "f", "g", "c", "d", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    @com.google.gson.annotations.c("areDaysEditable")
    private final boolean areDaysEditable;

    @com.google.gson.annotations.c("desciption")
    @l
    private final String desciption;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("isCustom")
    private final boolean isCustom;

    @com.google.gson.annotations.c("isPriceEditable")
    private final boolean isPriceEditable;

    @com.google.gson.annotations.c("isTariffSelectable")
    private final boolean isTariffSelectable;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("termsType")
    @k
    private final String termsType;

    public e(boolean z12, @l String str, @l String str2, boolean z13, boolean z14, boolean z15, @k String str3, @k String str4) {
        this.areDaysEditable = z12;
        this.desciption = str;
        this.description = str2;
        this.isCustom = z13;
        this.isPriceEditable = z14;
        this.isTariffSelectable = z15;
        this.name = str3;
        this.termsType = str4;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAreDaysEditable() {
        return this.areDaysEditable;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTermsType() {
        return this.termsType;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsCustom() {
        return this.isCustom;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsPriceEditable() {
        return this.isPriceEditable;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsTariffSelectable() {
        return this.isTariffSelectable;
    }
}
