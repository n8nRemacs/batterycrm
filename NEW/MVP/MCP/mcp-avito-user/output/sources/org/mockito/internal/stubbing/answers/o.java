package org.mockito.internal.stubbing.answers;

import e81.InterfaceC39968b;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: AnswersWithDelay.java */
/* loaded from: classes7.dex */
public class o implements l81.g<Object>, l81.m, Serializable {
    private static final long serialVersionUID = 2177950597971260246L;

    @Override // l81.g
    public final Object f(InterfaceC39968b interfaceC39968b) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(0L);
        throw null;
    }

    @Override // l81.m
    public final void c(InterfaceC39968b interfaceC39968b) {
    }
}
