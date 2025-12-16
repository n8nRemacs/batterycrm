package com.avito.android.video_requirements.mvi;

import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import pN0.InterfaceC46981b;
import pN0.InterfaceC46982c;

/* compiled from: VideoRequirementsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/video_requirements/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LpN0/b;", "LpN0/c;", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements t<InterfaceC46981b, InterfaceC46982c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC46982c b(InterfaceC46981b interfaceC46981b) {
        InterfaceC46981b interfaceC46981b2 = interfaceC46981b;
        if (interfaceC46981b2 instanceof InterfaceC46981b.c) {
            return null;
        }
        if (interfaceC46981b2 instanceof InterfaceC46981b.a) {
            return InterfaceC46982c.b.f428513a;
        }
        if (interfaceC46981b2 instanceof InterfaceC46981b.C12270b) {
            return InterfaceC46982c.a.f428512a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
