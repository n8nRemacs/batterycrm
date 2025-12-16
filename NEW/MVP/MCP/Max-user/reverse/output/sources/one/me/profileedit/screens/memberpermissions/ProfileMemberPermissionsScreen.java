package one.me.profileedit.screens.memberpermissions;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.bzb;
import defpackage.eo7;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hkc;
import defpackage.imb;
import defpackage.jc3;
import defpackage.k18;
import defpackage.m;
import defpackage.sjc;
import defpackage.tjc;
import defpackage.tqi;
import defpackage.vdc;
import defpackage.vjc;
import defpackage.wj1;
import defpackage.wjc;
import defpackage.xfh;
import defpackage.yec;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profileedit/screens/memberpermissions/ProfileMemberPermissionsScreen;", "Lone/me/sdk/arch/Widget;", "Lsjc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileMemberPermissionsScreen extends Widget implements sjc {
    public static final /* synthetic */ int d = 0;
    public final eo7 a;
    public final k18 b;
    public final tjc c;

    public ProfileMemberPermissionsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = createViewModelLazy(hkc.class, new vdc(4, new wj1(bundle, 10)));
        this.c = new tjc(((g4b) yec.a.getAccessor().c(56)).a(), this);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.a;
    }

    @Override // defpackage.c54
    public final boolean handleBack() {
        xfh.r(y0().w0, jc3.b);
        return true;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vjc vjcVar = new vjc(this, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tqi.c(new m(3, null, 13), linearLayout);
        vjcVar.invoke(linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(y0().v0, new bzb(2, this.c, tjc.class, "submitList", "submitList(Ljava/util/List;)V", 4, 4), 1), getViewLifecycleScope());
        gw0.w(new g56(y0().w0, new wjc(2, null), 1), getViewLifecycleScope());
    }

    public final hkc y0() {
        return (hkc) this.b.getValue();
    }

    public ProfileMemberPermissionsScreen(long j) {
        this(gwi.b(new imb("id", Long.valueOf(j))));
    }
}
