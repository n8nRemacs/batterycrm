package com.avito.android.bottom_sheet_group.bottomsheetgroup;

import androidx.view.C23060r0;
import androidx.view.N0;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.i;
import io.reactivex.rxjava3.core.z;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;

/* compiled from: BottomSheetGroupViewModel_Factory_Impl.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class k implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final j f107231a;

    public k(j jVar) {
        this.f107231a = jVar;
    }

    @Override // com.avito.android.bottom_sheet_group.bottomsheetgroup.i.a
    public final i a(C23060r0 c23060r0) {
        j jVar = this.f107231a;
        com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.j jVar2 = (com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.j) jVar.f107228a.get();
        z zVar = (z) jVar.f107229b.get();
        z zVar2 = (z) jVar.f107230c.get();
        i iVar = new i(jVar2, c23060r0, null, 4, null);
        C43175k.K(new C43197r1(new g(iVar, null), y.a(zVar)), N0.a(iVar));
        C43175k.K(new C43197r1(new h(iVar, null), y.a(zVar2)), N0.a(iVar));
        return iVar;
    }
}
