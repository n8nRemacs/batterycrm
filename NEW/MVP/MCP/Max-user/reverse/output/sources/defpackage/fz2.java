package defpackage;

import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class fz2 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cda b;

    public /* synthetic */ fz2(ChatTitleIconScreen chatTitleIconScreen, cda cdaVar, int i) {
        this.a = i;
        this.b = cdaVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                uaf uafVar = (uaf) obj;
                uafVar.M0();
                uafVar.s0(uafVar.L0(((wy2) this.b).b));
                break;
            case 1:
                uaf uafVar2 = (uaf) obj;
                uafVar2.M0();
                uafVar2.p0().b(a9h.d(((vy2) this.b).b, ":profile/edit/link?id=", "&type=local_chat&flow=create"), null);
                break;
            default:
                uaf uafVar3 = (uaf) obj;
                uafVar3.M0();
                uafVar3.p0().b(vb9.e(((uy2) this.b).b, ":start-conversation/add-subscribers?id="), null);
                break;
        }
        return qqg.a;
    }
}
