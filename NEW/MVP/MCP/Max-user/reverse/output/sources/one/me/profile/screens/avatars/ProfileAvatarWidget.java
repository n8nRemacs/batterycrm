package one.me.profile.screens.avatars;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.c20;
import defpackage.c2c;
import defpackage.cbc;
import defpackage.cei;
import defpackage.cf7;
import defpackage.df7;
import defpackage.ebc;
import defpackage.ffb;
import defpackage.fzc;
import defpackage.gwi;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.hr6;
import defpackage.hs;
import defpackage.imb;
import defpackage.ivd;
import defpackage.nj7;
import defpackage.of3;
import defpackage.or6;
import defpackage.rf7;
import defpackage.toc;
import defpackage.tyd;
import defpackage.vid;
import defpackage.w7i;
import defpackage.we3;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.zk6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/profile/screens/avatars/ProfileAvatarWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "", "urls", "(JLjava/util/List;)V", "Lcbc;", "model", "(Lcbc;)V", "ebc", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileAvatarWidget extends Widget {
    public static final /* synthetic */ yy7[] o = {new toc(ProfileAvatarWidget.class, "imageId", "getImageId()J", 0), ho7.d(vid.a, ProfileAvatarWidget.class, "imageUrls", "getImageUrls()Ljava/util/List;", 0), new toc(ProfileAvatarWidget.class, "imageView", "getImageView()Lone/me/sdk/zoom/ZoomableDraweeView;", 0)};
    public final bwf a;
    public final hs b;
    public final hs c;
    public final bbd d;

    public ProfileAvatarWidget(cbc cbcVar) {
        this(cbcVar.a, cbcVar.b);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = fzc.profile_contact_avatars_image_view;
        w7i w7iVar = new w7i(frameLayout.getContext());
        w7iVar.setId(i);
        w7iVar.setAdjustViewBounds(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        w7iVar.setLayoutParams(layoutParams);
        frameLayout.addView(w7iVar);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Object parentController = getParentController();
        ebc ebcVar = parentController instanceof ebc ? (ebc) parentController : null;
        yy7[] yy7VarArr = o;
        w7i w7iVar = (w7i) this.d.D(this, yy7VarArr[2]);
        int i = ((yeb) this.a.getValue()).getIcon().f;
        hr6 hr6Var = new hr6(w7iVar.getResources());
        hr6Var.l = tyd.f;
        hr6Var.j = new c20(w7iVar.getContext(), 0);
        Context context = w7iVar.getContext();
        int i2 = ivd.R;
        hr6Var.f = cei.h(i2, i, context);
        hr6Var.h = cei.h(i2, i, w7iVar.getContext());
        hr6Var.b = 0;
        w7iVar.setHierarchy(hr6Var.a());
        w7iVar.setZoomEnabled(true);
        w7iVar.setOnTouchListener(new or6(new GestureDetector(w7iVar.getContext(), new of3(ebcVar, 3, this)), 4));
        yy7 yy7Var = yy7VarArr[1];
        List<String> list = (List) this.c.a(this);
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        for (String str : list) {
            rf7 rf7VarB = rf7.b(str);
            if (rf7VarB == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            df7 df7VarE = zk6.e();
            df7VarE.getClass();
            arrayList.add(new cf7(df7VarE, rf7VarB, str));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c2c c2cVarA = zk6.a.a();
        c2cVarA.d = new nj7(arrayList, false);
        c2cVarA.f = true;
        c2cVarA.i = w7iVar.getController();
        w7iVar.setController(c2cVarA.a());
    }

    public ProfileAvatarWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new bwf(new ffb(15, this));
        this.b = new hs(Long.class, 0L, "extra.id");
        this.c = new hs(List.class, hd5.a, "extra.urls");
        this.d = viewBinding(fzc.profile_contact_avatars_image_view);
    }

    public ProfileAvatarWidget(long j, List<String> list) {
        this(gwi.b(new imb("extra.id", Long.valueOf(j)), new imb("extra.urls", list)));
    }
}
