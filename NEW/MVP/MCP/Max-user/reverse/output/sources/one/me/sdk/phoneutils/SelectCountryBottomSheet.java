package one.me.sdk.phoneutils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b0i;
import defpackage.bub;
import defpackage.g4b;
import defpackage.hs;
import defpackage.jbe;
import defpackage.u4e;
import defpackage.vid;
import defpackage.x2b;
import defpackage.ys;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/sdk/phoneutils/SelectCountryBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "jbe", "phone-utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SelectCountryBottomSheet extends BottomSheetWidget {
    public static final jbe E0;
    public static final /* synthetic */ yy7[] F0;
    public final hs C0;
    public final b0i D0;

    static {
        z8a z8aVar = new z8a(SelectCountryBottomSheet.class, "countries", "getCountries()[Lone/me/sdk/phoneutils/OneMeCountryModel;");
        vid.a.getClass();
        F0 = new yy7[]{z8aVar};
        E0 = new jbe(0);
    }

    public SelectCountryBottomSheet(Bundle bundle) {
        super(bundle);
        hs hsVar = new hs(x2b[].class, "countries");
        this.C0 = hsVar;
        int i = 3;
        b0i b0iVar = new b0i(((g4b) bub.a.getAccessor().c(56)).a(), new u4e(i, this), i);
        this.D0 = b0iVar;
        yy7 yy7Var = F0[0];
        b0iVar.E(ys.D((x2b[]) hsVar.a(this)));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.D0);
        recyclerView.setItemAnimator(null);
        linearLayout.addView(recyclerView);
        return linearLayout;
    }
}
