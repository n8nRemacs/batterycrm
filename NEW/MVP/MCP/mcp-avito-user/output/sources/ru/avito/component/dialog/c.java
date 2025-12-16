package ru.avito.component.dialog;

import Y61.k;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.dialog.r;
import com.avito.android.lib.util.g;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import kotlin.Metadata;

/* compiled from: Dialogs.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/component/dialog/c;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f430348a = new c();

    @k
    public static void a(@k Context context, @k Y41.a aVar) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.simple_dialog, (ViewGroup) null);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setView(viewInflate).create();
        r rVar = new r(viewInflate);
        Drawable drawableH = C35835l0.h(R.attr.img_dialogNotifications, context);
        ImageView imageView = rVar.f177949b;
        imageView.setImageDrawable(drawableH);
        D6.G(imageView, true);
        rVar.f177950c.f12285b.setText(R.string.notifications_settings_dialog_title);
        rVar.f177951d.f12285b.setText(R.string.notifications_settings_dialog_body);
        rVar.d(R.string.notifications_settings_dialog_button_primary);
        rVar.f177948a.f177877b.a(R.string.notifications_settings_dialog_button_secondary);
        rVar.f(new a(aVar, alertDialogCreate));
        rVar.h(new b(alertDialogCreate));
        g.a(alertDialogCreate);
    }
}
