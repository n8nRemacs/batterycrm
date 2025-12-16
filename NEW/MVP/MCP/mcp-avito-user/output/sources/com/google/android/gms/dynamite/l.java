package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class l implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC10624a interfaceC10624a) {
        int iB2;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iA2 = interfaceC10624a.a(context, str);
        bVar.f349676a = iA2;
        int i12 = 1;
        int i13 = 0;
        if (iA2 != 0) {
            iB2 = interfaceC10624a.b(context, str, false);
            bVar.f349677b = iB2;
        } else {
            iB2 = interfaceC10624a.b(context, str, true);
            bVar.f349677b = iB2;
        }
        int i14 = bVar.f349676a;
        if (i14 == 0) {
            if (iB2 == 0) {
                i12 = 0;
            }
            bVar.f349678c = i12;
            return bVar;
        }
        i13 = i14;
        if (iB2 < i13) {
            i12 = -1;
        }
        bVar.f349678c = i12;
        return bVar;
    }
}
