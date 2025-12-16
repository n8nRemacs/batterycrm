package ru.cyberity.cbr.core.widget.autocompletePhone;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ViewState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/ViewState;", "", "", "text", "countryCode", "", "validationError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getCountryCode", "Ljava/lang/CharSequence;", "getValidationError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ViewState {

    @l
    private final String countryCode;

    @k
    private final String text;

    @l
    private final CharSequence validationError;

    public ViewState(@k String str, @l String str2, @l CharSequence charSequence) {
        this.text = str;
        this.countryCode = str2;
        this.validationError = charSequence;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewState)) {
            return false;
        }
        ViewState viewState = (ViewState) other;
        return L.f(this.text, viewState.text) && L.f(this.countryCode, viewState.countryCode) && L.f(this.validationError, viewState.validationError);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.countryCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.validationError;
        return iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewState(text=");
        sb2.append(this.text);
        sb2.append(", countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", validationError=");
        return c.r(sb2, this.validationError, ')');
    }

    public /* synthetic */ ViewState(String str, String str2, CharSequence charSequence, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : charSequence);
    }
}
