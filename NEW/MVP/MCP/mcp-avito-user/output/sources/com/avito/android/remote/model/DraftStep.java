package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.gson.d;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Draft.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/DraftStep;", "", "id", "", "navigation", "Lcom/avito/android/remote/model/Navigation;", "wizardPreFinalNavigation", "(Ljava/lang/String;Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/Navigation;)V", "getId", "()Ljava/lang/String;", "getNavigation", "()Lcom/avito/android/remote/model/Navigation;", "getWizardPreFinalNavigation", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DraftStep {

    @c("id")
    @k
    private final String id;

    @c("navigation")
    @k
    private final Navigation navigation;

    @c("finalNavigation")
    @l
    private final Navigation wizardPreFinalNavigation;

    public DraftStep(@k String str, @k Navigation navigation2, @l Navigation navigation3) {
        this.id = str;
        this.navigation = navigation2;
        this.wizardPreFinalNavigation = navigation3;
    }

    public static /* synthetic */ DraftStep copy$default(DraftStep draftStep, String str, Navigation navigation2, Navigation navigation3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = draftStep.id;
        }
        if ((i12 & 2) != 0) {
            navigation2 = draftStep.navigation;
        }
        if ((i12 & 4) != 0) {
            navigation3 = draftStep.wizardPreFinalNavigation;
        }
        return draftStep.copy(str, navigation2, navigation3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Navigation getWizardPreFinalNavigation() {
        return this.wizardPreFinalNavigation;
    }

    @k
    public final DraftStep copy(@k String id2, @k Navigation navigation2, @l Navigation wizardPreFinalNavigation) {
        return new DraftStep(id2, navigation2, wizardPreFinalNavigation);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftStep)) {
            return false;
        }
        DraftStep draftStep = (DraftStep) other;
        return L.f(this.id, draftStep.id) && L.f(this.navigation, draftStep.navigation) && L.f(this.wizardPreFinalNavigation, draftStep.wizardPreFinalNavigation);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @l
    public final Navigation getWizardPreFinalNavigation() {
        return this.wizardPreFinalNavigation;
    }

    public int hashCode() {
        int iHashCode = (this.navigation.hashCode() + (this.id.hashCode() * 31)) * 31;
        Navigation navigation2 = this.wizardPreFinalNavigation;
        return iHashCode + (navigation2 == null ? 0 : navigation2.hashCode());
    }

    @k
    public String toString() {
        return "DraftStep(id=" + this.id + ", navigation=" + this.navigation + ", wizardPreFinalNavigation=" + this.wizardPreFinalNavigation + ')';
    }

    public /* synthetic */ DraftStep(String str, Navigation navigation2, Navigation navigation3, int i12, C42822w c42822w) {
        this(str, navigation2, (i12 & 4) != 0 ? null : navigation3);
    }
}
