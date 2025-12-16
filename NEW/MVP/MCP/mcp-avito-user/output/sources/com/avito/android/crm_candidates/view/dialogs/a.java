package com.avito.android.crm_candidates.view.dialogs;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f129966c;

    public /* synthetic */ a(b bVar, int i12) {
        this.f129965b = i12;
        this.f129966c = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f129966c;
        switch (this.f129965b) {
            case 0:
                bVar.f129968E.invoke();
                break;
            case 1:
                bVar.f129970G.invoke();
                break;
            default:
                int i12 = b.f129967O;
                bVar.dismiss();
                break;
        }
    }
}
