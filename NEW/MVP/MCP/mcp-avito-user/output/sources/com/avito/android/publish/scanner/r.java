package com.avito.android.publish.scanner;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.B;
import com.avito.android.photo_camera_view.InterfaceC33173d;
import com.avito.android.publish.C0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import ze0.C50556d;
import ze0.InterfaceC50553a;
import ze0.InterfaceC50555c;

/* compiled from: ScannerViewModel.kt */
@B
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/scanner/r;", "Lcom/avito/android/arch/mvi/android/j;", "Lze0/a;", "Lze0/d;", "Lze0/c;", "Lcom/avito/android/photo_camera_view/d$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r extends com.avito.android.arch.mvi.android.j<InterfaceC50553a, C50556d, InterfaceC50555c> implements InterfaceC33173d.a {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C0 f239271N;

    @Inject
    public r(@Y61.k C0 c02, @Y61.k com.avito.android.publish.scanner.mvi.f fVar) {
        super(fVar, null, 2, null);
        this.f239271N = c02;
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d.a
    public final void E9(@Y61.k List<? extends Uri> list) {
        C0 c02 = this.f239271N;
        accept(new InterfaceC50553a.c(list, c02.f231861Y.getNavigation(), c02.f231873k0));
    }
}
