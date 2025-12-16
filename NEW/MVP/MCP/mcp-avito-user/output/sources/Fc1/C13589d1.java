package Fc1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.C35969w4;
import com.google.android.material.sidesheet.SideSheetBehavior;
import feedback.shared.sdk.api.network.entities.PostVisitsRequest;
import xyz.n.a.ke;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Fc1.d1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C13589d1 implements io.reactivex.rxjava3.core.M, io.reactivex.rxjava3.core.C, androidx.core.view.accessibility.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5445c;

    public /* synthetic */ C13589d1(Object obj, int i12) {
        this.f5445c = obj;
        this.f5444b = i12;
    }

    @Override // androidx.core.view.accessibility.i
    public boolean c(View view) {
        int i12 = SideSheetBehavior.f357153v;
        ((SideSheetBehavior) this.f5445c).b(this.f5444b);
        return true;
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(io.reactivex.rxjava3.core.B b12) {
        C35969w4 c35969w4 = new C35969w4(this.f5444b, b12);
        RecyclerView recyclerView = (RecyclerView) this.f5445c;
        recyclerView.o(c35969w4);
        b12.f(new com.avito.android.app.work.a(6, recyclerView, c35969w4));
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(io.reactivex.rxjava3.core.K k12) {
        C13607f1 c13607f1 = (C13607f1) this.f5445c;
        T1 t12 = c13607f1.f5493a;
        if (t12 == null) {
            t12 = null;
        }
        c13607f1.a().a(new P1(t12.a(ke.POST_VISITS), new PostVisitsRequest(this.f5444b), new C13598e1(k12, 2), new C13598e1(k12, 3)));
    }
}
