package Gb1;

import D31.g;
import d31.h;
import e.InterfaceC39835a;
import kotlin.G0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import n31.C44179a;
import sberid.sdk.global.models.StandName;

/* loaded from: classes9.dex */
public final class a implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6606b = new a();

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        N41.f fVar;
        n31.d dVar;
        StandName standName = (StandName) obj;
        f.b(standName);
        ?? r13 = f.f6611a;
        InterfaceC39835a interfaceC39835a = (InterfaceC39835a) r13.getValue();
        int[] iArr = h.f393656a;
        int i12 = iArr[standName.ordinal()];
        if (i12 == 1) {
            fVar = N41.c.f11190b;
        } else if (i12 == 2) {
            fVar = N41.e.f11192b;
        } else if (i12 == 3) {
            fVar = N41.c.f11190b;
        } else if (i12 == 4) {
            fVar = N41.e.f11192b;
        } else {
            if (i12 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = N41.d.f11191b;
        }
        e.h hVar = (e.h) interfaceC39835a;
        hVar.getClass();
        C43259k.d((T) ((g) hVar.f394228a).f2880a.getValue(), null, null, new e.e(hVar, fVar, null), 3);
        InterfaceC39835a interfaceC39835a2 = (InterfaceC39835a) r13.getValue();
        int i13 = iArr[standName.ordinal()];
        if (i13 == 1) {
            dVar = C44179a.f414891c;
        } else if (i13 == 2) {
            dVar = n31.c.f414893c;
        } else if (i13 == 3) {
            dVar = C44179a.f414891c;
        } else if (i13 == 4) {
            dVar = n31.c.f414893c;
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = n31.b.f414892c;
        }
        e.h hVar2 = (e.h) interfaceC39835a2;
        C43259k.d((T) ((g) hVar2.f394228a).f2880a.getValue(), null, null, new e.c(hVar2, dVar, null), 3);
        dVar.toString();
        return G0.f406611a;
    }
}
