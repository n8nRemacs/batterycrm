package com.avito.android.publish.deeplink;

import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacAnonymousInfoSheetShowDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class t extends N implements Y41.l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public static final t f232607l = new t();

    public t() {
        super(1);
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        Context context2 = context;
        com.avito.android.publish.iac_devices.a aVar = new com.avito.android.publish.iac_devices.a(context2, 0, 2, null);
        aVar.setContentView(R.layout.iac_anonymous_info_bottom_sheet);
        com.avito.android.lib.design.bottom_sheet.d.M(aVar, null, false, true, 7);
        aVar.setCancelable(true);
        aVar.setCanceledOnTouchOutside(true);
        View viewFindViewById = aVar.findViewById(R.id.iac_anonymous_info_close);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(aVar, 11));
        }
        ListItem listItem = (ListItem) aVar.findViewById(R.id.iac_anonymous_info_advantage_1);
        if (listItem != null) {
            ListItem.k(listItem, R.drawable.ic_check_thin, 0, 2);
        }
        ListItem listItem2 = (ListItem) aVar.findViewById(R.id.iac_anonymous_info_advantage_2);
        if (listItem2 != null) {
            ListItem.k(listItem2, R.drawable.ic_check_thin, 0, 2);
        }
        ListItem listItem3 = (ListItem) aVar.findViewById(R.id.iac_anonymous_info_advantage_3);
        if (listItem3 != null) {
            ListItem.k(listItem3, R.drawable.ic_check_thin, 0, 2);
        }
        ListItem listItem4 = (ListItem) aVar.findViewById(R.id.iac_anonymous_info_advantage_4);
        if (listItem4 != null) {
            ListItem.k(listItem4, R.drawable.ic_check_thin, 0, 2);
        }
        aVar.S(C35835l0.g(context2).y);
        return aVar;
    }
}
