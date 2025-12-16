package sberid.sdk.ui.utils.extensions;

import Yb1.a;
import e.InterfaceC39835a;
import e31.C39939a;
import f61.C40239a;
import gc1.InterfaceC40658b;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import sberid.sdk.ui.models.root.ELKRootTypes;
import z2.C50357a;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"SberIdSDK_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class j {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f437906a;

        static {
            int[] iArr = new int[ELKRootTypes.values().length];
            try {
                ELKRootTypes eLKRootTypes = ELKRootTypes.f437784b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ELKRootTypes eLKRootTypes2 = ELKRootTypes.f437784b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f437906a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@Y61.k C50357a c50357a, @Y61.k InterfaceC40658b interfaceC40658b, @Y61.k String str, @Y61.l Boolean bool) throws SocketException {
        Integer numValueOf;
        if ((interfaceC40658b instanceof InterfaceC40658b.h) || (interfaceC40658b instanceof InterfaceC40658b.i) || (interfaceC40658b instanceof InterfaceC40658b.l) || (interfaceC40658b instanceof InterfaceC40658b.n)) {
            interfaceC40658b.getClass();
            return;
        }
        boolean z12 = interfaceC40658b instanceof InterfaceC40658b.j;
        C39939a c39939a = c50357a.f443798a;
        C40239a c40239a = c50357a.f443800c;
        InterfaceC39835a interfaceC39835a = c50357a.f443799b;
        if (z12 || (interfaceC40658b instanceof InterfaceC40658b.o) || (interfaceC40658b instanceof InterfaceC40658b.p)) {
            String f396628m = interfaceC40658b.getF396628m();
            String f396625j = interfaceC40658b.getF396625j();
            e.h hVar = (e.h) interfaceC39835a;
            c39939a.a(new a.q(null, null, "Click", hVar.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar.a(), f396628m, f396625j, null, 1027, null));
            return;
        }
        if (interfaceC40658b instanceof InterfaceC40658b.c) {
            InterfaceC40658b.c cVar = (InterfaceC40658b.c) interfaceC40658b;
            int i12 = 0;
            loop0: for (InterfaceC40658b interfaceC40658b2 : ((HashMap) ((G41.i) c50357a.f443801d).f6338i.getValue()).values()) {
                List<InterfaceC40658b> listA = interfaceC40658b2.a();
                if (listA != null && listA.contains(cVar)) {
                    List<InterfaceC40658b> listA2 = interfaceC40658b2.a();
                    if (listA2 == null) {
                        break;
                    }
                    Iterator<InterfaceC40658b> it = listA2.iterator();
                    while (it.hasNext()) {
                        i12++;
                        if (L.f(it.next(), cVar)) {
                            numValueOf = Integer.valueOf(i12);
                            break loop0;
                        }
                    }
                }
            }
            numValueOf = null;
            e.h hVar2 = (e.h) interfaceC39835a;
            c39939a.a(new a.j(null, null, "Click", hVar2.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar2.a(), null, h.a(cVar.f396504c), String.valueOf(numValueOf), cVar.f396502a, null, cVar.f396506e, 4355, null));
            return;
        }
        if ((interfaceC40658b instanceof InterfaceC40658b.f) || (interfaceC40658b instanceof InterfaceC40658b.e)) {
            String f396625j2 = interfaceC40658b.getF396625j();
            String f396626k = interfaceC40658b.getF396626k();
            e.h hVar3 = (e.h) interfaceC39835a;
            c39939a.a(new a.p(null, null, "Click", hVar3.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar3.a(), str, null, f396625j2, f396626k, String.valueOf(bool), 515, null));
            return;
        }
        if (!(interfaceC40658b instanceof InterfaceC40658b.k)) {
            if ((interfaceC40658b instanceof InterfaceC40658b.d) || (interfaceC40658b instanceof InterfaceC40658b.m) || (interfaceC40658b instanceof InterfaceC40658b.g)) {
                interfaceC40658b.getClass();
                return;
            }
            return;
        }
        if (a.f437906a[((InterfaceC40658b.k) interfaceC40658b).f396578f.ordinal()] != 2) {
            return;
        }
        e.h hVar4 = (e.h) interfaceC39835a;
        c39939a.a(new a.n(null, null, "Click", hVar4.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar4.a(), str, null, 515, null));
    }

    public static final void b(@Y61.k C50357a c50357a, @Y61.k InterfaceC40658b interfaceC40658b, boolean z12) throws SocketException {
        int size;
        C39939a c39939a = c50357a.f443798a;
        C40239a c40239a = c50357a.f443800c;
        InterfaceC39835a interfaceC39835a = c50357a.f443799b;
        if (z12) {
            if (interfaceC40658b instanceof InterfaceC40658b.k) {
                int i12 = a.f437906a[((InterfaceC40658b.k) interfaceC40658b).f396578f.ordinal()];
                if (i12 == 1) {
                    e.h hVar = (e.h) interfaceC39835a;
                    c39939a.a(new a.i(null, null, "Show", hVar.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar.a(), null, 259, null));
                    return;
                } else {
                    if (i12 != 2) {
                        return;
                    }
                    e.h hVar2 = (e.h) interfaceC39835a;
                    c39939a.a(new a.m(null, null, "Show", hVar2.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar2.a(), null, 259, null));
                    return;
                }
            }
            return;
        }
        if ((interfaceC40658b instanceof InterfaceC40658b.g) || (interfaceC40658b instanceof InterfaceC40658b.c) || (interfaceC40658b instanceof InterfaceC40658b.d) || (interfaceC40658b instanceof InterfaceC40658b.m) || (interfaceC40658b instanceof InterfaceC40658b.h) || (interfaceC40658b instanceof InterfaceC40658b.i) || (interfaceC40658b instanceof InterfaceC40658b.l) || (interfaceC40658b instanceof InterfaceC40658b.n)) {
            return;
        }
        if ((interfaceC40658b instanceof InterfaceC40658b.j) || (interfaceC40658b instanceof InterfaceC40658b.o) || (interfaceC40658b instanceof InterfaceC40658b.p)) {
            String f396628m = interfaceC40658b.getF396628m();
            String f396625j = interfaceC40658b.getF396625j();
            e.h hVar3 = (e.h) interfaceC39835a;
            String str = hVar3.f394234g;
            InterfaceC42726C interfaceC42726C = y31.c.f442880b;
            c39939a.a(new a.q(null, null, "Show", str, c40239a.f395679a, (String) interfaceC42726C.getValue(), "android_4.0.0", hVar3.a(), f396628m, f396625j, null, 1027, null));
            List<InterfaceC40658b> listA = interfaceC40658b.a();
            if (listA == null || (size = C42745f0.B(listA, InterfaceC40658b.c.class).size()) <= 0) {
                return;
            }
            c39939a.a(new a.j(null, null, "Show", hVar3.f394234g, c40239a.f395679a, (String) interfaceC42726C.getValue(), "android_4.0.0", hVar3.a(), String.valueOf(size), null, null, null, null, C42745f0.O(listA, null, null, null, null, 63), 7683, null));
            return;
        }
        if ((interfaceC40658b instanceof InterfaceC40658b.e) || (interfaceC40658b instanceof InterfaceC40658b.f)) {
            if (interfaceC40658b instanceof InterfaceC40658b.a) {
                e.h hVar4 = (e.h) interfaceC39835a;
                c39939a.a(new a.p(null, null, "Show", hVar4.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar4.a(), h.a(((InterfaceC40658b.a) interfaceC40658b).getF396623h()), null, interfaceC40658b.getF396625j(), interfaceC40658b.getF396626k(), null, 4611, null));
                return;
            }
            return;
        }
        if (interfaceC40658b instanceof InterfaceC40658b.k) {
            int i13 = a.f437906a[((InterfaceC40658b.k) interfaceC40658b).f396578f.ordinal()];
            if (i13 == 1) {
                e.h hVar5 = (e.h) interfaceC39835a;
                c39939a.a(new a.o(null, null, "Show", hVar5.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar5.a(), null, 259, null));
            } else {
                if (i13 != 2) {
                    return;
                }
                e.h hVar6 = (e.h) interfaceC39835a;
                c39939a.a(new a.n(null, null, "Show", hVar6.f394234g, c40239a.f395679a, (String) y31.c.f442880b.getValue(), "android_4.0.0", hVar6.a(), null, null, 771, null));
            }
        }
    }
}
