package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ExtendedProfilePhoneResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0005\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfilePhoneDisclaimer;", "", "title", "", "description", "isAnonymous", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDescription", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfilePhoneDisclaimer {

    @c("description")
    @l
    private final String description;

    @c("isAnonymous")
    @l
    private final Boolean isAnonymous;

    @c("title")
    @k
    private final String title;

    public ExtendedProfilePhoneDisclaimer(@k String str, @l String str2, @l Boolean bool) {
        this.title = str;
        this.description = str2;
        this.isAnonymous = bool;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: isAnonymous, reason: from getter */
    public final Boolean getIsAnonymous() {
        return this.isAnonymous;
    }
}
