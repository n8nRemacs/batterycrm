package com.avito.android.passport.network.model;

import Y61.k;
import androidx.annotation.Keep;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfileCreationDuplicationOptionsResponse.kt */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/avito/android/passport/network/model/ProfileCreationDuplicationOptionsResponse;", "", "title", "", "subtitle", "text", "Lcom/avito/android/remote/model/text/AttributedText;", "actions", "", "Lcom/avito/android/passport/network/model/Action;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getSubtitle", "()Ljava/lang/String;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileCreationDuplicationOptionsResponse {

    @k
    private final List<Action> actions;

    @k
    private final String subtitle;

    @k
    private final AttributedText text;

    @k
    private final String title;

    public ProfileCreationDuplicationOptionsResponse(@k String str, @k String str2, @k AttributedText attributedText, @k List<Action> list) {
        this.title = str;
        this.subtitle = str2;
        this.text = attributedText;
        this.actions = list;
    }

    @k
    public final List<Action> getActions() {
        return this.actions;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getText() {
        return this.text;
    }

    @k
    public final String getTitle() {
        return this.title;
    }
}
