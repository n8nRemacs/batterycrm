package defpackage;

import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.Objects;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class co2 implements sf5, joe, px3, cbb, ab3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ co2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    @Override // defpackage.cbb
    public void J(CharSequence charSequence) {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        yy7[] yy7VarArr = ContactListWidget.O0;
        hs hsVar = contactListWidget.L0;
        yy7[] yy7VarArr2 = ContactListWidget.O0;
        yy7 yy7Var = yy7VarArr2[7];
        hsVar.b(contactListWidget, Boolean.TRUE);
        hs hsVar2 = contactListWidget.J0;
        yy7 yy7Var2 = yy7VarArr2[5];
        hsVar2.b(contactListWidget, charSequence);
        if (contactListWidget.D0()) {
            zy3 zy3VarC0 = contactListWidget.C0();
            String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            ((f9a) zy3VarC0.E0.g.getValue()).setValue(string);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.cbb
    public void a0() {
        ((lz3) ((ContactListWidget) this.b).x0.getValue()).f(false);
    }

    @Override // defpackage.cbb
    public void e() {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        hs hsVar = contactListWidget.K0;
        yy7 yy7Var = ContactListWidget.O0[6];
        Boolean bool = Boolean.TRUE;
        hsVar.b(contactListWidget, bool);
        ((zh0) contactListWidget.z0.getValue()).X.m(null, bool);
        gda.g((gda) contactListWidget.b.getValue(), f1e.CONTACTS_SEARCH);
    }

    @Override // defpackage.joe
    public void e0(long j, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                yy7[] yy7VarArr = ChatNotificationsSettingsScreen.X;
                ((it2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).v(j);
                break;
            case 4:
                yy7[] yy7VarArr2 = DialogNotificationsSettingsScreen.X;
                ((fw4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).u(j);
                break;
            case 7:
                yy7[] yy7VarArr3 = MessagesSettingsScreen.X;
                jy9 jy9Var = (jy9) ((MessagesSettingsScreen) obj).c.getValue();
                if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
                    jy9Var.getClass();
                    break;
                } else {
                    jy9Var.b.f("app.messages.send.by.enter", z);
                    break;
                }
            default:
                yy7[] yy7VarArr4 = OtherNotificationsSettingsScreen.X;
                ((tjb) ((OtherNotificationsSettingsScreen) obj).b.getValue()).u(j);
                break;
        }
    }

    @Override // defpackage.sf5
    public boolean g() {
        switch (this.a) {
            case 0:
                break;
            default:
                MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                if (messagesListWidget.K0().D1.a.getValue() == hr9.d || !((hr9) messagesListWidget.K0().C1.getValue()).c) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.joe
    public void h(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                yy7[] yy7VarArr = ChatNotificationsSettingsScreen.X;
                ((it2) ((ChatNotificationsSettingsScreen) obj).b.getValue()).v(j);
                break;
            case 4:
                yy7[] yy7VarArr2 = DialogNotificationsSettingsScreen.X;
                ((fw4) ((DialogNotificationsSettingsScreen) obj).b.getValue()).u(j);
                break;
            case 7:
                yy7[] yy7VarArr3 = MessagesSettingsScreen.X;
                jy9 jy9Var = (jy9) ((MessagesSettingsScreen) obj).c.getValue();
                if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
                    if (j != 9223372036854775806L) {
                        jy9Var.getClass();
                        break;
                    } else {
                        ci5 ci5Var = jy9Var.o;
                        hy9.c.getClass();
                        xfh.r(ci5Var, new ei4(":stickers/settings"));
                        break;
                    }
                } else {
                    jy9Var.b.f("app.messages.send.by.enter", !r4.g.getBoolean("app.messages.send.by.enter", false));
                    jy9Var.t();
                    break;
                }
            default:
                yy7[] yy7VarArr4 = OtherNotificationsSettingsScreen.X;
                ((tjb) ((OtherNotificationsSettingsScreen) obj).b.getValue()).u(j);
                break;
        }
    }

    @Override // defpackage.sf5
    public void j() {
        switch (this.a) {
            case 0:
                break;
            default:
                MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                messagesListWidget.K0().d.v();
                break;
        }
    }

    @Override // defpackage.ab3
    public boolean k(ClickableSpan clickableSpan, int i, int i2, String str, i88 i88Var, MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                ab3 ab3Var = ((rm9) this.b).d;
                if (ab3Var != null) {
                    break;
                }
                break;
            case 9:
                ab3 onLinkLongClickListener = ((wue) this.b).getOnLinkLongClickListener();
                if (onLinkLongClickListener == null || !onLinkLongClickListener.k(clickableSpan, i, i2, str, i88Var, motionEvent)) {
                }
                break;
            default:
                ab3 onLinkLongClickListener2 = ((x4g) this.b).getOnLinkLongClickListener();
                if (onLinkLongClickListener2 == null || !onLinkLongClickListener2.k(clickableSpan, i, i2, str, i88Var, motionEvent)) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.cbb
    public void m() {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        yy7[] yy7VarArr = ContactListWidget.O0;
        hz3 hz3Var = contactListWidget.C0().b;
        hz3Var.getClass();
        ((lz3) contactListWidget.x0.getValue()).f(hz3Var == hz3.a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    @Override // defpackage.cbb
    public void o() {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        hs hsVar = contactListWidget.K0;
        yy7[] yy7VarArr = ContactListWidget.O0;
        yy7 yy7Var = yy7VarArr[6];
        hsVar.b(contactListWidget, Boolean.FALSE);
        zh0 zh0Var = (zh0) contactListWidget.z0.getValue();
        Boolean bool = (Boolean) contactListWidget.y0.getValue();
        bool.booleanValue();
        zh0Var.X.m(null, bool);
        hs hsVar2 = contactListWidget.J0;
        yy7 yy7Var2 = yy7VarArr[5];
        hsVar2.b(contactListWidget, null);
        contactListWidget.C0().E0.b();
        gda.g((gda) contactListWidget.b.getValue(), f1e.CONTACTS_TAB);
    }

    @Override // defpackage.sf5
    public void p() {
        jo2 jo2Var;
        ul2 ul2VarB;
        switch (this.a) {
            case 0:
                if (((in2) ((jo2) this.b).T0.getValue()).a.isEmpty() || (ul2VarB = (jo2Var = (jo2) this.b).B()) == null || ul2VarB.s0.a > 0) {
                    return;
                }
                pb2 pb2VarZ = jo2Var.z();
                eh9 eh9Var = pb2VarZ != null ? pb2VarZ.c : null;
                Long lValueOf = eh9Var != null ? Long.valueOf(eh9Var.getC()) : null;
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    wqi.c(ul2VarB.a, "loadPrev: time = %d, loadPrevOperation = %s", Long.valueOf(jLongValue), ul2VarB.s0);
                    synchronized (ul2VarB.s0) {
                        try {
                            synchronized (ul2VarB.s0) {
                            }
                            int i = 0;
                            if (ul2VarB.s0.a == jLongValue) {
                                wqi.o(ul2VarB.a, null, "loadPrev: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                            } else {
                                ul2VarB.t0.a();
                                ul2VarB.s0.a();
                                ul2VarB.Z.a();
                                ul2VarB.s0.a = jLongValue;
                                ev evVar = ul2VarB.s0;
                                qk3 qk3VarH = new kk3(0, new dv(new av(ul2VarB, jLongValue, i))).h(ul2VarB.c);
                                j0e j0eVar = ul2VarB.d;
                                Objects.requireNonNull(j0eVar, "scheduler is null");
                                ik3 ik3Var = new ik3(new qk3(qk3VarH, j0eVar, 0), 1, new bv(ul2VarB, 0));
                                qu1 qu1Var = new qu1(new bv(ul2VarB, 1), 0, new cv(ul2VarB, 0));
                                ik3Var.f(qu1Var);
                                evVar.b = qu1Var;
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                MessagesListWidget messagesListWidget = (MessagesListWidget) this.b;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                messagesListWidget.K0().d.u();
                return;
        }
    }

    @Override // defpackage.sf5
    public boolean q() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((in2) ((jo2) obj).T0.getValue()).c;
            default:
                MessagesListWidget messagesListWidget = (MessagesListWidget) obj;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                return messagesListWidget.K0().D1.a.getValue() != hr9.d && ((hr9) messagesListWidget.K0().C1.getValue()).b;
        }
    }

    @Override // defpackage.px3
    public void z(long j) {
        ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
        api.c(chatsListSearchScreen);
        yy7[] yy7VarArr = ChatsListSearchScreen.I0;
        chatsListSearchScreen.z0().z(j);
    }
}
