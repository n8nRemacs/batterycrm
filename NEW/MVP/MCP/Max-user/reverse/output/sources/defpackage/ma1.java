package defpackage;

import java.util.concurrent.CancellationException;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.members.list.MembersListWidget;
import one.me.profile.ProfileScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* loaded from: classes.dex */
public final class ma1 implements sf5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ ma1(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.sf5
    public final void p() {
        String str;
        int i = this.a;
        boolean z = true;
        Widget widget = this.b;
        switch (i) {
            case 0:
                v17 v17Var = CallHistoryPageScreen.u0;
                vw1 vw1Var = ((CallHistoryPageScreen) widget).B0().o;
                vw1Var.getClass();
                vw1Var.g(new ui(6, vw1Var, z));
                break;
            case 1:
                yy7[] yy7VarArr = ChatsListSearchScreen.I0;
                b43 b43VarZ0 = ((ChatsListSearchScreen) widget).z0();
                x9f x9fVar = b43VarZ0.S0;
                if (x9fVar == null || !x9fVar.isActive()) {
                    tcf tcfVar = b43VarZ0.H0;
                    tcfVar.m(null, y23.a((y23) tcfVar.getValue(), x23.b, null, null, false, false, 62));
                    b43VarZ0.S0 = svi.e(b43VarZ0.a, b43VarZ0.P0, null, new f33(b43VarZ0, null), 2);
                    break;
                }
                break;
            case 2:
                yy7[] yy7VarArr2 = ChatsListWidget.L0;
                ((ChatsListWidget) widget).B0().o.e();
                break;
            case 3:
                yy7[] yy7VarArr3 = LogsViewerScreen.X;
                ((LogsViewerScreen) widget).y0().u();
                break;
            case 4:
                yy7[] yy7VarArr4 = MediaGalleryWidget.Y;
                tq6 tq6VarA0 = ((MediaGalleryWidget) widget).A0();
                tq6VarA0.getClass();
                wqi.c("tq6", "loadMoreItems()", new Object[0]);
                x9f x9fVar2 = tq6VarA0.H0;
                if ((x9fVar2 != null && x9fVar2.isActive()) || ((Boolean) tq6VarA0.y0.getValue()).booleanValue()) {
                    wqi.c("tq6", "try to load more items when loading in process, ignore it", new Object[0]);
                    break;
                } else {
                    try {
                        x9f x9fVar3 = tq6VarA0.G0;
                        if (x9fVar3 != null) {
                            x9fVar3.cancel((CancellationException) null);
                        }
                    } catch (Throwable unused) {
                    }
                    tq6VarA0.G0 = xfh.o(tq6VarA0, ((q2b) tq6VarA0.v()).f().plus(tq6VarA0.d), new iq6(tq6VarA0, null), 2);
                    break;
                }
                break;
            case 5:
                yy7[] yy7VarArr5 = MembersListWidget.C0;
                ((le9) ((MembersListWidget) widget).B0().Z.getValue()).f();
                break;
            case 6:
                yy7[] yy7VarArr6 = PickerChatsListWidget.A0;
                ((PickerChatsListWidget) widget).D0().c.e();
                break;
            case 7:
                yy7[] yy7VarArr7 = ProfileScreen.C0;
                ((ProfileScreen) widget).D0().T0.s();
                break;
            case 8:
                yy7[] yy7VarArr8 = StickersSearchScreen.t0;
                whf whfVarZ0 = ((StickersSearchScreen) widget).z0();
                rhf rhfVar = (rhf) whfVarZ0.u0.get();
                x9f x9fVar4 = whfVarZ0.w0;
                if ((x9fVar4 == null || !x9fVar4.isActive()) && (str = rhfVar.a) != null && str.length() != 0) {
                    whfVarZ0.w0 = xfh.o(whfVarZ0, ((q2b) whfVarZ0.c).b(), new thf(whfVarZ0, rhfVar, null), 2);
                    break;
                }
                break;
            case 9:
                yy7[] yy7VarArr9 = StickersShowcaseScreen.u0;
                njf njfVarZ0 = ((StickersShowcaseScreen) widget).z0();
                kif kifVar = njfVarZ0.o;
                if (!kifVar.a()) {
                    fif fifVar = njfVarZ0.c;
                    x9f x9fVar5 = fifVar.g;
                    if (x9fVar5 == null || !x9fVar5.isActive()) {
                        fifVar.g = svi.e(fifVar.c, null, null, new dif(fifVar, null), 3);
                        break;
                    }
                } else {
                    x9f x9fVar6 = kifVar.h;
                    if (x9fVar6 == null || !x9fVar6.isActive()) {
                        kifVar.h = svi.e(kifVar.c, null, null, new iif(kifVar, null), 3);
                        break;
                    }
                }
                break;
            default:
                yy7[] yy7VarArr10 = SuggestionsWidget.F0;
                mqf mqfVarP0 = ((SuggestionsWidget) widget).P0();
                mqfVarP0.u(((Number) mqfVarP0.G0.getValue()).intValue(), (String) mqfVarP0.F0.getValue());
                break;
        }
    }

    @Override // defpackage.sf5
    public final boolean q() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                v17 v17Var = CallHistoryPageScreen.u0;
                return ((CallHistoryPageScreen) widget).B0().v();
            case 1:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) widget;
                yy7[] yy7VarArr = ChatsListSearchScreen.I0;
                return ((y23) chatsListSearchScreen.z0().I0.a.getValue()).a != x23.b && ((y23) chatsListSearchScreen.z0().I0.a.getValue()).b.length() > 0 && chatsListSearchScreen.z0().x() && chatsListSearchScreen.z0.j() > 0;
            case 2:
                yy7[] yy7VarArr2 = ChatsListWidget.L0;
                return ((v03) ((ChatsListWidget) widget).B0().L0.getValue()).b;
            case 3:
                return true;
            case 4:
                yy7[] yy7VarArr3 = MediaGalleryWidget.Y;
                tq6 tq6VarA0 = ((MediaGalleryWidget) widget).A0();
                vo6 vo6Var = (vo6) tq6VarA0.A0.getValue();
                if (vo6Var == null) {
                    return false;
                }
                boolean zB = ((bj7) tq6VarA0.o).b(vo6Var);
                ho7.q("canLoadMoreItems = ", "tq6", zB);
                return zB;
            case 5:
                yy7[] yy7VarArr4 = MembersListWidget.C0;
                return ((le9) ((MembersListWidget) widget).B0().Z.getValue()).d();
            case 6:
                return PickerChatsListWidget.z0((PickerChatsListWidget) widget);
            case 7:
                yy7[] yy7VarArr5 = ProfileScreen.C0;
                return ((ProfileScreen) widget).D0().T0.w();
            case 8:
                yy7[] yy7VarArr6 = StickersSearchScreen.t0;
                return ((StickersSearchScreen) widget).z0().u();
            case 9:
                yy7[] yy7VarArr7 = StickersShowcaseScreen.u0;
                return ((StickersShowcaseScreen) widget).z0().u();
            default:
                yy7[] yy7VarArr8 = SuggestionsWidget.F0;
                mqf mqfVarP0 = ((SuggestionsWidget) widget).P0();
                if (fni.a(mqfVarP0.A0.a, String.valueOf((String) mqfVarP0.F0.getValue()))) {
                    return mqfVarP0.A0.f;
                }
                return false;
        }
    }
}
