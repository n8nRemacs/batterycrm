package com.avito.android.delivery_tarifikator.presentation.region_screen;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TarifikatorRegionFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TarifikatorRegionFragment f135792l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TarifikatorRegionFragment tarifikatorRegionFragment) {
        super(2);
        this.f135792l = tarifikatorRegionFragment;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setButtonsOrientation(1);
        TarifikatorRegionFragment tarifikatorRegionFragment = this.f135792l;
        bVar2.setTitle(tarifikatorRegionFragment.getString(R.string.unsaved_changes_exit_dialog_title));
        bVar2.setSubtitle(tarifikatorRegionFragment.getString(R.string.unsaved_changes_dialog_subtitle));
        bVar2.L3(tarifikatorRegionFragment.getString(R.string.unsaved_changes_exit_dialog_positive), new d(tarifikatorRegionFragment));
        bVar2.M3(tarifikatorRegionFragment.getString(R.string.unsaved_changes_exit_dialog_negative), new e(tarifikatorRegionFragment));
        bVar2.P3(new f(tarifikatorRegionFragment));
        bVar2.b(new g(tarifikatorRegionFragment));
        return G0.f406611a;
    }
}
