package com.google.common.graph;

import com.google.common.base.InterfaceC37276u;
import com.google.common.graph.E;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.common.graph.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C37457b implements InterfaceC37276u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360185b;

    @Override // com.google.common.base.InterfaceC37276u
    public final Object apply(Object obj) {
        switch (this.f360185b) {
            case 0:
                int i12 = C37459c.f360186b;
                return E.d(obj, null);
            case 1:
                int i13 = C37459c.f360186b;
                return E.d(null, obj);
            default:
                int i14 = C37459c.f360186b;
                return new E.c(obj, null, null);
        }
    }
}
