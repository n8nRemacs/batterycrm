package ru.cyberity.cbr.domain;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicantDataEntites.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lru/cyberity/cbr/domain/j;", "", "", "label", "Lru/cyberity/cbr/core/data/model/remote/n;", "tinInfo", "hint", "example", "<init>", "(Ljava/lang/CharSequence;Lru/cyberity/cbr/core/data/model/remote/n;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "g", "()Ljava/lang/CharSequence;", "b", "Lru/cyberity/cbr/core/data/model/remote/n;", "h", "()Lru/cyberity/cbr/core/data/model/remote/n;", "c", "f", "d", "e", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final CharSequence label;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ru.cyberity.cbr.core.data.model.remote.n tinInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final CharSequence hint;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final CharSequence example;

    public j(@Y61.l CharSequence charSequence, @Y61.l ru.cyberity.cbr.core.data.model.remote.n nVar, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3) {
        this.label = charSequence;
        this.tinInfo = nVar;
        this.hint = charSequence2;
        this.example = charSequence3;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final CharSequence getExample() {
        return this.example;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return L.f(this.label, jVar.label) && L.f(this.tinInfo, jVar.tinInfo) && L.f(this.hint, jVar.hint) && L.f(this.example, jVar.example);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final CharSequence getHint() {
        return this.hint;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final CharSequence getLabel() {
        return this.label;
    }

    public int hashCode() {
        CharSequence charSequence = this.label;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        ru.cyberity.cbr.core.data.model.remote.n nVar = this.tinInfo;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        CharSequence charSequence2 = this.hint;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.example;
        return iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Tin(label=");
        sb2.append((Object) this.label);
        sb2.append(", tinInfo=");
        sb2.append(this.tinInfo);
        sb2.append(", hint=");
        sb2.append((Object) this.hint);
        sb2.append(", example=");
        return AK.c.r(sb2, this.example, ')');
    }
}
