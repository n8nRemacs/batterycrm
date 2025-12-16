package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SaveDraftResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/SaveDraftResponse;", "", "()V", "Conflict", "Ok", "Skipped", "Lcom/avito/android/remote/model/SaveDraftResponse$Conflict;", "Lcom/avito/android/remote/model/SaveDraftResponse$Ok;", "Lcom/avito/android/remote/model/SaveDraftResponse$Skipped;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SaveDraftResponse {

    /* compiled from: SaveDraftResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/SaveDraftResponse$Conflict;", "Lcom/avito/android/remote/model/SaveDraftResponse;", "dialogInfo", "Lcom/avito/android/remote/model/DeepLinksDialogInfo;", "(Lcom/avito/android/remote/model/DeepLinksDialogInfo;)V", "getDialogInfo", "()Lcom/avito/android/remote/model/DeepLinksDialogInfo;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Conflict extends SaveDraftResponse {

        @c("dialog")
        @k
        private final DeepLinksDialogInfo dialogInfo;

        public Conflict(@k DeepLinksDialogInfo deepLinksDialogInfo) {
            super(null);
            this.dialogInfo = deepLinksDialogInfo;
        }

        public static /* synthetic */ Conflict copy$default(Conflict conflict, DeepLinksDialogInfo deepLinksDialogInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLinksDialogInfo = conflict.dialogInfo;
            }
            return conflict.copy(deepLinksDialogInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final DeepLinksDialogInfo getDialogInfo() {
            return this.dialogInfo;
        }

        @k
        public final Conflict copy(@k DeepLinksDialogInfo dialogInfo) {
            return new Conflict(dialogInfo);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Conflict) && L.f(this.dialogInfo, ((Conflict) other).dialogInfo);
        }

        @k
        public final DeepLinksDialogInfo getDialogInfo() {
            return this.dialogInfo;
        }

        public int hashCode() {
            return this.dialogInfo.hashCode();
        }

        @k
        public String toString() {
            return "Conflict(dialogInfo=" + this.dialogInfo + ')';
        }
    }

    /* compiled from: SaveDraftResponse.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/SaveDraftResponse$Ok;", "Lcom/avito/android/remote/model/SaveDraftResponse;", "draft", "Lcom/avito/android/remote/model/SaveDraftResponse$Ok$Draft;", "message", "", "(Lcom/avito/android/remote/model/SaveDraftResponse$Ok$Draft;Ljava/lang/String;)V", "getDraft", "()Lcom/avito/android/remote/model/SaveDraftResponse$Ok$Draft;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Draft", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ok extends SaveDraftResponse {

        @c("draft")
        @k
        private final Draft draft;

        @c("message")
        @l
        private final String message;

        /* compiled from: SaveDraftResponse.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/SaveDraftResponse$Ok$Draft;", "", "id", "", "version", "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getVersion", "()I", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Draft {

            @c("id")
            @k
            private final String id;

            @c("version")
            private final int version;

            public Draft(@k String str, int i12) {
                this.id = str;
                this.version = i12;
            }

            public static /* synthetic */ Draft copy$default(Draft draft, String str, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = draft.id;
                }
                if ((i13 & 2) != 0) {
                    i12 = draft.version;
                }
                return draft.copy(str, i12);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final int getVersion() {
                return this.version;
            }

            @k
            public final Draft copy(@k String id2, int version) {
                return new Draft(id2, version);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Draft)) {
                    return false;
                }
                Draft draft = (Draft) other;
                return L.f(this.id, draft.id) && this.version == draft.version;
            }

            @k
            public final String getId() {
                return this.id;
            }

            public final int getVersion() {
                return this.version;
            }

            public int hashCode() {
                return Integer.hashCode(this.version) + (this.id.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Draft(id=");
                sb2.append(this.id);
                sb2.append(", version=");
                return r.t(sb2, this.version, ')');
            }
        }

        public /* synthetic */ Ok(Draft draft, String str, int i12, C42822w c42822w) {
            this(draft, (i12 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ Ok copy$default(Ok ok2, Draft draft, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                draft = ok2.draft;
            }
            if ((i12 & 2) != 0) {
                str = ok2.message;
            }
            return ok2.copy(draft, str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Draft getDraft() {
            return this.draft;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        public final Ok copy(@k Draft draft, @l String message) {
            return new Ok(draft, message);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ok)) {
                return false;
            }
            Ok ok2 = (Ok) other;
            return L.f(this.draft, ok2.draft) && L.f(this.message, ok2.message);
        }

        @k
        public final Draft getDraft() {
            return this.draft;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.draft.hashCode() * 31;
            String str = this.message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Ok(draft=");
            sb2.append(this.draft);
            sb2.append(", message=");
            return C22026a.c(sb2, this.message, ')');
        }

        public Ok(@k Draft draft, @l String str) {
            super(null);
            this.draft = draft;
            this.message = str;
        }
    }

    /* compiled from: SaveDraftResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/SaveDraftResponse$Skipped;", "Lcom/avito/android/remote/model/SaveDraftResponse;", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Skipped extends SaveDraftResponse {

        @k
        public static final Skipped INSTANCE = new Skipped();

        private Skipped() {
            super(null);
        }
    }

    public /* synthetic */ SaveDraftResponse(C42822w c42822w) {
        this();
    }

    private SaveDraftResponse() {
    }
}
