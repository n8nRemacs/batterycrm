package com.avito.android.remote.model.validation;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ValidationForm.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/validation/ValidationForm;", "", "structure", "Lcom/avito/android/remote/model/validation/Structure;", "(Lcom/avito/android/remote/model/validation/Structure;)V", "getStructure", "()Lcom/avito/android/remote/model/validation/Structure;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ValidationForm {

    @c("structure")
    @k
    private final Structure structure;

    public ValidationForm(@k Structure structure) {
        this.structure = structure;
    }

    public static /* synthetic */ ValidationForm copy$default(ValidationForm validationForm, Structure structure, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            structure = validationForm.structure;
        }
        return validationForm.copy(structure);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Structure getStructure() {
        return this.structure;
    }

    @k
    public final ValidationForm copy(@k Structure structure) {
        return new ValidationForm(structure);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ValidationForm) && L.f(this.structure, ((ValidationForm) other).structure);
    }

    @k
    public final Structure getStructure() {
        return this.structure;
    }

    public int hashCode() {
        return this.structure.hashCode();
    }

    @k
    public String toString() {
        return "ValidationForm(structure=" + this.structure + ')';
    }
}
