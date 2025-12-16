package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.gson.d;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Draft.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/Draft;", "", "draftId", "", "daysLeft", "", "version", "", "publishSessionId", "navigation", "Lcom/avito/android/remote/model/Navigation;", "rootNavigation", VoiceInfo.STATE, "Lcom/avito/android/remote/model/DraftState;", "(Ljava/lang/String;JILjava/lang/String;Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/Navigation;Lcom/avito/android/remote/model/DraftState;)V", "getDaysLeft", "()J", "getDraftId", "()Ljava/lang/String;", "getNavigation", "()Lcom/avito/android/remote/model/Navigation;", "getPublishSessionId", "getRootNavigation", "getState", "()Lcom/avito/android/remote/model/DraftState;", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Draft {

    @c("daysLeft")
    private final long daysLeft;

    @c("id")
    @k
    private final String draftId;

    @c("navigation")
    @k
    private final Navigation navigation;

    @c("publishSessionId")
    @k
    private final String publishSessionId;

    @c("rootNavigation")
    @k
    private final Navigation rootNavigation;

    @c(VoiceInfo.STATE)
    @l
    private final DraftState state;

    @c("version")
    private final int version;

    public Draft(@k String str, long j12, int i12, @k String str2, @k Navigation navigation2, @k Navigation navigation3, @l DraftState draftState) {
        this.draftId = str;
        this.daysLeft = j12;
        this.version = i12;
        this.publishSessionId = str2;
        this.navigation = navigation2;
        this.rootNavigation = navigation3;
        this.state = draftState;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getDraftId() {
        return this.draftId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDaysLeft() {
        return this.daysLeft;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getPublishSessionId() {
        return this.publishSessionId;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final Navigation getRootNavigation() {
        return this.rootNavigation;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DraftState getState() {
        return this.state;
    }

    @k
    public final Draft copy(@k String draftId, long daysLeft, int version, @k String publishSessionId, @k Navigation navigation2, @k Navigation rootNavigation, @l DraftState state) {
        return new Draft(draftId, daysLeft, version, publishSessionId, navigation2, rootNavigation, state);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Draft)) {
            return false;
        }
        Draft draft = (Draft) other;
        return L.f(this.draftId, draft.draftId) && this.daysLeft == draft.daysLeft && this.version == draft.version && L.f(this.publishSessionId, draft.publishSessionId) && L.f(this.navigation, draft.navigation) && L.f(this.rootNavigation, draft.rootNavigation) && L.f(this.state, draft.state);
    }

    public final long getDaysLeft() {
        return this.daysLeft;
    }

    @k
    public final String getDraftId() {
        return this.draftId;
    }

    @k
    public final Navigation getNavigation() {
        return this.navigation;
    }

    @k
    public final String getPublishSessionId() {
        return this.publishSessionId;
    }

    @k
    public final Navigation getRootNavigation() {
        return this.rootNavigation;
    }

    @l
    public final DraftState getState() {
        return this.state;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = (this.rootNavigation.hashCode() + ((this.navigation.hashCode() + H.d(r.e(this.version, r.g(this.draftId.hashCode() * 31, 31, this.daysLeft), 31), 31, this.publishSessionId)) * 31)) * 31;
        DraftState draftState = this.state;
        return iHashCode + (draftState == null ? 0 : draftState.hashCode());
    }

    @k
    public String toString() {
        return "Draft(draftId=" + this.draftId + ", daysLeft=" + this.daysLeft + ", version=" + this.version + ", publishSessionId=" + this.publishSessionId + ", navigation=" + this.navigation + ", rootNavigation=" + this.rootNavigation + ", state=" + this.state + ')';
    }

    public /* synthetic */ Draft(String str, long j12, int i12, String str2, Navigation navigation2, Navigation navigation3, DraftState draftState, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? 0L : j12, i12, str2, navigation2, navigation3, (i13 & 64) != 0 ? null : draftState);
    }
}
