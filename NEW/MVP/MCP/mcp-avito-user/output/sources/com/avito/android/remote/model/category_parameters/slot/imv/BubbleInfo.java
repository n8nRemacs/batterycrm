package com.avito.android.remote.model.category_parameters.slot.imv;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstantMarketValueResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/BubbleInfo;", "", "text", "", "actions", "", "Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "(Ljava/lang/String;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BubbleInfo {

    @c("actions")
    @l
    private final List<SuggestAction> actions;

    @c("text")
    @k
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public BubbleInfo(@k String str, @l List<? extends SuggestAction> list) {
        this.text = str;
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BubbleInfo copy$default(BubbleInfo bubbleInfo, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bubbleInfo.text;
        }
        if ((i12 & 2) != 0) {
            list = bubbleInfo.actions;
        }
        return bubbleInfo.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    public final List<SuggestAction> component2() {
        return this.actions;
    }

    @k
    public final BubbleInfo copy(@k String text, @l List<? extends SuggestAction> actions) {
        return new BubbleInfo(text, actions);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BubbleInfo)) {
            return false;
        }
        BubbleInfo bubbleInfo = (BubbleInfo) other;
        return L.f(this.text, bubbleInfo.text) && L.f(this.actions, bubbleInfo.actions);
    }

    @l
    public final List<SuggestAction> getActions() {
        return this.actions;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<SuggestAction> list = this.actions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BubbleInfo(text=");
        sb2.append(this.text);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }
}
