package one.me.folders.picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import defpackage.aw0;
import defpackage.d5b;
import defpackage.d92;
import defpackage.e44;
import defpackage.eo7;
import defpackage.fde;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.jzb;
import defpackage.k1b;
import defpackage.l38;
import defpackage.la6;
import defpackage.lyb;
import defpackage.ma6;
import defpackage.mcf;
import defpackage.n5g;
import defpackage.na6;
import defpackage.q9;
import defpackage.qfb;
import defpackage.r5j;
import defpackage.rd5;
import defpackage.tcf;
import defpackage.toc;
import defpackage.ucf;
import defpackage.vb6;
import defpackage.vid;
import defpackage.xs0;
import defpackage.yfb;
import defpackage.ys;
import defpackage.yy7;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/picker/FolderMemberPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lla6;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "resultTag", "", "membersIds", "(Ljava/lang/String;Ljava/lang/String;[J)V", "folders_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FolderMemberPickerScreen extends AbstractPickerScreen<la6> {
    public static final /* synthetic */ yy7[] y0 = {new toc(FolderMemberPickerScreen.class, "folderId", "getFolderId()Ljava/lang/String;", 0), ho7.d(vid.a, FolderMemberPickerScreen.class, "tag", "getTag()Ljava/lang/String;", 0)};
    public final eo7 t0;
    public final tcf u0;
    public final fde v0;
    public final hs w0;
    public final hs x0;

    public FolderMemberPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = eo7.f;
        this.u0 = ucf.a(new n5g(k1b.k0));
        vb6 vb6Var = vb6.a;
        this.v0 = new fde(vb6Var.getAccessor().d(8), vb6Var.getAccessor().d(109), J0(bundle));
        this.w0 = new hs(String.class, "folder_id");
        this.x0 = new hs(String.class, "result_tag");
        xs0 xs0Var = new xs0(this, new e44(19, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 5, xs0Var));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget A0(String str) {
        return new PickerChatsListWidget("all.chat.folder", str, null, false, false, null, 52, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final yfb B0(Context context) {
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(d5b.a);
        yfbVar.setTransitionName(context.getString(k1b.q));
        yfbVar.setTitle(k1b.l0);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new d92(24, this)));
        return yfbVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final jzb C0() {
        return new la6(this.v0, vb6.a.getAccessor().d(8));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final mcf E0() {
        return this.u0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set J0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("preselected_ids");
        return longArray != null ? ys.E(longArray) : rd5.a;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getT0() {
        return this.t0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(I0().Y, getViewLifecycleOwner().p(), l38.d), new ma6(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(((la6) I0().c).f, new na6(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable y0() {
        return hd5.a;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final lyb z0() {
        return new r5j(10, vb6.a.getAccessor().d(109));
    }

    public FolderMemberPickerScreen(String str, String str2, long[] jArr) {
        this(gwi.b(new imb("folder_id", str), new imb("result_tag", str2), new imb("preselected_ids", jArr)));
    }
}
