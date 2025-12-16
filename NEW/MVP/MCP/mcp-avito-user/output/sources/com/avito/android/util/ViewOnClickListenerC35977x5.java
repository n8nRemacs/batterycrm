package com.avito.android.util;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;

/* compiled from: SnackBarCallbackObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/x5;", "Lcom/google/android/material/snackbar/Snackbar$a;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.x5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC35977x5 extends Snackbar.a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<SnackBarCallbackType> f319127b = new io.reactivex.rxjava3.subjects.e<>();

    @Override // com.google.android.material.snackbar.Snackbar.a, com.google.android.material.snackbar.BaseTransientBottomBar.f
    public final /* bridge */ /* synthetic */ void a(BaseTransientBottomBar baseTransientBottomBar, int i12) {
        c();
    }

    @Override // com.google.android.material.snackbar.Snackbar.a
    public final void c() {
        this.f319127b.onNext(SnackBarCallbackType.f318737c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Y61.l View view) {
        this.f319127b.onNext(SnackBarCallbackType.f318736b);
    }
}
