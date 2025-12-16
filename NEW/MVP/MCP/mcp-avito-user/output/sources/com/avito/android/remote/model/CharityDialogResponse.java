package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CharityDialogResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/CharityDialogResponse;", "", "()V", "NotRequired", "Ok", "Lcom/avito/android/remote/model/CharityDialogResponse$NotRequired;", "Lcom/avito/android/remote/model/CharityDialogResponse$Ok;", "_avito-discouraged_avito-api_user-adverts-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class CharityDialogResponse {

    /* compiled from: CharityDialogResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/CharityDialogResponse$NotRequired;", "Lcom/avito/android/remote/model/CharityDialogResponse;", "()V", "_avito-discouraged_avito-api_user-adverts-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotRequired extends CharityDialogResponse {

        @k
        public static final NotRequired INSTANCE = new NotRequired();

        private NotRequired() {
            super(null);
        }
    }

    /* compiled from: CharityDialogResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/CharityDialogResponse$Ok;", "Lcom/avito/android/remote/model/CharityDialogResponse;", "body", "Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "(Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;)V", "getBody", "()Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_user-adverts-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ok extends CharityDialogResponse {

        @c("dialog")
        @k
        private final DetailsSheetLinkBody body;

        public Ok(@k DetailsSheetLinkBody detailsSheetLinkBody) {
            super(null);
            this.body = detailsSheetLinkBody;
        }

        public static /* synthetic */ Ok copy$default(Ok ok2, DetailsSheetLinkBody detailsSheetLinkBody, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                detailsSheetLinkBody = ok2.body;
            }
            return ok2.copy(detailsSheetLinkBody);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final DetailsSheetLinkBody getBody() {
            return this.body;
        }

        @k
        public final Ok copy(@k DetailsSheetLinkBody body) {
            return new Ok(body);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ok) && L.f(this.body, ((Ok) other).body);
        }

        @k
        public final DetailsSheetLinkBody getBody() {
            return this.body;
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        @k
        public String toString() {
            return "Ok(body=" + this.body + ')';
        }
    }

    public /* synthetic */ CharityDialogResponse(C42822w c42822w) {
        this();
    }

    private CharityDialogResponse() {
    }
}
