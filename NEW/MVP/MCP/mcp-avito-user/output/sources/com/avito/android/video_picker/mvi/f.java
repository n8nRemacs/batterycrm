package com.avito.android.video_picker.mvi;

import com.avito.android.arch.mvi.t;
import fN0.InterfaceC40322b;
import fN0.InterfaceC40323c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoPickerOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/video_picker/mvi/f;", "Lcom/avito/android/arch/mvi/t;", "LfN0/b;", "LfN0/c;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements t<InterfaceC40322b, InterfaceC40323c> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40323c b(InterfaceC40322b interfaceC40322b) {
        InterfaceC40322b interfaceC40322b2 = interfaceC40322b;
        if (interfaceC40322b2 instanceof InterfaceC40322b.a) {
            return InterfaceC40323c.a.f395872a;
        }
        if (interfaceC40322b2 instanceof InterfaceC40322b.C11149b) {
            return InterfaceC40323c.C11150c.f395874a;
        }
        if (!(interfaceC40322b2 instanceof InterfaceC40322b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((InterfaceC40322b.c) interfaceC40322b2).f395871a.isEmpty()) {
            return InterfaceC40323c.b.f395873a;
        }
        return null;
    }
}
