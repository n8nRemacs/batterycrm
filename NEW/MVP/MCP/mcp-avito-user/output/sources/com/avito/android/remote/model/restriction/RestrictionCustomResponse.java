package com.avito.android.remote.model.restriction;

import Y61.l;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RestrictionCustomResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/restriction/RestrictionCustomResponse;", "", "isAllowed", "", "content", "Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "(ZLcom/avito/android/deep_linking/links/DetailsSheetLinkBody;)V", "getContent", "()Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "()Z", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RestrictionCustomResponse {

    @c("content")
    @l
    private final DetailsSheetLinkBody content;

    @c("isAllowed")
    private final boolean isAllowed;

    public RestrictionCustomResponse(boolean z12, @l DetailsSheetLinkBody detailsSheetLinkBody) {
        this.isAllowed = z12;
        this.content = detailsSheetLinkBody;
    }

    @l
    public final DetailsSheetLinkBody getContent() {
        return this.content;
    }

    /* renamed from: isAllowed, reason: from getter */
    public final boolean getIsAllowed() {
        return this.isAllowed;
    }
}
