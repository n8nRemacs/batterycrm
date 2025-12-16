package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* loaded from: classes2.dex */
public final class olc extends dtf implements sm6 {
    public final /* synthetic */ ProfileScreen o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.o = profileScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        olc olcVar = (olc) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        olcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new olc(continuation, this.o);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ProfileScreen profileScreen = this.o;
        View view = profileScreen.getView();
        qqg qqgVar = qqg.a;
        if (view != null && !profileScreen.D0().T0.r() && !profileScreen.D0().T0.p()) {
            c83 c83Var = (c83) profileScreen.y0.D(profileScreen, ProfileScreen.C0[11]);
            ytd ytdVar = c83Var.a;
            if (!fni.a(c83Var.b(), "profile_members_list_widget")) {
                ytdVar.R(false);
                bud budVarA = l8j.a(new ChatMembersCompactWidget(profileScreen.getArgs().getLong("profile:id")), null, null);
                budVarA.d("profile_members_list_widget");
                ytdVar.S(budVarA);
            }
        }
        return qqgVar;
    }
}
