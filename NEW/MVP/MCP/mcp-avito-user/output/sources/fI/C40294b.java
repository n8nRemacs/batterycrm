package fI;

import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GuestsDetailedDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LfI/b;", "", "", "version", "totalCount", "adultsCount", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "withPets", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "c", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40294b {

    @com.google.gson.annotations.c("adultsCount")
    @l
    private final Integer adultsCount;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<String> children;

    @com.google.gson.annotations.c("totalCount")
    @l
    private final Integer totalCount;

    @com.google.gson.annotations.c("version")
    @l
    private final Integer version;

    @com.google.gson.annotations.c("withPets")
    @l
    private final Boolean withPets;

    public C40294b(@l Integer num, @l Integer num2, @l Integer num3, @l List<String> list, @l Boolean bool) {
        this.version = num;
        this.totalCount = num2;
        this.adultsCount = num3;
        this.children = list;
        this.withPets = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Integer getAdultsCount() {
        return this.adultsCount;
    }

    @l
    public final List<String> b() {
        return this.children;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getWithPets() {
        return this.withPets;
    }
}
