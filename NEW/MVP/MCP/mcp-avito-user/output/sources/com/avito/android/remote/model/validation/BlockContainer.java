package com.avito.android.remote.model.validation;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceRequestStructure.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/validation/BlockContainer;", "", "blocks", "", "Lcom/avito/android/remote/model/validation/Block;", "(Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BlockContainer {

    @c("blocks")
    @k
    private final List<Block> blocks;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockContainer(@k List<? extends Block> list) {
        this.blocks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockContainer copy$default(BlockContainer blockContainer, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = blockContainer.blocks;
        }
        return blockContainer.copy(list);
    }

    @k
    public final List<Block> component1() {
        return this.blocks;
    }

    @k
    public final BlockContainer copy(@k List<? extends Block> blocks) {
        return new BlockContainer(blocks);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlockContainer) && L.f(this.blocks, ((BlockContainer) other).blocks);
    }

    @k
    public final List<Block> getBlocks() {
        return this.blocks;
    }

    public int hashCode() {
        return this.blocks.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("BlockContainer(blocks="), this.blocks, ')');
    }
}
