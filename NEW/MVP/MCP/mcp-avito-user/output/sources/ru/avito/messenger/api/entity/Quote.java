package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.api.entity.body.MessageBody;

/* compiled from: Quote.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/avito/messenger/api/entity/Quote;", "", "", "id", "Lru/avito/messenger/api/entity/body/MessageBody;", "body", "", "created", "fromId", "", "chunkIndex", "<init>", "(Ljava/lang/String;Lru/avito/messenger/api/entity/body/MessageBody;JLjava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/avito/messenger/api/entity/body/MessageBody;", "getBody", "()Lru/avito/messenger/api/entity/body/MessageBody;", "J", "getCreated", "()J", "getFromId", "Ljava/lang/Integer;", "getChunkIndex", "()Ljava/lang/Integer;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Quote {

    @k
    private final MessageBody body;

    @l
    private final Integer chunkIndex;
    private final long created;

    @k
    private final String fromId;

    @k
    private final String id;

    public Quote(@k String str, @k MessageBody messageBody, long j12, @k String str2, @l Integer num) {
        this.id = str;
        this.body = messageBody;
        this.created = j12;
        this.fromId = str2;
        this.chunkIndex = num;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quote)) {
            return false;
        }
        Quote quote = (Quote) other;
        return L.f(this.id, quote.id) && L.f(this.body, quote.body) && this.created == quote.created && L.f(this.fromId, quote.fromId) && L.f(this.chunkIndex, quote.chunkIndex);
    }

    @k
    public final MessageBody getBody() {
        return this.body;
    }

    @l
    public final Integer getChunkIndex() {
        return this.chunkIndex;
    }

    public final long getCreated() {
        return this.created;
    }

    @k
    public final String getFromId() {
        return this.fromId;
    }

    @k
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iD2 = H.d(r.g((this.body.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.created), 31, this.fromId);
        Integer num = this.chunkIndex;
        return iD2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Quote(id=");
        sb2.append(this.id);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", created=");
        sb2.append(this.created);
        sb2.append(", fromId=");
        sb2.append(this.fromId);
        sb2.append(", chunkIndex=");
        return s.j(sb2, this.chunkIndex, ')');
    }
}
