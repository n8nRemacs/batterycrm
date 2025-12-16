package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.remote.model.vertical_main.Form;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/Form;", "it", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/remote/model/vertical_main/Form;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34878n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C34878n<T, R> f273566b = new C34878n<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Form form = (Form) obj;
        return form.getFilters().isEmpty() ? io.reactivex.rxjava3.core.z.M(new Exception("empty filters")) : io.reactivex.rxjava3.core.z.c0(form);
    }
}
