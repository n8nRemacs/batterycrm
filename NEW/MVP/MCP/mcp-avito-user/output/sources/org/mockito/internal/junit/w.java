package org.mockito.internal.junit;

import androidx.compose.foundation.H;
import m81.InterfaceC43929e;

/* compiled from: VerificationCollectorImpl.java */
/* loaded from: classes7.dex */
public class w implements f81.e {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f421683a = H.r("There were multiple verification failures:");

    /* renamed from: b, reason: collision with root package name */
    public int f421684b = 0;

    /* compiled from: VerificationCollectorImpl.java */
    public class a implements InterfaceC43929e {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC43929e f421685a;

        public a(InterfaceC43929e interfaceC43929e, u uVar) {
            this.f421685a = interfaceC43929e;
        }

        @Override // m81.InterfaceC43929e
        public final void a(a81.p pVar) {
            try {
                this.f421685a.a(pVar);
            } catch (AssertionError e12) {
                String message = e12.getMessage();
                w wVar = w.this;
                wVar.f421684b++;
                StringBuilder sb2 = wVar.f421683a;
                sb2.append('\n');
                sb2.append(wVar.f421684b);
                sb2.append(". ");
                sb2.append(message.trim());
                sb2.append('\n');
            }
        }
    }
}
