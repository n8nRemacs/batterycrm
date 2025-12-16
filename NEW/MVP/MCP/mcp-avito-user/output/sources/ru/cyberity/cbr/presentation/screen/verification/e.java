package ru.cyberity.cbr.presentation.screen.verification;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CBRApplicantStatusViewState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/presentation/screen/verification/e;", "", "", "message", "buttonPositive", "buttonNegative", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "f", "()Ljava/lang/CharSequence;", "b", "e", "c", "d", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence buttonPositive;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final CharSequence buttonNegative;

    public e(@l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3) {
        this.message = charSequence;
        this.buttonPositive = charSequence2;
        this.buttonNegative = charSequence3;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final CharSequence getButtonNegative() {
        return this.buttonNegative;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final CharSequence getButtonPositive() {
        return this.buttonPositive;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return L.f(this.message, eVar.message) && L.f(this.buttonPositive, eVar.buttonPositive) && L.f(this.buttonNegative, eVar.buttonNegative);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final CharSequence getMessage() {
        return this.message;
    }

    public int hashCode() {
        CharSequence charSequence = this.message;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.buttonPositive;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.buttonNegative;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmExitDialog(message=");
        sb2.append((Object) this.message);
        sb2.append(", buttonPositive=");
        sb2.append((Object) this.buttonPositive);
        sb2.append(", buttonNegative=");
        return AK.c.r(sb2, this.buttonNegative, ')');
    }
}
