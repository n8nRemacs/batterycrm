package com.avito.android.photo_picker.legacy;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33247i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33245g f219826b;

    public C33247i(C33245g c33245g) {
        this.f219826b = c33245g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C33245g c33245g = this.f219826b;
        c33245g.getClass();
        return zBooleanValue ? io.reactivex.rxjava3.core.I.q(Boolean.TRUE).g(3L, TimeUnit.SECONDS, c33245g.f219798f.c()) : io.reactivex.rxjava3.core.I.q(io.reactivex.rxjava3.core.I.q(Boolean.FALSE));
    }
}
