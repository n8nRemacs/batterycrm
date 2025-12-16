package com.avito.android.remote.model.profile_support;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ProfileRemoveSupport.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/profile_support/ProfileRemoveSupport;", "", "headerText", "", "descriptionText", "button", "Lcom/avito/android/remote/model/profile_support/NextButton;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/profile_support/NextButton;)V", "getButton", "()Lcom/avito/android/remote/model/profile_support/NextButton;", "getDescriptionText", "()Ljava/lang/String;", "getHeaderText", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProfileRemoveSupport {

    @c("actionButton")
    @k
    private final NextButton button;

    @c("descriptionText")
    @k
    private final String descriptionText;

    @c("headerText")
    @k
    private final String headerText;

    public ProfileRemoveSupport(@k String str, @k String str2, @k NextButton nextButton) {
        this.headerText = str;
        this.descriptionText = str2;
        this.button = nextButton;
    }

    @k
    public final NextButton getButton() {
        return this.button;
    }

    @k
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @k
    public final String getHeaderText() {
        return this.headerText;
    }
}
