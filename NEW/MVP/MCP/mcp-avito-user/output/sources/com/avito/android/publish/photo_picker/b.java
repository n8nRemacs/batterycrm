package com.avito.android.publish.photo_picker;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view.y;
import com.avito.android.publish.view.ItemDetailsBaseFragment;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PublishImageListPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/photo_picker/b;", "Lcom/avito/android/publish/photo_picker/a;", "Lcom/avito/android/photo_list_view/s;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a, s {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final s f238255a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ItemDetailsBaseFragment f238256b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k s sVar, @k c cVar) {
        this.f238255a = sVar;
        this.f238256b = (ItemDetailsBaseFragment) cVar;
    }

    @Override // com.avito.android.photo_list_view.s
    public final void A(@k y yVar) {
        this.f238255a.A(yVar);
    }

    @Override // com.avito.android.photo_list_view.y.a
    public final void B(@k String str, @l String str2) {
        this.f238255a.B(str, str2);
    }

    @Override // com.avito.android.photo_list_view.s
    /* renamed from: C */
    public final int getF218336k() {
        return this.f238255a.getF218336k();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.publish.photo_picker.c, com.avito.android.publish.view.ItemDetailsBaseFragment] */
    @Override // com.avito.android.photo_list_view.re23.a, com.avito.android.photo_list_view_groups.g
    public final void b(@k String str) {
        this.f238256b.E2(str);
    }

    @Override // com.avito.android.photo_list_view.s
    public final void c(int i12) {
        this.f238255a.c(i12);
    }

    @Override // com.avito.android.photo_list_view.s
    public final void e0() {
        this.f238255a.e0();
    }

    @Override // com.avito.android.photo_list_view.y.a
    public final void f(@k String str) {
        this.f238255a.f(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.publish.photo_picker.c, com.avito.android.publish.view.ItemDetailsBaseFragment] */
    @Override // com.avito.android.photo_list_view_groups.g
    public final void g(@k String str, @l String str2, @k String str3, @k List list, boolean z12) {
        this.f238256b.I2(str, str2, str3, list, z12);
    }

    @Override // com.avito.android.photo_list_view.s
    public final void l(boolean z12) {
        this.f238255a.l(z12);
    }

    @Override // com.avito.android.photo_list_view.y.a
    public final void o(@k String str) {
        this.f238255a.o(str);
    }

    @Override // com.avito.android.photo_list_view.s
    public final void p(boolean z12) {
        this.f238255a.p(z12);
    }

    @Override // com.avito.android.photo_list_view.y.a
    public final void r() {
        this.f238255a.r();
    }

    @Override // com.avito.android.photo_list_view.H
    public final void u(int i12, int i13) {
        this.f238255a.u(i12, i13);
    }

    @Override // com.avito.android.photo_list_view.s
    @k
    public final z<G> w() {
        return this.f238255a.w();
    }

    @Override // com.avito.android.photo_list_view.s
    public final void x(boolean z12) {
        this.f238255a.x(z12);
    }
}
