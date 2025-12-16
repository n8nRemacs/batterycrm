package ru.avito.component.toolbar;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f430591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CollapsingTitleAppBarLayout f430592c;

    public /* synthetic */ b(CollapsingTitleAppBarLayout collapsingTitleAppBarLayout, int i12) {
        this.f430591b = i12;
        this.f430592c = collapsingTitleAppBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f430591b) {
            case 0:
                e eVar = this.f430592c.f430588O;
                if (eVar != null) {
                    eVar.a();
                    break;
                }
                break;
            case 1:
                a aVar = this.f430592c.f430587N;
                if (aVar != null) {
                    aVar.R();
                    break;
                }
                break;
            default:
                a aVar2 = this.f430592c.f430587N;
                if (aVar2 != null) {
                    aVar2.u();
                    break;
                }
                break;
        }
    }
}
