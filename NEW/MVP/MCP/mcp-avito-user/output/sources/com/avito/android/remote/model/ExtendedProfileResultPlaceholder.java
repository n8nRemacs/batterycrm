package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ExtendedProfileResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileResultPlaceholder;", "Lcom/avito/android/remote/model/ExtendedProfileResult;", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "action", "Lcom/avito/android/remote/model/DeeplinkAction;", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/DeeplinkAction;)V", "getAction", "()Lcom/avito/android/remote/model/DeeplinkAction;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileResultPlaceholder implements ExtendedProfileResult {

    @c("action")
    @l
    private final DeeplinkAction action;

    @c("subtitle")
    @k
    private final AttributedText subtitle;

    @c("title")
    @k
    private final String title;

    public ExtendedProfileResultPlaceholder(@k String str, @k AttributedText attributedText, @l DeeplinkAction deeplinkAction) {
        this.title = str;
        this.subtitle = attributedText;
        this.action = deeplinkAction;
    }

    @l
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @k
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }
}
