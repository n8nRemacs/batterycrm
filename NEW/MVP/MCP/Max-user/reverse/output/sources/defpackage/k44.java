package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* loaded from: classes2.dex */
public final class k44 extends TextView implements u6g {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k44(s5g s5gVar, ContextMenuPopupWindow contextMenuPopupWindow, Context context) {
        super(context);
        this.a = contextMenuPopupWindow;
        dpg.h.b(this, t75.b);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setText(s5gVar.b(getContext()));
        onThemeChanged(ContextMenuPopupWindow.y0(contextMenuPopupWindow));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setTextColor(ContextMenuPopupWindow.y0(this.a).getText().h);
    }
}
