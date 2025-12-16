package com.avito.android.remote.model.validation;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceRequestStructure.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/validation/EvidenceStructure;", "", "main", "Lcom/avito/android/remote/model/validation/BlockContainer;", "bottom", "toastCancelled", "toastDeleted", "toastSuccess", "(Lcom/avito/android/remote/model/validation/BlockContainer;Lcom/avito/android/remote/model/validation/BlockContainer;Lcom/avito/android/remote/model/validation/BlockContainer;Lcom/avito/android/remote/model/validation/BlockContainer;Lcom/avito/android/remote/model/validation/BlockContainer;)V", "getBottom", "()Lcom/avito/android/remote/model/validation/BlockContainer;", "getMain", "getToastCancelled", "getToastDeleted", "getToastSuccess", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EvidenceStructure {

    @c("bottom")
    @k
    private final BlockContainer bottom;

    @c("main")
    @k
    private final BlockContainer main;

    @c("toast_cancelled")
    @k
    private final BlockContainer toastCancelled;

    @c("toast_deleted")
    @k
    private final BlockContainer toastDeleted;

    @c("toast_success")
    @k
    private final BlockContainer toastSuccess;

    public EvidenceStructure(@k BlockContainer blockContainer, @k BlockContainer blockContainer2, @k BlockContainer blockContainer3, @k BlockContainer blockContainer4, @k BlockContainer blockContainer5) {
        this.main = blockContainer;
        this.bottom = blockContainer2;
        this.toastCancelled = blockContainer3;
        this.toastDeleted = blockContainer4;
        this.toastSuccess = blockContainer5;
    }

    public static /* synthetic */ EvidenceStructure copy$default(EvidenceStructure evidenceStructure, BlockContainer blockContainer, BlockContainer blockContainer2, BlockContainer blockContainer3, BlockContainer blockContainer4, BlockContainer blockContainer5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            blockContainer = evidenceStructure.main;
        }
        if ((i12 & 2) != 0) {
            blockContainer2 = evidenceStructure.bottom;
        }
        BlockContainer blockContainer6 = blockContainer2;
        if ((i12 & 4) != 0) {
            blockContainer3 = evidenceStructure.toastCancelled;
        }
        BlockContainer blockContainer7 = blockContainer3;
        if ((i12 & 8) != 0) {
            blockContainer4 = evidenceStructure.toastDeleted;
        }
        BlockContainer blockContainer8 = blockContainer4;
        if ((i12 & 16) != 0) {
            blockContainer5 = evidenceStructure.toastSuccess;
        }
        return evidenceStructure.copy(blockContainer, blockContainer6, blockContainer7, blockContainer8, blockContainer5);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final BlockContainer getMain() {
        return this.main;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final BlockContainer getBottom() {
        return this.bottom;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final BlockContainer getToastCancelled() {
        return this.toastCancelled;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final BlockContainer getToastDeleted() {
        return this.toastDeleted;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final BlockContainer getToastSuccess() {
        return this.toastSuccess;
    }

    @k
    public final EvidenceStructure copy(@k BlockContainer main, @k BlockContainer bottom, @k BlockContainer toastCancelled, @k BlockContainer toastDeleted, @k BlockContainer toastSuccess) {
        return new EvidenceStructure(main, bottom, toastCancelled, toastDeleted, toastSuccess);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvidenceStructure)) {
            return false;
        }
        EvidenceStructure evidenceStructure = (EvidenceStructure) other;
        return L.f(this.main, evidenceStructure.main) && L.f(this.bottom, evidenceStructure.bottom) && L.f(this.toastCancelled, evidenceStructure.toastCancelled) && L.f(this.toastDeleted, evidenceStructure.toastDeleted) && L.f(this.toastSuccess, evidenceStructure.toastSuccess);
    }

    @k
    public final BlockContainer getBottom() {
        return this.bottom;
    }

    @k
    public final BlockContainer getMain() {
        return this.main;
    }

    @k
    public final BlockContainer getToastCancelled() {
        return this.toastCancelled;
    }

    @k
    public final BlockContainer getToastDeleted() {
        return this.toastDeleted;
    }

    @k
    public final BlockContainer getToastSuccess() {
        return this.toastSuccess;
    }

    public int hashCode() {
        return this.toastSuccess.hashCode() + ((this.toastDeleted.hashCode() + ((this.toastCancelled.hashCode() + ((this.bottom.hashCode() + (this.main.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @k
    public String toString() {
        return "EvidenceStructure(main=" + this.main + ", bottom=" + this.bottom + ", toastCancelled=" + this.toastCancelled + ", toastDeleted=" + this.toastDeleted + ", toastSuccess=" + this.toastSuccess + ')';
    }
}
