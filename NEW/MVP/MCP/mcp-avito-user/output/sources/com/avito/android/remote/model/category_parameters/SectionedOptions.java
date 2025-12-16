package com.avito.android.remote.model.category_parameters;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionedOptions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SectionedOptions;", "", "id", "", "label", "options", "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getLabel", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SectionedOptions {

    @c("id")
    @k
    private final String id;

    @c("label")
    @l
    private final String label;

    @c(alternate = {"values"}, value = "options")
    @l
    private final List<SelectParameter.Value> options;

    public SectionedOptions(@k String str, @l String str2, @l List<SelectParameter.Value> list) {
        this.id = str;
        this.label = str2;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionedOptions copy$default(SectionedOptions sectionedOptions, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = sectionedOptions.id;
        }
        if ((i12 & 2) != 0) {
            str2 = sectionedOptions.label;
        }
        if ((i12 & 4) != 0) {
            list = sectionedOptions.options;
        }
        return sectionedOptions.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @l
    public final List<SelectParameter.Value> component3() {
        return this.options;
    }

    @k
    public final SectionedOptions copy(@k String id2, @l String label, @l List<SelectParameter.Value> options) {
        return new SectionedOptions(id2, label, options);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionedOptions)) {
            return false;
        }
        SectionedOptions sectionedOptions = (SectionedOptions) other;
        return L.f(this.id, sectionedOptions.id) && L.f(this.label, sectionedOptions.label) && L.f(this.options, sectionedOptions.options);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getLabel() {
        return this.label;
    }

    @l
    public final List<SelectParameter.Value> getOptions() {
        return this.options;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SelectParameter.Value> list = this.options;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SectionedOptions(id=");
        sb2.append(this.id);
        sb2.append(", label=");
        sb2.append(this.label);
        sb2.append(", options=");
        return H.p(sb2, this.options, ')');
    }
}
