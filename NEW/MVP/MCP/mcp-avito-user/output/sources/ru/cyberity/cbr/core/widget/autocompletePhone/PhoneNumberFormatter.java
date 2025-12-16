package ru.cyberity.cbr.core.widget.autocompletePhone;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.remote.c;

/* compiled from: PhoneNumberFormatter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/PhoneNumberFormatter;", "", "<init>", "()V", "Lru/cyberity/cbr/core/data/model/remote/c;", "defaultMask", "Lru/cyberity/cbr/core/data/model/remote/c;", "getDefaultMask", "()Lru/cyberity/cbr/core/data/model/remote/c;", "FormatResult", "ResultCode", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class PhoneNumberFormatter {

    @k
    private final c defaultMask = new c("", Collections.singletonList("###############"));

    /* compiled from: PhoneNumberFormatter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/PhoneNumberFormatter$FormatResult;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "formattedString", "Ljava/lang/String;", "getFormattedString", "Lru/cyberity/cbr/core/widget/autocompletePhone/PhoneNumberFormatter$ResultCode;", "resultCode", "Lru/cyberity/cbr/core/widget/autocompletePhone/PhoneNumberFormatter$ResultCode;", "getResultCode", "()Lru/cyberity/cbr/core/widget/autocompletePhone/PhoneNumberFormatter$ResultCode;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class FormatResult {

        @k
        private final String formattedString;

        @k
        private final ResultCode resultCode;

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormatResult)) {
                return false;
            }
            FormatResult formatResult = (FormatResult) other;
            return L.f(this.formattedString, formatResult.formattedString) && this.resultCode == formatResult.resultCode;
        }

        public int hashCode() {
            return this.resultCode.hashCode() + (this.formattedString.hashCode() * 31);
        }

        @k
        public String toString() {
            return "FormatResult(formattedString=" + this.formattedString + ", resultCode=" + this.resultCode + ')';
        }
    }

    /* compiled from: PhoneNumberFormatter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/PhoneNumberFormatter$ResultCode;", "", "(Ljava/lang/String;I)V", "OK", "CODE_CHANGED", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ResultCode {
        OK,
        CODE_CHANGED
    }
}
