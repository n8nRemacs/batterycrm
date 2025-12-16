package com.avito.android.beduin.common.component.top_toolbar;

import com.avito.android.beduin.common.component.top_toolbar.h.b;
import com.avito.android.util.D6;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f102817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f102818c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f102819d;

    public /* synthetic */ g(h hVar, List list, int i12) {
        this.f102817b = i12;
        this.f102818c = hVar;
        this.f102819d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f102819d;
        h hVar = this.f102818c;
        switch (this.f102817b) {
            case 0:
                int i12 = h.f102820h;
                D6.l(true, hVar.f102825f, hVar.new b(list));
                break;
            default:
                int i13 = h.f102820h;
                hVar.f102825f.post(new g(hVar, list, 0));
                break;
        }
    }
}
