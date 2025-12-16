package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultipartUploadPart.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lru/avito/messenger/api/entity/MultipartUploadPart;", "", "", "partNumber", "", "eTag", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getPartNumber", "()J", "Ljava/lang/String;", "getETag", "Companion", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MultipartUploadPart {

    @c("etag")
    @k
    private final String eTag;

    @c("partNumber")
    private final long partNumber;

    public MultipartUploadPart(long j12, @k String str) {
        this.partNumber = j12;
        this.eTag = str;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipartUploadPart)) {
            return false;
        }
        MultipartUploadPart multipartUploadPart = (MultipartUploadPart) other;
        return this.partNumber == multipartUploadPart.partNumber && L.f(this.eTag, multipartUploadPart.eTag);
    }

    @k
    public final String getETag() {
        return this.eTag;
    }

    public int hashCode() {
        return this.eTag.hashCode() + (Long.hashCode(this.partNumber) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MultipartUploadPart(partNumber=");
        sb2.append(this.partNumber);
        sb2.append(", eTag=");
        return C22026a.c(sb2, this.eTag, ')');
    }
}
