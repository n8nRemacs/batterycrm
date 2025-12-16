package com.avito.android.remote.model.confirmation;

import Y61.k;
import Y61.l;
import com.avito.android.remote.ModerationEvidence;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.Gson;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: EvidenceConfirmationBody.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JZ\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody;", "", "()V", "build", "", "", "appealId", "itemId", "type", "name", "email", "params", "proofType", "Lcom/avito/android/remote/ModerationEvidence;", "Payload", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EvidenceConfirmationBody {

    @k
    public static final EvidenceConfirmationBody INSTANCE = new EvidenceConfirmationBody();

    /* compiled from: EvidenceConfirmationBody.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload;", "", "item", "Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$Item;", ChannelContext.UserToUser.TYPE, "Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$User;", "evidence", "Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$Evidence;", "(Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$Item;Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$User;Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$Evidence;)V", "getEvidence", "()Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$Evidence;", "getItem", "()Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$Item;", "getUser", "()Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$User;", "Evidence", "Item", "User", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Payload {

        @c("evidence")
        @k
        private final Evidence evidence;

        @c("item")
        @k
        private final Item item;

        @c(ChannelContext.UserToUser.TYPE)
        @l
        private final User user;

        /* compiled from: EvidenceConfirmationBody.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$Evidence;", "", "type", "", "params", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getParams", "()Ljava/util/Map;", "getType", "()Ljava/lang/String;", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Evidence {

            @c("data")
            @k
            private final Map<String, String> params;

            @c("type")
            @k
            private final String type;

            public Evidence(@k String str, @k Map<String, String> map) {
                this.type = str;
                this.params = map;
            }

            @k
            public final Map<String, String> getParams() {
                return this.params;
            }

            @k
            public final String getType() {
                return this.type;
            }
        }

        /* compiled from: EvidenceConfirmationBody.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$Item;", "", "itemId", "", "(J)V", "getItemId", "()J", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Item {

            @c("id")
            private final long itemId;

            public Item(long j12) {
                this.itemId = j12;
            }

            public final long getItemId() {
                return this.itemId;
            }
        }

        /* compiled from: EvidenceConfirmationBody.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationBody$Payload$User;", "", "name", "", "email", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getName", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class User {

            @c("email")
            @k
            private final String email;

            @c("fullName")
            @k
            private final String name;

            public User(@k String str, @k String str2) {
                this.name = str;
                this.email = str2;
            }

            @k
            public final String getEmail() {
                return this.email;
            }

            @k
            public final String getName() {
                return this.name;
            }
        }

        public Payload(@k Item item, @l User user, @k Evidence evidence) {
            this.item = item;
            this.user = user;
            this.evidence = evidence;
        }

        @k
        public final Evidence getEvidence() {
            return this.evidence;
        }

        @k
        public final Item getItem() {
            return this.item;
        }

        @l
        public final User getUser() {
            return this.user;
        }
    }

    private EvidenceConfirmationBody() {
    }

    @k
    public final Map<String, String> build(@k String appealId, @k String itemId, @k String type, @l String name, @l String email, @k Map<String, String> params, @k ModerationEvidence proofType) {
        return P0.g(new Q("uuid", appealId), new Q("payload", new Gson().l(new Payload(new Payload.Item(Long.parseLong(itemId)), (name == null || email == null) ? null : new Payload.User(name, email), new Payload.Evidence(type, params)))), new Q(MessageBody.Location.KIND, proofType.f253042b));
    }
}
