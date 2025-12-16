package one.me.devmenu.utils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import defpackage.gwi;
import defpackage.imb;
import defpackage.tk4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/devmenu/utils/StringValueBottomSheet;", "Lone/me/devmenu/utils/ValueBottomSheet;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "initialValue", "", "buttonId", "", "descriptions", "(Ljava/lang/String;J[Ljava/lang/String;)V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StringValueBottomSheet extends ValueBottomSheet {
    public StringValueBottomSheet(Bundle bundle) {
        super(bundle);
    }

    @Override // one.me.devmenu.utils.ValueBottomSheet
    /* renamed from: O0 */
    public final String getC0() {
        String string = getArgs().getString("arg:value");
        return string == null ? "" : string;
    }

    public /* synthetic */ StringValueBottomSheet(String str, long j, String[] strArr, int i, tk4 tk4Var) {
        this(str, j, (i & 4) != 0 ? new String[0] : strArr);
    }

    public StringValueBottomSheet(String str, long j, String[] strArr) {
        this(gwi.b(new imb("arg:value", str), new imb("arg:button_id", Long.valueOf(j)), new imb("arg:descriptions", strArr)));
    }
}
