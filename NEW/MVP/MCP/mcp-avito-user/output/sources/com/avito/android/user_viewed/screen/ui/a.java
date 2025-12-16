package com.avito.android.user_viewed.screen.ui;

import Me.m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.user_viewed.screen.ui.state.UserViewedUiState;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecyclerViews.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/u4", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserViewedFragment f318483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserViewedUiState f318484c;

    public a(RecyclerView.Adapter adapter, UserViewedFragment userViewedFragment, UserViewedUiState userViewedUiState) {
        this.f318483b = userViewedFragment;
        this.f318484c = userViewedUiState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserViewedFragment userViewedFragment = this.f318483b;
        com.avito.konveyor.adapter.d dVar = userViewedFragment.f318470x0;
        if (dVar == null) {
            dVar = null;
        }
        UserViewedUiState userViewedUiState = this.f318484c;
        List<ParcelableItem> list = userViewedUiState.f318507b;
        b bVar = new b(userViewedFragment);
        if (userViewedUiState.f318511f) {
            dVar.l(null, new m(dVar, list, bVar, 28));
        } else {
            dVar.l(list, null);
        }
    }
}
