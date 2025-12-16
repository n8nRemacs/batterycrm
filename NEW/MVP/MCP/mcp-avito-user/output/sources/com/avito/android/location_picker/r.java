package com.avito.android.location_picker;

import com.avito.android.location_picker.x0;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Function1;", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182491b;

    public r(x0 x0Var) {
        this.f182491b = x0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String message = ((Throwable) obj).getMessage();
        x0 x0Var = this.f182491b;
        if (message != null) {
            x0Var.f182815i.f(null, message);
        }
        return x0.a.a(x0Var);
    }
}
