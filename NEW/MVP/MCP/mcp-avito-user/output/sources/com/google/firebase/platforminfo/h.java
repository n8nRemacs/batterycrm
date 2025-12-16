package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.b;
import com.google.firebase.components.n;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes6.dex */
public class h {

    /* compiled from: LibraryVersionComponent.java */
    public interface a<T> {
        String b(Context context);
    }

    public static com.google.firebase.components.b<?> a(String str, String str2) {
        com.google.firebase.platforminfo.a aVar = new com.google.firebase.platforminfo.a(str, str2);
        b.C10697b c10697bB = com.google.firebase.components.b.b(f.class);
        c10697bB.f360736e = 1;
        c10697bB.f360737f = new com.avito.android.publish.details.seller_protection.b(aVar);
        return c10697bB.b();
    }

    public static com.google.firebase.components.b<?> b(final String str, final a<Context> aVar) {
        b.C10697b c10697bB = com.google.firebase.components.b.b(f.class);
        c10697bB.f360736e = 1;
        c10697bB.a(n.a(Context.class));
        c10697bB.f360737f = new com.google.firebase.components.f() { // from class: com.google.firebase.platforminfo.g
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new a(str, aVar.b((Context) cVar.a(Context.class)));
            }
        };
        return c10697bB.b();
    }
}
