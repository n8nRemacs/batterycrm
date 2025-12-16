package com.avito.android.lib.design.component_container.behavior;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputBehavior.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/lib/design/component_container/behavior/InputBehavior;", "Lcom/avito/android/lib/design/component_container/a;", "Lcom/avito/android/lib/design/input/Input;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "view", "Lkotlin/G0;", "onAttachView", "(Lcom/avito/android/lib/design/input/Input;)V", "onDetachView", "Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", VoiceInfo.STATE, "onStateChanged", "(Lcom/avito/android/lib/design/component_container/ComponentContainer$State;)V", "Landroid/text/TextWatcher;", "watcher", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class InputBehavior extends com.avito.android.lib.design.component_container.a<Input> {

    @k
    private final TextWatcher watcher;

    public InputBehavior(@k Context context) {
        super(context);
        this.watcher = new a();
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onStateChanged(@k ComponentContainer.State state) {
        Input view = getView();
        if (view != null) {
            view.setState(state.f178871b);
        }
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onAttachView(@k Input view) {
        view.b(this.watcher);
        onStateChanged(getState());
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onDetachView(@k Input view) {
        view.h(this.watcher);
    }

    /* compiled from: InputBehavior.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/component_container/behavior/InputBehavior$a", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f178886b = "";

        public a() {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
            String string;
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            this.f178886b = string;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
            String string;
            String str = this.f178886b;
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            if (L.f(str, string)) {
                return;
            }
            InputBehavior inputBehavior = InputBehavior.this;
            int autoReset = inputBehavior.getAutoReset();
            if (autoReset != 1) {
                if (autoReset != 2) {
                    return;
                }
                inputBehavior.setState(ComponentContainer.State.f178866c);
                inputBehavior.notifyValueReset();
                return;
            }
            ComponentContainer.State state = inputBehavior.getState();
            ComponentContainer.State state2 = ComponentContainer.State.f178866c;
            if (state != state2) {
                inputBehavior.setState(state2);
                inputBehavior.notifyValueReset();
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
        }
    }
}
