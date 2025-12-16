package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.bxcontent.beduin_v2.wrapper.cell.m;
import com.avito.android.serp.adapter.l1;
import com.avito.beduin.v2.render.android_view.diff.g;
import com.avito.konveyor.exception.ItemNotSupportedException;
import com.avito.konveyor.exception.ViewTypeCollisionException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BxComponentContainerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/o;", "Lcom/avito/beduin/v2/render/android_view/diff/g;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements com.avito.beduin.v2.render.android_view.diff.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<l1> f109595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f109596b;

    /* compiled from: BxComponentContainerHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Integer, View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f109597l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar) {
            super(1);
            this.f109597l = mVar;
        }

        @Override // Y41.l
        public final View invoke(Integer num) {
            int iIntValue = num.intValue();
            m mVar = this.f109597l;
            View viewInflate = mVar.f109590c.inflate(iIntValue, mVar.f109588a, false);
            if (viewInflate != null) {
                return viewInflate;
            }
            throw new IllegalStateException();
        }
    }

    public o(m mVar, List list) {
        this.f109595a = list;
        this.f109596b = mVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void a(int i12, int i13) throws ItemNotSupportedException {
        m mVar = this.f109596b;
        m.a aVar = (m.a) mVar.f109588a.getChildAt(i12).getTag();
        l1 l1Var = this.f109595a.get(i13);
        com.avito.konveyor.adapter.b bVar = aVar.f109592b;
        bVar.itemView.setTag(new m.a(l1Var, bVar));
        mVar.f109589b.O5(bVar, l1Var, 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void b(int i12, int i13) {
        this.f109596b.f109588a.removeViews(i12, i13);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void c(int i12, int i13) throws ItemNotSupportedException, ViewTypeCollisionException {
        l1 l1Var = this.f109595a.get(i13);
        m mVar = this.f109596b;
        com.avito.konveyor.a aVar = mVar.f109589b;
        int iO2 = aVar.O(l1Var);
        a aVar2 = new a(mVar);
        ViewGroup viewGroup = mVar.f109588a;
        com.avito.konveyor.adapter.b bVarK = aVar.k(viewGroup, iO2, aVar2);
        if (bVarK == null) {
            throw new IllegalStateException();
        }
        bVarK.itemView.setTag(new m.a(l1Var, bVarK));
        viewGroup.addView(bVarK.itemView, i12);
        mVar.f109589b.O5(bVarK, l1Var, 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void d(int i12, int i13) {
        m mVar = this.f109596b;
        View childAt = mVar.f109588a.getChildAt(i12);
        mVar.f109588a.removeViewAt(i12);
        mVar.f109588a.addView(childAt, i13);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void e(int i12, @Y61.k ArrayList arrayList) {
        g.a.a(this, i12, arrayList);
    }

    @Override // com.avito.beduin.v2.render.android_view.diff.g
    public final void f(int i12, @Y61.k ArrayList arrayList) {
        g.a.b(this, i12, arrayList);
    }
}
