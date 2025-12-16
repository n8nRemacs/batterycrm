package com.avito.android.persistence.messenger;

import androidx.annotation.Keep;
import androidx.room.InterfaceC23472t;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessageMetaInfo.kt */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/avito/android/persistence/messenger/FileChunkMetaInfo;", "", "chunkIndex", "", "progress", "", "localPath", "", "transferStatus", "Lcom/avito/android/persistence/messenger/TransferStatus;", "(IJLjava/lang/String;Lcom/avito/android/persistence/messenger/TransferStatus;)V", "getChunkIndex", "()I", "getLocalPath", "()Ljava/lang/String;", "getProgress", "()J", "getTransferStatus", "()Lcom/avito/android/persistence/messenger/TransferStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FileChunkMetaInfo {

    @InterfaceC23472t
    private final int chunkIndex;

    @InterfaceC23472t
    @Y61.l
    private final String localPath;

    @InterfaceC23472t
    private final long progress;

    @InterfaceC23472t
    @Y61.k
    private final TransferStatus transferStatus;

    public FileChunkMetaInfo(int i12, long j12, @Y61.l String str, @Y61.k TransferStatus transferStatus) {
        this.chunkIndex = i12;
        this.progress = j12;
        this.localPath = str;
        this.transferStatus = transferStatus;
    }

    public static /* synthetic */ FileChunkMetaInfo copy$default(FileChunkMetaInfo fileChunkMetaInfo, int i12, long j12, String str, TransferStatus transferStatus, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = fileChunkMetaInfo.chunkIndex;
        }
        if ((i13 & 2) != 0) {
            j12 = fileChunkMetaInfo.progress;
        }
        long j13 = j12;
        if ((i13 & 4) != 0) {
            str = fileChunkMetaInfo.localPath;
        }
        String str2 = str;
        if ((i13 & 8) != 0) {
            transferStatus = fileChunkMetaInfo.transferStatus;
        }
        return fileChunkMetaInfo.copy(i12, j13, str2, transferStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final int getChunkIndex() {
        return this.chunkIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final long getProgress() {
        return this.progress;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final TransferStatus getTransferStatus() {
        return this.transferStatus;
    }

    @Y61.k
    public final FileChunkMetaInfo copy(int chunkIndex, long progress, @Y61.l String localPath, @Y61.k TransferStatus transferStatus) {
        return new FileChunkMetaInfo(chunkIndex, progress, localPath, transferStatus);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileChunkMetaInfo)) {
            return false;
        }
        FileChunkMetaInfo fileChunkMetaInfo = (FileChunkMetaInfo) other;
        return this.chunkIndex == fileChunkMetaInfo.chunkIndex && this.progress == fileChunkMetaInfo.progress && kotlin.jvm.internal.L.f(this.localPath, fileChunkMetaInfo.localPath) && this.transferStatus == fileChunkMetaInfo.transferStatus;
    }

    public final int getChunkIndex() {
        return this.chunkIndex;
    }

    @Y61.l
    public final String getLocalPath() {
        return this.localPath;
    }

    public final long getProgress() {
        return this.progress;
    }

    @Y61.k
    public final TransferStatus getTransferStatus() {
        return this.transferStatus;
    }

    public int hashCode() {
        int iG2 = androidx.appcompat.app.r.g(Integer.hashCode(this.chunkIndex) * 31, 31, this.progress);
        String str = this.localPath;
        return this.transferStatus.hashCode() + ((iG2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public String toString() {
        return "FileChunkMetaInfo(chunkIndex=" + this.chunkIndex + ", progress=" + this.progress + ", localPath=" + this.localPath + ", transferStatus=" + this.transferStatus + ')';
    }

    public /* synthetic */ FileChunkMetaInfo(int i12, long j12, String str, TransferStatus transferStatus, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? 0L : j12, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? TransferStatus.NONE : transferStatus);
    }
}
