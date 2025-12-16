package com.google.firebase.platforminfo;

import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements com.google.firebase.components.f {
    @Override // com.google.firebase.components.f
    public final Object a(com.google.firebase.components.c cVar) {
        Set setH = cVar.h(f.class);
        d dVar = d.f361946b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = d.f361946b;
                    if (dVar == null) {
                        dVar = new d();
                        d.f361946b = dVar;
                    }
                } finally {
                }
            }
        }
        return new c(setH, dVar);
    }
}
