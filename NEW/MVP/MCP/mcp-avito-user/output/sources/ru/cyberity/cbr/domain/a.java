package ru.cyberity.cbr.domain;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicantDataEntites.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"Lru/cyberity/cbr/domain/a;", "", "Lru/cyberity/cbr/core/data/model/h;", "field", "", "value", "", "label", "hint", "example", "<init>", "(Lru/cyberity/cbr/core/data/model/h;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/h;", "g", "()Lru/cyberity/cbr/core/data/model/h;", "b", "Ljava/lang/String;", "j", "c", "Ljava/lang/CharSequence;", "i", "()Ljava/lang/CharSequence;", "d", "h", "e", "f", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.model.h field;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final CharSequence label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final CharSequence hint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final CharSequence example;

    public a(@Y61.k ru.cyberity.cbr.core.data.model.h hVar, @Y61.k String str, @Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3) {
        this.field = hVar;
        this.value = str;
        this.label = charSequence;
        this.hint = charSequence2;
        this.example = charSequence3;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return L.f(this.field, aVar.field) && L.f(this.value, aVar.value) && L.f(this.label, aVar.label) && L.f(this.hint, aVar.hint) && L.f(this.example, aVar.example);
    }

    public int hashCode() {
        int iD2 = H.d(this.field.hashCode() * 31, 31, this.value);
        CharSequence charSequence = this.label;
        int iHashCode = (iD2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.hint;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.example;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicantData(field=");
        sb2.append(this.field);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", label=");
        sb2.append((Object) this.label);
        sb2.append(", hint=");
        sb2.append((Object) this.hint);
        sb2.append(", example=");
        return AK.c.r(sb2, this.example, ')');
    }

    public /* synthetic */ a(ru.cyberity.cbr.core.data.model.h hVar, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i12, C42822w c42822w) {
        this(hVar, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? null : charSequence, (i12 & 8) != 0 ? null : charSequence2, (i12 & 16) != 0 ? null : charSequence3);
    }
}
