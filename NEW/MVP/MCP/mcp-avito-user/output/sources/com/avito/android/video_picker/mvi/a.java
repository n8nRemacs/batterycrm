package com.avito.android.video_picker.mvi;

import Y61.k;
import com.avito.android.arch.mvi.a;
import fN0.InterfaceC40321a;
import fN0.InterfaceC40322b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VideoPickerActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/video_picker/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LfN0/a;", "LfN0/b;", "LfN0/d;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40321a, InterfaceC40322b, fN0.d> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC40322b> b(InterfaceC40321a interfaceC40321a, fN0.d dVar) {
        C43210w c43210w;
        InterfaceC40321a interfaceC40321a2 = interfaceC40321a;
        if (interfaceC40321a2 instanceof InterfaceC40321a.c) {
            return new C43210w(new InterfaceC40322b.c(((InterfaceC40321a.c) interfaceC40321a2).f395868a));
        }
        if (interfaceC40321a2 instanceof InterfaceC40321a.C11148a) {
            c43210w = new C43210w(InterfaceC40322b.a.f395869a);
        } else {
            if (!(interfaceC40321a2 instanceof InterfaceC40321a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(InterfaceC40322b.C11149b.f395870a);
        }
        return c43210w;
    }
}
