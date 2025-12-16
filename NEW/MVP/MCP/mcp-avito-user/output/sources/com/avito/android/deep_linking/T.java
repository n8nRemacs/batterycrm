package com.avito.android.deep_linking;

import android.net.Uri;
import arrow.core.AbstractC23662a;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.Task;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class T implements InterfaceC37023f, InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l f132875b;

    public /* synthetic */ T(Y41.l lVar) {
        this.f132875b = lVar;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        DynamicLinkData dynamicLinkData;
        String str;
        U u12 = U.f132876a;
        Uri uri = null;
        if (task.r() && task.n() != null && (dynamicLinkData = ((com.google.firebase.dynamiclinks.d) task.n()).f361520a) != null && (str = dynamicLinkData.f361522c) != null) {
            uri = Uri.parse(str);
        }
        AbstractC23662a.f56267a.getClass();
        this.f132875b.invoke(new AbstractC23662a.c(uri));
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public void onFailure(Exception exc) {
        U u12 = U.f132876a;
        AbstractC23662a.f56267a.getClass();
        ((C29663a) this.f132875b).invoke(new AbstractC23662a.b(exc));
    }
}
