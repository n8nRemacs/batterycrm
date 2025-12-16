package com.avito.android.lib.design.bottom_sheet;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f178569c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f178570d;

    public /* synthetic */ t(int i12, Object obj, Object obj2) {
        this.f178568b = i12;
        this.f178569c = obj;
        this.f178570d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v20, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f178568b) {
            case 0:
                if (((Boolean) ((f) ((Y41.a) this.f178569c)).invoke()).booleanValue()) {
                    u uVar = (u) this.f178570d;
                    if (uVar.f178589p.f355975L != 2) {
                        ?? r02 = uVar.f178598y;
                        if (r02 != 0) {
                            r02.invoke();
                        }
                        uVar.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                if (((Boolean) ((f) ((Y41.a) this.f178569c)).invoke()).booleanValue()) {
                    A a12 = (A) this.f178570d;
                    ?? r03 = a12.f178488r;
                    if (r03 != 0) {
                        r03.invoke();
                    }
                    a12.dismiss();
                    break;
                }
                break;
            default:
                ?? r32 = ((m) this.f178569c).f178558d;
                if (r32 != 0) {
                    r32.invoke((k) this.f178570d);
                    break;
                }
                break;
        }
    }
}
