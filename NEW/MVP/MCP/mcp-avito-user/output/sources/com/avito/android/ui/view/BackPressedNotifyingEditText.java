package com.avito.android.ui.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BackPressedNotifyingEditText.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/ui/view/BackPressedNotifyingEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "c", "Lio/reactivex/rxjava3/core/z;", "getBackPressedEvents", "()Lio/reactivex/rxjava3/core/z;", "backPressedEvents", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackPressedNotifyingEditText extends AppCompatEditText {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f304678b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f304679c;

    public BackPressedNotifyingEditText(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        this.f304678b = cVar;
        this.f304679c = cVar;
    }

    @k
    public final z<G0> getBackPressedEvents() {
        return this.f304679c;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i12, @l KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            this.f304678b.accept(G0.f406611a);
        }
        return false;
    }
}
