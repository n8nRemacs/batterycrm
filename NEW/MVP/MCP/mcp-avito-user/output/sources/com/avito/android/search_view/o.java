package com.avito.android.search_view;

import android.view.View;
import com.avito.android.R;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f264583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar23SearchView f264584c;

    public /* synthetic */ o(Toolbar23SearchView toolbar23SearchView, int i12) {
        this.f264583b = i12;
        this.f264584c = toolbar23SearchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Toolbar23SearchView toolbar23SearchView = this.f264584c;
        switch (this.f264583b) {
            case 0:
                int i12 = Toolbar23SearchView.f264435C0;
                toolbar23SearchView.f264463b0.accept(ShareButtonEvent.f264426b);
                break;
            case 1:
                toolbar23SearchView.f264457T.accept(G0.f406611a);
                break;
            case 2:
                toolbar23SearchView.f264474h.requestFocus();
                break;
            case 3:
                toolbar23SearchView.f264474h.f();
                break;
            case 4:
                int i13 = Toolbar23SearchView.f264435C0;
                toolbar23SearchView.G();
                break;
            case 5:
                toolbar23SearchView.f264474h.requestFocus();
                break;
            case 6:
                toolbar23SearchView.f264456S.accept(Integer.valueOf(R.id.menu_clarify));
                break;
            case 7:
                toolbar23SearchView.f264474h.requestFocus();
                break;
            case 8:
                toolbar23SearchView.f264456S.accept(Integer.valueOf(R.id.menu_clarify));
                break;
            case 9:
                int i14 = Toolbar23SearchView.f264435C0;
                toolbar23SearchView.G();
                toolbar23SearchView.f264459V.accept(G0.f406611a);
                break;
            default:
                int i15 = Toolbar23SearchView.f264435C0;
                toolbar23SearchView.K();
                break;
        }
    }
}
