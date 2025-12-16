package com.avito.android.bxcontent;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.bottom_sheet.result.SelectBottomSheetResult;
import com.avito.android.util.D6;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.bxcontent.a1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C28962a1 implements SwipeRefreshLayout.e, SwipeRefreshLayout.f, androidx.fragment.app.C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f109448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109449c;

    public /* synthetic */ C28962a1(Object obj, int i12) {
        this.f109448b = i12;
        this.f109449c = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
    public boolean b() {
        switch (this.f109448b) {
            case 0:
                return D6.y(((C29240o1) this.f109449c).f112712c1.f113095b);
            case 1:
                return D6.y(((C29240o1) this.f109449c).f112706a1.f113182b);
            case 2:
            default:
                return D6.y(((C29240o1) this.f109449c).f112709b1.f113217b);
            case 3:
                return D6.y(((C29240o1) this.f109449c).f112721f1.f113141e);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        ((C29240o1) this.f109449c).f112722g.s();
    }

    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        SelectBottomSheetResult selectBottomSheetResult = (SelectBottomSheetResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("REQUEST_ITEM_SELECTION_DATA", SelectBottomSheetResult.class) : bundle.getParcelable("REQUEST_ITEM_SELECTION_DATA"));
        if (selectBottomSheetResult instanceof SelectBottomSheetResult.Select) {
            BxContentFragment bxContentFragment = (BxContentFragment) this.f109449c;
            InterfaceC31062w interfaceC31062w = bxContentFragment.f108996e1;
            if (interfaceC31062w == null) {
                interfaceC31062w = null;
            }
            SelectBottomSheetResult.Select select = (SelectBottomSheetResult.Select) selectBottomSheetResult;
            String str2 = select.f265326b;
            List<ParcelableEntity<String>> list = select.f265327c;
            interfaceC31062w.q(list);
            com.avito.android.serp.adapter.vertical_main.p pVar = bxContentFragment.f109048r1;
            (pVar != null ? pVar : null).k(select.f265326b, list);
        }
    }
}
