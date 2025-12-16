package com.avito.android.lib.design.component_container.behavior;

import Y61.k;
import android.content.Context;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: CompoundButtonListItemBehavior.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/lib/design/component_container/behavior/CompoundButtonListItemBehavior;", "Lcom/avito/android/lib/design/component_container/a;", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "view", "Lkotlin/G0;", "onAttachView", "(Lcom/avito/android/lib/design/list_item/ListItemCompoundButton;)V", "onDetachView", "Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", VoiceInfo.STATE, "onStateChanged", "(Lcom/avito/android/lib/design/component_container/ComponentContainer$State;)V", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "listener", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class CompoundButtonListItemBehavior extends com.avito.android.lib.design.component_container.a<ListItemCompoundButton> {

    @k
    private final ListItemCompoundButton.a listener;

    /* compiled from: CompoundButtonListItemBehavior.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/component_container/behavior/CompoundButtonListItemBehavior$a", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListItemCompoundButton.a {
        public a() {
        }

        @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
        public final void a(@k ListItemCompoundButton listItemCompoundButton, boolean z12) {
            CompoundButtonListItemBehavior compoundButtonListItemBehavior = CompoundButtonListItemBehavior.this;
            int autoReset = compoundButtonListItemBehavior.getAutoReset();
            if (autoReset != 1) {
                if (autoReset != 2) {
                    return;
                }
                compoundButtonListItemBehavior.setState(ComponentContainer.State.f178866c);
                compoundButtonListItemBehavior.notifyValueReset();
                return;
            }
            ComponentContainer.State state = compoundButtonListItemBehavior.getState();
            ComponentContainer.State state2 = ComponentContainer.State.f178866c;
            if (state != state2) {
                compoundButtonListItemBehavior.setState(state2);
                compoundButtonListItemBehavior.notifyValueReset();
            }
        }
    }

    public CompoundButtonListItemBehavior(@k Context context) {
        super(context);
        this.listener = new a();
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onStateChanged(@k ComponentContainer.State state) {
        ListItemCompoundButton view = getView();
        if (view != null) {
            view.setState(state.f178871b);
        }
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onAttachView(@k ListItemCompoundButton view) {
        view.e(this.listener);
        onStateChanged(getState());
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onDetachView(@k ListItemCompoundButton view) {
        view.j(this.listener);
    }
}
