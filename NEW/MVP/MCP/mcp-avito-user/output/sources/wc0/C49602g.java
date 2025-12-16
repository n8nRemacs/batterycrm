package wc0;

import Y41.p;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LinkEditActionsBottomMenu.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwc0/g;", "Lwc0/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wc0.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49602g implements InterfaceC49601f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f441691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441692b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p<LinkEditItem.Action, LinkEditItem, G0> f441693c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f441694d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public LinearLayout f441695e;

    /* JADX WARN: Multi-variable type inference failed */
    public C49602g(@Y61.k Context context, int i12, @Y61.k p<? super LinkEditItem.Action, ? super LinkEditItem, G0> pVar) {
        this.f441691a = context;
        this.f441692b = i12;
        this.f441693c = pVar;
    }

    public final void a(LinkEditItem linkEditItem) {
        LinearLayout linearLayout = this.f441695e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            for (LinkEditItem.Action action : linkEditItem.f229647i) {
                ListItem listItem = new ListItem(this.f441691a, null);
                listItem.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItem.setTitle(action.f229650b);
                int i12 = this.f441692b;
                listItem.setPadding(i12, 0, i12, 0);
                listItem.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(this, action, linkEditItem, 29));
                linearLayout.addView(listItem);
            }
        }
    }
}
