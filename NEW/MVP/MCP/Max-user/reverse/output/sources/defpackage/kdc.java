package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.stickerspreview.StickerPreviewScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class kdc implements mi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kdc(long j, Parcelable parcelable, int i) {
        this.a = i;
        this.b = j;
        this.c = parcelable;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                pdc pdcVar = (pdc) this.c;
                int i = ndc.$EnumSwitchMapping$0[pdcVar.ordinal()];
                long j = this.b;
                if (i == 1 || i == 2) {
                    ProfileAvatarsScreen profileAvatarsScreen = new ProfileAvatarsScreen(j, pdcVar);
                    return profileAvatarsScreen;
                }
                if (i == 3) {
                    return qqg.a;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                br2 br2Var = (br2) this.c;
                br2 br2Var2 = br2.ADMIN;
                long j2 = this.b;
                return br2Var == br2Var2 ? new ChatAdminsScreen(j2) : new ChatMembersScreen(j2, br2Var);
            case 2:
                return new ProfileEditScreen(this.b, (dfc) this.c);
            default:
                Bundle bundle = (Bundle) this.c;
                Long lD = l8j.d("chat_id", bundle);
                long jLongValue = lD != null ? lD.longValue() : 0L;
                Long lD2 = l8j.d("forward_id", bundle);
                return new StickerPreviewScreen(this.b, jLongValue, lD2 != null ? lD2.longValue() : 0L);
        }
    }

    public /* synthetic */ kdc(Enum r1, long j, int i) {
        this.a = i;
        this.c = r1;
        this.b = j;
    }
}
