package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Advices.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/Advices;", "", "header", "Lcom/avito/android/remote/model/AdviceHeader;", "advices", "", "Lcom/avito/android/remote/model/Advice;", "(Lcom/avito/android/remote/model/AdviceHeader;Ljava/util/List;)V", "getAdvices", "()Ljava/util/List;", "getHeader", "()Lcom/avito/android/remote/model/AdviceHeader;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Advices {

    @c("advices")
    @l
    private final List<Advice> advices;

    @c("header")
    @k
    private final AdviceHeader header;

    public Advices(@k AdviceHeader adviceHeader, @l List<Advice> list) {
        this.header = adviceHeader;
        this.advices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Advices copy$default(Advices advices, AdviceHeader adviceHeader, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            adviceHeader = advices.header;
        }
        if ((i12 & 2) != 0) {
            list = advices.advices;
        }
        return advices.copy(adviceHeader, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AdviceHeader getHeader() {
        return this.header;
    }

    @l
    public final List<Advice> component2() {
        return this.advices;
    }

    @k
    public final Advices copy(@k AdviceHeader header, @l List<Advice> advices) {
        return new Advices(header, advices);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Advices)) {
            return false;
        }
        Advices advices = (Advices) other;
        return L.f(this.header, advices.header) && L.f(this.advices, advices.advices);
    }

    @l
    public final List<Advice> getAdvices() {
        return this.advices;
    }

    @k
    public final AdviceHeader getHeader() {
        return this.header;
    }

    public int hashCode() {
        int iHashCode = this.header.hashCode() * 31;
        List<Advice> list = this.advices;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Advices(header=");
        sb2.append(this.header);
        sb2.append(", advices=");
        return H.p(sb2, this.advices, ')');
    }
}
