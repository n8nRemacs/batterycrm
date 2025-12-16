package com.avito.android.remote.model.delivery;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinModel;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DeliveryReturnCheckoutResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\fR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryReturnCheckoutResult;", "", "title", "", "topFormId", "mainFormId", "bottomFormId", "topComponents", "", "Lcom/avito/android/beduin_models/BeduinModel;", "mainComponents", "bottomComponents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBottomComponents", "()Ljava/util/List;", "getBottomFormId", "()Ljava/lang/String;", "getMainComponents", "getMainFormId", "getTitle", "getTopComponents", "getTopFormId", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryReturnCheckoutResult {

    @c("bottomComponents")
    @l
    private final List<BeduinModel> bottomComponents;

    @c("bottomFormId")
    @l
    private final String bottomFormId;

    @c("mainComponents")
    @l
    private final List<BeduinModel> mainComponents;

    @c("mainFormId")
    @l
    private final String mainFormId;

    @c("title")
    @k
    private final String title;

    @c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @c("topFormId")
    @l
    private final String topFormId;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryReturnCheckoutResult(@k String str, @l String str2, @l String str3, @l String str4, @l List<? extends BeduinModel> list, @l List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3) {
        this.title = str;
        this.topFormId = str2;
        this.mainFormId = str3;
        this.bottomFormId = str4;
        this.topComponents = list;
        this.mainComponents = list2;
        this.bottomComponents = list3;
    }

    @l
    public final List<BeduinModel> getBottomComponents() {
        return this.bottomComponents;
    }

    @l
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> getMainComponents() {
        return this.mainComponents;
    }

    @l
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<BeduinModel> getTopComponents() {
        return this.topComponents;
    }

    @l
    public final String getTopFormId() {
        return this.topFormId;
    }
}
