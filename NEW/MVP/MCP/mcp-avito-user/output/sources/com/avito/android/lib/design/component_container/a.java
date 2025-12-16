package com.avito.android.lib.design.component_container;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComponentBehavior.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b&\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u00010B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010\r\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u000f¨\u00061"}, d2 = {"Lcom/avito/android/lib/design/component_container/a;", "Landroid/view/View;", "V", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", VoiceInfo.STATE, "Lkotlin/G0;", "onStateChanged", "(Lcom/avito/android/lib/design/component_container/ComponentContainer$State;)V", "view", "onAttachView", "(Landroid/view/View;)V", "onDetachView", "attach", "detach", "()V", "notifyValueReset", "Lkotlin/Function0;", "listener", "setValueResetListener", "(LY41/a;)V", "", "autoResetCondition", "setAutoResetCondition", "(I)V", "getAutoResetCondition", "()I", "setState", "getState", "()Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "resetListener", "LY41/a;", "autoReset", "I", "currentState", "Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "Companion", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a<V extends View> {
    public static final int RESET_ANY_CHANGES = 2;
    public static final int RESET_NEVER = 0;
    public static final int RESET_NOT_NORMAL_ONLY = 1;
    private int autoReset;

    @k
    private final Context context;

    @l
    private ComponentContainer.State currentState;

    @l
    private Y41.a<G0> resetListener;

    @l
    private V view;

    public a(@k Context context) {
        this.context = context;
    }

    public final void attach(@k V view) {
        if (this.view != null) {
            detach();
        }
        this.view = view;
        onAttachView(view);
    }

    public final void detach() {
        V v12 = this.view;
        if (v12 == null) {
            return;
        }
        onDetachView(v12);
        this.view = null;
    }

    /* renamed from: getAutoResetCondition, reason: from getter */
    public final int getAutoReset() {
        return this.autoReset;
    }

    @k
    public final Context getContext() {
        return this.context;
    }

    @k
    public final ComponentContainer.State getState() {
        ComponentContainer.State state = this.currentState;
        return state == null ? ComponentContainer.State.f178866c : state;
    }

    @l
    public final V getView() {
        return this.view;
    }

    public final void notifyValueReset() {
        Y41.a<G0> aVar = this.resetListener;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public abstract void onAttachView(@k V view);

    public abstract void onDetachView(@k V view);

    public abstract void onStateChanged(@k ComponentContainer.State state);

    public final void setAutoResetCondition(int autoResetCondition) {
        this.autoReset = autoResetCondition;
    }

    public final void setState(@k ComponentContainer.State state) {
        if (this.currentState == state) {
            return;
        }
        this.currentState = state;
        onStateChanged(state);
    }

    public final void setValueResetListener(@l Y41.a<G0> listener) {
        this.resetListener = listener;
    }

    public final void setView(@l V v12) {
        this.view = v12;
    }
}
