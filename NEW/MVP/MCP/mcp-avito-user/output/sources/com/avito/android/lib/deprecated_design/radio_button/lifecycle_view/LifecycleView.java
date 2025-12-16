package com.avito.android.lib.deprecated_design.radio_button.lifecycle_view;

import MU.a;
import MU.c;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.legacy.widget.Space;
import com.avito.android.util.Kundle;
import hw.InterfaceC41179d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LifecycleView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/lib/deprecated_design/radio_button/lifecycle_view/LifecycleView;", "Landroidx/legacy/widget/Space;", "LMU/a;", "attachListener", "Lkotlin/G0;", "setAttachListener", "(LMU/a;)V", "LMU/c;", "stateListener", "setStateListener", "(LMU/c;)V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public class LifecycleView extends Space {

    /* renamed from: b, reason: collision with root package name */
    @l
    public a f178086b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public c f178087c;

    @j
    public LifecycleView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f178086b;
        if (aVar != null) {
            aVar.h2();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f178086b;
        if (aVar != null) {
            aVar.f2();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof Kundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Kundle kundle = (Kundle) parcelable;
        super.onRestoreInstanceState(kundle.d("saved_view_state"));
        c cVar = this.f178087c;
        if (cVar != null) {
            cVar.f0((Kundle) kundle.d("saved_external_state"));
        }
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        c cVar = this.f178087c;
        Kundle kundleD0 = cVar != null ? cVar.d0() : null;
        Kundle kundle = new Kundle();
        kundle.j(parcelableOnSaveInstanceState, "saved_view_state");
        kundle.j(kundleD0, "saved_external_state");
        return kundle;
    }

    public final void setAttachListener(@k a attachListener) {
        this.f178086b = attachListener;
    }

    public final void setStateListener(@k c stateListener) {
        this.f178087c = stateListener;
    }

    public LifecycleView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, null, 0);
    }
}
