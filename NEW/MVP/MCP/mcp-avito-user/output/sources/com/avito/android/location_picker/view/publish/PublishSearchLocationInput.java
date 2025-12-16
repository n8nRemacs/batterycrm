package com.avito.android.location_picker.view.publish;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishSearchLocationInput.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/location_picker/view/publish/PublishSearchLocationInput;", "Lcom/avito/android/lib/design/input/Input;", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "f0", "Lio/reactivex/rxjava3/core/z;", "getBackPressedEvents", "()Lio/reactivex/rxjava3/core/z;", "backPressedEvents", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PublishSearchLocationInput extends Input {

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182660e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f182661f0;

    @X41.j
    public PublishSearchLocationInput(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Y61.k
    public final z<G0> getBackPressedEvents() {
        return this.f182661f0;
    }

    @Override // android.view.View
    public final boolean onKeyPreIme(int i12, @Y61.l KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f182660e0.accept(G0.f406611a);
        return false;
    }

    public PublishSearchLocationInput(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.input : i12, (i14 & 8) != 0 ? R.style.Design_Widget_Input : i13);
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        this.f182660e0 = cVar;
        this.f182661f0 = cVar;
    }
}
