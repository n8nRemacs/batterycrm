package com.avito.android.video_requirements.mvi;

import com.avito.android.arch.mvi.u;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import nN0.C44297b;
import nN0.C44298c;
import oN0.C44668a;
import pN0.InterfaceC46981b;

/* compiled from: VideoRequirementsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/video_requirements/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LpN0/b;", "LpN0/d;", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements u<InterfaceC46981b, pN0.d> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final pN0.d a(InterfaceC46981b interfaceC46981b, pN0.d dVar) {
        C44668a c44668a;
        InterfaceC46981b interfaceC46981b2 = interfaceC46981b;
        pN0.d dVar2 = dVar;
        if (!(interfaceC46981b2 instanceof InterfaceC46981b.a)) {
            if (interfaceC46981b2 instanceof InterfaceC46981b.c ? true : interfaceC46981b2 instanceof InterfaceC46981b.C12270b) {
                return dVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        C44297b c44297b = ((InterfaceC46981b.a) interfaceC46981b2).f428509a;
        if (c44297b != null) {
            String title = c44297b.getTitle();
            List<C44298c> listA = c44297b.a();
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            for (C44298c c44298c : listA) {
                arrayList.add(new C44668a.C12184a.C12185a(c44298c.getTitle(), c44298c.getDescription()));
            }
            c44668a = new C44668a(new C44668a.C12184a(title, arrayList));
        } else {
            c44668a = null;
        }
        return new pN0.d(c44668a);
    }
}
