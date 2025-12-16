package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishDraftResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/PublishDraftResponse;", "", "()V", "NotFound", "Ok", "Lcom/avito/android/remote/model/PublishDraftResponse$NotFound;", "Lcom/avito/android/remote/model/PublishDraftResponse$Ok;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PublishDraftResponse {

    /* compiled from: PublishDraftResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/PublishDraftResponse$NotFound;", "Lcom/avito/android/remote/model/PublishDraftResponse;", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotFound extends PublishDraftResponse {

        @k
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    /* compiled from: PublishDraftResponse.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/PublishDraftResponse$Ok;", "Lcom/avito/android/remote/model/PublishDraftResponse;", "draft", "Lcom/avito/android/remote/model/PublishDraftResponse$Ok$Draft;", "dialogInfo", "Lcom/avito/android/remote/model/DeepLinksDialogInfo;", "(Lcom/avito/android/remote/model/PublishDraftResponse$Ok$Draft;Lcom/avito/android/remote/model/DeepLinksDialogInfo;)V", "getDialogInfo", "()Lcom/avito/android/remote/model/DeepLinksDialogInfo;", "getDraft", "()Lcom/avito/android/remote/model/PublishDraftResponse$Ok$Draft;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "Draft", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ok extends PublishDraftResponse {

        @c("dialog")
        @k
        private final DeepLinksDialogInfo dialogInfo;

        @c("draft")
        @k
        private final Draft draft;

        /* compiled from: PublishDraftResponse.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/PublishDraftResponse$Ok$Draft;", "", "sessionId", "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Draft {

            @c("publishSessionId")
            @k
            private final String sessionId;

            public Draft(@k String str) {
                this.sessionId = str;
            }

            public static /* synthetic */ Draft copy$default(Draft draft, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = draft.sessionId;
                }
                return draft.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getSessionId() {
                return this.sessionId;
            }

            @k
            public final Draft copy(@k String sessionId) {
                return new Draft(sessionId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Draft) && L.f(this.sessionId, ((Draft) other).sessionId);
            }

            @k
            public final String getSessionId() {
                return this.sessionId;
            }

            public int hashCode() {
                return this.sessionId.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("Draft(sessionId="), this.sessionId, ')');
            }
        }

        public Ok(@k Draft draft, @k DeepLinksDialogInfo deepLinksDialogInfo) {
            super(null);
            this.draft = draft;
            this.dialogInfo = deepLinksDialogInfo;
        }

        public static /* synthetic */ Ok copy$default(Ok ok2, Draft draft, DeepLinksDialogInfo deepLinksDialogInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                draft = ok2.draft;
            }
            if ((i12 & 2) != 0) {
                deepLinksDialogInfo = ok2.dialogInfo;
            }
            return ok2.copy(draft, deepLinksDialogInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Draft getDraft() {
            return this.draft;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLinksDialogInfo getDialogInfo() {
            return this.dialogInfo;
        }

        @k
        public final Ok copy(@k Draft draft, @k DeepLinksDialogInfo dialogInfo) {
            return new Ok(draft, dialogInfo);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ok)) {
                return false;
            }
            Ok ok2 = (Ok) other;
            return L.f(this.draft, ok2.draft) && L.f(this.dialogInfo, ok2.dialogInfo);
        }

        @k
        public final DeepLinksDialogInfo getDialogInfo() {
            return this.dialogInfo;
        }

        @k
        public final Draft getDraft() {
            return this.draft;
        }

        public int hashCode() {
            return this.dialogInfo.hashCode() + (this.draft.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Ok(draft=" + this.draft + ", dialogInfo=" + this.dialogInfo + ')';
        }
    }

    public /* synthetic */ PublishDraftResponse(C42822w c42822w) {
        this();
    }

    private PublishDraftResponse() {
    }
}
