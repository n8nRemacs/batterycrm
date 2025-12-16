package com.avito.android.beduin.ui.screen.fragment;

import androidx.view.InterfaceC23040h0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/architecture_components/s", "Landroidx/lifecycle/h0;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC23040h0<i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public i f104147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinBaseScreenFragment f104148c;

    public b(BeduinBaseScreenFragment beduinBaseScreenFragment) {
        this.f104148c = beduinBaseScreenFragment;
    }

    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(i iVar) {
        i iVar2 = this.f104147b;
        this.f104148c.u5(iVar2, iVar);
        this.f104147b = iVar;
    }
}
