package ru.cyberity.cbr.geo.presentation;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.h;

/* compiled from: CBRGeoViewState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006#"}, d2 = {"Lru/cyberity/cbr/geo/presentation/e;", "", "Lru/cyberity/cbr/core/data/model/h$d;", "field", "", "value", "title", "hint", "error", "<init>", "(Lru/cyberity/cbr/core/data/model/h$d;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru/cyberity/cbr/core/data/model/h$d;", "g", "()Lru/cyberity/cbr/core/data/model/h$d;", "b", "Ljava/lang/CharSequence;", "j", "()Ljava/lang/CharSequence;", "c", "i", "d", "h", "e", "f", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final h.d field;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence hint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence error;

    public e(@k h.d dVar, @l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3, @l CharSequence charSequence4) {
        this.field = dVar;
        this.value = charSequence;
        this.title = charSequence2;
        this.hint = charSequence3;
        this.error = charSequence4;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return L.f(this.field, eVar.field) && L.f(this.value, eVar.value) && L.f(this.title, eVar.title) && L.f(this.hint, eVar.hint) && L.f(this.error, eVar.error);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final CharSequence getError() {
        return this.error;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final h.d getField() {
        return this.field;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final CharSequence getHint() {
        return this.hint;
    }

    public int hashCode() {
        int iHashCode = this.field.hashCode() * 31;
        CharSequence charSequence = this.value;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.title;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.hint;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.error;
        return iHashCode4 + (charSequence4 != null ? charSequence4.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final CharSequence getValue() {
        return this.value;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocationItem(field=");
        sb2.append(this.field);
        sb2.append(", value=");
        sb2.append((Object) this.value);
        sb2.append(", title=");
        sb2.append((Object) this.title);
        sb2.append(", hint=");
        sb2.append((Object) this.hint);
        sb2.append(", error=");
        return AK.c.r(sb2, this.error, ')');
    }
}
