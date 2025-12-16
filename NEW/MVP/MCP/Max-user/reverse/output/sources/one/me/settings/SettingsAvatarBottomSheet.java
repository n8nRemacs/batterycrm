package one.me.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ane;
import defpackage.ho7;
import defpackage.hs;
import defpackage.s5g;
import defpackage.tk4;
import defpackage.toc;
import defpackage.vid;
import defpackage.yy7;
import defpackage.z8a;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/SettingsAvatarBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "zme", "settings-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SettingsAvatarBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] G0 = {new toc(SettingsAvatarBottomSheet.class, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), ho7.d(vid.a, SettingsAvatarBottomSheet.class, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), new toc(SettingsAvatarBottomSheet.class, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new toc(SettingsAvatarBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new z8a(SettingsAvatarBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final hs C0;
    public final hs D0;
    public final hs E0;
    public final hs F0;

    public SettingsAvatarBottomSheet(Bundle bundle, tk4 tk4Var) {
        super(bundle);
        this.C0 = new hs(s5g.class, "title");
        this.D0 = new hs(s5g.class, null, "description");
        this.E0 = new hs(ArrayList.class, new ArrayList(), "buttons");
        this.F0 = new hs(Boolean.class, Boolean.FALSE, "callback_sent");
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        yy7[] yy7VarArr = G0;
        yy7 yy7Var = yy7VarArr[0];
        CharSequence charSequenceB = ((s5g) this.C0.a(this)).b(getContext());
        if (charSequenceB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yy7 yy7Var2 = yy7VarArr[1];
        s5g s5gVar = (s5g) this.D0.a(this);
        CharSequence charSequenceB2 = s5gVar != null ? s5gVar.b(layoutInflater.getContext()) : null;
        yy7 yy7Var3 = yy7VarArr[2];
        return new ane(this, charSequenceB, charSequenceB2, (ArrayList) this.E0.a(this), layoutInflater.getContext());
    }

    public SettingsAvatarBottomSheet() {
        super(null);
        this.C0 = new hs(s5g.class, "title");
        this.D0 = new hs(s5g.class, null, "description");
        this.E0 = new hs(ArrayList.class, new ArrayList(), "buttons");
        this.F0 = new hs(Boolean.class, Boolean.FALSE, "callback_sent");
    }
}
