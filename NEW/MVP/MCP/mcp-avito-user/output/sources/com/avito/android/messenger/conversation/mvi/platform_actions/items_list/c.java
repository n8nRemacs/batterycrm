package com.avito.android.messenger.conversation.mvi.platform_actions.items_list;

import android.view.View;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f193999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f194000c;

    public /* synthetic */ c(b bVar, int i12) {
        this.f193999b = i12;
        this.f194000c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f193999b) {
            case 0:
                this.f194000c.f193979c.accept(G0.f406611a);
                break;
            default:
                this.f194000c.f193978b.accept(G0.f406611a);
                break;
        }
    }
}
