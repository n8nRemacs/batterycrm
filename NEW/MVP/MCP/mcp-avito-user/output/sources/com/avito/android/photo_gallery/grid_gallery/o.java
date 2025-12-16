package com.avito.android.photo_gallery.grid_gallery;

import T70.c;
import androidx.core.view.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_gallery.grid_gallery.GridGalleryActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f217422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f217423c;

    public /* synthetic */ o(y yVar, int i12) {
        this.f217422b = i12;
        this.f217423c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f217422b) {
            case 0:
                y yVar = this.f217423c;
                RecyclerView recyclerView = yVar.f217445f;
                P.b(recyclerView, new u(recyclerView, yVar));
                ((GridGalleryActivity.b) yVar.f217442c).invoke(c.e.f15404a);
                break;
            default:
                y yVar2 = this.f217423c;
                yVar2.f217445f.o(yVar2.f217454o);
                break;
        }
    }
}
