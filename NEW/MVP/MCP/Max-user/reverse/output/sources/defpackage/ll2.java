package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import one.me.profile.screens.media.ChatMediaListWidget;

/* loaded from: classes2.dex */
public final class ll2 extends y0f {
    public final ChatMediaListWidget o;

    public ll2(ExecutorService executorService, ChatMediaListWidget chatMediaListWidget) {
        super(executorService);
        this.o = chatMediaListWidget;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(ml2 ml2Var, int i) {
        yb9 yb9Var = (yb9) ((t98) C(i));
        if (yb9Var instanceof tb9) {
            ml2Var.F(yb9Var, new jx0(1, this.o, kl2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 5), new rw(2, this.o, kl2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 4));
            return;
        }
        if (!(yb9Var instanceof ub9)) {
            if (yb9Var instanceof wb9) {
                ml2Var.F(yb9Var, new jx0(1, this.o, kl2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 8), new rw(2, this.o, kl2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 6));
                return;
            } else if (yb9Var instanceof sb9) {
                ml2Var.F(yb9Var, new jx0(1, this.o, kl2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 9), new rw(2, this.o, kl2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 7));
                return;
            } else {
                if (!(yb9Var instanceof xb9)) {
                    throw new NoWhenBranchMatchedException();
                }
                ml2Var.F(yb9Var, new jx0(1, this.o, kl2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 4), new rw(2, this.o, kl2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 3));
                return;
            }
        }
        zi2 zi2Var = ml2Var instanceof zi2 ? (zi2) ml2Var : null;
        if (zi2Var != null) {
            ub9 ub9Var = (ub9) yb9Var;
            jx0 jx0Var = new jx0(1, this.o, kl2.class, "onAttachClick", "onAttachClick(Lone/me/profile/screens/media/model/MediaUiMessage;)V", 0, 6);
            rw rwVar = new rw(2, this.o, kl2.class, "onAttachLongClick", "onAttachLongClick(Lone/me/profile/screens/media/model/MediaUiMessage;Landroid/view/View;)V", 0, 5);
            jx0 jx0Var2 = new jx0(1, this.o, kl2.class, "onLinkLongClick", "onLinkLongClick(Lone/me/profile/screens/media/model/MediaUiMessage$Link;)V", 0, 7);
            jl2 jl2Var = (jl2) zi2Var.a;
            zi2Var.z(ub9Var);
            f8j.d(jl2Var, 300L, new ub(jx0Var, 12, ub9Var));
            jl2Var.setOnLongClickListener(new yi2(rwVar, ub9Var, zi2Var, 0));
            jl2Var.setLinkOnLongClickListener(new d72(jx0Var2, 1, ub9Var));
            jl2Var.setOnLinkClickListener(new ub(jx0Var2, 13, ub9Var));
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        return ((yb9) this.d.f.get(i)).getK0();
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == fzc.profile_media_view_type_photo_video) {
            return new jc2(new rm2(viewGroup.getContext()), 1);
        }
        if (i == fzc.profile_media_view_type_file) {
            return new xg2(viewGroup.getContext());
        }
        if (i == fzc.profile_media_view_type_link) {
            return new zi2(new jl2(viewGroup.getContext()));
        }
        if (i == fzc.profile_media_view_type_audio) {
            return new jc2(new pj2(viewGroup.getContext()), 0);
        }
        if (i == fzc.profile_media_view_type_video_msg) {
            return new jc2(new fn2(viewGroup.getContext()), 2);
        }
        throw new IllegalStateException("ChatMedia: wrong viewType");
    }
}
