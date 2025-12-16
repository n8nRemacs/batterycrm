package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class h implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC10624a interfaceC10624a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB2 = interfaceC10624a.b(context, str, false);
        bVar.f349677b = iB2;
        bVar.f349678c = iB2 != 0 ? 1 : 0;
        return bVar;
    }
}
