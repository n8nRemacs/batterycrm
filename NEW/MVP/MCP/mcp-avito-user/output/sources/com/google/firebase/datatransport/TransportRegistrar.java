package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.c;
import com.google.firebase.components.n;
import com.yandex.div2.D8;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h lambda$getComponents$0(c cVar) {
        v.b((Context) cVar.a(Context.class));
        return v.a().c(a.f342926f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        b.C10697b c10697bB = b.b(h.class);
        c10697bB.f360732a = LIBRARY_NAME;
        c10697bB.a(n.a(Context.class));
        c10697bB.f360737f = new D8(27);
        return Arrays.asList(c10697bB.b(), com.google.firebase.platforminfo.h.a(LIBRARY_NAME, "18.1.7"));
    }
}
