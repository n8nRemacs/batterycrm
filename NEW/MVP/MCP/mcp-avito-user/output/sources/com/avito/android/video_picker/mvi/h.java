package com.avito.android.video_picker.mvi;

import com.avito.android.arch.mvi.u;
import fN0.InterfaceC40322b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoPickerReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/video_picker/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "LfN0/b;", "LfN0/d;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements u<InterfaceC40322b, fN0.d> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final fN0.d a(InterfaceC40322b interfaceC40322b, fN0.d dVar) {
        InterfaceC40322b interfaceC40322b2 = interfaceC40322b;
        fN0.d dVar2 = dVar;
        if (interfaceC40322b2 instanceof InterfaceC40322b.c) {
            return new fN0.d(((InterfaceC40322b.c) interfaceC40322b2).f395871a);
        }
        if (interfaceC40322b2 instanceof InterfaceC40322b.a ? true : interfaceC40322b2 instanceof InterfaceC40322b.C11149b) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
