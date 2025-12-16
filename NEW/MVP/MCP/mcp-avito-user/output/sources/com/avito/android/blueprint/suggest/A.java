package com.avito.android.blueprint.suggest;

import android.view.View;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class A implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f105672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f105673c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ A(int i12, Y41.l lVar) {
        this.f105672b = i12;
        this.f105673c = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z12) {
        ?? r22 = this.f105673c;
        switch (this.f105672b) {
            case 0:
                int i12 = C.f105675y;
                r22.invoke(Boolean.valueOf(z12));
                break;
            case 1:
                int i13 = com.avito.android.blueprint.video.url.k.f105807r;
                r22.invoke(Boolean.valueOf(z12));
                break;
            case 2:
                int i14 = com.avito.android.publish.items.tagged_input.D.f237110o;
                r22.invoke(Boolean.valueOf(z12));
                break;
            case 3:
                int i15 = com.avito.android.publish.items.video.l.f237224h;
                r22.invoke(Boolean.valueOf(z12));
                break;
            case 4:
                int i16 = com.avito.android.search.filter.adapter.double_input.t.f262243h;
                r22.invoke(Boolean.valueOf(z12));
                break;
            default:
                int i17 = com.avito.android.search.filter.adapter.double_input.t.f262243h;
                r22.invoke(Boolean.valueOf(z12));
                break;
        }
    }
}
