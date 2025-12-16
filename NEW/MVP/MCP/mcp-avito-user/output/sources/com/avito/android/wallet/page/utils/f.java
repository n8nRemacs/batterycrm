package com.avito.android.wallet.page.utils;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.Metadata;

/* compiled from: TabletViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_wallet-page_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {
    @k
    public static final io.reactivex.rxjava3.disposables.d a(@k View view, @k RecyclerView recyclerView) {
        return view.getResources().getBoolean(R.bool.is_tablet) ? C37722i.e(view).N(c.f328424b).d0(d.f328425b).t0(new e(view, recyclerView)) : EmptyDisposable.f401988b;
    }
}
