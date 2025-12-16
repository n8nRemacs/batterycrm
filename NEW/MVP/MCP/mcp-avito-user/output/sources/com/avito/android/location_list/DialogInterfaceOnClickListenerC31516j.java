package com.avito.android.location_list;

import android.content.DialogInterface;
import iR.C41336a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.location_list.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC31516j implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f182052c;

    public /* synthetic */ DialogInterfaceOnClickListenerC31516j(int i12, Y41.a aVar) {
        this.f182051b = i12;
        this.f182052c = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i12) {
        switch (this.f182051b) {
            case 0:
                C41336a.C11375a.a();
                Y41.a aVar = this.f182052c;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            default:
                ru.cyberity.cbr.core.android.a.a(this.f182052c, dialogInterface, i12);
                break;
        }
    }
}
