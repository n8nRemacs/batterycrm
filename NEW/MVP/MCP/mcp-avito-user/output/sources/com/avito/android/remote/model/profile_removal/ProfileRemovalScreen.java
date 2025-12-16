package com.avito.android.remote.model.profile_removal;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileRemovalScreen.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/ProfileRemovalScreen;", "", "items", "", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "removeOnboarding", "Lcom/avito/android/remote/model/profile_removal/RemovalOnboarding;", "newWalletBalance", "", "oldWalletBalance", "button", "Lcom/avito/android/remote/model/profile_removal/RemovalButton;", "extraButton", "(Ljava/util/List;Lcom/avito/android/remote/model/profile_removal/RemovalOnboarding;Ljava/lang/Double;Ljava/lang/Double;Lcom/avito/android/remote/model/profile_removal/RemovalButton;Lcom/avito/android/remote/model/profile_removal/RemovalButton;)V", "getButton", "()Lcom/avito/android/remote/model/profile_removal/RemovalButton;", "getExtraButton", "getItems", "()Ljava/util/List;", "getNewWalletBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOldWalletBalance", "getRemoveOnboarding", "()Lcom/avito/android/remote/model/profile_removal/RemovalOnboarding;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProfileRemovalScreen {

    @c("actionButton")
    @l
    private final RemovalButton button;

    @c("extraActionButton")
    @l
    private final RemovalButton extraButton;

    @c("list")
    @k
    private final List<RemovalProcessItem> items;

    @c("newWalletBalance")
    @l
    private final Double newWalletBalance;

    @c("oldWalletBalance")
    @l
    private final Double oldWalletBalance;

    @c("removeOnboarding")
    @l
    private final RemovalOnboarding removeOnboarding;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileRemovalScreen(@k List<? extends RemovalProcessItem> list, @l RemovalOnboarding removalOnboarding, @l Double d12, @l Double d13, @l RemovalButton removalButton, @l RemovalButton removalButton2) {
        this.items = list;
        this.removeOnboarding = removalOnboarding;
        this.newWalletBalance = d12;
        this.oldWalletBalance = d13;
        this.button = removalButton;
        this.extraButton = removalButton2;
    }

    @l
    public final RemovalButton getButton() {
        return this.button;
    }

    @l
    public final RemovalButton getExtraButton() {
        return this.extraButton;
    }

    @k
    public final List<RemovalProcessItem> getItems() {
        return this.items;
    }

    @l
    public final Double getNewWalletBalance() {
        return this.newWalletBalance;
    }

    @l
    public final Double getOldWalletBalance() {
        return this.oldWalletBalance;
    }

    @l
    public final RemovalOnboarding getRemoveOnboarding() {
        return this.removeOnboarding;
    }
}
