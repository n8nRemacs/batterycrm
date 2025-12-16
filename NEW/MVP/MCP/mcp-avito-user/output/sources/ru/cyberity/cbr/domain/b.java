package ru.cyberity.cbr.domain;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicantDataEntites.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/domain/b;", "", "Lru/cyberity/cbr/core/data/model/h;", "field", "", "text", "<init>", "(Lru/cyberity/cbr/core/data/model/h;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/h;", "c", "()Lru/cyberity/cbr/core/data/model/h;", "b", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.model.h field;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final CharSequence text;

    public b(@Y61.k ru.cyberity.cbr.core.data.model.h hVar, @Y61.l CharSequence charSequence) {
        this.field = hVar;
        this.text = charSequence;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final ru.cyberity.cbr.core.data.model.h getField() {
        return this.field;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return L.f(this.field, bVar.field) && L.f(this.text, bVar.text);
    }

    public int hashCode() {
        int iHashCode = this.field.hashCode() * 31;
        CharSequence charSequence = this.text;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicantDataError(field=");
        sb2.append(this.field);
        sb2.append(", text=");
        return AK.c.r(sb2, this.text, ')');
    }
}
