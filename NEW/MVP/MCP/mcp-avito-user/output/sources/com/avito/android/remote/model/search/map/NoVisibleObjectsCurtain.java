package com.avito.android.remote.model.search.map;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Counter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/search/map/NoVisibleObjectsCurtain;", "", "message", "", "action", "Lcom/avito/android/remote/model/search/map/NoVisibleObjectsAction;", "(Ljava/lang/String;Lcom/avito/android/remote/model/search/map/NoVisibleObjectsAction;)V", "getAction", "()Lcom/avito/android/remote/model/search/map/NoVisibleObjectsAction;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NoVisibleObjectsCurtain {

    @c("action")
    @l
    private final NoVisibleObjectsAction action;

    @c("message")
    @k
    private final String message;

    public NoVisibleObjectsCurtain(@k String str, @l NoVisibleObjectsAction noVisibleObjectsAction) {
        this.message = str;
        this.action = noVisibleObjectsAction;
    }

    public static /* synthetic */ NoVisibleObjectsCurtain copy$default(NoVisibleObjectsCurtain noVisibleObjectsCurtain, String str, NoVisibleObjectsAction noVisibleObjectsAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = noVisibleObjectsCurtain.message;
        }
        if ((i12 & 2) != 0) {
            noVisibleObjectsAction = noVisibleObjectsCurtain.action;
        }
        return noVisibleObjectsCurtain.copy(str, noVisibleObjectsAction);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final NoVisibleObjectsAction getAction() {
        return this.action;
    }

    @k
    public final NoVisibleObjectsCurtain copy(@k String message, @l NoVisibleObjectsAction action) {
        return new NoVisibleObjectsCurtain(message, action);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoVisibleObjectsCurtain)) {
            return false;
        }
        NoVisibleObjectsCurtain noVisibleObjectsCurtain = (NoVisibleObjectsCurtain) other;
        return L.f(this.message, noVisibleObjectsCurtain.message) && L.f(this.action, noVisibleObjectsCurtain.action);
    }

    @l
    public final NoVisibleObjectsAction getAction() {
        return this.action;
    }

    @k
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        NoVisibleObjectsAction noVisibleObjectsAction = this.action;
        return iHashCode + (noVisibleObjectsAction == null ? 0 : noVisibleObjectsAction.hashCode());
    }

    @k
    public String toString() {
        return "NoVisibleObjectsCurtain(message=" + this.message + ", action=" + this.action + ')';
    }

    public /* synthetic */ NoVisibleObjectsCurtain(String str, NoVisibleObjectsAction noVisibleObjectsAction, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : noVisibleObjectsAction);
    }
}
