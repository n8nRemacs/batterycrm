package com.avito.android.remote.model.delivery;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DeliveryUniversalCheckoutSummary.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u001dBu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryUniversalCheckoutSummary;", "", "title", "", "actions", "", "Lcom/avito/android/beduin_models/BeduinAction;", "topFormId", "mainFormId", "bottomFormId", "topComponents", "Lcom/avito/android/beduin_models/BeduinModel;", "mainComponents", "bottomComponents", "settings", "Lcom/avito/android/remote/model/delivery/DeliveryUniversalCheckoutSummary$Settings;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/delivery/DeliveryUniversalCheckoutSummary$Settings;)V", "getActions", "()Ljava/util/List;", "getBottomComponents", "getBottomFormId", "()Ljava/lang/String;", "getMainComponents", "getMainFormId", "getSettings", "()Lcom/avito/android/remote/model/delivery/DeliveryUniversalCheckoutSummary$Settings;", "getTitle", "getTopComponents", "getTopFormId", "Settings", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DeliveryUniversalCheckoutSummary {

    @c("actions")
    @l
    private final List<BeduinAction> actions;

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

    @c("settings")
    @l
    private final Settings settings;

    @c("title")
    @k
    private final String title;

    @c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @c("topFormId")
    @l
    private final String topFormId;

    /* compiled from: DeliveryUniversalCheckoutSummary.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryUniversalCheckoutSummary$Settings;", "", "showBottomFormBackground", "", "(Ljava/lang/Boolean;)V", "getShowBottomFormBackground", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Settings {

        @c("showBottomFormBackground")
        @l
        private final Boolean showBottomFormBackground;

        public Settings(@l Boolean bool) {
            this.showBottomFormBackground = bool;
        }

        @l
        public final Boolean getShowBottomFormBackground() {
            return this.showBottomFormBackground;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryUniversalCheckoutSummary(@k String str, @l List<? extends BeduinAction> list, @l String str2, @l String str3, @l String str4, @l List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3, @l List<? extends BeduinModel> list4, @l Settings settings) {
        this.title = str;
        this.actions = list;
        this.topFormId = str2;
        this.mainFormId = str3;
        this.bottomFormId = str4;
        this.topComponents = list2;
        this.mainComponents = list3;
        this.bottomComponents = list4;
        this.settings = settings;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
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

    @l
    public final Settings getSettings() {
        return this.settings;
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
