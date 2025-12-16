package com.avito.android.remote.model;

import Y61.l;
import com.avito.android.remote.model.onboarding.OnboardingItem;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: OnboardingResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/OnboardingResult;", "", "id", "", "item", "Lcom/avito/android/remote/model/onboarding/OnboardingItem;", "(Ljava/lang/String;Lcom/avito/android/remote/model/onboarding/OnboardingItem;)V", "getId", "()Ljava/lang/String;", "getItem", "()Lcom/avito/android/remote/model/onboarding/OnboardingItem;", "_avito-discouraged_avito-api_onboarding"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OnboardingResult {

    @c("id")
    @l
    private final String id;

    @c("item")
    @l
    private final OnboardingItem item;

    public OnboardingResult(@l String str, @l OnboardingItem onboardingItem) {
        this.id = str;
        this.item = onboardingItem;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final OnboardingItem getItem() {
        return this.item;
    }
}
